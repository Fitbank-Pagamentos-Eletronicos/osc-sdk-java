package br.com.fitbank.domains.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.time.Instant;

public class AuthResponse implements Serializable {

    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("expire_at")
    private Instant expireAt;

    public AuthResponse() { }
    public AuthResponse(String accessToken, String expireAt) {
        setAccessToken(accessToken);
        setExpireAt(expireAt);
    }

    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    public Instant getExpireAt() {
        return expireAt;
    }
    public void setExpireAt(Instant expireAt) {
        this.expireAt = expireAt;
    }
    public void setExpireAt(String expireAt) {
        this.expireAt = Instant.parse(expireAt);
    }
}
