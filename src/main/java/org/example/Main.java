package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"); runApp();
    }

    private static void runApp() {
        // Healthplan örneği
        Healthplan hp1 = new Healthplan(1, "Standard Healthplan", org.example.Plan.BASIC);
        System.out.println(hp1);

        // Employee örneği
        String[] empHealthplans = new String[2];
        Employee emp1 = new Employee(1, "John Doe", "john@example.com", "secret", empHealthplans);
        emp1.addHealthplan(0, "Standard Coverage");
        emp1.addHealthplan(0, "Duplicate Coverage"); // index dolu uyarısı
        emp1.addHealthplan(2, "Out of bounds");   // geçersiz index uyarısı
        System.out.println(emp1);

        // Company örneği
        String[] devs = new String[3];
        Company comp1 = new Company(100, "TechCorp", 100000.0, devs);
        comp1.addEmployee(0, "Alice");
        comp1.addEmployee(0, "Bob");        // index dolu uyarısı
        comp1.addEmployee(3, "Charlie");   // geçersiz index uyarısı
        comp1.setGiro(-5000);                // negatif giro denemesi
        System.out.println(comp1);
    }
}