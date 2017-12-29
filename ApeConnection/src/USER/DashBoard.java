/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Shub
 */
public class DashBoard implements Serializable{

    private final String name;
    private final String id;
    private final String email;
    private final ArrayList<String> events;
    private final ArrayList<String> notices;
    

    public DashBoard(String name, String id, String email, ArrayList<String> events, ArrayList<String> notices) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.events = events;
        this.notices = notices;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    
    public String getName() {
        return name;
    }

    public ArrayList<String> getEvents() {
        return events;
    }

    public ArrayList<String> getNotices() {
        return notices;
    }
   
}
