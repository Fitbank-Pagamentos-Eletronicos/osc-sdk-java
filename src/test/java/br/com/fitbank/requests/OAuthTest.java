package br.com.fitbank.requests;

import br.com.fitbank.domains.AuthSucess;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OAuthTest {

    @Test
    void OAuthErrorTest() {
        String client_id = "wrong client_id";
        String client_secret = "wrong client_secret";
        try {
            AuthSucess response = OAuth.request(client_id, client_secret);

            assertNotNull(response.getAccess_token());
            assertNotNull(response.getExpire_at());
        } catch (IOException e){
            assertEquals(e.getMessage(), "{\"message\":\"User not found\"}");
        }
    }

    @Test
    void OAuthSucessTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        try {
            AuthSucess response = OAuth.request(client_id, client_secret);

            assertNotNull(response.getAccess_token());
            assertNotNull(response.getExpire_at());
        } catch (IOException e){
            assertEquals(e.getMessage(), "{\"message\":\"User not found\"}");
        }
    }
}
