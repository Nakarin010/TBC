/*
 * ID: 6588070   NAME: Nakarin Phoorahong
 * SEC: 2
 */

public class Coder {
    private static String code[] = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", 
            "-.--", "--.."};
    //INCOMPLETE
    public static String encode(char c) {
        String str="?";
        //CODE HERE
        c = Character.toLowerCase(c); // to lower the whole input out
        if(c<'a' || c>'z') //if out of this then space
        {
            str = " ";
        }else{
            int position = c - 'a';
            str += " ";
            str = code[position];
            str += " "; // to space between each character like the pdf presented
        
        }

        return str;
    }

}
