package com.apollo.user;

/**
 * Created by alpereninal on 21/12/14.
 */
public class UserDao {

    private String email;
    private boolean isAdmin;

    public UserDao(String email, boolean admin) {
        this.email = email;
        isAdmin = admin;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

}
