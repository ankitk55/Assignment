import java.util.Arrays;

public class Qu15Searching {
    public static int BinarySearch(int [] A, int target){
        Arrays.sort(A);
            int lo =0;
            int hi =A.length-1;
            while(lo<=hi){
                int mid =lo+(hi-lo)/2;
                if(A[mid]==target){
                    return mid;
                }
                else if(A[mid]>target){
                    hi =mid-1;
                }else{
                    lo =mid+1;
                }
            }
            return -1;

    }
        public static int LenearSearch(int [] A, int target){
            int idx =-1;
            for(int i=0;i<A.length;i++){
                    if(A[i]==target){
                        idx =i;
                    }
            }
            return idx;
        }
    public static void main(String[] args) {

                        // Array have Unique Elements
        
        int [] A =new int []{3,5,6,7,8,44,34,23,32};
        int target =32;

        //int idx =LenearSearch(A, target);
        int idx =BinarySearch(A, target);
        if(idx ==-1){
            System.out.println(target+" not present in this Array ");
        }else{
            System.out.println(target+" is present in this Array ");
        }

    }
}
