package j0531;
import java.util.*;
import java.io.*;





public class StuProcess {
	Scanner scan = new Scanner(System.in);
	int stuNo,kor,eng,math,total;
	String name;
	double avg;
	
	void stuSave(List<Student> list) {
		File f = new File("C:/savedata/student.txt");
		FileWriter fw = null;
		String data = "";
		try {
			 fw = new FileWriter(f);
			 for(int i = 0 ; i<list.size();i++) {
				 data +=  list.get(i).getStuNo()+","+
						 list.get(i).getName()+","+
						 list.get(i).getKor()+","+
						 list.get(i).getEng()+","+
						 list.get(i).getMath()+"\r\n"
						 ;
				 
			 }
			 fw.write(data);
				 
			
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	Map<String,Object> stuRead() {
		Map<String,Object> map = new HashMap();
		
		File f = new File("C:/savedata/student.txt");
		List<Student> list = new ArrayList();
		BufferedReader br = null;  
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String[] str = line.split(",");
				list.add(new Student(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4])));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		
		
		System.out.println();
		
		map.put("list", list);
		map.put("stuCount", list.get(list.size()-1).getStuNo());
		return map;
		
		
		
	}
	
	void stuOutput(List<Student> list) {
		System.out.println("[ 학생 성적 출력 ]");
		
		String[] title = { "학번","이름", "국어", "영어", "수학", "합계", "평균","등수" };
		for(int i = 0; i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		for(int i = 0 ; i< list.size();i++) {
			Student s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getStuNo(),s.getName(),
					s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	Map<String,Object> stuInput(List<Student> list, int stuCount) {
		Map<String,Object> map = new HashMap();
		while(true) {
			System.out.println("[ 학생 성적 입력 ]");
			System.out.println(stuCount+ "번째 이름 입력 : >>(0: 이전페이지 이동) ");
			name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전페이지로 이동합니다. ");
				break;
				//				return list; 
			}
			System.out.println("국어 입력 : >> ");
			kor = scan.nextInt();
			System.out.println("영어 입력 : >> ");
			eng = scan.nextInt();
			System.out.println("수학 입력 : >> ");
			math = scan.nextInt();
			
			list.add(new Student(stuCount, name, kor, eng, math));
			stuCount++;
		}
		System.out.println();
		
		map.put("list", list);
		map.put("stuCount", stuCount);
		return map;
	}

}
