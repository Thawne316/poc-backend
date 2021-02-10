package com.gssp.worklogupdate.model

import groovy.transform.Canonical

@Canonical
class Login {

    private String userName
    private String password

    String getUserName() {
        return userName
    }

    void setUserName(String userName) {
        this.userName = userName
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }
}
