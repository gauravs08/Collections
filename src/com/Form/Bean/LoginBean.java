/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Form.Bean;

import java.io.Serializable;
public class LoginBean implements Serializable {
private String username ;
private String password ;
private boolean valid = false ;
public LoginBean() {
}

public String getUsername() {
    return username;
}
public void setUsername(String value) {
    username = value ;
}
public String getPassword() {
    return password;
}
public void setPassword(String value) {
    password = value ;
}
public boolean isValid() {
    valid=false ; // By default assume invalid login attempt
    if((username != null)&&(password != null))
         valid = true ;
    return valid ;
}
}
