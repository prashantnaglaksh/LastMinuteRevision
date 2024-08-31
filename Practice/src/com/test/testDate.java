package com.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//   11/23/2023 12:41:39 PM
public class testDate {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");  
			 LocalDateTime now = LocalDateTime.now();
			 System.out.println("now ::" + now);
			 String sSchedulerStartDate = dtf.format(now);
			 System.out.println("sSchedulerStartDate ::" + sSchedulerStartDate);
			 
			 // Encode the date string
		     String encodedDate = URLEncoder.encode(sSchedulerStartDate, StandardCharsets.UTF_8);
		     System.out.println("encodedDate ::" + encodedDate);
			 
		     String decodedDate = URLDecoder.decode(encodedDate, StandardCharsets.UTF_8);
			 System.out.println("decodedDate ::" + decodedDate);
			 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
