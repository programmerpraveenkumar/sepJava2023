package org.example.ExceptionManagement;

/*
control over the error.
All the exceptions of the application will be handled in the central place
based on priority take necessary action for the Error.
 */
public class CustomException extends Exception {
    //method name same as the classname
    CustomException(String message){
            super(message);//calling the parent class constructor
            System.out.println("Error"+ message);
    }
}
