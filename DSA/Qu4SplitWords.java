public class Qu4SplitWords {
    public static void main(String[] args) {
        String s = "My name is Ankit Kumar";
        String [] A =s.split(" ");
        for(String word: A){
            System.out.println(word);
        }
    }
}
