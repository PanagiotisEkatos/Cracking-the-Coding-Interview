package ArraysAndStrings;

/**
 * Created by panek on 6/8/2017.
 */
// Question 1.3
public class URLify {
    public static void main(String[] args) {
        System.out.println(myReplaceSpaces("Mr John Smith    ".toCharArray(), 13));
    }

    static private char[] myReplaceSpaces(char[] str, int trueLength) {
        int replaceIndex = str.length - 1;
        for (int i = trueLength - 1; i > -1; i--) {
            if (str[i] != ' ') {
                str[replaceIndex--] = str[i];
            } else {
                str[replaceIndex--] = '0';
                str[replaceIndex--] = '2';
                str[replaceIndex--] = '%';
            }
        }
        return str;
    }

    // Copied of the book, seems broken
    static char[] replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++)
            if (str[i] == ' ')
                spaceCount++;

        index = trueLength + spaceCount*2;
        if (trueLength < str.length) str[trueLength] = '\0'; // End array
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[1] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index -3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        return str;
    }

}
