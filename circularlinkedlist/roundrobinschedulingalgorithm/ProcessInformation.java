package circularlinkedlist.roundrobinschedulingalgorithm;

class ProcessInformation
{
    int processID;
    int burstTime;
    int priority;
    ProcessInformation next;

    // Constructor of the class
    public ProcessInformation(int processID, int burstTime, int priority)
    {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}