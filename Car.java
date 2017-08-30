
public class Car extends Vehicle{
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentGear;

	public Car(String name, String size, int wheels, int doors, int gears,
			boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		currentGear = 1;
	}
	
	public void changeGear(int currentGear){
		this.currentGear = currentGear;
		System.out.println("Car.changeGear(): Change to " + this.currentGear + " gear.");
	}
	
	public void changeVelocity(int velocity, int direction){
		System.out.println("Car.changeVelocity(): Velocity " + velocity + "km direction " + direction);
		move(velocity, direction);
	}

}
/*
 * private String shifting;
	private int windows;
	private String brand;
	
	public Car(int doors, int wheels, String colour, int shiftingGears, String shifting, int windows, String brand) {
		super(doors, wheels, colour, shiftingGears);
		this.shifting = shifting;
		this.windows = windows;
		this.brand = brand;
	}
	
	private void changeGear(){
		System.out.println("Gear changed");
	}
	
	public void goSlow(){
		System.out.println("Car is going slowly!");
		move(50);
	}
	
	public void goFast(){
		changeGear();
		System.out.println("Car is going fast!!");
		move(130);
	}
	
	public void turnRight(){
		handSteering("to the right.");
	}
	
	public void turnLeft(){
		handSteering("to the left.");
	}
	
	public void goingStraight(){
		handSteering("straight.");
	}
 */
// Challenge.

// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.