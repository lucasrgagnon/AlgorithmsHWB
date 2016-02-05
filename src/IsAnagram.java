/**
 * Created by lucasgagnon on 2/5/16.
 */
public class IsAnagram {

    public IsAnagram(){}

    /**
     * Main fucntion for IsAnagram
     * @param s1 Sting with no spaces
     * @param s2 Sting with no spaces
     * @return Boolean whether s1 and s2 are anagrams
     */
    public Boolean function(String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        } else if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        int index = s2.indexOf(s1.charAt(0));
        if (index != -1) {
            return function(stripString(s1, 0), stripString(s2, index));
        } else {
            return false;
        }
    }

    /**
     * Returns string s1 with character at index removed
     * @param s1 nonempty string
     * @param index int
     * @return string
     */
    private String stripString(String s1, int index) {
        if (index == 0){
            return s1.substring(1, s1.length());
        } else if (index == s1.length()-1) {
            return s1.substring(0, s1.length()-1);
        } else {
            return s1.substring(0, index).concat(s1.substring(index+1, s1.length()));
        }
    }
}
