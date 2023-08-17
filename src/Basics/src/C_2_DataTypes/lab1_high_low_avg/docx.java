package C_2_DataTypes.lab1_high_low_avg;


public class docx {

    public static void main(String[] args)
    {
        int[] numbersArray = {9, 8, 10, 12, 18, 20, 21, 5, 36, 3};
        System.out.println("odd number:");
        for (int i=0 ; i<numbersArray.length ; i++)
        {
            if (numbersArray[i]%2 !=0)
            {
                System.out.print(numbersArray[i] + " ");
            }
        }
        System.out.println("Even numbers increase by 2:");
        for (int i=0 ; i<numbersArray.length ; i++)
        {
            if (numbersArray[i] % 2 == 0)
            {
                numbersArray[i]+=2;
            }
            System.out.println("updated Array:" + numbersArray[i]);
        }
        System.out.println("Divide by 3:");
        for (int i=0 ; i<numbersArray.length ; i++)
        {
            if (numbersArray[i]%3 ==0)
            {
                System.out.print(numbersArray[i] + " ");
            }
        }
        //	Print the average of the array.
       double  sum;
        sum = 0;
        for(int i=0;i<numbersArray.length ; i++)
        {
            sum +=numbersArray[i];
        }
        double Average;
        Average=sum / numbersArray.length;
        System.out.println("Average of Array is:" + Average);
        int max = numbersArray[0];
        for (int num : numbersArray) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Highest value: " + max);

        // 6) Print the lowest value
        int min = numbersArray[0];
        for (int num : numbersArray) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Lowest value: " + min);
        //7)	Print every number less than the average
        System.out.println("Numbers less than the average:");
        for (int num : numbersArray) {
            if (num < Average) {
                System.out.print(num + " ");
            }

        }
    }
}
