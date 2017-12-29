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
public class StuSubjectAttendence implements Serializable{
    
    ArrayList<Attendence> subjectList;

    public StuSubjectAttendence(ArrayList<Attendence> subjectList) {
        this.subjectList = subjectList;
    }
    
    public static class Attendence implements Serializable{
        String subject;
        String totalClasses;
        String presentCount;

        public Attendence(String subject, String totalClasses, String presentCount) {
            this.subject = subject;
            this.totalClasses = totalClasses;
            this.presentCount = presentCount;
        }

        public String getSubject() {
            return subject;
        }

        public String getTotalClasses() {
            return totalClasses;
        }

        public String getPresentCount() {
            return presentCount;
        }
        
        
    }
}
