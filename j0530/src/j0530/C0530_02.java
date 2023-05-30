package j0530;

import java.util.Scanner;

public class C0530_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String domain = "https://forum.nexon.com";
		String url = "https://forum.nexon.com/asgard";
		
		String[] files = {"fifamobile", "asgard","GodzillaDF","csonline"};
		
		String output1 = url.substring(domain.length()+1);
//		System.out.println(output1);
		
		System.out.println("원하는 페이지를 호출하세요 >> ");
		String input = scan.next();
		
		
		
		for(int i = 0; i < 4 ; i ++) {
			
			if(input.equalsIgnoreCase(files[i])) {
				System.out.println( files[i] + "페이지를 호출하겠습니다.");
			}
			
			
			
		}
		
		
		
		
		
		
//		switch(input) {
//		case "fifamobile":
//			System.out.println("fifamobile - open");
//			break;
//		case "asgard":
//			System.out.println("asgard - open");
//			break;
//		case "GodzillaDF":
//			System.out.println("GodzillaDF - open");
//			break;
//		case "csonline":
//			System.out.println("csonline - open");
//			break;
//		}
//		
		
		
	}

}
