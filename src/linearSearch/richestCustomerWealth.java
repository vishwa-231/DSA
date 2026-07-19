package linearSearch;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class richestCustomerWealth {
    public static void main(String[] args){
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int richWealth = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if(sum > richWealth){
                richWealth = sum;
            }
        }
        return richWealth;
    }
}
