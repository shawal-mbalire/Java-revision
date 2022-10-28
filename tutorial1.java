import java.util.Scanner;
public class tutorial1 {
    public static void main(String[] args) {
        try (
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string");
            String scanned = sc.next();
            System.out.println("Enter a string");
            String scannedLine = sc.nextLine();
            System.out.println("Enter a number");
            int scannedInt = sc.nextInt();
            int x = Integer.parseInt("34");

            System.out.println(scanned);
            System.out.println(scannedLine);
            System.out.println(scannedInt);
            System.out.println(x);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //int[] newArr = new int[5];
        int[] newArr = {1,2,3,4,5};
        newArr[0]=9;
        //newArr[5]=9; error
        System.out.println(newArr); //returns object id

        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
        for (int element : newArr) {
            System.out.println(element);
        }
    }
}
