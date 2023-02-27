package br.com.fitbank.domains;


import br.com.fitbank.domains.requests.AuthRequest;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AuthTest {
    @Test
    public void authTest(){
        String client_id = "00000001";
        String client_secret = "1111111110";
        AuthRequest authRequest = new AuthRequest(client_id, client_secret);
        String s = JSON.getGson().toJson(authRequest);
        AuthRequest newAuthRequest = JSON.getGson().fromJson(s, AuthRequest.class);
        assertNotNull(newAuthRequest);

    }

}
