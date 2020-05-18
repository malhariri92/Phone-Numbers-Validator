package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * validates phone numbers
 * @author Mutasem Alhariri 01/28/2020
 *
 */
public class Validator {
	private	File myFile;
	

	public Validator(File myFile) {
		this.myFile = myFile;
	}
	
	/**
	 * Checks if a phone number matches a valid pattern
	 */
	public void checkPatterns(){
		int line = 1;
		
		try(Scanner input = new Scanner(myFile)){
			
			while(input.hasNext()) {
				String phoneNum = input.nextLine();
				
		if((checkPat1(phoneNum) == false ) && (checkPat2(phoneNum) == false) && (checkPat3(phoneNum) == false)) {
					
					System.out.println("Line "+ line +": Invalid phone number \"" +phoneNum +"\"");					
				}				
		           line++;
			}
			
		System.out.println("Done");	
		
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file");
	    }
	}
	
	
    /**
    * checks if a phone number matches the first pattern
    * @param phoneNum contains phone number to be matched 
    * @return true if the string matches the pattern, false otherwise
    */
	
    public static boolean checkPat1(String phoneNum) {
    	Pattern pat = Pattern.compile("^\\([^0-1]\\d\\d\\)\\s\\d{3}-\\d{4}$");
    	Matcher mat = pat.matcher(phoneNum);
    	
    	boolean result = mat.matches();
    	
    	return result;
    }
    
    /**
     * checks if a phone number matches the second pattern
     * @param phoneNum contains phone number to be matched 
     * @return true if the string matches the pattern, false otherwise
     */
    
    public static boolean checkPat2(String phoneNum) {
    	Pattern pat = Pattern.compile("^[^0-1]\\d\\d-\\d{3}-\\d{4}$");
    	Matcher mat = pat.matcher(phoneNum);
    	
    	boolean result = mat.matches();
    	
    	return result;
    }
    
    /**
     * checks if a phone number matches the third pattern
     * @param phoneNum contains phone number to be matched 
     * @return true if the string matches the pattern, false otherwise
     */
    public static boolean checkPat3(String phoneNum) {
    	Pattern pat = Pattern.compile("^[^0-1]\\d{9}$");
    	Matcher mat = pat.matcher(phoneNum);
    	
    	boolean result = mat.matches();
    	
    	return result;
    }
	
	
	/**
     * checks if a phone number matches any of the three valid patterns
     * @param phoneNum contains phone number to be matched 
     * @return true if the the phone number matches any of the three pattern, false otherwise
     */
    
//	public boolean checkAll(String phoneNum) {
//		
//		Pattern pat = Pattern.compile("^\\(?[^0-1]\\d\\d\\)?[-\\s]?\\d{3}-?\\d{4}$");
//		Matcher mat = pat.matcher(phoneNum);
//		
//		boolean result = mat.matches();
//		
//		return result;
//	}
	

}
