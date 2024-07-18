package exercisePackage;

class Generic<t>{
    private  t obj;
     Generic(t obj){
        System.out.println(this.obj = obj);

    }
}

public class SimpleGeneric {
    public static void main(String[] args) {
        Generic<String>  genClass = new Generic<String>("Input");
        Generic<Integer>  genClass2 = new Generic<Integer>(24);

    }

}
