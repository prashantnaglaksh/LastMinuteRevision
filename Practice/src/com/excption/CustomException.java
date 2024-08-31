package com.excption;

public class CustomException extends Exception {
    CustomException(String s){
        super(s);
    }

    public static void main(String[] args) {
        try{
            CustomException customException = new CustomException(
                    "i am a custom exception");
            //throw new CustomException("ok boss");
            throw customException;
        }catch (CustomException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Always keep genric " +
                    "expetion in lower catch block");
        }
    }
}
