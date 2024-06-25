package p0625;

public class Point3D extends Point{
	int z;
	
	Point3D(){
		
	}
	
	
	Point3D(int x, int y, int z){
		// 부모의 기본생성자를 만들지 않으면
		// super() 조상생성자 에러발생
		// super(x, y); 매개변수 조상생성자를 직접 입력해야함.
//		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
}
