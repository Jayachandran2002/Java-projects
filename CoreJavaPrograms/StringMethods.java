package exercisePackage.CoreJavaPrograms;

public class StringMethods {
        public static void main(String[] args){
            try {
                StringBuilder sb = new StringBuilder("Sachin");
                String name = sb.append("Tendulkar").toString();
                System.out.println(name);
                System.out.println(name.toUpperCase());


            }catch (Exception e){
                System.out.print(e.getMessage());
            }
        }
    }
    