import java.util.Scanner;

public class giatrilonnhat {
    public static void main(String[] args) {


        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập giá trị");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("giá trị không hợp ");

        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhập điểm của hs: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
            int count = 0;
            System.out.print("Danh sách điểm: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
                if (array[j] >= 5 & array[j] <= 10)
                    count++;

            }
            System.out.print("Điểm của sv là: " + count);
        }
    }
}