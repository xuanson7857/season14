package bai4;

import bai2.Student;

import java.util.Scanner;

public class FootballTeam extends Student {
    private static int nextId=1;
    private int id;
    private String name;
    private int numerOfPlayer;
    private int score;

    public FootballTeam() {
        this.id=nextId++;
    }

    public FootballTeam(String name, int numerOfPlayer, int score) {
        this.name = name;
        this.numerOfPlayer = numerOfPlayer;
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

    public int getNumerOfPlayer() {
        return numerOfPlayer;
    }

    public void setNumerOfPlayer(int numerOfPlayer) {
        this.numerOfPlayer = numerOfPlayer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void inputData(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten : ");
        this.name=scanner.nextLine();
        System.out.println("nhap numberplayof :");
        this.numerOfPlayer= Integer.parseInt(scanner.nextLine());
        System.out.println("nhap score : " );
        this.score= Integer.parseInt(scanner.nextLine());
    }

    public void displayData(){
        System.out.println("ten" +name);
        System.out.println("numberplayof" +numerOfPlayer);
        System.out.println("socore" +score);
    }
}
