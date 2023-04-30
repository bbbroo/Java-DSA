public class recursion {
    public static void main(String[] args) {
        System.out.println(recursiveiveFactorial(3));
        System.out.println(iterativeFactorial(3));

    }

    public static int recursiveiveFactorial(int number) {
        if (number == 0) {
            return 1;
        } 

        return number * recursiveiveFactorial(number-1);

    }

    public static int iterativeFactorial(int number) {
        int fact = 1;

        if (number == 0) {
            return 1;
        } 
        else {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
        }
        return fact;
    }
    }
        
