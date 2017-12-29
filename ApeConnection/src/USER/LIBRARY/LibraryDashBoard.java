/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER.LIBRARY;
import USER.DashBoard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;



/**
 *
 * @author Shub
 */
public class LibraryDashBoard extends DashBoard implements Serializable{
    
    private double TotalBooks;
    private HashMap<String,Integer>  issueRate;
    private double IssuedBooks;

    public LibraryDashBoard(double TotalBooks, HashMap<String, Integer> issueRate, double IssuedBooks, String name, String id, String email, ArrayList<String> events, ArrayList<String> notices) {
        super(name, id, email, events, notices);
        this.TotalBooks = TotalBooks;
        this.issueRate = issueRate;
        this.IssuedBooks = IssuedBooks;
    }

    
    
     public double getTotalBooks() {
        return TotalBooks;
    }

    public HashMap<String, Integer> getIssueRate() {
        return issueRate;
    }

    public double getIssuedBooks() {
        return IssuedBooks;
    }
    
}
