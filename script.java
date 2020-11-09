// Function to find a missing number in a given array of numbers
class Main { 
    static int getMissingNo(int K[], int N) 
    { 
        int i, total; 
        total = (N + 1) * (N + 2) / 2; 
        for (i = 0; i < N; i++) 
            total -= K[i]; 
        return total; 
    } 

    // Function that returns the missing number 
    public static void main(String args[]) 
    { 
        int K[] = { 3, 5, 4, 1,}; 
        int missingNo = getMissingNo(K, 5); 
        System.out.println(missingNo); 
    } 
} 
