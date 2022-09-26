package binTree.java;
import binTree.java.BinTree;
import java.util.*;

public class Test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        BinTree<Integer> intTree = new BinTree<Integer>();

        String line = sc.nextLine();

        String [] splt_inp = line.split(" ");
        for (int i = 0; i < splt_inp.length; i++) {
            try {
                intTree.insert(Integer.parseInt(splt_inp[i]));
            }
            catch (Exception e) {
                System.out.println("[WARNING] invalid integer detected, skipping " + splt_inp[i]);
            }
        }
        
        System.out.println("\n");
        
        //left visit right
        System.out.print("Depth First Traversal: Inorder, LVR -> ");
        intTree.lvr();
        System.out.println("\n");
        
        System.out.print("Depth First Traversal: Inorder, RVL -> ");
        intTree.rvl();
        System.out.println("\n");
        
        System.out.print("Depth First Traversal: Preorder, VLR -> ");
        intTree.vlr();
        System.out.println("\n");

        
        System.out.print("Depth First Traversal: Preorder, VRL -> ");
        intTree.vrl();
        System.out.println("\n");
        
        System.out.print("Depth First Traversal: Postorder, LRV -> ");
        intTree.lrv();
        System.out.println("\n");

        System.out.print("Depth First Traversal: Postorder, RLV -> ");
        intTree.rlv();
        
        System.out.println("\n");
    } 
}