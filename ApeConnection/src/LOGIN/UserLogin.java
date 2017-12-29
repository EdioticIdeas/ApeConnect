/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGIN;

import Util.Designation;
import java.io.Serializable;

/**
 *
 * @author Shub
 */
public class UserLogin implements Serializable{
    
    private final String USERNAME;
    private final String PASSWORD;
    private final String Session_id;

    public UserLogin(String USERNAME, String PASSWORD) {
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        Session_id = null;
    }

    public UserLogin(String USERNAME, String PASSWORD, String Session_id) {
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.Session_id = Session_id;
    }

    public String getSession_id() {
        return Session_id;
    }
    
    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    
}
