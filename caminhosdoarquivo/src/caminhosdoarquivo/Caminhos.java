package caminhosdoarquivo;

import java.io.File;
import java.util.Scanner;

public class Caminhos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the folder path:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: "+ path.getName());
		System.out.println("getPrent: "+ path.getParent());
		System.out.println("getPath: "+ path.getPath());
		sc.close();


	}

}
