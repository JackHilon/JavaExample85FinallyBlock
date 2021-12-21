
package javaexample85finallyblock;


public class JavaExample85FinallyBlock {

    
    public static void main(String[] args) {
        
        // infinity-loop
        while (true) {            
            
            
            try{
                int i = Integer.parseInt("ABCD");
                System.out.println("Try block....");
                break;
            }
            
            catch(Exception e)
            {
                System.out.println("Catch block....");
                continue; // <- unnecessary statement
                // program is executed in finally-block and then it begins a new round
            }
            
            finally 
            {
                System.out.println("Finally block....");
            }
            
            // System.out.println("Out-of-finally-block");
            //      /|\ (error) unreachable-statement
        }
        
        
        
    }
    
}
