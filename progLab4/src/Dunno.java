public class Dunno extends object{
    private boolean male = true;
    public Dunno(){
        super("Dunno");
        Join(getName());
    }
    public void goToBed(String var){
        System.out.print(" "+ getName() + " he quickly slipped into bed");
    }
    public void understood(String var){
        System.out.print(" " + getName() + " I realized that this is " + var + ", ");
    }
    public void gender() throws MaleException{
        if (male == true){
            System.out.println(getName() + " is a man");
        }
        else {
            throw new MaleException(getName() + " is not a man");
        }
    }
    public void PutOnBlanket(String b){
        class blanket{
            private String action = "covered with a blanket.";
            public blanket(){
                this.action = b;
            }
        }
        System.out.println(" и " + b);
    }


}
