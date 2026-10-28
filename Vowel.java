public class Vowel {
    public static void main(String[] args) {
        String s = "hello world";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' || ch == 'A' ||
                    ch == 'E' || ch == 'I' || ch == 'O' ||
                    ch == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}