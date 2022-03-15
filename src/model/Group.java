package model;

public class Group {
    private String group_name;

    public static Group of(String group){
        return new Group()
                .setGroup_name(group);
    }

    public Group(){

    }

    public String getGroup_name(){
        return group_name;
    }

    public Group setGroup_name(String group_name) {
        this.group_name = group_name;
        return this;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group_name='" + group_name + '\'' +
                '}';
    }
}
