package model;

public class Teacher {
    private String name;
    private String surname;

    public Teacher(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Teacher(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String string){
        this.surname = surname;
    }
}
