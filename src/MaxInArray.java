import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter size of array: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while(size > 20);

        array = new int[size];
        int i = 0;
        while(i <size){
            System.out.print("Enter element "+(i+1)+" : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("property list: ");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j]+"\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println();
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}