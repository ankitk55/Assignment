public class Qu5PrimeNumbers {
    public static boolean isPrime(int a){
        if(a==1){
            return false;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] A= new int []{1,3,2,5,7,11,45,6,8,9,4,66,87};
        for(int i=0;i<A.length;i++){
        if(isPrime(A[i])){
            System.out.print(A[i]+" ");
        }
    }
    }
}
