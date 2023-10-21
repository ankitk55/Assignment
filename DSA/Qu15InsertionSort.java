public class Qu15InsertionSort {
    public static void main(String[] args) {
        int [] A= new int []{4,5,3,2,1,5,6,7,8};
        int n =A.length;
          for(int i=1;i<n;i++){
            int val =A[i];
            int j =i-1;
            while(j>=0&&A[j]>val){
                A[j+1] =A[j];
                j--;
            }
            A[j+1] =val;
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
}
