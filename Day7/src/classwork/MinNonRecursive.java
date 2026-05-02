package classwork;


// not completed
public class MinNonRecursive {
	
	
	public int findMinRec(BTNode node) {
	    if (node.getLeft() == null)
	        return node.getData();

	    return findMinRec(node.getLeft());
	}

}
