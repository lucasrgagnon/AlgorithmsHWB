/**
 * Created by lucasgagnon on 2/5/16.
 */
public class IsPalindrome {

    public IsPalindrome() {}

    public Boolean function(String s) {
        if (s == null) {
          throw new NullPointerException();
        } else if (s.isEmpty() || s.length() == 1) {
            return true;
        } else if (Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length()-1))) {
            return function(s.substring(1, s.length()-1));
        } else {
            return false;
        }
    }
}
