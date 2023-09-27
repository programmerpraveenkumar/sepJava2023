package org.example.ExceptionManagement;

/*
array will store the value inthe index.
index starts with 0,1,2,3....
 */
public class Exception1 {
    public static void main(String[] args) {
        int numList[] = {10,45,59};//creating array with values
        try{
            System.out.println(numList[10]);//10th index
            System.out.println(25/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bound exception "+e);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException exception "+e);
        }catch(Exception e){
            //catch will work when the error wil be created.
            System.out.println("Common Exception "+e);
        }
        System.out.println("this is the last line of the program...");
    }


}
