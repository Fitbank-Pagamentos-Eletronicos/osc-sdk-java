package br.com.fitbank.requests;

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

        PubSubSubscription.subscriber("project-5341349585364433217", "callback-leonardo.sousa-sub", receiver);
        TimeUnit.SECONDS.sleep(30);

    }
}

