package br.com.fitbank.requests;

import br.com.fitbank.OSC;
import br.com.fitbank.domains.Pipeline;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SimpleSignupTest {

    @Test
    void signupSuccessTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        OSC osc = null;
        try {
            osc = OSC.createIntance(client_id, client_secret);
            String s ="{\n  \"cpf\": \"05910188020\",\n  \"name\": \"Renan Collienne Braga Alves\",\n  \"birthday\": \"1992-05-07\",\n  \"email\": \"renan@easyc.com.br\",\n  \"phone\": \"62982103909\",\n  \"zipCode\": \"74363820\",\n  \"logData\": {\n    \"latitude\": -16.6982283,\n    \"longitude\": -49.2581201,\n    \"occurrenceDate\": \"2019-08-21T14:31:17.459Z\",\n    \"userAgent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36\",\n    \"ip\": \"0.0.0.0\",\n    \"mac\": \"00:00:00:00:00:00\"\n  }\n}";
            br.com.fitbank.domains.SimpleSignup simpleSignup = JSON.getGson().fromJson(s, br.com.fitbank.domains.SimpleSignup.class);

            Pipeline pipeline = SimpleSignup.request(osc, simpleSignup);

            assertNotNull(pipeline.getId());
            assertNotNull(pipeline.getStatus());
            assertNotNull(pipeline.getCpf());
            assertNotNull(pipeline.getName());
            assertNotNull(pipeline.getDateCreated());
            assertNotNull(pipeline.getLastUpdated());

        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}