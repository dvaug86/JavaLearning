public class IfElseDemo {
    public static void main(String[] args) {
        // int x = 28;
        // if (x > 10 && x <= 20)
        // System.out.println("hello");
        // else
        // System.out.println("Bye");

        // int x = 5;
        // int y = 7;

        // if (x > y){
        // System.out.print(x);
        // System.out.print("x is greater than y");
        // }
        // else
        // System.out.print("y is greater than x");
        ///////////////////////////////////////////////////////////////////////

        int x = 5;
        int y = 7;
        int z = 6;

        if (x > y && x > z)
            System.out.print(x);
        else if (y > x && y > z) //save time by saying else if (y>z) because if first statement is false we don't need to know that y is > x
            System.out.print(y);
        else
            System.out.println(z);

    }
}
