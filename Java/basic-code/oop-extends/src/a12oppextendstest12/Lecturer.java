package a12oppextendstest12;

public class Lecturer extends Teacher{
    public Lecturer(){}

    public Lecturer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("讲师在讲课");
    }
}