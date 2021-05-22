package BST;

public class BTree {

    Node root;

    public BTree(Node root){
        this.root = root;
    }

    public void AddNode(Node NewNode, Node rootExplore){

        if (rootExplore == null) return;

        if (NewNode.value > rootExplore.value){
            if (rootExplore.rightChild == null) rootExplore.rightChild = NewNode;
            else AddNode(NewNode, rootExplore.rightChild);
        }

        if (NewNode.value < rootExplore.value){
            if (rootExplore.leftChild == null) rootExplore.leftChild = NewNode;
            else AddNode(NewNode, rootExplore.leftChild);
        }
    }

    public void Search(int value, Node rootExplore){

        if (rootExplore == null) {
            System.out.println("no value");
            return;
        }

        if (rootExplore.value == value){
            System.out.println("value is founded");
            return;
        }

        if (value > rootExplore.value){
            Search(value, rootExplore.leftChild);
        }

        if (value < rootExplore.value){
            Search(value, rootExplore.leftChild);
        }
    }
}
