package j0522;

public class Data {
	
	
	Data(){
		this(1,1);
		
//		num1 = 1; 
//		num2 = 1; 
//		data1 = num1+num2;
//		data2 = num1-num2;
//		data3 = num1*num2;
//		data4 = num1/num2;	
//		
		
	} 
//	Data(int n1, int n2){
//		num1 = n1; 
//		num2 = n2; 
//		data1 = num1+num2;
//		data2 = num1-num2;
//		data3 = num1*num2;
//		data4 = num1/num2;	
//	}
	
	Data(int num1, int num2){
		this.num1 = num1; 
		this.num2 = num2; 
		data1 = num1+num2;
		data2 = num1-num2;
		data3 = num1*num2;
		data4 = num1/num2;	
	}
	
	
	int num1; // 입력받을 1번째 숫자
	int num2; // 입력받을 2번째 숫자
	int data1;// 더하기
	int data2;// 빼가
	int data3;// 곱하기
	int data4;// 나누기
}
