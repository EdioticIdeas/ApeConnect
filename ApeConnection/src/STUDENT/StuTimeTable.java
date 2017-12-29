/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STUDENT;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Shub
 */
public class StuTimeTable implements Serializable{
    
    ArrayList<Day> timetable;

    public StuTimeTable(ArrayList<Day> timetable) {
        this.timetable = timetable;
    }
    
    public static class Day implements Serializable{
    String SubjectName;
    String teacher;
    String room;
    String date;

        public Day(String SubjectName, String teacher, String room, String date) {
            this.SubjectName = SubjectName;
            this.teacher = teacher;
            this.room = room;
            this.date = date;
        }

        public String getSubjectName() {
            return SubjectName;
        }

        public String getTeacher() {
            return teacher;
        }

        public String getRoom() {
            return room;
        }

        public String getDate() {
            return date;
        }
    

    }

    public ArrayList<Day> getTimetable() {
        return timetable;
    }
    
}
