import java.util.*;
abstract class Car {
	protected boolean isSedan;
	protected String seats;
	
	public Car() {
	
	}

	public Car(boolean isSedan, String seats){
		this.isSedan = isSedan;
		this.seats = seats;
	}
	public boolean getIsSedan(){
		return this.isSedan;
	}
	public String sedanLogic(){
		if(this.getIsSedan()==true)
			return "is Sedan";
		else
			return "is not Sedan";
	}
	public String getSeats(){
		return this.seats;
	} 
	public abstract String getMileage();	
}

class WagonR extends Car{
	private String mileage;

	public WagonR(Integer mileage) {
		super(false, "4");
		this.mileage = mileage + " kmpl";
		System.out.println("A WagonR " + sedanLogic() + ",is " + getSeats() + " seater,and has a mileage of " + getMileage());
	}

	public String getMileage() {
		return this.mileage;
	}
}

class HondaCity extends Car{
	private String mileage;

	public HondaCity(Integer mileage) {
		super(true, "4");
		this.mileage = mileage + " kmpl";
		System.out.println("A HondaCity " + sedanLogic() + ",is " + getSeats() + " seater,and has a mileage of " + getMileage());
	}

	public String getMileage() {
		return this.mileage;
	}
	
}
class InnovaCrysta extends Car{
	private String mileage;

	public InnovaCrysta(Integer mileage) {
		super(false, "6");
		this.mileage = mileage + " kmpl";
		System.out.println("A InnovaCrysta " + sedanLogic() + ",is " + getSeats() + " seater,and has a mileage of " + getMileage());
	}

	public String getMileage() {
		return this.mileage;
	}
	
}
class CarShowroom {
	public static void getCar(int type, int mileage) {
		boolean b = true;
		while (b) {
			switch (type) {
				case 0:
					new WagonR(mileage);
					b = false;
					break;
				case 1:
					new HondaCity(mileage);
					b = false;
					break;
				case 2:
					new InnovaCrysta(mileage);
					b = false;
					break;
				default:
					System.out.println("No Such Car is available");
					b = false;
					break;
			}
		}
	}
}
class TestVehicle{
	public static void main(String args[]) {
		CarShowroom carShowroom = new CarShowroom();
		Scanner scanner = new Scanner(System.in);
		int type = scanner.nextInt();
		int mileage = scanner.nextInt();
		CarShowroom.getCar(type, mileage);
		}
	}

