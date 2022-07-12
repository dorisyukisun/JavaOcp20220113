package com.study.ocp.day22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class WebImageDownload {

	public static void main(String[] args) {
		 String sourcePath = "https://data.whicdn.com/images/261038342/original.gif"; //來源端
		 String destPath ="src/main/java/com/study/ocp/day22/file//original.gif"; //目的端
		  try (InputStream is =getImageStream(sourcePath);
			FileOutputStream fos =new FileOutputStream(destPath);){
			  
			  byte[] buffer =new byte[1];
			  while(is.read(buffer) !=-1) {
				  fos.write(buffer);
			  }
			 
		  }
		  catch(IOException e) {
			  e.printStackTrace();
		  }
	}
	private static InputStream getImageStream(String sourcePath) throws IOException{
		URL url = new URL(sourcePath);
		return url.openStream();
		
	}

}
