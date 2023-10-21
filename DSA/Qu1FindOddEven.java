import java.util.ArrayList;
import java.util.List;

class Qu1FindOddEven{
    public static void main(String[] args) {
        int []A = new int []{3,4,6,7,12,45,67,88,90};
        List<Integer>even =new ArrayList<>();
        List<Integer>odd =new ArrayList<>();
        
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                even.add(A[i]);
            }else{
                odd.add(A[i]);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}