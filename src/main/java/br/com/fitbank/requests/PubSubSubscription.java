package br.com.fitbank.requests;

import br.com.fitbank.domains.response.PubSubRequestReturn;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.pubsub.v1.MessageReceiver;
import com.google.cloud.pubsub.v1.Subscriber;
import com.google.pubsub.v1.ProjectSubscriptionName;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PubSubSubscription {
    public static Subscriber subscriber(PubSubRequestReturn config, MessageReceiver receiver) throws IOException {
        String subscriptionId = config.getSubscription_id();
        String projectId = config.getProject_id();
        String serviceAccount = config.getService_account();
        ProjectSubscriptionName subscriptionName = ProjectSubscriptionName.of(projectId, subscriptionId);
        FixedCredentialsProvider credentials = getCredentials(serviceAccount);
        Subscriber subscriber = Subscriber.newBuilder(subscriptionName, receiver).setCredentialsProvider(credentials).build();
        subscriber.startAsync().awaitRunning();
        return subscriber;
    }

    private static FixedCredentialsProvider getCredentials(String serviceAccount) throws IOException {
        InputStream targetStream = new ByteArrayInputStream(serviceAccount.getBytes());
        GoogleCredentials googleCredentials = GoogleCredentials.fromStream(targetStream);
        return FixedCredentialsProvider.create(googleCredentials);
    }
}
