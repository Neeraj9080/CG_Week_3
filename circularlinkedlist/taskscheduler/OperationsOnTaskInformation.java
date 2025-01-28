package circularlinkedlist.taskscheduler;

// Class to perform operations on tasks
class OperationsOnTaskInformation
{
    TaskInformation head;

    // Constructor
    public OperationsOnTaskInformation()
    {
        head = null;
    }

    // Add a task at the beginning
    public void addAtBeginning(int taskID, String taskName, int priority, String dueDate)
    {
        TaskInformation newTask = new TaskInformation(taskID, taskName, priority, dueDate);
        if (head == null)
        {
            head = newTask;
            newTask.next = head;
        }
        else
        {
            TaskInformation temp = head;
            while (temp.next != head)
            {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
            head = newTask;
        }
    }

    // Add a task at the end
    public void addAtEnd(int taskID, String taskName, int priority, String dueDate)
    {
        TaskInformation newTask = new TaskInformation(taskID, taskName, priority, dueDate);
        if (head == null)
        {
            head = newTask;
            newTask.next = head;
        }
        else
        {
            TaskInformation temp = head;
            while (temp.next != head)
            {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Remove a task by taskID
    public void removeTaskByID(int taskID)
    {
        if (head == null)
        {
            System.out.println("No tasks to remove");
            return;
        }

        TaskInformation temp = head;
        TaskInformation prev = null;
        do
        {
            if (temp.taskID == taskID)
            {
                if (prev != null)
                {
                    prev.next = temp.next;
                }
                else
                {
                    // If the task is head
                    TaskInformation last = head;
                    while (last.next != head)
                    {
                        last = last.next;
                    }
                    head = temp.next;
                    last.next = head;
                }
                System.out.println("Task removed: " + taskID);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task not found");
    }

    // View current task and move to next
    public void viewNextTask()
    {
        if (head == null)
        {
            System.out.println("No tasks available");
            return;
        }
        System.out.println("Current task is " + head.taskName);
        head = head.next;
    }

    // Search for a task by priority
    public void searchByPriority(int priority)
    {
        if (head == null)
        {
            System.out.println("No tasks to search");
            return;
        }
        TaskInformation temp = head;
        do
        {
            if (temp.priority == priority)
            {
                System.out.println("Task found " + temp.taskName);
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("No task with given priority");
    }

    // Display all tasks in the list
    public void displayTasks()
    {
        if (head == null)
        {
            System.out.println("No tasks to display");
            return;
        }
        TaskInformation temp = head;
        do
        {
            System.out.println("Task ID is " + temp.taskID);
            System.out.println("Name is " + temp.taskName);
            System.out.println("Priority is" + temp.priority);
            System.out.println("Due Date is " + temp.dueDate);

            temp = temp.next;
        } while (temp != head);
    }
}