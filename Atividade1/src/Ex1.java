
public class Ex1 {
	
	public static double CalculatePI(int terms) {
		double quarterPI = 0;
		double aux = 1;
		for(double i = 1; i <= terms; i++)
		{
			quarterPI += aux * (1/(2*i-1)); 
			aux *= -1;
		}
		
		return quarterPI * 4;
	}
}
