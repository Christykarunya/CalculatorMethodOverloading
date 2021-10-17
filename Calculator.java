package week3.day1;

public class Calculator {

public void add(int x, int y, int z) {
	int sum=x+y+z;
	System.out.println(sum);
}
public void add(int x,int y) {
	int sum=x+y;
	System.out.println(sum);

}
public void mul(int x, int y, int z) {
	int mul=x*y*z;
	System.out.println(mul);
	

}
public void mul(int x, int y) {
	int mul=x*y;
	System.out.println(mul);
	

}
public void div(int x, int y, int z) {
	int div=x/y/z;
	System.out.println(div);
	

}
public void div(int x, int y) {
	int div=x/y;
	System.out.println(div);
	

}
public void sub(int x, int y, int z) {
	int sub=x-y-z;
	System.out.println(sub);
	

}
public void sub(int x, int y) {
	int sub=x-y;
	System.out.println(sub);
	

}
public static void main(String[] args) {
	
	Calculator calc=new Calculator();
	calc.add(2, 3, 4);
	calc.add(2, 3);
	calc.mul(3, 4);
	calc.mul(3, 4, 5);
	calc.div(20, 10);
	calc.div(8, 4, 2);
	calc.sub(6, 3);
	calc.sub(10, 5, 4);
}

}
