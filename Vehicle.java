
public class Vehicle {

	private String name;
	private String size; 
	
	private int currentVelocity;
	private int currentDirection;
	
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}
	
	public void steer(int direction){
		this.currentDirection += direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
	}
	
	public void move(int velocity, int direction){
		this.currentVelocity = velocity;
		this.currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at " + currentVelocity + "km in direction " + currentDirection + ".");
	}
	
	public void stop(){
		this.currentVelocity = 0;
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}
}

/*private int doors;
private int wheels;
private String colour;
private int shiftingGears;

public Vehicle(int doors, int wheels, String colour, int shiftingGears) {
	this.doors = doors;
	this.wheels = wheels;
	this.colour = colour;
	this.shiftingGears = shiftingGears;
}

public void move(int speed){
	System.out.println("Car is moving at " + speed);
}

public void handSteering(String direction){
	System.out.println("Car is going " + direction);
} */