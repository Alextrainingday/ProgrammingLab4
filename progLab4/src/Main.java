public class Main {
    public static void main(String [] arg){
        Girls member = new Girls();
        Girls.BlueEye payper = member.new BlueEye();
        Cheeks potter = new Cheeks();
        GrayEyes santan = new GrayEyes();
        Girls.Medunica digdat = member.new Medunica();
        Blanket headie = new Blanket();
        Steps teflon = new Steps(){
            private String name = "Steps";
            public void underDoor(){
                System.out.print("There was a sound outside the door " + name + ".");
            }
        };
        Robe robe = new Robe();
        WhiteCap cap = new WhiteCap();
        Suitcase realart = new Suitcase();
        Dunno dunno = new Dunno();
        try {dunno.gender();
        }
        catch (MaleException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        teflon.underDoor();
        dunno.goToBed(headie.getName());
        dunno.PutOnBlanket("covered with a blanket.");
        payper.enter(robe, cap, realart);
        potter.were();
        santan.watch();
        dunno.understood(digdat.getName());
        payper.talk();
    }
}