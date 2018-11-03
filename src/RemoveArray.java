import java.util.Scanner;

public class RemoveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        for (int i = 0; i<array.length;i++){
            System.out.print("Enter a element at index " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }
        for (int x:array){
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Enter the index you want to remove");
        int index = 0;
        index = sc.nextInt();

        for (int i = index; i < array.length -1; i++){
            array[i] = array[i + 1];
        }

        array[array.length-1] = 0;

        for (int x:array){
            System.out.print(x + " ");
        }

        
    }
}
