//Time Complexity :O(1)
//Space Complexity :O(1)
//Did this code successfully run on Leetcode :
//Any problem you faced while coding this : No


//Your code here along with comments explaining your approach
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	return (top == -1 ? true : false );
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	boolean insert = true;
    	if(top >= MAX-1) {
    		//checks condition: if top is MAX-1 then its full
    		insert = false;
    	}
        //Write your code here
    	else {
    		a[++top] = x;
    	}
    	return insert;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	int value;
    	if(!isEmpty()) {
    		value = 0;
    		System.out.println("Stack Underflow");
    	}
        //Write your code here
    	else {
    		value = a[top--];
    	}
    	return value;
    } 
  
    int peek() 
    { 
        //Write your code here
    	int value;
    	if(!isEmpty()) {
    		value = 0;
    	}
        //Write your code here
    	else {
    		value = a[top];
    	}
    	return value;
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}