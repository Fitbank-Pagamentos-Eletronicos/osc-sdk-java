package br.com.fitbank.requests;

import br.com.fitbank.domains.response.AuthResponse;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OAuthTestRequest {

    @Test
    void OAuthErrorTest() {
        String client_id = "wrong client_id";
        String client_secret = "wrong client_secret";
        try {
            AuthResponse response = OAuth.request(client_id, client_secret);

            assertNotNull(response.getAccessToken());
            assertNotNull(response.getExpireAt());
        } catch (IOException e){
            assertEquals(e.getMessage(), "{\"message\":\"User not found\"}");
        }
    }

    @Test
    void OAuthSucessTest() {
        String client_id = System.getenv("CLIENT_ID");
        String client_secret = System.getenv("CLIENT_SECRET");
        try {
            AuthResponse response = OAuth.request(client_id, client_secret);

            assertNotNull(response.getAccessToken());
            assertNotNull(response.getExpireAt());
        } catch (IOException e){
            assertEquals(e.getMessage(), "{\"message\":\"User not found\"}");
        }
    }
}
