/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER;

import java.io.Serializable;

/**
 *
 * @author Shub
 */
public class Staff implements Serializable{
    
    String S_id;
    String s_name;
    String S_email;
    String s_Address;
    String s_graduate;
    String s_post_graduate;
    String s_phd;
    String sex;
    String s_designation;
    String department_id;
    String s_password;
    String s_manager_id;

    public Staff(String S_id, String s_name, String S_email, String s_Address, String s_graduate, String s_post_graduate, String s_phd, String sex, String s_designation, String department_id, String s_password, String s_manager_id) {
        this.S_id = S_id;
        this.s_name = s_name;
        this.S_email = S_email;
        this.s_Address = s_Address;
        this.s_graduate = s_graduate;
        this.s_post_graduate = s_post_graduate;
        this.s_phd = s_phd;
        this.sex = sex;
        this.s_designation = s_designation;
        this.department_id = department_id;
        this.s_password = s_password;
        this.s_manager_id = s_manager_id;
    }

    public String getS_id() {
        return S_id;
    }

    public String getS_name() {
        return s_name;
    }

    public String getS_email() {
        return S_email;
    }

    public String getS_Address() {
        return s_Address;
    }

    public String getS_graduate() {
        return s_graduate;
    }

    public String getS_post_graduate() {
        return s_post_graduate;
    }

    public String getS_phd() {
        return s_phd;
    }

    public String getSex() {
        return sex;
    }

    public String getS_designation() {
        return s_designation;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public String getS_password() {
        return s_password;
    }

    public String getS_manager_id() {
        return s_manager_id;
    }

    
}
