public class Qu7Lowest3rdInArray {
    public static void main(String[] args) {
        int [] A= new int []{4,5,5,5,5,5,5};

        int min1 =Integer.MAX_VALUE;
        int min2= Integer.MIN_VALUE;
        int min3 =Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]<min1){
                min3 =min2;
                min2 =min1;
                min1 =A[i];
            }
            else if(A[i]>min1 && A[i]<min2){
                min3 =min2;
                min2 =A[i];

            }
            else if(A[i]>min1 && A[i]>min2 && A[i]<min3){
                min3 =A[i];
            }
        }
        if(min3 ==Integer.MAX_VALUE)
        System.out.println("3 rd element not present ");
        else
        System.out.println(min3);
    }
}
