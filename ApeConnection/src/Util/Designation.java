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
public enum Designation {
    STAFF{

        @Override
        boolean isStaff() {
           return true;
        }

        @Override
        boolean isStudent() {
            return false;
        }

        @Override
        boolean islibrarian() {
            return false;
        }

        @Override
        boolean isFeecollector() {
            return false;
        }

        @Override
        boolean isAdmin() {
            return false;
        }
    },
    ADMIN {

        @Override
        boolean isStaff() {
            return false;
        }

        @Override
        boolean isStudent() {
            return false;
        }

        @Override
        boolean islibrarian() {
            return false;
        }

        @Override
        boolean isFeecollector() {
            return false;
        }

        @Override
        boolean isAdmin() {
           return true;
        }
    },
    LIBRARIAN {

        @Override
        boolean isStaff() {
            return false;
        }

        @Override
        boolean isStudent() {
            return false;
        }

        @Override
        boolean islibrarian() {
           return true;
        }

        @Override
        boolean isFeecollector() {
            return false;
        }

        @Override
        boolean isAdmin() {
            return false;
        }
    },
    FEECOLLECTOR {

        @Override
        boolean isStaff() {
            return false;
        }

        @Override
        boolean isStudent() {
            return false;
        }

        @Override
        boolean islibrarian() {
            return false;
        }

        @Override
        boolean isFeecollector() {
           return true;
        }

        @Override
        boolean isAdmin() {
            return false;
        }
    },
    STUDENT {

        @Override
        boolean isStaff() {
            return false;
        }

        @Override
        boolean isStudent() {
           return true;
        }

        @Override
        boolean islibrarian() {
            return false;
        }

        @Override
        boolean isFeecollector() {
            return false;
        }

        @Override
        boolean isAdmin() {
            return false;
        }
    },
    ;
    abstract boolean isStaff();
    abstract boolean isStudent();
    abstract boolean islibrarian();
    abstract boolean isFeecollector();
    abstract boolean isAdmin();
    
}
