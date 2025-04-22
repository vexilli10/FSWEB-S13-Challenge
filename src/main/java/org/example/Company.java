package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if (giro < 0) {
            throw new IllegalArgumentException("Giro negatif olamaz.");
        }
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getGiro() { return giro; }
    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro negatif olamaz: " + giro);
        } else {
            this.giro = giro;
        }
    }
    public String[] getDeveloperNames() { return developerNames; }
    public void setDeveloperNames(String[] developerNames) { this.developerNames = developerNames; }

    public void addEmployee(int index, String name) {
        if (developerNames == null) {
            System.out.println("DeveloperNames dizisi tanımlı değil.");
            return;
        }
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index: " + index);
            return;
        }
        if (developerNames[index] == null || developerNames[index].isEmpty()) {
            developerNames[index] = name;
            System.out.println("Employee eklendi: " + name + " index: " + index);
        } else {
            System.out.println("Index dolu: " + index + ", mevcut değer: " + developerNames[index]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company{id=").append(id)
                .append(", name='").append(name).append('\'')
                .append(", giro=").append(giro)
                .append(", developerNames=[");
        if (developerNames != null) {
            for (int i = 0; i < developerNames.length; i++) {
                sb.append(developerNames[i]);
                if (i < developerNames.length - 1) sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}
