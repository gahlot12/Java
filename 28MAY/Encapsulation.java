/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Car{
    private String model;
    private String manufacturer;
    private int year;
    
    public Car(String model,String manufacturer,int year){
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
    }
    
     public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Car Supra = new Car("2024 GR", "Toyota", 2024);
		
		System.out.println("Car Details:");
        System.out.println("Manufacturer: " + Supra.getManufacturer());
        System.out.println("Model: " + Supra.getModel());
        System.out.println("Year: " + Supra.getYear());
	}
}
