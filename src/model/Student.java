package model;


import java.util.Date;

public class Student {
    private int id; //sonradan yaratdim
    private String name;
    private String surname;
    private String address;
    private String contact;
    private Date to_date;
    private Date from_date;
    private int active;
    private Group group;

    public Student(String name, String surname, String address, String contact,
                   Date to_date, Date from_date, int active, Group group) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.contact = contact;
        this.to_date = to_date;
        this.from_date = from_date;
        this.active = active;
        this.group = group;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public Student setName(String name){
        this.name = name;
        return this;
    }

    public String getSurname(){
        return  surname;
    }

    public Student setSurname(String surname){
        this.surname=surname;
        return this;
    }

    public String getAddress(){
        return address;
    }

    public Student setAddress(String address){
        this.address = address;
        return this;
    }

    public String getContact()
    {
        return contact;
    }

    public Student setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public Date getTo_date() {
        return to_date;
    }
    public Student setTo_date(Date to_date){
        this.to_date = to_date;
        return this;
    }

    public Date getFrom_date() {
        return from_date;
    }
    public Student setFrom_date(Date from_date){
        this.from_date = from_date;
        return this;
    }

    public int getActive(){
        return active;
    }
    public Student setActive(int active){
        this.active = active;
        return this;
    }

    public Group getGroup(){
        return group;
    }
    public Student setGroup(Group group){
        this.group=group;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", to_date=" + to_date +
                ", from_date=" + from_date +
                ", active=" + active +
                ", group=" + group +
                '}';
    }

    public void setId(int id) {
        this.id=id;
    }
}
