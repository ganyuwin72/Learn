package a12oppextendstest12;

public class Maintainer extends AdminStaff{
    public Maintainer(){}

    public Maintainer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("维护专员在维护代码");
    }
}