public class BlueEye extends object{
    public BlueEye(){
        super("Blue Eyes");
        Join(getName());
    }
    public void enter(object var1,object var2,object var3){
        System.out.println("The room was entered " + getName() + " and another little girl, in " + var1.getColor() + "ом " + var1.getName()
                + "е и " + var2.getColor() + "ой " + var2.getName() + "е," +
                " with a little " + var3.getColor() + "ым " + var3.getName() + "om in the hands.");
    }
    public void talk(){
        System.out.print("Which I told him about "+ getName() + ".");
    }
}