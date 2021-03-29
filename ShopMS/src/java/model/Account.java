/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Minh Thanh
 */
public class Account {
    
    private String username;
    private String password;
    private String fullName;
    private int role;

    public Account() {
    }

    public Account(String username, String fullName, int role) {
        this.username = username;
        this.fullName = fullName;
        this.role = role;
    }

    public Account(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public Account(String username, String password, String fullName, int role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", password=" + password + ", fullName=" + fullName + ", role=" + role + '}';
    }

}
