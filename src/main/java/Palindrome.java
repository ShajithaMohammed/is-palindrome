public class Palindrome {
    public boolean check(String sentence) {
        String fmtSnt = sentence.replaceAll("\\W", "");
        return fmtSnt.equalsIgnoreCase(new StringBuilder(fmtSnt).reverse().toString());
    }
}
