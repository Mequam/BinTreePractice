package binTree.java;

//import java.io.*;

public class Test {
    //convinence function because java is silly and does
    //not contain default arguments
    public static int threeNP1(int i) {
        return threeNP1(i,12);
    }
    public static int threeNP1(int i,int n0) {
        if (i == 0)
            return n0;
        
        int nm1 = threeNP1(i-1, n0);
        
        if (nm1 % 2 == 0)
            return nm1/2;
        
        return nm1*3+1;
        
    }
    
    public static void main (String [] args) {
        for (int i = 0; i < 100; i+=1) {
            System.out.println(threeNP1(i));
        }
    } 
}
