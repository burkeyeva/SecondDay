package supercars;

public class Car {
	//Поля класса, по сути несколько
	//переменных описывающие класcmlk
	private int yearModel;
    private String brand;
    private int priceModel;
    private int numberModel;
    public String color;
    public String getBrand()
    {
        return brand;
    }
    public int getPrice()
    {
        return priceModel;
    }
    public void setPrice(int priceModel)                        
    {
        this.priceModel = priceModel;   

    }
    public Car(String b, int year, int price, int number)
    {
        yearModel = year;
        brand = b;
        priceModel = price;
        numberModel = number;      
    }
    //методы
    public void startEngine()                
    {
        System.out.println("VrumVrum");
    }
    public static void SomeFunction() {
    	 System.out.println("HelloWorld");
    }

}
