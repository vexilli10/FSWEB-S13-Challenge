package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String[] getHealthplans() { return healthplans; }
    public void setHealthplans(String[] healthplans) { this.healthplans = healthplans; }

    public void addHealthplan(int index, String name) {
        if (healthplans == null) {
            System.out.println("Healthplans dizisi tanımlı değil.");
            return;
        }
        if (index < 0 || index >= healthplans.length) {
            System.out.println("Geçersiz index: " + index);
            return;
        }
        if (healthplans[index] == null || healthplans[index].isEmpty()) {
            healthplans[index] = name;
            System.out.println("Healthplan eklendi: " + name + " index: " + index);
        } else {
            System.out.println("Index dolu: " + index + ", mevcut değer: " + healthplans[index]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{id=").append(id)
                .append(", fullName='").append(fullName).append('\'')
                .append(", email='").append(email).append('\'')
                .append(", password='").append(password).append('\'')
                .append(", healthplans=[");
        if (healthplans != null) {
            for (int i = 0; i < healthplans.length; i++) {
                sb.append(healthplans[i]);
                if (i < healthplans.length - 1) sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}
