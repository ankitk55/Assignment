public class Qu3ReverseString {
    public static void reverse (char [] A){
        int i=0;
        int j =A.length-1;
        while(i<j){
            char tmp =A[j];
            A[j] =A[i];
            A[i] =tmp;
            i++;
            j--;

        }
    } 
    public static void main(String[] args) {
        String s ="AnkitKumar";
        char [] A =s.toCharArray();
        reverse(A);
        for(char a:A){
            System.out.print(a);
        }

    }
}
