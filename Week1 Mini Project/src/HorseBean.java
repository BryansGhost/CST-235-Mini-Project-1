import java.io.Serializable;
import java.util.Random;


public class HorseBean implements Serializable{
	
	private String name; //horse name
	private int number; //number assigned to horse
	private String color; //color of horse on the message board
	private transient int randomAttribute; //This int will not be save as serializable since it is "transient"
	
	Random rand = new Random();//can be used to set a random attribute for the horse
	
	public HorseBean(){ //empty constructor
	
	}

	public HorseBean(String name, int number, String color){ //overloaded method
		this.name = name;
		this.number = number;
		this.color = color;
	}
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
}
