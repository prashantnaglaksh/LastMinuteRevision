package com.miscelenous;

import java.io.File;

class FileSearchThread extends Thread {

	// File name and File Directory for every thread
	private final String fileName;
	private final File directory;

	// Constuctor
	public FileSearchThread(String fileName, File directory) {
		this.fileName = fileName;
		this.directory = directory;
	}

	// Run method that calls search method for searching file.
	@Override
	public void run() {
		boolean result = searchFile(fileName, directory);
		if (result) {
			System.out.println("File Found. Location — " + directory.toString());
		}
	}

	private boolean searchFile(String fileName, File directory) {
		// Searching in the directory
		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					// Recursively search in nested directories
					searchFile(fileName, file);
				} else if (file.getName().equalsIgnoreCase(fileName)) {
					System.out.println("File found at: " + file.getAbsolutePath());
					return true;
				}
			}
		}
		return false;
	}
}

public class FileSearch {
	public static void main(String[] args) {
		String fileNameToSearch = "headers";
		// Create a separate thread for each drive and folder
		for (char drive = 'C'; drive <= 'D'; drive++) {
			String rootPath = drive + ":\\";
			// List all directories in the current drive
			File[] directories = new File(rootPath).listFiles(File::isDirectory);
			// If there are directories in the drive
			if (directories != null) {
				// Iterate through each directory
				for (File directory : directories) {
					System.out.println("i am directory ::" + directory);
					// Start a new thread to search for the file in this directory
					new FileSearchThread(fileNameToSearch, directory).start();
				}
			}
		}
	}
}