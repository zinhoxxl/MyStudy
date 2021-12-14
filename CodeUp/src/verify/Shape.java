package verify;

public class Shape {
	public void draw() {
        System.out.println("그린다");
    }
    
}

class Circle extends Shape { // 원 클래스 => 도형(Shape) 클래스를 상속받아 정의
	 
    // Shape 클래스의 draw() 메서드 오버라이딩
    // => "원 그리기!" 로 메서드 작업 변경
    @Override
    public void draw() {
        System.out.println("원을 그린다");
    } 
}