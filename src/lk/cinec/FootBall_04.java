package lk.cinec;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class FootBall_04 {
    public static void main(String[] args) {
        List<Team> table = Arrays.asList(
          new Team(
                  1,
                  "Manchester City",
                  30,19,8,3,720,450,270,100,60,8,2,78),

          new Team(
                  2,
                  "Bayern Munich",
                  30,18,2,10,580,490,90,82,58,7,1,75),

          new Team(
                  3,
                  "Liverpool",
                  30,16,8,6,423, 484, 39, 35, 48, 6, 2, 65),

          new Team(
                  4,
                  "PSG",
                  30,15,4,11,652, 421, 262, 79, 41, 8, 4, 62),

          new Team(
                  5,
                  "Chelsea",
                  30,14,8,8,666, 423, 358, 74, 45, 2, 6, 61),

          new Team(
                  6,
                  "Real Madrid",
                  30,13,10,7,682, 545, 135, 70, 50, 3, 3, 68),

          new Team(
                  7,
                  "Inter",
                  30,12,12,6,431, 435, 18, 61, 53, 3, 9, 56),

          new Team(
                  8,
                  "Juventus",
                  30,11,11,8,425, 525, 42, 44, 52, 7, 2, 51),

          new Team(
                  9,
                  "Manchester United",
                  30,10,11,9,585, 541, -38, 57, 64, 3, 4, 54),

          new Team(
                  10,
                  "Ajax",
                  30,9,10,11,454, 541, -145, 45, 54, 5, 1, 44)
        );

        System.out.println("Several Teams have 56 points");
        table.stream().filter(club -> club.getScore() == 56)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Teams with 75 points");
        table.stream().filter(club -> club.getScore() == 75)
                .forEach(System.out::println);
    }
}
