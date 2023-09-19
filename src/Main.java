import entity.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Khai báo và khởi tạo đối tượng sinh viên mà không khởi tạo bất cứ thông tin gì
        //--> sử dụng default constructor
        Student student1 = new Student();
        //2. Khai báo và khởi tạo đối tượng sinh viên gồm mã sinh viên và tên sinh viên
        Student student2 = new Student("SV002","Nguyễn Văn B");
        //3. Khai báo và khởi tạo đối tượng sinh viên gồm tất cả các thông tin
        Student student3 = new Student("SV003","Nguyễn Văn C",25,true,"Hồ Chí Minh", Student.Status.DANGHOC);
        //4. Nhập thông tin cho sinh viên 1 với phương thức inputData
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên 1:");
        student1.inputData(scanner);
        //5. Nhập thông tin sinh viên 2 sử dụng các phương thức getter/setter
        System.out.println("Nhập thông tin sinh viên 2");
        System.out.println("Nhập vào tuổi sinh viên:");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào giới tính:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập vào địa chỉ:");
        student2.setAddress(scanner.nextLine());
        System.out.println("Chọn trạng thái sinh viên: ");
        System.out.println("1. Đang học");
        System.out.println("2. Bảo lưu");
        System.out.println("3. Đình chỉ");
        System.out.println("4. Kết thúc");
        System.out.print("Lựa chọn của bạn:");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                student2.setStudentStatus(Student.Status.DANGHOC);
                break;
            case 2:
                student2.setStudentStatus(Student.Status.BAOLUU);
                break;
            case 3:
                student2.setStudentStatus(Student.Status.DINHCHI);
                break;
            case 4:
                student2.setStudentStatus(Student.Status.KETTHUC);
                break;
        }
        //6. In ra tuổi trung bình của 3 sinh viên - Sử dụng phương thức get để lấy tuổi sinh viên
        int avgAge = (student1.getAge()+student2.getAge()+student3.getAge())/3;
        System.out.println("Tuổi trung bình của 3 sinh viên: "+avgAge);

        //In ra thông tin các sinh viên
        //In thông tin sinh viên 1:
        System.out.println("Thông tin sinh viên 1:");
        student1.displayData();
        System.out.println("Thông tin sinh viên 2:");
        student2.displayData();
        System.out.println("Thông tin sinh viên 3:");
        student3.displayData();



    }
}