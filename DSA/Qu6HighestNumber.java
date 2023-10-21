public class Qu6HighestNumber {
    public static void main(String[] args) {
        int [] A= new int []{1,3,2,5,7,11,45,6,8,9,4,66,87};
        int max =Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
                if(A[i]>max){
                    max =A[i];
                }
        }
        System.out.println(max);
    }
}
