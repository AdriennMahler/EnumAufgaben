public class MyOS {
    public static void main(String[] args) {
        System.out.println("*** statische Methode values:");
        OS[] allValues=OS.values();

        for(OS os: allValues){
            System.out.println(os);
        }
        System.out.println("** toString");
        OS var1= OS.MAC_OS;
        System.out.println(var1); //MAC

        switch(var1.toString()){
            case "WINDOWS":
                System.out.println("Blue-Screen-Alarm!");
                break;
            default:
                System.out.println("Alles in Ordnung");
        }
        System.out.println("*** statische Methode values:");
        EnumOS[] allValuesEnum= EnumOS.values();

        for(EnumOS os: allValuesEnum){
            System.out.println(os);
        }

        System.out.println("*** toString:");
        EnumOS var2= EnumOS.WINDOWS;
        System.out.println(var2);

        switch (var2){
            case WINDOWS:
                System.out.println("Blue-Screen-Alarm!");
                break;
            case UNIX:
            case MAC_OS:
                System.out.println("Alles in Ordnung");
                break;
            default:
                System.out.println("Unbekanntes OS");
        }
    }
}
enum EnumOS {UNIX, WINDOWS, MAC_OS}
class OS {

    public static final OS UNIX=new OS("UNIX");
    public static final OS WINDOWS=new OS("WINDOWS");
    public static final OS MAC_OS=new OS("MAC_OS");
    private String os;
    private OS(String os){
        this.os=os;
    }

    public static OS[] values(){
        return new OS[]{UNIX, WINDOWS, MAC_OS};
    }


    public String toString(){
        return os;
  }
}