import javax.swing.*;

public class RainFall
{
    public static String highestRainFallMonth(String[] name,int[]rain,int highestRain)
    {
        //declare variable to store month with highest rainfall
        String highestMonth = "";

        //loop through each element of array
        for (int i = 0; i < rain.length; i++)
        {
            //check if rain index matches highest rain index
            if (rain[i] == highestRain)
            {   //add name index to highest month variable
                highestMonth += name[i] + " ";
            }
        }
        return highestMonth;

        // eunadjsfh
        // test 1 2 3 jhbkjb
    }

    public static String lowestRainFallMonth(String[] name,int[] rain,int lowestRain)
    {
        //declare variable to store month with highest rainfall
        String lowestMonth = "";
        //loop through each element of array
        for (int i = 0; i < rain.length; i++)
        {
            //check if rain index matches lowest rain index
            if (rain[i] == lowestRain)
            {   //add name index to lowest month variable
                lowestMonth += name[i];
            }
        }
        return lowestMonth;
    }
    //method to calculate highest rainfall
    public static int highestRainFall(int[] rain )
    {
        //declare variable to store highest rainfall and initialise to first index of array
        int highest = rain[0];
        //loop through each element of array
        for (int i = 1; i < rain.length; i++) //loop now starts at 1
        {
            //check each rain element and store highest value in variable highest
            if (rain[i] > highest)
            {
                highest = rain[i];
            }
        }
        return highest;
    }

    public static int lowestRainFall(int[] rain)
    {
        //declare variable to store lowest rainfall and initialise to first index of array
        int lowest = rain[0];
        //loop through each element of array
        for (int i = 1; i < rain.length; i++) //loop now starts at 1
        {
            //check each rain element and store lowest value in variable lowest
            if (rain[i] < lowest )
            {
                lowest = rain[i];
            }
        }
        return lowest;
    }

    public static float calculateAverageMonthOfRainFall(int[] rain)
    {	 //declare and initialise variable to store total
        float total = 0;
        //loop through each element of array
        for (int i = 0; i < rain.length; i++)
        {   //add running total to total count
            total = total + rain[i];
        }
        //calculate average rainfall
        float average = total/rain.length;
        return average;
    }

    public static int totalRainFall(int[] rain)
    {
        int total = 0;
        //loop through each element of array
        for (int i = 0; i < rain.length; i++)
        {   //add running total to total count
            total = total + rain[i];
        }
        return total;
    }
    //main method-execution starts here
    public static void main(String[] args)
    {
        final int[] RAINFALL = new int [12];

        String[] months = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};
        //loop through each element of array
        for (int i = 0; i < months.length; i++)
        {
            int input = Integer.parseInt(JOptionPane.showInputDialog(("Enter Rainfall :" + months[i])));
           // int input = GUI.getInt("Enter Rainfall :" + months[i]);
            //condition to assure a valid value is input
            while(input < 0 || input > 1000)
            {   //re-enter input
                input = Integer.parseInt(JOptionPane.showInputDialog(("Rainfall must be between 0-1000")));
            }
            RAINFALL[i] = input;
        }
        //call highest method and store result in highest variable
        int highest = highestRainFall(RAINFALL);
        //call highest method
        int lowest =  lowestRainFall( RAINFALL);
        //call highest method
        int total = totalRainFall(RAINFALL);
        //call highest method
        float average = calculateAverageMonthOfRainFall(RAINFALL);
        //call highest method
        String highestMonth = highestRainFallMonth(months,RAINFALL,highest);
        //call highest method
        String lowestMonth = lowestRainFallMonth(months,RAINFALL,lowest);

        //print results
        System.out.print("Total Rainfall: " + total +" mm" + "\n"
                + "Average Monthly Rainfall: " + (average) +" mm" +
                "\n" + "Month with most rain: " + highestMonth + "\n"
                + "Month with least rain: " + lowestMonth);

    }
}
