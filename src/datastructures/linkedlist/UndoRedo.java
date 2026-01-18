package datastructures.linkedlist;
class StateNode {
    String text;
    StateNode prev, next;

    StateNode(String text) {
        this.text = text;
    }
}

class TextEditor {
    StateNode current;

    void addState(String t) {
        StateNode n = new StateNode(t);
        if (current != null) {
            current.next = n;
            n.prev = current;
        }
        current = n;
    }

    void undo() {
        if (current.prev != null)
            current = current.prev;
    }
}

public class UndoRedo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addState("A");
        editor.addState("AB");
        editor.undo();
        System.out.println(editor.current.text);
    }
}
