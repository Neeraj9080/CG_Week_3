package circularlinkedlist.taskscheduler;

// Main class
public class TaskScheduler
{
    public static void main(String[] args)
    {
        OperationsOnTaskInformation taskList = new OperationsOnTaskInformation();

        // Adding tasks
        taskList.addAtBeginning(101, "Task1", 2, "28/01/25");
        taskList.addAtEnd(102, "Task2", 1, "29/01/2025");

        // Displaying tasks
        taskList.displayTasks();

        // Remove a task
        taskList.removeTaskByID(1);

        // Search tasks by priority
        taskList.searchByPriority(1);

        // View next task
        taskList.viewNextTask();

        // Display remaining tasks
        taskList.displayTasks();
    }
}