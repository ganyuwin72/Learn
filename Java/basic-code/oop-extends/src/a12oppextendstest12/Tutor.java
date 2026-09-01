package a12oppextendstest12;

public class Tutor extends Teacher{
    public Tutor(){}

    public Tutor(int id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("助教在辅导作业");
    }
}