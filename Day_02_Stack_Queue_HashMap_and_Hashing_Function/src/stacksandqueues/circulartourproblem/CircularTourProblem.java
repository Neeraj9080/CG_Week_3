package stacksandqueues.circulartourproblem;

// Creating CircularTourProblem class to find starting petrol pump index
public class CircularTourProblem
{
    // Method to find start point
    public static int findStartPoint(int[] petrolPump, int[] distance)
    {
        int totalPetrolPump = 0;
        int totalDistance = 0;
        int currentPetrolPump = 0;
        int start = 0;

        for (int i = 0; i < petrolPump.length; i++)
        {
            totalPetrolPump = totalPetrolPump + petrolPump[i];
            totalDistance = totalDistance +  distance[i];
            currentPetrolPump = currentPetrolPump + (petrolPump[i] - distance[i]);

            // If we cannot reach the next pump, reset start and currentPetrol
            if (currentPetrolPump<0)
            {
                start = (i + 1);
                currentPetrolPump = 0;
            }
        }
        if (totalPetrolPump < totalDistance)
            return -1;

        return start;
    }

    // Main Method
    public static void main(String[] args)
    {
        int[] petrolPump = {12, 3, 9, 2};
        int[] distance = {8, 7, 2, 9};

        int startPoint = findStartPoint(petrolPump, distance);

        // Checking petrol pump found or not
        if (startPoint == -1)
        {
            System.out.println("Starting petrol pump not found");
        }
        else
        {
            System.out.println("Start from pump " + startPoint);
        }
    }
}