public class Qu15BubbleSort {
    public static void main(String[] args) {
        int [] A= new int []{4,5,3,2,1,5,6,7,8};

        for(int i=0;i<A.length-1;i++){
            for(int j=0;j<A.length-i-1;j++){
                if(A[j]>A[j+1]){
                    int tmp =A[j];
                    A[j] =A[j+1];
                    A[j+1] =tmp;
                }
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
