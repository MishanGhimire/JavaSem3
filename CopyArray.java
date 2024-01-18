public class CopyArray {
    public static void main(String[] args) {
        int[] sourceArray = { 1, 2, 3, 4, 5, 6, 7 };
        int[] destinationArray = new int[sourceArray.length];

        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

        System.out.print("Copied Array: ");
        for (int element : destinationArray) {
            System.out.print(element + " ");
        }
    }
}
