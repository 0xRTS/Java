public class Numeric
	{
		//controllo della differenza con una precisione di 10 alla meno 14 ma in relazione alla grandezza dei numeri
		public static boolean approxEqual(double x, double y)
		{
			final double EPSILON = 1E-14;
			double xyMax = Math.max(Math.abs(x), Math.abs(y));
			return Math.abs(x-y) <= EPSILON * xyMax;
		}
	
	}
	