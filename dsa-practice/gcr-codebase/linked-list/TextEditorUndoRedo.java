class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content = content;
    }
}

class TextEditorHistory {
    private TextState head;
    private TextState tail;
    private TextState current;
    private int size = 0;
    private final int limit = 10;

    void addState(String text) {
        TextState node = new TextState(text);

        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = recalcSize();
        }

        if (head == null) {
            head = tail = current = node;
            size = 1;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        current = node;
        size++;

        if (size > limit) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void showCurrentText() {
        if (current == null) {
            System.out.println("Empty Editor");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }

    private int recalcSize() {
        int count = 0;
        TextState temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class TextEditorUndoRedo {
    public static void main(String[] args) {
        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.showCurrentText();

        editor.undo();
        editor.showCurrentText();

        editor.undo();
        editor.showCurrentText();

        editor.redo();
        editor.showCurrentText();

        editor.addState("Hello Java");
        editor.showCurrentText();
    }
}
