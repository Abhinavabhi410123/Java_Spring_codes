package Stringprobs;

public class SsubString {

    public static void main(String[] args) {
        String s = "himadammomnew", s2 = "";
        int fi = 0, li = 0;
        boolean isPalin;

        for (int i = 0; i < s.length(); i++) {
            for (int z = i + 1; z < s.length(); z++) {
                isPalin = true;
                fi = i;
                li = z;
                s2 = s.substring(fi, li + 1);
                int len = s2.length();
               
                for (int j = 0; j < len / 2; j++) {
                    if (s2.charAt(j) != s2.charAt(len - j - 1)) {
                        isPalin = false;
                        break;
                    }
                }
                if (isPalin && len > 1) {
                    System.out.println(s2);
                    i = z+1;
                }
            }
        }
    }
}
