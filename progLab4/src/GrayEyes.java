public class GrayEyes extends object{
    public GrayEyes(){
        super("GrayEyes", color.gray);
        Join(getName());
    }
    public void watch(){
        System.out.print(" " + getColor() + " " + getName() + " Stared sternly from behind round horn-rimmed glasses.");
    }
}