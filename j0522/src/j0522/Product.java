package j0522;

public class Product {
	static int count = 0; 
	int serialNo;
	{ // 인스턴스 초기화 블럭
		++count;
		serialNo = count;
	}
	Product(){}

}
