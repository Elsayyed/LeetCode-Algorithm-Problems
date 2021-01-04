public class tempRecent {

    //one edge case left I guess
    // if the letter starts and doesn't end!
    public static void main(String[] args) {
        // write your code here
        String name = "bbbbb";
        System.out.println(Solution.lengthOfLongestSubstring(name));
    }
}

class tempRecent2 {
    public static int counter = 0;

    public static int lengthOfLongestSubstring(String s) {
        boolean noRepetitionFlag = false;
        int wordCount;

        int highestWordCount = 0;

        char[] noDuplicate = uniqueStringMaker(s);

        for (int i = 0; i < noDuplicate.length; i++){
            System.out.print(noDuplicate[i]);
        }
        System.out.println();

        int fullLength = (noDuplicate.length > 0) ? 1 : 0;

        for (int i = 0; i < noDuplicate.length; i++) {
            wordCount = 0;
            for (int j = i + 1; j < noDuplicate.length; j++) {

                //lw wslna le akher el .length - 2 we should see meen akbar word count or highestWordCount

                if (counter == j && noRepetitionFlag){
                    highestWordCount = Math.max(highestWordCount,wordCount);
                    break;
                }
                else if (noDuplicate[i] == '\u0000'){
                    highestWordCount = Math.max(highestWordCount,wordCount);
                    break;
                }
                else if (noDuplicate[i] == noDuplicate[j]) {
                    highestWordCount = Math.max(highestWordCount,wordCount);
                    noRepetitionFlag = true;
                    i = j;
                    break;
                }
                else {
                    wordCount++;
                }
            }
        }
        return highestWordCount+fullLength;
    }

    public static char[] uniqueStringMaker(String s){

        char[] duplicate = s.toCharArray();
        char[] noDuplicate = new char[duplicate.length];
        char charStreakChar = '\u0000';
        int i;

        for (i = 0; i<duplicate.length-1; i++)
        {
            if (duplicate[i] != duplicate[i+1] && duplicate[i] != charStreakChar) {
                charStreakChar = duplicate[i];
                noDuplicate[counter] = duplicate[i];
                counter++;
            }
            else if (duplicate[i] != charStreakChar){
                charStreakChar = duplicate[i];
                noDuplicate[counter] = duplicate[i];
                counter++;
                i++;
            }
        }

        if (duplicate.length-1 == i && duplicate[i] != charStreakChar){
            noDuplicate[counter] = duplicate[i];
            counter++;
        }
        return noDuplicate;
    }

}
