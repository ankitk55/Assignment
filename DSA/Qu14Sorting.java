public class Qu14Sorting {
    public static void main(String[] args) {  // Same code will run for Numbers, only we have to change TMP variable dataType
        char [] A= new char []{'b','a','c'};

        for(int i=0;i<A.length-1;i++){
            for(int j=0;j<A.length-i-1;j++){
                if(A[j]>A[j+1]){
                    char tmp =A[j];
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
