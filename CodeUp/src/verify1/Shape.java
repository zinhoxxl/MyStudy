package verify1;

 public class Shape {
		public void draw() {
	        System.out.println("그린다");
	    }
	    
	}
 
 
class Circle extends Shape { 
		 
    @Override
    public void draw() {
        System.out.println("원을 그린다");
    } 
}

class Rectangle extends Shape { 
	 
    @Override
    public void draw() {
        System.out.println("사각형을 그린다");
    } 
    
}

class Triangle extends Shape { 
	 
    @Override
    public void draw() {
        System.out.println("삼각형을 그린다");
    } 
    
}

