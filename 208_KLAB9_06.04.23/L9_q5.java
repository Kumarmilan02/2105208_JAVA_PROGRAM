/*Define Write a java program to implement a stack class having methods push
() and pop(). These methods must be designed to throw user-defined
exceptions when the stack is empty or full.*/
class Stack 
{
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int maxSize) 
    {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) throws StackFullException 

    {
        if (isFull()) 
        {
            throw new StackFullException("Exception: Stack is full.");
        } 
        else 
        {
            stackArray[++top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

    // Method to pop an element from the stack
    public int pop() throws StackEmptyException 
    {
        if (isEmpty()) 
        {
            throw new StackEmptyException("Exception: Stack is empty.");
        } 
        else 
        {
            int value = stackArray[top--];
            System.out.println("Popped element: " + value);
            return value;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() 
    {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() 
    {
        return (top == maxSize - 1);
    }
}

// Custom exception class for stack full
class StackFullException extends Exception 
{
    public StackFullException(String message) 
    {
        super(message);
    }
}

//
class StackEmptyException extends Exception 
{
    public StackEmptyException(String message) 
    {
        super(message);
    }
}

class L9_q5
{
    public static void main(String[] args) 
    {
        Stack stack = new Stack(5);

        try 
        {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            // Uncomment the line below to test stack full exception
            //stack.push(60);

            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
			// Uncomment the line below to test stack empty exception
            stack.pop();
        } 
        catch (StackFullException | StackEmptyException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
