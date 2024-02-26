class Pen{
    String color;
    String type;

    Pen(String color,String type){
        this.color=color;
        this.type=type;
    }

    public void use(){
        System.out.println("Write something");
    }
}
public class PenUtil {
    public static void main(String[] args){
        Pen p1=new Pen("black","ballpoint");
        p1.use();
    }
}
