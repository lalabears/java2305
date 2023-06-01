import java.util.*;


public class StuMain {
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		StuProcess sp = new StuProcess();
		Map<String,Object> map = new HashMap();
		List<Student> list = new ArrayList();

		int choice = 0; 
		int stuCount = 0; 

		list = sp.test();
		System.out.println(list.get(0).getName());
		System.out.println(list.get(1).getName());
		
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
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적삭제");
			System.out.println("5. 학생검색");
			System.out.println("6. 등수처리");
			System.out.println("7. 오름차순 정렬");
			System.out.println("8. 파일 저장하기");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1://성적입력
				
				map = sp.stuInput(list, stuCount);
				list = (List<Student>)map.get("list");
				stuCount = (int)map.get("stuCount");
				break;
			case 2://성적출력
				sp.stuOutput(list);
				break;
			case 3: //성적수정
				break;
			case 4: //성적삭제
				break;
			case 5: //학생검색
				break;
			case 6: //등수처리
				break;
			case 7: //오름차순 정렬
				break;
			case 8: // 파일 저장하기
				System.out.println("파일 저장하기 완료");
				sp.stuSave(list);
				
				break;
			
			case 0: //  프로그램 종료
				break loop;
			
			}
			
			
			
			
			
			
		}
		
	}

}
