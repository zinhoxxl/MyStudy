package verify1;

 public class Shape {
		public void draw() {
	        System.out.println("�׸���");
	    }
	    
	}
 
 
class Circle extends Shape { 
		 
    @Override
    public void draw() {
        System.out.println("���� �׸���");
    } 
}

class Rectangle extends Shape { 
	 
    @Override
    public void draw() {
        System.out.println("�簢���� �׸���");
    } 
    
}

class Triangle extends Shape { 
	 
    @Override
    public void draw() {
        System.out.println("�ﰢ���� �׸���");
    } 
    
}

