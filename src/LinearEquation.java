import java.util.Scanner;

public class LinearEquation {
	public static void main(String[] args) {
		//���ϥΪ̿�J��
		System.out.println("input a,b,c,d,e,f : ");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = scanner.nextDouble();
		double f = scanner.nextDouble();
		//�إߤ@��calculate����
		Calculate calculate = new Calculate(a, b, c, d, e, f);
		System.out.println("your a,b,c,d,e,f are : " + 
		calculate.getA()+ " , " + calculate.getB()+ " , " + calculate.getC()+ " , " +  
		calculate.getD()+ " , " + calculate.getE()+ " , " + calculate.getF());
	
		//�̷�isSolvable ��X���Presult
		if (calculate.isSolvable() == true)
			System.out.println("x = " + calculate.getX() + " , y = " + calculate.getY());
		else
			System.out.println("The Eqution Has No Solution.");

	}

}

class Calculate {
	
	//private data field a b c d e f
	private double a, b, c, d, e, f;
	private double x, y;
	
	//test�ण��p��
	boolean isSolvable() {
		if (a * d != b * c) 
			return true;
		else
			return false;
	}
	//constructor for a b c d e f 
	Calculate(double A, double B, double C, double D, double E, double F) {
		a = A; b = B; c = C; d = D; e = E; f = F;
	}

	//six "Get" methods
	double getA() {
		return a;
	}

	double getB() {
		return b;
	}

	double getC() {
		return c;
	}

	double getD() {
		return d;
	}

	double getE() {
		return e;
	}

	double getF() {
		return f;
	}
	//getX,Y return the solution
	double getX() {
		x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
		return x;
	}

	double getY() {
		y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
		return y;
	}

}