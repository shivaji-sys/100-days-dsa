Day 1: Friends Pairing Problem


  class Solution {
    public long countFriendsPairings(int n) {
        // code here
        if(n==1 || n==2){
            return n;
        }
        
        long fnm1 = countFriendsPairings(n-1);
        long fnm2 = countFriendsPairings(n-2);
    
        long pairways = (n-1)*fnm2;
        
        long totaways = fnm1 + pairways;
    
        return totaways;
    }
    
}


// TODAYS TASK
// I REVIESD RECURSION.
// SOLVED 1 PROBLEM.
// LEARNED TREES (LCA).
