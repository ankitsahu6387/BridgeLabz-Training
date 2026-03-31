public class StringConcatPerformance {

    public static void main(String[] args) {
        int n = 100000; // increase to test more
        // Using String
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "hello";
        }
        long end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + " ms");
        // Using StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");
        // Using StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuf.append("hello");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");
    }
}
