package com.motoPeople.models.jpa;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "photo")
    private byte[] photo;

    @Column(name = "januszToken", unique = true)
    private String januszToken;

    @Column(name = "fbToken", unique = true)
    private String fbToken;

    public Users(int id, String email, String password, byte[] photo, String januszToken, String fbToken) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.photo = photo;
        this.januszToken = januszToken;
        this.fbToken = fbToken;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getJanuszToken() {
        return januszToken;
    }

    public void setJanuszToken(String januszToken) {
        this.januszToken = januszToken;
    }

    public String getFbToken() {
        return fbToken;
    }

    public void setFbToken(String fbToken) {
        this.fbToken = fbToken;
    }
}
