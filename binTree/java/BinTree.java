package binTree.java;

/** 
 * this class represents a single node in a binary tree
 * and contains functions that are used in order to
 * navigate the tree
*/
public class BinTree<T extends Comparable<T>> {

    public interface Visit<T> {
        public void visit(T data);
    }
    public class PrintVisit<J> implements Visit<J> {
        public void visit(J data) {
            System.out.println(data);
        }
    }
    /** 
     * the pointers to the left and right of the tree,
     * private variables so as to remain protected
    */
    private BinTree<T> leftPointer = null; //null pointer indicates no tree
    private BinTree<T> rightPointer = null;
    /** 
     * the data stored at this node
    */
    private T data;

    /** 
     * getters for the left and right pointers of the tree
    */
    public BinTree<T> getLeftPointer() {
        return leftPointer;
    }
    public BinTree<T> getRightPointer() {
        return rightPointer;
    }
    public T getData() {
        return data;
    }
    /** inserts the given data into the tree */
    public void insert(T data) {
        if (data.compareTo(this.data) < 0) {
            getLeftPointer().insert(data);
        }
        else if (data.compareTo(this.data) > 0) {
            getRightPointer().insert(data);       
        }
    }

    /** convinence function to set default arguments of vlr*/
    public void vlr() {
        vlr(this,new PrintVisit<T>());
    }
    /** visit left right function */
    public void vlr(BinTree<T> t,Visit<T> v) {
        v.visit(t.data);
        if (t.getLeftPointer() != null) {
            vlr(t.getLeftPointer(),v);
        }
        if (t.getRightPointer() != null) {
            vlr(t.getRightPointer(),v);
        }
    }
}
