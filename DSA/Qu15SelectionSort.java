public class Qu15SelectionSort {
    public static void main(String[] args) {
        int [] A= new int []{4,5,3,2,1,5,6,7,8};

        for(int i=0;i<A.length-1;i++){
            int idx =i;
            for(int j=i+1;j<A.length;j++){
                if(A[idx]>A[j]){
                   idx =j;
                }
            }
             int tmp =A[i];
                    A[i] =A[idx];
                    A[idx] =tmp;
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
