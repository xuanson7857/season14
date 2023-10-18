package bai2;

import java.util.Scanner;

public class Student {
    private static int nextId=1;
    private int id;
    private String name;
    private double score;

    public Student() {
        this.id =nextId++;
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void inputData(Scanner sc){
        System.out.println("nhap ten sinh vien");
        this.name=sc.nextLine();
        System.out.println("nhap diem sinh vien");
        this.score= Double.parseDouble(sc.nextLine());
    }

    public void displayData(){
        System.out.println("ma sinh vien" +id);
        System.out.println("ten sinh vien " +name);
        System.out.println("diem sinh vien " +score);
    }
}
