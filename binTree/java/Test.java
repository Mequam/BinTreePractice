package binTree.java;
import binTree.java.BinTree;

public class Test {
    public static void main(String [] args){
        
        //construct a test tree
        BinTree<Integer> intTree = new BinTree<Integer>(20);
        intTree.insert(10);
        intTree.insert(5);
        intTree.insert(1);
        intTree.insert(15);
        intTree.insert(6);
        intTree.insert(30);
        intTree.insert(25);
        intTree.insert(28);
        intTree.insert(40);


        //visit thel left then right
        System.out.println("[*] starting vlr");
        intTree.vlr();

        //left visit right
        System.out.println("[*] starting lvr");
        intTree.lvr();
    }
}
