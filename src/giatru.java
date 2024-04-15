import java.util.Scanner;

public class giatru {
    public static void main(String[] args) {
        String[] hocsinh = {"Minh", "Hoàng", "Khánh", "Tâm" ,"Chí Anh", "Dũng" , "Sâm","dân"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh:");
        String input_name  = scanner.nextLine();
        boolean isExist = false;
        for (int i=0 ; i < hocsinh.length; i++){
            if (hocsinh[i].equals(input_name)){
                System.out.println("Học sinh có trong danh sách: " + input_name + "is:" + i);
                isExist = true;
                break;
            }
        }
        if (! isExist){
            System.out.println("Không thấy" + input_name +" trong danh sách.");
        }
    }
}
