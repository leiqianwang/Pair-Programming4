package com.techelevator.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SearchDomainException extends Exception {

	public SearchDomainException(String message) throws FileNotFoundException {
		String fileRead = new String(getMessage());
		try (Scanner domain = new Scanner(fileRead)) {

			PrintWriter searchDomain = new PrintWriter(domain.toString());
			File searchDomainException = new File(message);

			super.getMessage();

		}
	}
}

