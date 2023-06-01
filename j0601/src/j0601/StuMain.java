package j0601;

import java.util.*;

public class StuMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StuProcess sp = new StuProcess();
		Map<String,Object> map = new HashMap();
		List<Student> list = new ArrayList();

		
		int choice = 0; 
		int stuCount = 0; 
		// interface                  객체 
		
//		list.add(new Student(1,"홍길동",100,100,100));
//		list.add(new Student(2,"유관순",90,90,100));
//		
		System.out.println("[ 학생 성적 프로그램 ]");
		System.out.println("저장된 학생성적 파일을 읽어올까요 ? (1.yes)");
		choice = scan.nextInt();
		if(choice == 1 ) {
			map = sp.stuRead();
			list = (List<Student>)map.get("list");
			stuCount = (int)map.get("stuCount");
			System.out.println(stuCount);
			stuCount++;
			System.out.println("[학생성적 파일이 복사되었습니다. ]");
			
		}			
		
		loop:while(true) {
			System.out.println("[ 학생 성적 프로그램 ]");
			System.out.println("1. 학생 입력");
			System.out.println("2. 학생 출력");
			System.out.println("8. 파일에서 가져오기");
			System.out.println("9. 파일 저장 하기");
			System.out.println("0. 종료");
			System.out.println("--------------------");
			System.out.println("원하는 번호를 입력하세요 >>");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				
				map = sp.stuInput(list, stuCount);
//				list = sp.stuInput(list);
				
				list = (List<Student>)map.get("list");
				stuCount = (int)map.get("stuCount");
				break;
			case 2:
				sp.stuOutput(list);
				break;
			case 8: // 파일에서 가져오기
				
				map = sp.stuRead();
				list = (List<Student>)map.get("list");
				stuCount = (int)map.get("stuCount");
				System.out.println(stuCount);
				stuCount++;
				System.out.println("파일에서 가져오기 완료");
				break;
			case 9:
				System.out.println("파일 저장하기 완료");
				sp.stuSave(list);
				
				break;
			
			case 0:
				break loop;
			
			}
			
			
			
			
			
			
		}
		
		
		
	}

}
