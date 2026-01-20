public class PageNode {
    private String url;
    private PageNode prev;
    private PageNode next;

    public PageNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }

    public String getUrl() {
        return url;
    }

    public PageNode getPrev() {
        return prev;
    }

    public void setPrev(PageNode prev) {
        this.prev = prev;
    }

    public PageNode getNext() {
        return next;
    }

    public void setNext(PageNode next) {
        this.next = next;
    }
}
