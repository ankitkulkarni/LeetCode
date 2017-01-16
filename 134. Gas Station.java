public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, netValue = 0, index = 0;
        for(int i = 0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
            netValue += gas[i] - cost[i];
            if(netValue < 0){
                index = i + 1;
                netValue = 0;
            }
        }
        return totalGas < totalCost ? -1 : index;
    }
}