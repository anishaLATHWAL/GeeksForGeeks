class MaximumAndValue{
    // code in ide
}
class Solution{
    
    // Function for finding maximum AND value.
      static int checkBit(int pattern, int arr[], int n)
     {
         int count = 0;
         for (int i = 0; i < n; i++)
             if ((pattern & arr[i]) == pattern)
                 count++;
         return count;
     }
 
 
     static int maxAND(int arr[], int n)
     {
         int res = 0, count;
 
         for (int bit = 31; bit >= 0; bit--) {
      
             count = checkBit(res | (1 << bit), arr, n);
 
             if (count >= 2)
                 res |= (1 << bit);
         }
 
         return res;
     }
 }