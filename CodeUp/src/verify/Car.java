package verify;


public class Car {
	String carNo;
	int inTime;
	int outTime;
	
	public Car(String carNo, int inTime, int outTime) {
		super();
		this.carNo = carNo;
		this.inTime = inTime;
		this.outTime = outTime;
	}
	
	int getFee() { return (outTime - inTime)*2000;}
	
	void prn() {
		System.out.println(carNo + "의 입차 시각 : " + inTime + ", 의 출차 시각 : " + outTime);
		System.out.println("주차요금 : " + getFee());
	}

	public static void main(String[] args) {
         Car car1 = new Car("001",10,14);
         Car car2 = new Car("002",11,15);
         Car car3 = new Car("003",12,19);
         
         car1.prn();
         car2.prn();
         car3.prn();
	}
}
