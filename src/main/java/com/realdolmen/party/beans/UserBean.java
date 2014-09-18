package com.realdolmen.party.beans;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
@Named
@SessionScoped
public class UserBean implements Serializable {
    private String name, password;
    private boolean admin;

    public UserBean() {
    }

    public String login(String username) {
        if (username.equals("Tim")) {
            admin = true;
        } else {
            admin = false;
        }
        return "index";
    }

    public String logout() {
        admin = false;
        return "index";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
