package DSA.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] wt = { 10, 20, 30 };
        int[] val = { 60, 100, 120 };
        double ratios[][] = new double[val.length][2];
        int weight = 50;
        int capacity = weight;
        int finalVal = 0;
        for (int i = 0; i < val.length; i++) {
            ratios[i][0] = i;
            ratios[i][1] = val[i] / (double) wt[i];
        }
        Arrays.sort(ratios, Comparator.comparingDouble(o -> o[1]));
        for (int i = ratios.length - 1; i >= 0; i--) {
            int idx = (int) ratios[i][0];
            if (capacity >= wt[idx]) {
                capacity -= wt[idx];
                finalVal += val[idx];
            } else {
                finalVal += (ratios[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(finalVal);
    }
}
