package a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        
    }
}

class Fu {
    private int a = 0x111;
    int b = 0x222;

    public void fuShow1() {
        System.out.println("public --- FuShow");
    }

    private void fuShow2() {
        System.out.println("private --- FuShow");
    }
}

class Zi extends Fu {
    int c = 0x333;

    public void ziShow() {
        System.out.println("public --- ZiShow");
    }
}
