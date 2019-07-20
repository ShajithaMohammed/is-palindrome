public class Palindrome {
    public boolean check(String sentence) {

        String formattedSentence = sentence.replaceAll("\\W", "").toLowerCase();

        for (int i = 0; i < formattedSentence.length() / 2; i++) {
            if (formattedSentence.charAt(i) != formattedSentence.charAt(formattedSentence.length() - i - 1))
                return false;
        }

        return true;
    }
}
