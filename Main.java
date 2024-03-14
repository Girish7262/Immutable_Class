final class ImmutableClass{
    private final String PanCard;

    public ImmutableClass(String PanCard){
        this.PanCard=PanCard;
    }
    public String getPanCard(){
        return PanCard;
    }


}
public class Main {
    public static void main(String[] args) {

        ImmutableClass c1=new ImmutableClass("fgr434de");
        System.out.println(c1.getPanCard());
    }
}