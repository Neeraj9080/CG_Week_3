package circularlinkedlist.taskscheduler;

class TaskInformation
{
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    TaskInformation next;

    // Constructor to of the class
    public TaskInformation(int taskID, String taskName, int priority, String dueDate)
    {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}