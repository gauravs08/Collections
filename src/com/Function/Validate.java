/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Function;
import com.Form.Bean.LoginBean ;

public class Validate {
public static String validate(LoginBean lb) {
    try{
        if((lb.getUsername().equals("jack"))&&(lb.getPassword().equals("jill")))
                 return "Valid Login" ;
        else
        return "Invalid Login, Please try again." ;
        }
    catch(NullPointerException ex) { // No login data
    return "Please Login." ;
    }
}
}