package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTest2 {
	public static void main(String[] args) throws IOException{
		// TODO 과제
		PrintWriter bout = new PrintWriter(
				new BufferedWriter(new FileWriter("C:\\maymin\\JavaWork\\EclipseWork\\test3.txt")));
		
		String input = null;
		while(true) {
			//input = reader.readLine();
			
			if(input == null)
				break;
			bout.println(input);
			bout.flush();
		}
		bout.close();
	}
}