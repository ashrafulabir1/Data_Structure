package Default;

public class LinearSearch {
	   public static void main(String args[]){
	      int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      int value1 = 63;
	      int value2= 57;
	    
	    	 for (int i=0 ;i< size; i++){
		         if(array[i]==value1 || (array[i]==value2 && array[i]==value1)){
		            System.out.println("Search element is: "+value1+" found at the index of "+ i);
		         }
		            else if(array[i]==value2 || (array[i]==value2 && array[i]==value1)) {
		            	System.out.println("Search element is: "+value2+" found at the index of "+ i);
		            }
		         else{
		            System.out.println("Element not found");
		         
		      }
	     }
	   }
	}