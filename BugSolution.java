public class BugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 2;
        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]); //Safe access
        } else {
            System.out.println("Invalid array index");
        }
    }
}