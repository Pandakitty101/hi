import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {

        public static void main(String[] args) {

            // 1
            Random rnd = new Random();
            Scanner in = new Scanner(System.in);
            int[] dataPoints;
            dataPoints = new int[100];
            for (int e = 0; e < dataPoints.length; e++) {
                dataPoints[e] = rnd.nextInt(100) + 1;
            }
            for (int e = 0; e < dataPoints.length; e++) {
                System.out.printf("%3d |", dataPoints[e]);
            }

            // 1

            getAverage(dataPoints);
            sum(dataPoints);

            // 2

            int searchTarget = 0;
            searchTarget = SafeInput.getRangedInt(in, "\nEnter a value to search for", 1, 100);
            occurrenceScan(dataPoints, searchTarget);

            // 2c

            contains(dataPoints, searchTarget);

            // 2d

            min(dataPoints);
            max(dataPoints);

        }

        private static double getAverage(int values[])
        {
            double sum = 0;
            for(int e = 0; e < values.length; e++)
            {
                sum = sum + values[e];
            }
            double ave = sum / values.length;
            System.out.println("\n\nAverage of dataPoints is " + ave);
            return ave;
        }
        private static int min(int values[])
        {
            int min = values[0];
            for(int e = 0; e < values.length; e++)
            {
                if(min > values[e])
                {
                    min = values[e];
                }
            }

            System.out.println("\nThe minimum is " + min);
            return min;
        }
        private static int max(int values[]) {
            int max = values[0];
            for (int e = 0; e < values.length; e++) {
                if (max < values[e])
                {
                    max = values[e];
                }
            }

            System.out.println("\nThe maximum is " + max);
            return max;
        }
        private static int occurrenceScan (int values[], int target)
        {
            int repeatedTimes = 0;

            for(int e = 0; e < values.length; e++)
            {
                if (values[e] == target)
                {
                    repeatedTimes = repeatedTimes + 1;
                    System.out.println("The value " + target + " was found at index " + e);
                }
            }

            System.out.println("Found " + target + " " + repeatedTimes + " times");
            return repeatedTimes;
        }
        private static int sum(int values[])
        {
            int sum = 0;
            for(int e = 0; e < values.length; e++)
            {
                sum = sum + values[e];
            }

            System.out.println("\nThe sum of the array dataPoints is " + sum);
            return sum;
        }
        public static boolean contains(int values[], int target)
        {
            boolean foundTarget = false;

            for(int e = 0; e < values.length; e++)
            {
                if (values[e] == target)
                {
                    foundTarget = true;
                }
            }
            if (!foundTarget)
            {
                System.out.println("\nTarget " + target + " not found!");
            }

            return foundTarget;
        }

    }

