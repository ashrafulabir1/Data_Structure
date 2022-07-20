package Default;

public class LinearSearch {
	   public static void main(String args[]){
	      int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      int value = 63;

	      for (int i=0 ;i< size; i++){
	         if(array[i]==value){
	            System.out.println("Search element is: "+value+" found at the index of "+ i);
	         }else{
	            System.out.println("Element not found");
	         }
	      }
	   }
	}