package verify3;

public class CarRun {

	public static void main(String[] args) {
		Car[] car = new Car[3];
		car[0] = new Bus();
		car[0].drive();
		car[1] = new Taxi();
		car[1].drive(); {
	        for(int i = 0; i < car.length; i++) {
	            if(car[i] instanceof Taxi)
	                System.out.println("정원이 5명이다");
		        }
		}
        car[2] = new Ambulance();
		car[2].drive();    
		    }
		}
		 
		abstract class Car {
		    abstract public void drive();
		}
		 
		class Bus extends Car {
		    public void drive () {
		        System.out.println("40명을 싣고 달린다");
		    }
		}
		 
		class Taxi extends Car {
		    public void drive () {
		        System.out.print("총알처럼 달린다, ");
		    }
		}
		    
	    class Ambulance extends Car {
		    public void drive () {
		        System.out.println("싸이렌을 울리며 달린다");
		    }
}
		
