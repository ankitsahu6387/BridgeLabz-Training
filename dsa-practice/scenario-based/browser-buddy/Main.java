public class Main {

    public static void main(String[] args) {

        BrowserTab tab = new BrowserTab();

        // Open pages
        tab.openPage("google.com");
        tab.openPage("github.com");
        tab.openPage("stackoverflow.com");
        tab.showHistory();

        // Navigate back and forward
        tab.back();
        tab.showHistory();

        tab.back();
        tab.showHistory();

        tab.forward();
        tab.showHistory();

        // Close and reopen tab
        tab.closeTab();
        tab.showHistory();

        tab.reopenTab();
        tab.showHistory();

        // Add more pages after reopening
        tab.openPage("leetcode.com");
        tab.showHistory();
    }
}
