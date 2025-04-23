package OOP;

public class Car {
	
	private String name;
	private String color;
	private String brand;
	
	private int wheels;
	private int width;
	private int height;	
	private int engine;
	private int weight;

	
	public Car() { 
		this.name = "Default name";
		this.color = "Gray";
		this.brand = "Fake brand";
		
		this.wheels = 4;
		this.width = 200;
		this.height = 150;
		this.engine = 260;
		this.weight = 560;
	}
	
	public Car(String name, String color, String brand, int wheels, int width, int height, int engine, int weight) {
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.wheels = wheels;
		this.width = width;
		this.height = height;
		this.engine = engine;
		this.weight = weight;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color ;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
