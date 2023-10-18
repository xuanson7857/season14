package bai4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<FootballTeam> footballTeams = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Thêm doi bong");
            System.out.println("2. Hiển thị danh sách bong");
            System.out.println("3. Sắp xếp bằng Insertion Sort");
            System.out.println("4. Sắp xếp bằng Selection Sort");
            System.out.println("5. Sắp xếp bằng Bubble Sort");
            System.out.println("6. Thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng doi bong cần thêm:");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        FootballTeam footballTeam = new FootballTeam();
                        footballTeam.inputData();
                        footballTeams.add(footballTeam);
                    }
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    System.out.println("Danh sách doi bong:");
                    for (FootballTeam f : footballTeams) {
                        f.displayData();
                    }
                    break;
                case 3:
                    FootballTeam[] insertionSortedStudents = SortFootballTeam.insertionSort(footballTeams.toArray(new FootballTeam[0]));
                    System.out.println("Danh sách doi bong sau khi sắp xếp bằng Insertion Sort:");
                    for (FootballTeam student : insertionSortedStudents) {
                        student.displayData();
                    }
                    break;
                case 4:
                    FootballTeam[] selectionSortedStudents = SortFootballTeam.selectionSort(footballTeams.toArray(new FootballTeam[0]));
                    System.out.println("Danh sách doi bong sau khi sắp xếp bằng Selection Sort:");
                    for (FootballTeam f : selectionSortedStudents) {
                        f.displayData();
                    }
                    break;
                case 5:
                    FootballTeam[] bubbleSortedStudents = SortFootballTeam.bubbleSort(footballTeams.toArray(new FootballTeam[0]));
                    System.out.println("Danh sách doi bong sau khi sắp xếp bằng Bubble Sort:");
                    for (FootballTeam f : bubbleSortedStudents) {
                        f.displayData();
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

