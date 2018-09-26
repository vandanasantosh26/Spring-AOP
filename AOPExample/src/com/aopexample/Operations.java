package com.aopexample;

public class Operations {
	public void validate(int age)throws Exception{  
	    if(age<18){  
	        throw new ArithmeticException("Not valid age");  
	    }  
	    else{  
	        System.out.println("Thanks for vote");  
	    }  
	    }  
}
