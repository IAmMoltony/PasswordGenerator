package com.moltony112;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("welcome to password generator 9000\npassword length:");
        int passwordLength = scanner.nextInt();

        System.out.println("ur new password is: " + PasswordGenerator.generatePassword(passwordLength));
    }
}