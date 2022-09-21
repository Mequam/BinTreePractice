package binTree.java;

/** 
 * this class represents a single node in a binary tree
 * and contains functions that are used in order to
 * navigate the tree
*/
public class BinTree<T extends Comparable<T>> {
    public BinTree(T data) {
        this.data = data;
    }
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
    /** convinence function to safely insert data
     * in nodes to our right
    */
    private void insertRight(T data) {
        if (getRightPointer() == null) {
            rightPointer = new BinTree<T>(data);
        } else {
            getRightPointer().insert(data);
        }
    }
    /** 
     * private convinence function to insert data to the LEFT of the current
     * node safely
    */
    private void insertLeft(T data) {
        if (getLeftPointer() == null) {
            leftPointer = new BinTree<T>(data);
        } else {
            getLeftPointer().insert(data);
        }
    }
    /** inserts the given data into the tree */
    public void insert(T data) {
        if (data.compareTo(this.data) < 0) {
            insertLeft(data);
        }
        else if (data.compareTo(this.data) > 0) {
            insertRight(data);
        }
    }

    /** convinence function to set default arguments of vlr*/
    public void vlr() {
        vlr(new PrintVisit<T>());
    }
    /** visit left right function */
    public void vlr(Visit<T> v) {
        v.visit(data);
        if (getLeftPointer() != null) {
            getLeftPointer().vlr(v);
        }
        if (getRightPointer() != null) {
            getRightPointer().vlr(v);
        }
    }

    public void lvr() {
        lvr(new PrintVisit<T>());
    }
    /**left visit right function */
    public void lvr(Visit<T> v) {
        if (getLeftPointer() != null) {
            getLeftPointer().lvr(v);
        }
        v.visit(data);
        if (getRightPointer() != null) {
            getRightPointer().lvr(v);
        }
    }
}
