class Solution
{
    static int majorityElement(int arr[], int n)
    {
       int ans = -1;          // optimizite method will be Moores vooting algo but it will noy working here
    HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
                                         
    for (int i = 0; i < n; i++)
    {
        if(freq.containsKey(arr[i]))
        {
            freq.put(arr[i], freq.get(arr[i]) + 1);
        }
        else
        {
            freq.put(arr[i], 1);
        }
        if (freq.get(arr[i]) > n / 2)
            ans = arr[i];
    }
    return ans;
        
    }
}
