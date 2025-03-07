class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root == null){
            return true;

        }
        
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(this.isEmpty()){
            root = node;
        }else{
            node.next = root;
            root = node;
        }
    } 
  
    public int pop() 
    { 	
	
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int top_element = root.data;
            root = root.next;
            
            return top_element;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 