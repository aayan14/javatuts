package phase1.codes;



public class LongestSubsequence {

	public static int lis(int arr[]){
		int arrLen[] = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            arrLen[i] = 1; 
        }
        
        for(int i=1; i < arr.length; i++){
            for(int j=0; j < i; j++){
                if(arr[i] > arr[j]){
                    if(arrLen[j] + 1 > arrLen[i]){
                        arrLen[i] = arrLen[j] + 1;  
                    }
                }
            }
        }
        int maxLength = arrLen[0];
        for(int i=1; i < arrLen.length; i++){
            if(arrLen[i] > maxLength){
                maxLength = arrLen[i];
            }
        }
        for(int i=0; i < arrLen.length; i++){
        	System.out.println(arrLen[i]);
            
        }
        
        return maxLength;
	}
		
	
	public static void main(String[] args) {
		int arr[] = {10,9,2,5,3,7,101,18};
		int result = lis(arr);
		System.out.println("Length of largest increasing subsequence is: " + result);
	}

}
