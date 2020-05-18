package edu.cscc;

import java.io.File;

/**
 * Implementation of the validator class
 * @author Mutasem Alhariri  01/28/2020
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Validator validator = new Validator(new File("phoneno.dat"));
		
		validator.checkPatterns();
		} 
	}

