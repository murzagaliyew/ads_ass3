package BST;

public class BTreeMain {

    public static void main(String[] args){

        Node root = new Node(7, null, null);
        BTree bt = new BTree(root);

        for (int i=1; i<10; i++){
            Node newNode = new Node(i, null, null);
            bt.AddNode(newNode, bt.root);
        }

        bt.Search(7, bt.root);
    }
}