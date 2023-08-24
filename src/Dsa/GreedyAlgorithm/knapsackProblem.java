package Dsa.GreedyAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class knapsackProblem {
    //Function to get maximum value
    public static double getMaxValue(ItemValue[] arr, int capacity) {
        //1. Sorting item by profit/weight ratio
        Arrays.sort(arr, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue item1, ItemValue item2) {
                double cpr1 = (double) (item1.profit / item1.weight);
                double cpr2 = (double) (item2.profit / item2.weight);

                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });
        double totalValue = 0;
        for (ItemValue i : arr) {
            int curWt = (int) i.weight;
            int curProfit = (int) i.profit;

            if (capacity - curWt >= 0) {
                //This can be picked whole
                capacity = capacity - curWt;
                totalValue += curProfit;
            } else {
                //Item can be picked whole
                double fraction = ((double) capacity / (double) curWt);
                totalValue += (curProfit * fraction);
                capacity = (int) (capacity - (curWt * fraction));
                break;
            }
        }
        return totalValue;
    }

    //Item value class
    static class ItemValue {
        int profit, weight;

        //Item value function
        public ItemValue(int profit, int wt) {
            this.weight = wt;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        ItemValue[] arr = {
                new ItemValue(25, 5),
                new ItemValue(75, 10),
                new ItemValue(100, 12),
                new ItemValue(50, 4),
                new ItemValue(45, 7),
                new ItemValue(90, 9),
                new ItemValue(30, 3),
        };
        int capacity = 37;

        //function calling
        double maxValue = getMaxValue(arr, capacity);

        //function call
        System.out.println("Maximum profit is: " + maxValue);
    }
}
