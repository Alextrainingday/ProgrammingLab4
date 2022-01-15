public class Girls {
    public class BlueEye extends object{
        private boolean female = true;

        public BlueEye(){
            super("Blue Eyes");
            Join(getName());
        }
        public void enter(object var1,object var2,object var3){
            System.out.println("The room was entered " + getName() + " and another baby, in " + var1.getColor() + "ом " + var1.getName()
                    + "е и " + var2.getColor() + "ой " + var2.getName() + "е," +
                    " with a little " + var3.getColor() + "ым " + var3.getName() + "om in the hands.");
        }
        public void talk(){
            System.out.print("Which I told him about "+ getName() + ".");
        }
        public void gender2() throws Throwable{
            if (female == true){
                System.out.println(getName() + " is a woman");
            }
            else {
                throw new RuntimeException();
            }
        }

    }
    public class Medunica extends object{
        public Medunica(){
            super("Medunica");
            Join(getName());
        }
    }


}