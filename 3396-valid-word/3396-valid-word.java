class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        int vowels = 0, consonants = 0, digits = 0, alphabets = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                alphabets++;
                char lower = Character.toLowerCase(ch);
                if ("aeiou".indexOf(lower) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }else return false;
        }
        return (vowels!=0 && consonants!=0 && alphabets!=0 ) ? true:false;
    }

}