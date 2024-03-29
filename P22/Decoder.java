/*
 * ID: 6588070       NAME: Nakarin Phoorahong
 * SEC: 2
 */

public class Decoder {
   
	public Node<String> root;

    public Decoder() {
        root = new Node<String>(""); // root Node has no information.

        addMorse(root, "a", ".-");
        addMorse(root, "b", "-...");
        addMorse(root, "c", "-.-.");
        addMorse(root, "d", "-..");
        addMorse(root, "e", ".");
        addMorse(root, "f", "..-.");
        addMorse(root, "g", "--.");
        addMorse(root, "h", "....");
        addMorse(root, "i", "..");
        addMorse(root, "j", ".---");
        addMorse(root, "k", "-.-");
        addMorse(root, "l", ".-..");
        addMorse(root, "m", "--");
        addMorse(root, "n", "-.");
        addMorse(root, "o", "---");
        addMorse(root, "p", ".--.");
        addMorse(root, "q", "--.-");
        addMorse(root, "r", ".-.");
        addMorse(root, "s", "...");
        addMorse(root, "t", "-");
        addMorse(root, "u", "..-");
        addMorse(root, "v", "...-");
        addMorse(root, "w", ".--");
        addMorse(root, "x", "-..-");
        addMorse(root, "y", "-.--");
        addMorse(root, "z", "--..");
    }
    
    
    //INCOMPLETE    
    //Insert Morse Code.
    @SuppressWarnings("unchecked")
    private void addMorse(Node<String> tree, String letter, String code)
    {
      //CODE HERE
    }
    
    //INCOMPLETE
    // An iterative version of the Morse code decoder
    public String decode(String m) {
        Node<String> ptr = root; // start at root of tree
        String str="?"; // For unknow character, the program must show ?

        // Scan through the Morse String
        // CODE HERE

        return str;
    }


    //INCOMPLETE
    // A Recursive version of the decoder
    public String decodeR(Node<String> n, String m) {
        String str="?"; // For unknow character, the program must show ?
        //CODE HERE
        return str;
    }

    // public wrapper function to hide decodeR()
    public String decode2(String m) {
        return decodeR(root, m);
    }
}
