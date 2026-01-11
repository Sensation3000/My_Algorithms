public class Fibonacci {
    public static void main(String[] args) {
        //How it works:
        //
        //Start with the two first Fibonacci numbers 0 and 1.
        //Add the two previous numbers together to create a new Fibonacci number.
        //Update the value of the two previous numbers.
        //Do point a and b above 18 times.


        //0, 1, 1, 2, 3, 5, 8, 13, 21
        //0 + 1 = 1
        // 1 + 1 = 2
        // 1 + 2 = 3
        // 2 + 3 = 5
        // 3 + 5 = 8

        //WITH LOOP
        int a = 0;
        int b = 1;
        int resultNumber;

        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < 18; i ++){
            resultNumber = a + b;
            System.out.println(resultNumber);
            a = b;
            b = resultNumber;
        }
    }
}
