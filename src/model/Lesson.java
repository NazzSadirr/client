package model;

public class Lesson {
    private String lesson_name;

    public Lesson(String lesson_name){
        this.lesson_name = lesson_name;
    }

    public Lesson(){

    }

    public String getLesson_name(){
        return lesson_name;
    }

    public void setLesson_name(String lesson_name){
        this.lesson_name = lesson_name;
    }

    @Override
    public String toString(){
        return "Lesson [lesson name = " + lesson_name + "]";
    }
}
