package telran.numbers;

public class Calculator {
	static int res;
public static int sum(int op1, int op2) {
	res = op1 + op2;
	
	return 0;
}
public static int substract(int op1, int op2) {
	res = op1 - op2;
	return res;
}
public static int multiply(int op1, int op2) {
	res = op1 * op2;
	
	return res;
}
public static int devide(int op1, int op2) {
	res = op1 / op2;
	return res;
}

public static int testRemainder(int op1, int op2) {
	res = op1 % op2;
	return res;
}

}
