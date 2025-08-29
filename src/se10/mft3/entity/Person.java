package se10.mft3.entity;

import com.google.gson.Gson;

import java.time.LocalDate;


public class Person {
    private int id;
    private String name;
    private String family;
    private LocalDate birthDate;
    private Role role;
    private boolean status;

    public Person(int id, String name, String family, LocalDate birthDate, Role role, boolean status) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.birthDate = birthDate;
        this.role = role;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Person setFamily(String family) {
        this.family = family;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Person setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public Person setRole(Role role) {
        this.role = role;
        return this;
    }

    public boolean isStatus() {
        return status;
    }

    public Person setStatus(boolean status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
