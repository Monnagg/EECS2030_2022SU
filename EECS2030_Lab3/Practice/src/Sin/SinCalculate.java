package Sin;

public class SinCalculate {

	
	public static double mySin(double x) {
		
		double sum = 0;
		
		for(int i = 0;  ; i++) {
			double base = i * 2 + 1 ;
			double powX = 1;
			double f = SinCalculate.factorial(base);
			for(int j = 0; j < base; j++) {
				powX = powX * x;
			}
			if(i % 2 == 0 ) {
				sum += powX / f;
				System.out.println(sum);
			}else {
				sum -= powX / f;
				System.out.println(sum);
			}	
			System.out.println("base: " + base + " powX: " + powX + " f: "+ f + " sum: " + sum);
//			if(Math.abs(sum) < 1) {
//				break;
//			}
			//break;
			if(sum <0) {
				if(-sum < 1) {
					break;
				}
			}else {
				if(sum <1) {
					break;
				}
			}
		}
		double a = Math.sin(30);
		System.out.println("a: " + a);
		return sum;
	}
	
	public static double factorial(double base) {
		
		if(base == 0) {
			return 1;
		}
	
		return base * factorial(base-1);
		
	}
	
	
public static double factorialoop(double n) {
		double result = 1;
		for(int i = 1; i <= n; i++) {
			result = result  * i;
		}
		return result;
	}
}
