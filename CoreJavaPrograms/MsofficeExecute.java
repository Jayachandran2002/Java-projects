package exercisePackage.CoreJavaPrograms;

class Msoffice extends Thread{
    Msoffice(String name){
        super(name);
    }
    public void run(){
        if (getName().equals("Typing")){
            typing();
        } else if (getName().equals("SpellCheck")) {
            spellCheck();
        }else {
            autoSave();
        }
    }

    void typing(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Typing");
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    void spellCheck(){
        try {
            for ( ; ; ) {
                System.out.println("Spell Checking");
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    void autoSave(){
        try {
            for ( ; ; ) {
                System.out.println("Auto Save");
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class MsofficeExecute {
    public static void main(String[] args) {
        Msoffice m1 = new Msoffice("Typing");
        Msoffice m2 = new Msoffice("SpellCheck");
        Msoffice m3 = new Msoffice("AutoSave");
        m2.setDaemon(true);
        m3.setDaemon(true);
        m2.setPriority(9);
        m3.setPriority(8);
        m1.start();
        m2.start();
        m3.start();
    }
}
