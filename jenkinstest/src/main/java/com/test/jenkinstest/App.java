package com.test.jenkinstest;

public class App 
{
	static int sum;
	
    public static void main( String[] args )
    {
    	sum = fetchValue()+fetchValue();
    	System.out.println(sum);
    }
    
    private static int fetchValue(){
    	return 10;
    }
}
