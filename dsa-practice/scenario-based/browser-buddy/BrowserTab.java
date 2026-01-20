import java.util.Stack;

public class BrowserTab {

    private PageNode head;
    private PageNode current;
    private Stack<PageNode> closedTabs;

    public BrowserTab() {
        head = null;
        current = null;
        closedTabs = new Stack<>();
    }

    public void openPage(String url) {
        PageNode newPage = new PageNode(url);
        if (head == null) {
            head = newPage;
            current = head;
        } else {
            current.setNext(newPage);
            newPage.setPrev(current);
            current = newPage;
        }
        System.out.println("Opened: " + url);
    }

    public void back() {
        if (current != null && current.getPrev() != null) {
            current = current.getPrev();
            System.out.println("Back to: " + current.getUrl());
        } else {
            System.out.println("No previous page.");
        }
    }

    public void forward() {
        if (current != null && current.getNext() != null) {
            current = current.getNext();
            System.out.println("Forward to: " + current.getUrl());
        } else {
            System.out.println("No forward page.");
        }
    }

    public void closeTab() {
        if (head != null) {
            closedTabs.push(head);
            head = null;
            current = null;
            System.out.println("Tab closed.");
        } else {
            System.out.println("No tab open to close.");
        }
    }

    public void reopenTab() {
        if (!closedTabs.isEmpty()) {
            head = closedTabs.pop();
            current = head;
            System.out.println("Tab reopened: " + current.getUrl());
        } else {
            System.out.println("No recently closed tabs to reopen.");
        }
    }

    public void showHistory() {
        if (head == null) {
            System.out.println("No history available.");
            return;
        }
        System.out.println("Browsing History:");
        PageNode temp = head;
        while (temp != null) {
            if (temp == current)
                System.out.print("[" + temp.getUrl() + "] "); // current page
            else
                System.out.print(temp.getUrl() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
