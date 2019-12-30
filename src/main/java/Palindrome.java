public class Palindrome {
    public boolean check(String sentence) {
        if(sentence==null)
            return false;

        String fmtSnt = sentence.replaceAll("\\W", "").toLowerCase();

        for (int i = 0; i < fmtSnt.length() / 2; i++) {
            if (fmtSnt.charAt(i) != fmtSnt.charAt(fmtSnt.length() - i - 1))
                return false;
        }
        return true;
    }
}
