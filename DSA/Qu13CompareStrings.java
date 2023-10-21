public class Qu13CompareStrings {
    public static boolean isEqual(String s1, String s2){
        int n =s1.length();
        int m =s2.length();
        if(n!=m){
            return false;
        }else{
            for(int i=0;i<m;i++){
               char ch1 =s1.charAt(i);
                char ch2 =s2.charAt(i);
                if(ch1!=ch2){
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        
        String s1 = "Ankit";
        String s2 ="Ankit";
        System.out.println(isEqual(s1,s2));
    }
}
