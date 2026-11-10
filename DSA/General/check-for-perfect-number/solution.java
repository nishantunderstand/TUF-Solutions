class Solution {
    public boolean isPerfect(int n) {
        return forLoopApproach(n);
        // return sqRtApproach(n); // TODO
    }
    
    // Tuesday, November 10, 2026 12:02:26 PM    
    // TC : O(n) | SC : O(1)
    public boolean forLoopApproach(int n) {
        int divSum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                divSum += i;                
            }            
        }
        return divSum==n;
    }
}