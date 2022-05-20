import java.util.Arrays;
import java.util.HashSet;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(array1));
        HashSet<String> answerHashSet = new HashSet<>();

        for (String i : array2) {
            boolean contains = hashSet.contains(i);
            if(contains) {
                answerHashSet.add(i);
            }
        }
        String[] strArr = answerHashSet.toArray(new String[0]);
        return strArr;
    }
}