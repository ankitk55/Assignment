public class Qu10MissingNumber {
    public static void main(String[] args) { // If Array contains element [0-n]
        int [] A = new int []{0,1,2,3,4,5,6,8,9};
        int n =A.length;
        int sum =n*(n+1)/2;
        int sum1 =0;
        for(int i =0;i<n;i++){
                sum1+=A[i];
        }
        System.out.println(sum-sum1);

    }
}
