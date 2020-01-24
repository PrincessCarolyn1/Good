package com.academy.lesson03;

import java.util.Arrays;

public class StringExc {
    public static void main(String[] args) {
        String[] tracks={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};

        System.out.println(Arrays.toString(tracks));
        filterByRange(tracks, 10, 15);

        // System.out.println(extractNumber(tracks[2]));
    }

    private static void filterByRange(String[] tracks, int from, int to) {
        for (int i = 0; i < tracks.length; i++) {
            int number = extractNumber(tracks[i]);
            if (number >= from && number <= to) {
                System.out.println(tracks[i]);
            }
        }
    }

    public static int extractNumber(String track) {
        String digits = track.substring(6); // "track_01" => "01"
        return Integer.parseInt(digits); // "01" => 1
    }
}
