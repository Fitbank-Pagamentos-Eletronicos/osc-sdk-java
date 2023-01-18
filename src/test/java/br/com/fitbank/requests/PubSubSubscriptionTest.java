package br.com.fitbank.requests;

import br.com.fitbank.domains.response.PubSubRequestReturn;
import com.google.cloud.pubsub.v1.AckReplyConsumer;
import com.google.cloud.pubsub.v1.MessageReceiver;
import com.google.pubsub.v1.PubsubMessage;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PubSubSubscriptionTest {


    @Test
    public void listenerTest() throws IOException, InterruptedException {
        MessageReceiver receiver =
                (PubsubMessage message, AckReplyConsumer consumer) -> {
                    System.out.println("Id: " + message.getMessageId());
                    System.out.println("Data: " + message.getData().toStringUtf8());
                    consumer.ack();
                };
        PubSubRequestReturn config = new PubSubRequestReturn();
        config.setProject_id("project-5341349585364433217");
        config.setSubscription_id("callback-leonardo.sousa-sub");
        config.setService_account("{}");
        PubSubSubscription.subscriber(config, receiver);
        TimeUnit.SECONDS.sleep(30);

    }
}

