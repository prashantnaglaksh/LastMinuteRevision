package com.java8features.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileReadAndPrintOperation {
	public static void main(String[] args) {
		String fileNmae = "C:\\Users\\SGSLP041\\Downloads\\tset.txt";
		String fileNmae2 = "C:\\Users\\SGSLP041\\Downloads\\tset2.txt";
		try {
//			creating stream by reading from file
			Stream<String> lines = Files.lines(Paths.get(fileNmae));
			
			List<String> ls = filterAndConvertToUpper(lines, 2);
			System.out.println("i am ls ::" + ls);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		writing into a file
		try(PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(fileNmae2)))) {
			String[] arr = new String[] {"Ohh", "Fine"};
			
			Stream.of(arr).forEach(pw::println);
			System.out.println("Words written to the file successfully");
			
			var s = "ok";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static List<String> filterAndConvertToUpper(Stream<String> stream, int length){
		return stream.filter(s -> s.length() == length).map(s -> s.toUpperCase()).collect(Collectors.toList());
	}
}
