class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int row = 0; row < accounts.length; row++){
            int currCustomerWealth = 0;
            for(int col = 0; col < accounts[row].length; col++){
                currCustomerWealth+= accounts[row][col];
            }
            if(currCustomerWealth > maxWealth){
                maxWealth = currCustomerWealth;
            }
        }
        return maxWealth;
    }
}