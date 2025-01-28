package doublylinkedlist.undoredofunctionalityfortexteditor;

// Main class
public class UndoRedoTextEditor
{
    public static void main(String[] args)
    {
        UndoRedoManager texteditor = new UndoRedoManager(5);
        // Adding text states
        texteditor.addTextState("Example of");
        texteditor.addTextState("Doubly Linked list");
        texteditor.addTextState("This is a text editor");

        // Display current state
        texteditor.displayCurrentState();

        // Perform undo and redo operations
        texteditor.undo();
        texteditor.undo();
        texteditor.redo();
        texteditor.redo();

        // Adding new text state and checking the limit on history
        texteditor.addTextState("Undo/Redo limit test");
        texteditor.displayCurrentState();
    }
}