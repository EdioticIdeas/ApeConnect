/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketConnect;

import Util.RequestedType;
import java.io.Serializable;

/**
 *
 * @author Shub
 */
public class Request implements Serializable{
    
    private final String session_id;
    private final String time;
    private final RequestedType type;
    private final Object RequestedObject;

    public Request(String session_id, String time, Object RequestedObject , RequestedType type) {
        this.session_id = session_id;
        this.time = time;
        this.RequestedObject = RequestedObject;
        this.type = type;
    }

    public Request(String time, Object RequestedObject) {
        this.time = time;
        this.RequestedObject = RequestedObject;
        this.session_id = "*";
        type = RequestedType.USERLOGIN;
    }

    public String getSession_id() {
        return session_id;
    }

    public String getTime() {
        return time;
    }

    public RequestedType getType() {
        return type;
    }
    
    public Object getRequestedObject() {
        return RequestedObject;
    }
}
