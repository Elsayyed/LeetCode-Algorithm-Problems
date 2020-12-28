class Solutieon {
    public static int lengthOfLongestSubstring(String s) {
        int wordCount = 0;
        int fullLength = (s.length() > 0)? 1:0;
        boolean flag = false;
        for (int i = 0; i< s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                wordCount++;
                if (s.charAt(i) == s.charAt(j)){
                    fullLength = (fullLength < wordCount) ? wordCount:fullLength;
                    i = j-1;
                    flag = true;
                    break;
                }
            }
        }

        fullLength = (flag == false) ? s.length():fullLength;

        return fullLength;
    }
}