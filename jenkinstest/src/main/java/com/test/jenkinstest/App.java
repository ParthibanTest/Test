package com.test.jenkinstest;

public class App 
{

	public static void main( String[] args )
    {
    	int sum;
    	sum = fetchValue()+fetchValue();
    	System.out.println(sum);
    }
    
    public static int fetchValue(){
    	return 10;
    }
    
}
