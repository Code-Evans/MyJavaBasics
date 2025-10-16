package Programming_Challenges;



public class ReverseWord {

    // Main method: where we test everything
    public static void main(String[] args) {
        
        String word = "Adrian";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println("Reversed: " + reversed);

    }

}
