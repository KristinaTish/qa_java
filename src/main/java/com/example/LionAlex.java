package com.example;

import java.util.List;

public class LionAlex extends Lion {
    private static List<String> alexsFriends = List.of("Марти", "Глория", "Мелман");

    public LionAlex(Feline feline) throws Exception {
        super(feline, "Самец");
    }

    public List<String> getFriends() {
        return alexsFriends;
    }

    public String getPlaceOfLiving() {
        String zoo = "Нью-Йоркский зоопарк";
        return zoo;
    }

    @Override
    public int getKittens() {
        return 0;
    }
}