package br.com.fitbank.requests;

import com.google.api.core.ApiFuture;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.pubsub.v1.MessageReceiver;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.cloud.pubsub.v1.Subscriber;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.ProjectSubscriptionName;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.TopicName;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;


public class PubSubSubscription {
    static FixedCredentialsProvider credentials = null;

    static String publish(String projectId, String topicId, String message) throws IOException, ExecutionException, InterruptedException {
        TopicName topicName = TopicName.of(projectId, topicId);
        Publisher publisher = null;
        String messageId = null;

        try {
            publisher = Publisher.newBuilder(topicName).setCredentialsProvider(getCredentials()).setEnableMessageOrdering(true).build();
            ByteString data = ByteString.copyFromUtf8(message);
            PubsubMessage pubsubMessage = PubsubMessage.newBuilder().setData(data).setOrderingKey("timestamp").build();
            ApiFuture<String> messageIdFuture = publisher.publish(pubsubMessage);

            messageId = messageIdFuture.get();
        } finally {
            if (publisher != null) {
                publisher.shutdown();
                publisher.awaitTermination(1, TimeUnit.MINUTES);
            }
        }

        return messageId;
    }


    public static Subscriber subscriber(String projectId, String subscriptionId, MessageReceiver receiver) throws IOException {
        ProjectSubscriptionName subscriptionName = ProjectSubscriptionName.of(projectId, subscriptionId);
        Subscriber subscriber = Subscriber.newBuilder(subscriptionName, receiver).setCredentialsProvider(getCredentials()).build();
        subscriber.startAsync().awaitRunning();
        return subscriber;
    }

    private static FixedCredentialsProvider getCredentials() throws IOException {
        if (credentials == null) {
            String serviceAccount = "{\n  \"type\": \"service_account\",\n  \"project_id\": \"project-5341349585364433217\",\n  \"private_key_id\": \"67282184b91638e2b8c3c8722f71cb14d3288045\",\n  \"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDPD/N7w+DW+QGA\\nWqcOKfydbYIHjq+/7HRAvBeeH65c6m+/t87NkkuK9jsEfpZJ61MbaT3s3dpP3tSY\\nxjup1XAxZAf81zNp2k4GNKz9Tkt42UMXFKtW/F+IDa8jCfm9EYO4RK17G0+dcGXS\\nEA7nW1B8mM2qe+5USihdgaTwiMNTFrqgi/CNx9dMvjU5i75hsew28Fp9RMTKM0ii\\n+07NsdoOU8+s7C7OIocBrq3r7Wl90IanAMmj+Y7yiGb0oYI9wAoz52c/b5FP5rXt\\nfEp3J46K2G8Rg708nobZ7xwFTLK2UDbr9O11DybkQ9hRuFkaWq1j9ifjqP1+OuKs\\n8t9KbqNbAgMBAAECggEAOkMiP0Jz+vkwt3WKiP0+c+uSyV6YTDgT0/045gjDDqj2\\njasCGSzfbbfwDkkyL5V0GoPn5UTdf1jTWDN7KUQB4Bvl9Xp2IIRJLQzYWiQUL2pu\\nqslplr3HgahcDc9qQo1xk0Fb0QZzxfiQ5eUX1HiIsq5qPFzHyFbfecQXbYkF8NQz\\nqPOQJChcJEmEEkrYUpvXlRry2qMRCWUHuoazeG+1xI3KEOcOt9zrt2HGc1ut9uG3\\nJvyWYZHYm8Lor96aKj8dPGmv/QJRqUxk6Xrj2+VdmD+JkzLsloMGX7J7mIXGD3d8\\nACgo1ESZJuaI2jPFm1Igd6X7ZlzxXl9qp1fm/3280QKBgQD/NyCyqc1tRhcjgSWS\\n+GQaBltgAKWRK10sBSVy6L0kzVNkVhqLQhpdRgEghj2Z34kTInjzhq42Ny26+UTm\\n13FNrpFTFGsvN1EarmxYMlsjq3ER8mVlAk7gS0b6IZcVPZcrVmWNPEfLEjynZYhk\\nsvysGZ3ZYC2PBA9q4WhCURVMkQKBgQDPsuxwFigKr5tzmDFhPADOKFssH1i3xLT1\\nbO2pGK+8q6HZogE2Y94wLyxkWg7xdoKeMI1XtlMjn3bKn6Sg/xLR4PDesKG9IsCn\\nMaeQ8Qyd/kwivg8jq2kCMUVx1OthfvLRUwv+AROGqzI5Kl9IYnTdkSOvOJ230/Gi\\nFZ/j6j3XKwKBgQDzJaxrS0dCAnLtCo+ntCp6eO/5SOR0qCG+XLDPB1mchFocz8O+\\nRR4lGxrbx8lMniFUL5WYPgof8PYKmo3AeCWkYtplkqCDfWoxx1fFt0QJeb7h4FQl\\npctL+awHhpUQUXuCeG+L3ZBwslFDEoKdncEInec7QFxnUvD1XQcdl255YQKBgQCE\\nr/20rbLvALkC5BvHzpmFGusECRKYdCZXFDvQZ2D923gOnRzBLpPnnHtzsMUTJW7U\\nuJfTjTsX6uvtDogSAmJ3iojW+2iYd/cz2NkAE77HwInLODhbxUnUiL2gtzGYm41s\\nhO2IXA+pXP084AD3MU8PrYVqj3TS16fqsH3xENho+QKBgQC1lJUZmFhOpssfbjIu\\nqqLLsA1motD0ReACeedm9mOjDP9wGQyBl7w4O/6Y86LA+3cMibE0AO6/zB2nrMrO\\nB4c49YUKmD6pay5PqUQo/uiP06DHg/TpI86PmT3LsPeqjg2GT0/LKn7xT6yYwTD8\\n251Z9zEmtFY3GShTmKVWV1RvDQ==\\n-----END PRIVATE KEY-----\\n\",\n  \"client_email\": \"external-callback-leonardosou@project-5341349585364433217.iam.gserviceaccount.com\",\n  \"client_id\": \"114064645857332582439\",\n  \"auth_uri\": \"https://accounts.google.com/o/oauth2/auth\",\n  \"token_uri\": \"https://oauth2.googleapis.com/token\",\n  \"auth_provider_x509_cert_url\": \"https://www.googleapis.com/oauth2/v1/certs\",\n  \"client_x509_cert_url\": \"https://www.googleapis.com/robot/v1/metadata/x509/external-callback-leonardosou%40project-5341349585364433217.iam.gserviceaccount.com\"\n}";
            InputStream targetStream = new ByteArrayInputStream(serviceAccount.getBytes());
            GoogleCredentials googleCredentials = GoogleCredentials.fromStream(targetStream);
            credentials = FixedCredentialsProvider.create(googleCredentials);
        }
        return credentials;
    }
}
