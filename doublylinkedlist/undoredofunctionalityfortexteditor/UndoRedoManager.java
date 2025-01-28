package doublylinkedlist.undoredofunctionalityfortexteditor;

// Class to manage the undo/redo functionality
class UndoRedoManager
{
    TextState head, tail, current;
    int maxHistorySize;
    int historyCount;

    // Constructor
    public UndoRedoManager(int maxHistorySize)
    {
        this.maxHistorySize = maxHistorySize;
        this.historyCount = 0;
        head = tail = current = null;
    }

    // Add a new text state to the list
    public void addTextState(String textContent)
    {
        TextState newState = new TextState(textContent);

        // If history count exceeds the max limit, remove the oldest state
        if (historyCount >= maxHistorySize)
        {
            removeOldestState();
        }

        // Add the new state at the end of the list
        if (head == null)
        {
            head = tail = current = newState;
        }
        else
        {
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = tail;
        }

        historyCount++;
    }

    // Remove the oldest state from the list
    private void removeOldestState()
    {
        if (head != null)
        {
            head = head.next;
            if (head != null)
            {
                head.prev = null;
            }
            historyCount--;
        }
    }

    // Performing Undo operation
    public void undo()
    {
        if (current != null && current.prev != null)
        {
            current = current.prev;
            System.out.println("Undo:- " + current.textContent);
        }
        else
        {
            System.out.println("No previous state to undo");
        }
    }

    // Performing Redo operation
    public void redo()
    {
        if (current != null && current.next != null)
        {
            current = current.next;
            System.out.println("Redo:- " + current.textContent);
        }
        else
        {
            System.out.println("No next state to redo");
        }
    }

    // Display the current state of the text editor
    public void displayCurrentState()
    {
        if (current != null)
        {
            System.out.println("Current Text State " + current.textContent);
        }
        else
        {
            System.out.println("No text state available");
        }
    }
}
