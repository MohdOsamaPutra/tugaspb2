package com.example.tugaspb2;

public class User {
    private String username;
    private String pengaruh;
    private int image;

    public User(String username, String pengaruh, int image) {
        this.username = username;
        this.pengaruh = pengaruh;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPengaruh() {
        return pengaruh;
    }

    public void setPengaruh(String pengaruh) {
        this.pengaruh = pengaruh;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

