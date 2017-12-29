/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER.LIBRARY;

import java.io.Serializable;

/**
 *
 * @author Shub
 */
public class Books implements Serializable{
    
    private final String title, authur , publisher ,GENRE , book_count,issueDate , dueDate , lateFee;

    public Books(String title, String authur, String publisher, String GENRE, String book_count, String issueDate, String dueDate, String lateFee) {
        this.title = title;
        this.authur = authur;
        this.publisher = publisher;
        this.GENRE = GENRE;
        this.book_count = book_count;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.lateFee = lateFee;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthur() {
        return authur;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGENRE() {
        return GENRE;
    }

    public String getBook_count() {
        return book_count;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getLateFee() {
        return lateFee;
    }
}
