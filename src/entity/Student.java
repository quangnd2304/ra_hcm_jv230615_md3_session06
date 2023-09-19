package entity;

/*
 * 1. Đặc điểm:
 *   - Mã sinh viên
 *   - Tên sinh viên
 *   - Tuổi
 *   - Giới tính
 *   - Địa chỉ
 *   - Trạng thái sinh viên
 * 2. Hành vi:
 *   - Biết tính tổng 2 số
 *   - Biết chào giảng viên
 *   - Cho phép nhập dữ liệu cho đối tượng
 *   - Cho phép hiển thị thông tin của đối tượng
 * *
 *
 * */

import java.util.Scanner;

public class Student {
    //Tạo kiểu dữ liệu enum
    public enum Status{
        DANGHOC,BAOLUU,DINHCHI,KETTHUC;
    }
    //1. Attributes - Fields
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private Status studentStatus;

    //2. Constructors
    //Constructor không có tham số - default constructor
    public Student() {
    }

    //Constructor có 2 tham số để khởi tạo đối tượng sinh viên với thông tin mã sinh viên và tên sinh viên
    public Student(String studentId, String studentName) {
        //this chỉ ra là của đối tượng hiện tại
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //Constructor có các tham số để khởi tạo đầy đủ thông tin sinh viên
    public Student(String studentId, String studentName, int age, boolean sex, String address, Status studentStatus) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.studentStatus = studentStatus;
    }

    //3. Methods
    //3.1.Getter-Setter: phương thức giúp truy cập vào các thuộc tính của đối tượng từ bên ngoài
    //Getter: lấy dữ liệu thuộc tính
    //Setter: set dữ liệu cho thuộc tính
    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Status isStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(Status studentStatus) {
        this.studentStatus = studentStatus;
    }

    //3.2.Methods mô tả các hành vi của đối tượng
    //Method - hành vi chào giảng viên
    //MethodName: giống quy tắc đặt tên biến
    public void hello() {
        System.out.println("Xin chào thầy/cô");
    }

    //Method - hành vi tính tổng 2 số nguyên
    public int add(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    //Method - Nhập thông tin cho đối tượng
    public void inputData(Scanner scanner) {
        //Setter
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên:");
        this.address = scanner.nextLine();
        System.out.println("Chọn trạng thái sinh viên: ");
        System.out.println("1. Đang học");
        System.out.println("2. Bảo lưu");
        System.out.println("3. Đình chỉ");
        System.out.println("4. Kết thúc");
        System.out.print("Lựa chọn của bạn:");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                this.studentStatus = Status.DANGHOC;
                break;
            case 2:
                this.studentStatus = Status.BAOLUU;
                break;
            case 3:
                this.studentStatus = Status.DINHCHI;
                break;
            case 4:
                this.studentStatus = Status.KETTHUC;
                break;
        }

    }

    //Method - Hiển thị thông tin sinh viên
    public void displayData() {
        //Getter
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %b - Địa chỉ: %s - Trạng thái: %s\n", this.sex, this.address, this.studentStatus);
    }
}
