package UnitTest4;

public class q4 {
    String name;
    int numOfPl;
    boolean teamOf;

    public void makeSp(String name, int pl, boolean team){
        name = name;
        numOfPl = pl;
        teamOf = team;

    }
    public String toString(){
        String msg ="The sport is "+ name + " and has "+numOfPl + "players total ";
        if(teamOf){
            msg += "diveded";
                    }else{
            msg += "but...";
        }
        return msg;
    }

    public static void main(String[] args) {
        q4 soccer = new q4();
        soccer.makeSp("Soccer", 22, true);
        System.out.println(soccer);
    }
}
