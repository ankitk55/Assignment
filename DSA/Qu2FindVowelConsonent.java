public class Qu2FindVowelConsonent {
    public static void main(String[] args) {
        String s ="ankitkumarjadon";                // For Small case Only 
        String vowels="";
        String consonents ="";
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='a'||ch=='e'|| ch =='i' || ch =='o'|| ch=='u'){
                vowels=vowels+ch+" ";
            }else{
                consonents =consonents+ch+" ";
            }
        }
        System.out.println("vowels : "+vowels);
        System.out.println("consonents : "+consonents);
    }
    
}
