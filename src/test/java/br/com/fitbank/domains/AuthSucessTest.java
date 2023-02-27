package br.com.fitbank.domains;


import br.com.fitbank.domains.response.AuthResponse;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AuthSucessTest {
    @Test
    public void authSucessTest(){
        String access_token = "token";
        String expire_at = "expire";
        AuthResponse authResponse = new AuthResponse(access_token, expire_at);
        String s = JSON.getGson().toJson(authResponse);
        AuthResponse newAuthResponse = JSON.getGson().fromJson(s, AuthResponse.class);
        assertNotNull(newAuthResponse);

    }
}
