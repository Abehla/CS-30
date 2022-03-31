/**
 * vehicle class
 * @author 1100015357
 *
 */
abstract class Vehicle 
{
	private int model;
	private int colour;
	private int weight;
	private double horespower;

	public Vehicle(int M, int Kilos, int C, double HP) 
	{
		model = M ;
		weight = Kilos;
		colour = C;
		horespower = HP;
	}
	
		
	
	 public int GetKilos() {
	 	return(weight);
	 }


	
	 public int GetM() {
	 	return(model);
	 }


	
	 public int getC() {
	 	return(colour);
	 }


	
	 public double getHP() {
	 	return(horespower);
	 }



	abstract String horsepower();
	

	abstract String description();
}