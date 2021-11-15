package com.helper.com;

public class FileReaderManager {
	private FileReaderManager() {
	}
	
public FileReaderManager getInstanceFR() {
	FileReaderManager fr=new FileReaderManager();
	return fr;
}
public static ConfigurationReader getInstanceCR() throws Throwable {
	ConfigurationReader cf=new ConfigurationReader();
	return cf;

}

}
