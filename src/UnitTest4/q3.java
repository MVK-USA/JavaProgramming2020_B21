package UnitTest4;

public class q3 {
    double w;
    double l;

    public String print(){
        return  "W "+w + ", l"+l;
    }
    public void setInfo(double w, double l){
        this.w = w;
        this.l =l;
    }
}
class useBoxes{
    public static void main(String[] args) {
        q3 box = new q3();
        box.setInfo(5, 11);
        System.out.println(box);
    }
}
