package Stringprobs;

public class Maxlenpalin {

	public static void main(String[] args) {
		String s = "himadammamadamamnew";
        boolean isPalin;
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                isPalin = true;

                // Check if substring is a palindrome
                for (int k = 0; k < sub.length() / 2; k++) {
                    if (sub.charAt(k) != sub.charAt(sub.length() - 1 - k)) {
                        isPalin = false;
                        break;
                    }
                }

               if (isPalin && sub.length()>1) {
                    s2 = s2.concat(sub + " ");
                }
            }
        }

        // Print all found palindromes
        System.out.println("Palindromic substrings: " + s2);

	}
	}

