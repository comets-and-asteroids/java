package org.example.pract14;

public class Team {
    private String name;
    private String date;

    public Team(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
