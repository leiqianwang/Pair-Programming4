package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchDomainException;
import com.techelevator.search.SearchEngine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Application {

	private static Object Log;

	public static void main(String[] args) throws FileNotFoundException {

		 try {
		// Step Two: Create TELog, and log the start of the application.

	         TELog.log("Search application started");


			// Step Four: Instantiate a Search Domain
			SearchDomain searchDomain = new SearchDomain("data");
			 TELog.log("Indexed files:\n"+ searchDomain);



	// Step Six: Single word search
			 SearchEngine se = new SearchEngine(searchDomain);
                      se.indexFiles();
                      List<String> foundInFiles = se.search("squirrel");
                     if (foundInFiles.size() > 0) {
                      for (String file : foundInFiles) {
                              System.out.println(file);
                      }
                     } else {
                     	System.out.println("The search term does not appear in any of the indexed files.");
					 }

                     foundInFiles = se.search("Larry");
                     if (foundInFiles.size() > 0) {
                              for (String file : foundInFiles) {
                                     System.out.println(file);
                             }                      } else {
                     	System.out.println("The search term does not appear in any of the indexed files.");
					 }

                     //Step Seven: Multiple word search

			 se.indexFiles();
			 foundInFiles = se.search("telephone line");
			 if (foundInFiles.size() > 0) {

				 for (String file : foundInFiles) {
					 System.out.println(file);
				 }
			 } else {
				 System.out.println("The search term does not appear in any of the indexed files.");
			 }
		 }
		 catch (SearchDomainException e) {
			 e.printStackTrace();
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}
}


			
			





