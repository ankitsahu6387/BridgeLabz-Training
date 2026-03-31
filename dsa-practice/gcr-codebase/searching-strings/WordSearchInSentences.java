public class WordSearchInSentences {

    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // first matching sentence
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a powerful language",
            "I love solving problems",
            "Linear search is simple to understand",
            "Practice makes you better"
        };

        String word = "search";
        String result = findSentence(sentences, word);

        System.out.println(result);
    }
}
