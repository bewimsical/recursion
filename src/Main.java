public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(15)); //print output for recursive factorial
        System.out.println(iterativeFactorial(15)); //print output for iterative factorial
        System.out.println(fibonacci(7)); //print output for recursive fibonacci
    }

    public static int factorial(int n){
        if(n <=1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static int iterativeFactorial(int n){
        int sum = 1;
        for(int i = 2; i<= n; i++){
            sum *= i;
        }
        return sum;
    }

    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return fibonacci(n-2) + fibonacci(n -1);
        }
    }
}