package com.game.network.messages;

import java.io.Serializable;

public class CreateAccountMessage implements Serializable {
    private String username;
    private String password;

    public CreateAccountMessage(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}