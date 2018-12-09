package com.company;

import java.util.ArrayList;

public class Woman {

    private ArrayList<Lipstick> lipsticks = new ArrayList<>();

    public Woman() {
    }

    public void addLipstick(String colour) {
        lipsticks.add(new Lipstick(colour));
    }

    public void recreateLipstick(int index, String colour) {
        lipsticks.set(index, new Lipstick(colour));
    }

    public void deleteLipstick(int index) {
        lipsticks.remove(index);
    }

    public void deleteAllLipsticks() {
        lipsticks.clear();
    }

    public void showAllLipsicks() {
        if (lipsticks.isEmpty()) {
            System.out.println("There are no lipsticks! ");
        } else {
            for (int i = 0; i < lipsticks.size(); i++) {
                System.out.print(lipsticks.get(i).getColour() + " lipstick, ");
            }
        }
    }

}
