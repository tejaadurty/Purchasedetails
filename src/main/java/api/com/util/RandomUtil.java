package api.com.util;

import java.util.Random;

public class RandomUtil {

	
	public static String generaterandomstring() {
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 StringBuilder sb = new StringBuilder();
	 Random random = new Random();
	 int length=7;
	 for(int i=0;i<length;i++) {
		int index= random.nextInt(alphabet.length());
		char randomChar = alphabet.charAt(index);
		 sb.append(randomChar);
		 
		 
	 }
	 String randomString = sb.toString();
	    System.out.println("Random String is: " + randomString);
		return randomString;

	}
	
	
	public static String generaterandomEmail() {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		 Random random = new Random();
		 int length=6;
		 for(int i=0;i<length;i++) {
			int index= random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			 sb.append(randomChar);
			 
			 
		 }
		 String randomEmail = sb.toString()+ "@mail.com";
		    System.out.println("Random String is: " + randomEmail);
			return randomEmail;
		 
		
	}
}
