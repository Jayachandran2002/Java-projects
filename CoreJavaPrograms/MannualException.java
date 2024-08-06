package exercisePackage.CoreJavaPrograms;

public class MannualException {
    public static void main(String[] args) {
        int a=10,b=60;
        try{
            if(a>b){
                System.out.println("The sub is :"+(a+b));
            }
            else {
                throw new AlessthanBexception();
            }
        } catch (AlessthanBexception e) {
            System.out.println(e.getMessage());
        }
    }
}
