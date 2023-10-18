package bai4;

import bai2.Student;

public class SortFootballTeam {

    public static FootballTeam[] insertionSort(FootballTeam[] footballTeams) {
        int n = footballTeams.length;
        for (int i = 1; i < n; i++) {
            Student key = footballTeams[i];
            int j = i - 1;
            while (j >= 0 && footballTeams[j].getScore() > key.getScore()) {
                footballTeams[j + 1] = footballTeams[j];
                j--;
            }
            footballTeams[j + 1] = (FootballTeam) key;
        }
        return footballTeams;
    }

    public static FootballTeam[] selectionSort(FootballTeam[] footballTeams) {
        int n = footballTeams.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (footballTeams[j].getScore() < footballTeams[minIndex].getScore()) {
                    minIndex = j;
                }
            }
            Student temp = footballTeams[minIndex];
            footballTeams[minIndex] = footballTeams[i];
            footballTeams[i] = (FootballTeam) temp;
        }
        return footballTeams;
    }

    public static FootballTeam[] bubbleSort(FootballTeam[] footballTeams) {
        int n = footballTeams.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (footballTeams[j].getScore() > footballTeams[j + 1].getScore()) {
                    FootballTeam temp = footballTeams[j];
                    footballTeams[j] = footballTeams[j + 1];
                    footballTeams[j + 1] = temp;
                }
            }
        }
        return footballTeams;
    }
}
