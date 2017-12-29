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
public class Response implements Serializable{

    private final String time;
    private final RequestedType type;
    private final Object requestedObject;

    public Response(String time, RequestedType type, Object requestedObject) {
        this.time = time;
        this.type = type;
        this.requestedObject = requestedObject;
    }

    public String getTime() {
        return time;
    }

    public RequestedType getType() {
        return type;
    }

    public Object getRequestedObject() {
        return requestedObject;
    }
}
