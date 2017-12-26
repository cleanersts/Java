package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		Outlander outlander = new Outlander(30);
		outlander.accelerate(30);
		outlander.changeVelocity(20,1);
    }
}
