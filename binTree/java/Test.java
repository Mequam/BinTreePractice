package binTree.java;
import binTree.java.BinTree;
import java.util.*;

public class Test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        BinTree<Integer> intTree = new BinTree<Integer>();

        String line = sc.nextLine();
        do {
            try {
                intTree.insert(Integer.parseInt(line));
            }
            catch (Exception e) {
                System.out.println(e.toString());
                System.out.println("[ERROR] please pass in an integer type!");
            }
            line = sc.nextLine();
        }
        while (!line.equals("d"));

        //construct a test tree


        //visit thel left then right
        System.out.print("[*] vlr ");
        intTree.vlr();
        System.out.println();

        //left visit right
        System.out.print("[*] lvr ");
        intTree.lvr();
        System.out.println();


        System.out.print("[*] lrv ");
        intTree.lrv();
        
        System.out.println();

        
        System.out.print("[*] vrl ");
        intTree.vrl();
        System.out.println();

        System.out.print("[*] rvl ");
        intTree.rvl();
        System.out.println();

        System.out.print("[*] rlv ");
        intTree.rlv();
        System.out.println();
    } 
}