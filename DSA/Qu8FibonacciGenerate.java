public class Qu8FibonacciGenerate {
    public static void main(String[] args) {
        int n =10;
        int a =0;
        int b =1;
        for(int i=0;i<10;i++){
            System.out.println(a);
            int c =b+a;
                a =b;
                b =c;
        }

    }
}
