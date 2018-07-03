import java.util.regex.Pattern;

public class TwoWord {
    public static void main(String[] args) {
        Pattern regex1 = Pattern.compile("\\b([a-z]+)((?:\\s|<[^>]+>)+)(\\1\\b)", Pattern.CASE_INSENSITIVE);
//        System.out.println("\\>");
    }
}
