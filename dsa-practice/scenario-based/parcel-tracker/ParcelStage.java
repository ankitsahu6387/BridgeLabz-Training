public class ParcelStage {
    private String stageName;
    private ParcelStage next;

    public ParcelStage(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }

    public String getStageName() {
        return stageName;
    }

    public ParcelStage getNext() {
        return next;
    }

    public void setNext(ParcelStage next) {
        this.next = next;
    }
}
