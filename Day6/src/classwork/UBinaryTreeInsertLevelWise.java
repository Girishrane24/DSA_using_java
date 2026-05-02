package classwork;

public class UBinaryTreeInsertLevelWise{
public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    
    // Insert multiple nodes level-wise: 1,2,3,4,5
    tree.insertLevelWise(1);  // Root
    tree.insertLevelWise(2);  
    tree.insertLevelWise(3);  
    tree.insertLevelWise(4);     
    tree.insertLevelWise(5);  
    
    System.out.println("Pre Order : ");
    tree.preOrder();
    
    System.out.println("Display Level wise : ");
    tree.disp_levelwise();
	
	}

}