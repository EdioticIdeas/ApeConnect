/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Shub
 */



public class Lectures {
    private String lectureTime;
    private String subject;
    private String roomId;
    private String semester;

    public Lectures(String lectureTime, String subject, String roomId, String semester) {
        this.lectureTime = lectureTime;
        this.subject = subject;
        this.roomId = roomId;
        this.semester = semester;
    }
}
