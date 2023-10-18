package bai2;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Sắp xếp bằng Insertion Sort");
            System.out.println("4. Sắp xếp bằng Selection Sort");
            System.out.println("5. Sắp xếp bằng Bubble Sort");
            System.out.println("6. Thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sinh viên cần thêm:");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.inputData(sc);
                        students.add(student);
                    }
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên:");
                    for (Student student : students) {
                        student.displayData();
                    }
                    break;
                case 3:
                    Student[] insertionSortedStudents = SortStudent.insertionSort(students.toArray(new Student[0]));
                    System.out.println("Danh sách sinh viên sau khi sắp xếp bằng Insertion Sort:");
                    for (Student student : insertionSortedStudents) {
                        student.displayData();
                    }
                    break;
                case 4:
                    Student[] selectionSortedStudents = SortStudent.selectionSort(students.toArray(new Student[0]));
                    System.out.println("Danh sách sinh viên sau khi sắp xếp bằng Selection Sort:");
                    for (Student student : selectionSortedStudents) {
                        student.displayData();
                    }
                    break;
                case 5:
                    Student[] bubbleSortedStudents = SortStudent.bubbleSort(students.toArray(new Student[0]));
                    System.out.println("Danh sách sinh viên sau khi sắp xếp bằng Bubble Sort:");
                    for (Student student : bubbleSortedStudents) {
                        student.displayData();
                    }
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (choice != 6);
    }
}