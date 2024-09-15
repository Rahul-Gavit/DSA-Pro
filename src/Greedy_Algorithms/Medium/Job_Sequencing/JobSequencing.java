package Greedy_Algorithms.Medium.Job_Sequencing;

import java.util.*;

public class JobSequencing {
    public static void main(String[] args) {
        Integer jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 }, { 2, 30 } };

        Arrays.sort(jobInfo, Comparator.comparingDouble(o -> o[1]));

        int deadline = 0;
        int time = 0;
        int jobProfit = 0;

        for (int i = jobInfo.length - 1; i >= 0; i--) {
            if (jobInfo[i][0] > time) {
                deadline++;
                jobProfit += jobInfo[i][1];
                time += jobInfo[i][0];
            }
        }

        System.out.println("total Jobs done within deadline " + deadline);
        System.out.println("total Jobs Profit " + jobProfit);
    }
}
