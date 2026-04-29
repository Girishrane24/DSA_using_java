package classwork;

public class DoublyLL {

    private DoublyNode head;

    public DoublyLL() {
        head = null;
    }

    // Insert at beginning
    public void insertFirst(int d) {
        DoublyNode new_node = new DoublyNode(d);

        if (head == null) {
            head = new_node;
            return;
        }

        new_node.setNext(head);
        head.setPrev(new_node);
        head = new_node;
    }

    // Insert at end
    public void insertLast(int d) {
        DoublyNode new_node = new DoublyNode(d);

        if (head == null) {
            head = new_node;
            return;
        }

        DoublyNode iter = head;
        while (iter.getNext() != null) {
            iter = iter.getNext();
        }

        iter.setNext(new_node);
        new_node.setPrev(iter);
    }

    // Insert by position
    public void insertByPosition(int d, int pos) {
        if (pos <= 0) return;

        if (pos == 1 || head == null) {
            insertFirst(d);
            return;
        }

        DoublyNode new_node = new DoublyNode(d);
        DoublyNode iter = head;

        for (int i = 1; i < pos - 1 && iter.getNext() != null; i++) {
            iter = iter.getNext();
        }

        new_node.setNext(iter.getNext());
        new_node.setPrev(iter);

        if (iter.getNext() != null) {
            iter.getNext().setPrev(new_node);
        }

        iter.setNext(new_node);
    }

    // Delete first
    public int deleteFirst() {
        if (head == null)
            return -999;

        int d = head.getData();
        head = head.getNext();

        if (head != null)
            head.setPrev(null);

        return d;
    }

    // Delete last
    public int deleteLast() {
        if (head == null)
            return -999;

        if (head.getNext() == null) {
            int d = head.getData();
            head = null;
            return d;
        }

        DoublyNode iter = head;
        while (iter.getNext().getNext() != null) {
            iter = iter.getNext();
        }

        int d = iter.getNext().getData();
        iter.setNext(null);

        return d;
    }

    // Delete by position
    public int deleteByPosition(int pos) {
        if (head == null)
            return -999;

        if (pos == 1)
            return deleteFirst();

        DoublyNode iter = head;

        for (int i = 1; i < pos - 1 && iter.getNext() != null; i++) {
            iter = iter.getNext();
        }

        DoublyNode deletable = iter.getNext();

        if (deletable == null)
            return -999;

        int d = deletable.getData();

        iter.setNext(deletable.getNext());

        if (deletable.getNext() != null) {
            deletable.getNext().setPrev(iter);
        }

        return d;
    }
    
    // delete node by position
    public int deletebyPos(int pos)
    {
    	if(head == null || pos  <= 0)
    		return -999;
    	// delete first node
    	if(pos == 1)
    	{
    		int d = head.getData();
    		head = head.getNext();
    		
    		if(head != null)
    			head.setPrev(null);
    		return d;
    	}
    	
    	// Traverse to n-1 position
    	DoublyNode iter= head;
    	for(int i = 1; i< pos - 1 && iter.getNext() != null; i++)
    	{
    		iter = iter.getNext();
    	}
    	DoublyNode deletable = iter.getNext();
    	
    	// Position out of range
    	if(deletable == null)
    		return -999;
    	
    	int d = deletable.getData();
    	
    	// Link previous node to next node
    	iter.setNext(deletable.getNext());
    	
    	// Fix backword Link
    	if(deletable.getNext() != null)
    	{
    		deletable.getNext().setPrev(iter);
    	}
    	return d;
    }

    
    // Delete List 
    public void deletelist()
    {
    	head = null;
    }
    // Display
    public void display() {
        DoublyNode iter = head;
        while (iter != null) {
            System.out.print(iter.getData() + " -> ");
            iter = iter.getNext();
        }
        //System.out.println("null");
    }
}