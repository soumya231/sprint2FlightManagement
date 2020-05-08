package com.capgemini.exception;


@SuppressWarnings("serial")
public class RecordExists extends RuntimeException 
{
	 
		public RecordExists(String exception){
	        super(exception);
	    }
	
}
