package org.example;

public class Healthplan {
    private int id;
    private String name;
    private org.example.Plan plan;

    public Healthplan(int id, String name, org.example.Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public org.example.Plan getPlan() { return plan; }
    public void setPlan(org.example.Plan plan) { this.plan = plan; }

    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}
