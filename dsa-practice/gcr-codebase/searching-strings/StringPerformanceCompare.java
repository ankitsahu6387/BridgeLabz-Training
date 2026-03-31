public class StringPerformanceCompare {

    public static void main(String[] args) {

        int n = 1_000000;

        // StringBuffer test
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            stringBuffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // StringBuilder test
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < n; i++) {
            stringBuilder.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // Output
        System.out.println("StringBuffer Time (ns): " + bufferTime);
        System.out.println("StringBuilder Time (ns): " + builderTime);
    }
}
