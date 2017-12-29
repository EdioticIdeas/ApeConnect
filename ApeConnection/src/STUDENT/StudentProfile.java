/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STUDENT;

import java.io.Serializable;

/**
 *
 * @author Shub
 */
public class StudentProfile implements Serializable{

    String rollno,st_name ,g_name ,addmission_date,per_address,temp_address,DOB ,sex ,mobile,email,catgry,department_id;

    public StudentProfile(String rollno) {
        this.rollno = rollno;
    }
    
    public StudentProfile(String rollno, String st_name, String g_name, String addmission_date, String per_address, String temp_address, String DOB, String sex, String mobile, String email, String catgry, String department_id) {
        this.rollno = rollno;
        this.st_name = st_name;
        this.g_name = g_name;
        this.addmission_date = addmission_date;
        this.per_address = per_address;
        this.temp_address = temp_address;
        this.DOB = DOB;
        this.sex = sex;
        this.mobile = mobile;
        this.email = email;
        this.catgry = catgry;
        this.department_id = department_id;
    }

    public String getRollno() {
        return rollno;
    }

    public String getSt_name() {
        return st_name;
    }

    public String getG_name() {
        return g_name;
    }

    public String getAddmission_date() {
        return addmission_date;
    }

    public String getPer_address() {
        return per_address;
    }

    public String getTemp_address() {
        return temp_address;
    }

    public String getDOB() {
        return DOB;
    }

    public String getSex() {
        return sex;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getCatgry() {
        return catgry;
    }

    public String getDepartment_id() {
        return department_id;
    }
    
}
