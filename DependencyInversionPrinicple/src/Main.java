class MackBook{
    private final WiredKeyBoard keyBoard;
    private final WireMouse mouse;

    public MackBook(){
        this.keyBoard=new KeyBoard();
        this.mouse=new Mouse();
    }
}

class MackBook1{
    private final KeyBoard keyBoard;
    private final Mouse mouse;

    public MackBook1(KeyBoard keyBoard, Mouse mouse){  //KeyBoard and Mouse are interface which will be implemented by WiredKeyBoard and BlueToothKeyBoad and WiredMouse and BluetothMouse
        this.keyBoard=keyBoard;
        this.mouse=mouse;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}