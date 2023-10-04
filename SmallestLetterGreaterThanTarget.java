public class SmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int middle;

        while (start <= end) {
            middle = start + (end - start)/2;
            if (target >= letters[middle]) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return letters[start % letters.length];
    }
}
