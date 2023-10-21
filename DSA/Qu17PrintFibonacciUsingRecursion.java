public class Qu17PrintFibonacciUsingRecursion {
    static int a =0;
    static int b =1;
    static void printFib(int n){
        if(n==0){
            return ;
        }
        System.out.println(a+" ");
        int c =a+b;
        a =b;
        b =c;
        printFib(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        printFib(n);
    }
}
