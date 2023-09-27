package org.example.ExceptionManagement;

public class ThrowError {
    public static void main(String[] args) {
        ThrowError throwError = new ThrowError();
        throwError.checkChildAge(5);

        /*
            checkChildAge1 is throws Exception.so it should wrap with try catch.
         */
        try{
            throwError.checkChildAge1(55);
        }catch (Exception e){
            System.out.println("Exception :: "+e.getMessage());
        }

    }

    public void checkChildAge(int age){
            try{
                if(age >10){
                    throw new Exception("this is not child");
                }
                System.out.println("this is child");
            }catch (Exception e){
                System.out.println("Error "+e.getMessage());
            }
    }

    /*
        below method may return error.
     */
    public void checkChildAge1(int age)throws Exception{
            if(age >10){
                throw new Exception("this is not child");
            }
            System.out.println("this is child");
    }
}
