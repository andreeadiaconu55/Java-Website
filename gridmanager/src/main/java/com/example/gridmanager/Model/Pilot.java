package com.example.gridmanager.Model;

public class Pilot {

    private Long id;
    private String name;
    private int age;
    private Echipa echipa;

    public Pilot() {
        // Constructor implicit necesar pentru framework-uri
    }

    public Pilot(Long id, String name, int age, Echipa echipa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.echipa = echipa;
    }

    public Pilot(String name, int age, Echipa echipa) {
        this.name = name;
        this.age = age;
        this.echipa = echipa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Echipa getEchipa() {
        return echipa;
    }

    public void setEchipa(Echipa echipa) {
        this.echipa = echipa;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", echipa=" + (echipa != null ? echipa.getName() : "N/A") +
                '}';
    }
}
