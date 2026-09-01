package a12oppextendstest12;

public class Buyer extends AdminStaff{
    public Buyer(){}

    public Buyer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("采购专员在买零食");
    }
}