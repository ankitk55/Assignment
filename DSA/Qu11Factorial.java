public class Qu11Factorial {
    static int fact (int m){
        if(m==1){
            return 1;
        }
        int ans =m*fact(m-1);
        return ans;
    }
    public static void main(String[] args) {
        int n =6;
        int ans = fact(n);
        System.out.println(ans);
    }
}
