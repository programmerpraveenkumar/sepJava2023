package org.example.ExceptionManagement;
/*
throw->Create an error
throws->declare the method as it may return the error
throwable->parent class for exception
 */
public class ThrowError1 {
    public static void main(String[] args) {
        ThrowError1 throwError = new ThrowError1();
        throwError.checkChildAge(5);

        /*
            checkChildAge1 is throws Exception.so it should wrap with try catch.
         */
        try{
            throwError.checkChildAge1(55);
        }catch (CustomException e){
            System.out.println("Exception :: "+e.getMessage());
        }

    }

    public void checkChildAge(int age){
            try{
                if(age >10){
                    throw new CustomException("this is not child");
                }
                System.out.println("this is child");
            }catch (CustomException e){
                System.out.println("Error "+e.getMessage());
            }
    }

    /*
        below method may return error.
     */
    public void checkChildAge1(int age)throws CustomException{
            if(age >10){
                throw new CustomException("this is not child");
            }
            System.out.println("this is child");
    }
}
