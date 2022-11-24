package br.com.fitbank.domains;

import java.io.Serializable;
import java.time.Instant;

public class AuthSucess implements Serializable {
    private String access_token;
    private Instant expire_at;

    public AuthSucess() { }
    public AuthSucess(String access_token, String expire_at) {
        setAccess_token(access_token);
        setExpire_at(expire_at);
    }

    public String getAccess_token() {
        return access_token;
    }
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
    public Instant getExpire_at() {
        return expire_at;
    }
    public void setExpire_at(Instant expire_at) {
        this.expire_at = expire_at;
    }
    public void setExpire_at(String expire_at) {
        this.expire_at = Instant.parse(expire_at);
    }
}
