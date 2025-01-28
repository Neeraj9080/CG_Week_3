package circularlinkedlist.roundrobinschedulingalgorithm;

// Main class to simulate round-robin scheduling
public class RoundRobinSchedulingAlgorithm
{
    public static void main(String[] args)
    {
        RoundRobinScheduler process = new RoundRobinScheduler(3);

        // Adding processes
        process.addProcess(101, 12, 1);
        process.addProcess(102, 4, 2);
        process.addProcess(103, 7, 3);

        // Displaying processes
        process.displayProcesses();

        // Running scheduling
        process.runScheduling();

        // Removing process by its ID
        process.removeProcess(101);

        // Displaying processes after scheduling
        process.displayProcesses();
    }
}