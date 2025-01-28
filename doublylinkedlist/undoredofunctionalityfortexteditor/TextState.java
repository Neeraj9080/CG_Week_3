package doublylinkedlist.undoredofunctionalityfortexteditor;

class TextState
{
    String textContent;
    TextState next;
    TextState prev;

    // Constructor of the class
    public TextState(String textContent)
    {
        this.textContent = textContent;
        this.next = null;
        this.prev = null;
    }
}
