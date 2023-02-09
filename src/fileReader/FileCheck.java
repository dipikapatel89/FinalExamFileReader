package fileReader;

import java.io.File;
import java.util.Scanner;

public class FileCheck {

	public static void main(String[] args) {
		String path = "src/fileReader/Dictonary.txt";
		doesFileExist(path);
	}
	
	public static void doesFileExist(String path)
	{	
		File f = new File(path);
	
		try
		{
			if(f.exists() && !f.isDirectory()) { 
				System.out.println("File Exists");
				
				Scanner scanner = new Scanner(f);

				while (scanner.hasNextLine()) {
					String[] arrStr = scanner.nextLine().split("-", 2);
					for (String str : arrStr)
			            System.out.println(str);
				}

				scanner.close();
			}
			else
			{
				System.out.println("File is not exist");
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}

}
