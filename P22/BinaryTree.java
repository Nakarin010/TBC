/*
 * ID: 6588070  NAME: Nakarin Phoorahong
 * SEC: 2
 */

public class BinaryTree<E extends Comparable<E>> {
    Node<E> root;

    public BinaryTree() {
        root = null;
    }

    // INCOMPLETE
    private String addToSubTree(Node<E> n, E v) {    
    	//CODE HERE
        //add left subtree
        if (v.compareTo(n.getValue())<0) // in case of v less than value of n
        {
            if(n.getLeft() == null){
                n.setLeft(new Node<E>(v));
                return "Leftsubtree("+v+")";
                
        }else {
            // to get to the new place of left subtree that still available
            addToSubTree(n.getLeft(), v);
            return "Leftsubtree("+v+")";
        }

        //add right subtree
        }else if (v.compareTo(n.getValue())>0) // in case of v is greater than value of n 
        {
        if(n.getRight() == null){
            n.setRight(new Node<E>(v));
            return "Rightsubtree("+v+")";
        }else {
            addToSubTree(n.getRight(), v);
            return "Rightsubtree("+v+")";
        }
        }
        return "";
    }

 // INCOMPLETE
    public String add(E v) {
    	//CODE HERE
        if(root == null)
        {
            root = new Node<E>(v);
            return "Root(" + root.getValue() + ")";
        }
        else if (root != null)
        {
            return addToSubTree(root, v);
        }
        return "";
    }

    // INCOMPLETE.
    private void inOrder(Node<E> n) {
       //CODE HERE
        //in order is LVR (left, visit, right)
        if(n==null){
            return;
        }
        //First Left
        inOrder(n.getLeft());
        // Then visit
        System.out.print(n.getValue()+ " ");
        //Then Right
        inOrder(n.getRight());
    }

    // INCOMPLETE.
    // pre order is VLR (visit, left, right)
    private void preOrder(Node<E> n)
    {
        //CODE HERE
        if(n == null)
        {
            return;
        }
        //First visit the first one
        System.out.print(n.getValue() + " ");
        //then left
        preOrder(n.getLeft());
        //then right
        preOrder(n.getRight());
    }

    // INCOMPLETE.
    private void postOrder(Node<E> n)
    {
    	//CODE HERE

        //Post order is LRV (left, right, visit)
        if(n == null)
        {
            return;
        }
        //First is left
        postOrder(n.getLeft());
        //then is right
        postOrder(n.getRight());
        //then visit
        System.out.print(n.getValue() + " ");
    }

    public void traversal()
    {
        System.out.print("Inorder traversal: ");
        inOrder(root);
        System.out.println();
        
        System.out.print("Preorder traversal: ");
        preOrder(root);
        System.out.println();
        
        System.out.print("Postorder traversal: ");
        postOrder(root);
        System.out.println();
    }
}
