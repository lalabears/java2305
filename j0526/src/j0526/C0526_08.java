package j0526;

import java.util.Scanner;

public class C0526_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "안녕하세요. 반갑습니다. 좋은 하루 되세요. 오늘은 불금요 완전 좋음요";
		//            012346   789012   34  56 7890  123   456  78  901
		System.out.println("찾고자하는 문자를 입력하세요>>");
		String search = scan.next();
		
			

		int searchNum = -1;
		int count = 0; 
	
		// 반복문을 사용해서 입력한 글자가 몇번나오는지? 
		while(true) {
			
			searchNum = str.indexOf(search,searchNum+1);
			if(searchNum != -1) {
				count++;
				System.out.println("찾는 위치: " +  searchNum);
			}
			else {
				break;
			}
		}
		
		System.out.println(count);
		
		
	}

}
