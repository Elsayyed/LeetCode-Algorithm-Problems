public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "aaaaaaaa";
        System.out.println(Solution.lengthOfLongestSubstring(name));
    }
}

class Solution {
    public static int lengthOfLongestSubstring(String s) {

        int wordCount;

        boolean letterFound;
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
                if (noDuplicate[i] == noDuplicate[j] || j == noDuplicate.length-2) {
                    highestWordCount = Math.max(highestWordCount,wordCount);
                    break;
                }
                else {
                    wordCount++;
                }
            }
        }

        return highestWordCount+fullLength;
    }

    private static char[] uniqueStringMaker(String s){

        char[] duplicate = s.toCharArray();
        char[] noDuplicate = new char[duplicate.length];
        char charStreakChar = ' ';
        int counter = 0;
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
        }

        char[] noDuplicateFinal = new char[counter--];

        for (int j = 0; j <counter ; j++) {
            noDuplicateFinal[j]=noDuplicate[j];
        }

        return noDuplicateFinal;
    }
}
