/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Shub
 */
    
    public class NoticeList implements Serializable{
        String Title;
        String details;
        String id;

        public NoticeList(String Title, String details, String id) {
            this.Title = Title;
            this.details = details;
            this.id = id;
        }
        
        public String getTitle() {
            return Title;
        }

        public String getDetails() {
            return details;
        }

        public String getId() {
            return id;
        }
    }

