package circularlinkedlist.roundrobinschedulingalgorithm;

// Class to perform the round-robin scheduling
class RoundRobinScheduler
{
    ProcessInformation head;
    int timeQuantum;

    // Constructor
    public RoundRobinScheduler(int timeQuantum)
    {
        this.head = null;
        this.timeQuantum = timeQuantum;
    }

    // Add a new process at the end of the circular list
    public void addProcess(int processID, int burstTime, int priority)
    {
        ProcessInformation newProcess = new ProcessInformation(processID, burstTime, priority);
        if (head == null)
        {
            head = newProcess;
            newProcess.next = head;
        }
        else
        {
            ProcessInformation temp = head;
            while (temp.next != head)
            {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    // Remove a process after its execution
    public void removeProcess(int processID)
    {
        if (head == null)
        {
            System.out.println("No processes to remove");
            return;
        }

        ProcessInformation temp = head;
        ProcessInformation prev = null;
        do
        {
            if (temp.processID == processID)
            {
                if (prev != null)
                {
                    prev.next = temp.next;
                }
                else
                {
                    ProcessInformation last = head;
                    while (last.next != head)
                    {
                        last = last.next;
                    }
                    head = temp.next;
                    last.next = head;
                }
                System.out.println("Process removed " + processID);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Process not found");
    }

    // Simulate the round-robin scheduling
    public void runScheduling()
    {
        if (head == null)
        {
            System.out.println("No processes to schedule");
            return;
        }

        ProcessInformation temp = head;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int totalProcesses = 0;

        while (temp != null)
        {
            int burst = temp.burstTime;
            if (burst > timeQuantum)
            {
                temp.burstTime -= timeQuantum;
                totalWaitingTime += timeQuantum;
            }
            else
            {
                totalTurnAroundTime += (totalWaitingTime + burst);
                totalWaitingTime += burst;
                removeProcess(temp.processID); // Remove completed process
            }
            totalProcesses++;
            temp = temp.next;
        }

        System.out.println("Average Waiting Time is " + totalWaitingTime / totalProcesses);
        System.out.println("Average Turnaround Time is " + totalTurnAroundTime / totalProcesses);
    }

    // Display the processes in the circular list
    public void displayProcesses()
    {
        if (head == null)
        {
            System.out.println("No processes to display");
            return;
        }

        ProcessInformation temp = head;
        do
        {
            System.out.println("Process ID is " + temp.processID);
            System.out.println("Burst Time is " + temp.burstTime);
            System.out.println("Priority is " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}
