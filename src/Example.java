public class Example	{
	public static void main(String[] args) {
		int nParameter = 10;
		printArray(nParameter);	}
	
    public static void printArray(int nParameter) {
         int [] arrayParameter = new int[nParameter];
   
         for(int i = 0 ; i <= nParameter-1 ; i++){
            for(int j = 1 ; j <= i ; j++){
            	
            	++arrayParameter[i];
            	
             //   arrayParameter[i] = j ; 
                
            }     /* End of inner for loop */
        }     /* End of outer for loop */
         
         for (int arrayCount = 0; arrayCount < arrayParameter.length; arrayCount++)	{
        	 System.out.println("\n\t" + arrayParameter[arrayCount]);
         }	// End of printing for loop
    } /* End of printArray */	}	// End of the class
