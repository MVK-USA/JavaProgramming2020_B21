package UnitTest4;

public class q2 {
    int count;
    public void m(){
        count++;
    }
    public void m(int n){
        count *= n;
    }

    public static void main(String[] args) {
        q2 obj = new q2();
        obj.m(5);
        obj.m();
        obj.count += 10;
        obj.m(2);

        System.out.println(obj.count);
    }
}
