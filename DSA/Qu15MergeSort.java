public class Qu15MergeSort {
    static void display(int [] A){
        for(int i=0;i<A.length;i++){
        System.out.print(A[i]+" ");
        }
    }
static void merge(int [] A, int l, int mid , int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int [] left = new int[n1];
        int [] right = new int[n2];
        for(int i=0;i<n1;i++){
            left[i] = A[l+i];
        }
         for(int i=0;i<n2;i++){
            right[i] = A[mid+1+i];
        }
        int i,j,k;
        i=0;
        j=0;
        k=l;
        while(i<n1&&j<n2){
            if(left[i]<right[j]){
                A[k++] = left[i++];
            }
            else{
                A[k++] =right[j++];
            }
        }
        while(i<n1){
              A[k++] = left[i++];
        }
        while(i<n2){
              A[k++] = left[j++];
        }
}
    static void mergeSort(int [] A, int l, int r){
        if(l>=r){
            return;
        }
        int mid   = (l+r)/2;
        mergeSort(A, l, mid);
        mergeSort(A, mid+1, r);
        merge(A, l, mid, r);
}
    public static void main(String[] args) {
        int [] A = {8,55,4,88,45,58,55,89,9,3,36};
        int n = A.length;

        mergeSort(A,0,n-1);
        display(A);

    }
}
