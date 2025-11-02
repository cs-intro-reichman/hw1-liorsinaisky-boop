
public class Ascend {
	public static void main(String[] args) {
		int lim = 100;
		double a = (Math.random()*lim);
		double b = (Math.random()*lim);
		double c = (Math.random()*lim);
		double small = Math.min(Math.min(a, b), c);
		double big = Math.max(Math.max(a, b),c);
		double mid = (a+b+c)-big-small;
		System.out.println((int)a+" "+(int)b+" "+(int)c);
		System.out.println((int)small+" "+(int)mid+" "+(int)big);
	}
}
