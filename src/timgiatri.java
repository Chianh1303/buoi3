import java.util.Scanner;

public class timgiatri {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập giá trị: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Gía trị không phù hợp ");
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhập giá trị " + (i+1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("property list: ");
        for(int j = 0;j < array.length;j++){
        System.out.print(array[j]+" ");
    }
        int max = array[0];
        int index = 1;
        for (int j = 0;j < array.length; j++){
            if (array[j]>max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Gía trị lớn nhất trong mảng là: " + max +"là" +index);
    }
}
