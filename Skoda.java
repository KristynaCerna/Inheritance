
public class Skoda extends Car{
	
	private int roadServisMonths;

	public Skoda( int roadServisMonths) {
		super("Octavia", "Kombi", 5, 5, 6, false);
		this.roadServisMonths = roadServisMonths;
	}
	
	public void accelerate(int rate){
		
		int newVelocity = getCurrentVelocity() + rate; 
		if (newVelocity == 0){
			stop();
			changeGear(1);
		}else if (newVelocity > 0 && newVelocity <= 10){
			changeGear(1);
		}else if (newVelocity > 10 && newVelocity <= 30){
			changeGear(2);
		}else if (newVelocity > 30 && newVelocity <= 55){
			changeGear(3);
		}else if (newVelocity > 55 && newVelocity <= 80){
			changeGear(4);
		}else if (newVelocity > 80 && newVelocity <= 100){
			changeGear(5);
		}else if (newVelocity >100){
			changeGear(6);
		}
		
		if(newVelocity > 0){
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}
	
	
	
}

/*
private String model;

public Skoda(int doors, int wheels, String colour, int shiftingGears, String shifting, int windows, String brand,
		String model) {
	super(5, 4, "blue", 6, "manual", 8, "Skoda");
	this.model = model;
*/