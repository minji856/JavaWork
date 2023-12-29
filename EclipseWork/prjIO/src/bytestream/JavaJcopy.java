package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaJcopy {
	static void copy() throws IOException{
        FileInputStream fin = new FileInputStream("C:\\maymin\\JavaWork\\EclipseWork\\a.txt");
        FileOutputStream fout = new FileOutputStream("C:\\maymin\\JavaWork\\EclipseWork\\b.txt");

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fin.read(buffer)) != -1) {
                fout.write(buffer, 0, bytesRead);
            }

            System.out.println("a.txt 파일이 b.txt로 복사되었습니다.");
            
            fin.close();
    		fout.close();
	}
   
		
	
	static void comp() throws IOException {
		FileInputStream ain = new FileInputStream("C:\\maymin\\JavaWork\\EclipseWork\\a.txt");
		FileInputStream bin = new FileInputStream("C:\\maymin\\JavaWork\\EclipseWork\\b.txt");

		boolean check = true;

		while (true) {
			int aindata = ain.read();
			int bindata = bin.read();
			if (aindata != bindata) {
				check = false;
				break;
			} else if (aindata == -1 && bindata == -1) {
				break;
				}
			}
		
		
		if (check) {
			System.out.println("두 파일의 내용이 같습니다.");
		} else {
			System.out.println("두 파일의 내용이 다릅니다.");
		}
		ain.close();
		bin.close();
	}
	
	public static void main(String[] args) throws IOException {
		copy();
		comp();
	}
}
/*
 * Java Jcopy a.txt b.txt
 * 
 * java Jcomp a.txt b.txt 두개가 같은파일인지 아닌지 비교해서 같은파일입니다,아닙니다 출력
 * 
 * */
