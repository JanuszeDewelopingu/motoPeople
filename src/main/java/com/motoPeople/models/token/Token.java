package com.motoPeople.models.token;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.ZonedDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "token",
        "expirationDate"
})
public class Token {

    @JsonProperty("token")
    private String token;
    @JsonProperty("expirationDate")
    private ZonedDateTime expirationDate;

    /**
     * No args constructor for use in serialization
     *
     */
    public Token() {
    }

    /**
     *
     * @param expirationDate
     * @param token
     */
    public Token(String token, ZonedDateTime expirationDate) {
        super();
        this.token = token;
        this.expirationDate = expirationDate;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("expirationDate")
    public ZonedDateTime getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("expirationDate")
    public void setExpirationDate(ZonedDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Token{" +
                "token='" + token + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}