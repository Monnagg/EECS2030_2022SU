package Sin;

public class Sin {

	public static double sinC(double x) {
		double result = 0;
		double e,base, powX;
		
		for( int n = 0; n < 49 ; n++ ) {
			e = 2*n +1;
			base = fact(e);
			powX = 1;
			for(int i = 0;i < e ; i++) {
				powX = powX * x;
			}
			
			if(n % 2 == 0) {
				result += powX / base;
			}else {
				result -= powX / base;
			}
			
		}
		return result;
	}
	
	public static double fact(double n) {
		double x = 1;
		for(int i = 1; i <= n ; i++) {
			x = x * i;
		}
		return x;
	}
	public static double factc(double n) {
		if(n == 0) {
			return 1;
		}
		return n * factc(n-1);
	}
}
