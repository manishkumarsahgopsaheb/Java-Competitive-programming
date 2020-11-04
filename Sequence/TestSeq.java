package Sequence;

import java.text.NumberFormat;
import java.util.Scanner;

public class TestSeq {
    public static void main(String[] args) {
//        int n, seqRec;
//        Scanner scan = new Scanner(System.in);

        NumberFormat form = NumberFormat.getInstance();
        form.setMaximumFractionDigits(7);
        form.setMinimumFractionDigits(7);

        System.out.println("Execution Times in Milliseconds (ms)");

        System.out.println("\nSeqR(n) \t\tOutput_value \t\tRecursive_time");
        for(int i = 20; i <= 40; i+=10) {
            // time consumption by solution a
            long start1 = System.nanoTime();
            int seqA = Seq.seqR(i);
            long end1 = System.nanoTime();
            double time1 = (double) (end1 - start1) / 1000000;
            System.out.println(i + "\t\t\t\t" +seqA+ "\t\t\t\t"+ form.format(time1));
        }

        System.out.println("\nSeqM(n) \t\tOutput_value \t\tMemoization_time");
        for(int i = 20; i <= 40; i+=10) {
            // time consumption by solution b
            long start2 = System.nanoTime();
            int seqB = Seq.seqM(i);
            long end2 = System.nanoTime();
            double time2 = (double) (end2 - start2) / 1000000;
            System.out.println(i + "\t\t\t\t" +seqB+ "\t\t\t\t"+ form.format(time2));
        }

        System.out.println("\nSeqI(n) \t\tOutput_value \t\tIterative_time");
        for(int i = 20; i <= 40; i+=10) {
            // time consumption by solution c
            long start3 = System.nanoTime();
            int seqC = Seq.seqI(i);
            long end3 = System.nanoTime();
            double time3 = (double) (end3 - start3) / 1000000;
            System.out.println(i + "\t\t\t\t" +seqC+ "\t\t\t\t"+ form.format(time3));
        }
    }
}
