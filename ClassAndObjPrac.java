/**
 * Calc
 */
class Calculator
 {
public int add(int n1, int n2){
    int r = n1 +n2;
    return r;
}
}

public class ClassAndObjPrac {
    public static void main(String[] args) {
        int num1 = 4; //primitive variable
        int num2 = 5; //primitive variable
        // int sum = num1 + num2;
        // System.out.println(sum);
Calculator calc = new Calculator(); //how we create a new object
int result = calc.add(num1, num2);
System.out.println(result);

    }
}
