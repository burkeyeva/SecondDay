package people;
import supercars.Car;

public class CreateCars {

	public static void main(String[] args) {
		Car car = new Car("Audi", 1991, 2000000, 87);
		car.setPrice(1000000);
		System.out.println(car.getPrice());
	}

}
