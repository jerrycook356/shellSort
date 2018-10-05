/**uses larger gap to pre sort some of the elements then uses insertion sort. this is done to lessen
 * the amount of iterations that insertion sort uses. using a gap of length/2 on each
 * iteration divide the gap by 2
 * @author jerry
 *
 */


public class ShellSortMain {
	
	public static void main(String[] args) {
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		
		shellSort(intArray);	
		print(intArray);
		
	}
	
	public static void print(int[] intArray)
	{
		for(int i = 0; i < intArray.length;i++)
			System.out.println(intArray[i]);
	}
	
	public static void shellSort(int[] intArray) {
		for(int gap = intArray.length /2; gap >0; gap /=2) {
			
			for(int i = gap ; i < intArray.length;i++) {
				
				int newElement = intArray[i];
				int j = i;
				while(j >= gap && intArray[j-gap] > newElement)
				{
					intArray[j] = intArray[j-gap];
					
					j -= gap;
					
				}
				intArray[j] = newElement;
			}
		}
	}

}
