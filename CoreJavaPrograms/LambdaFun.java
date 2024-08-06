package exercisePackage.CoreJavaPrograms;

interface ConcatString{
    String concat(String s, String d);
}


public class LambdaFun {
    public static void main(String[] args) {
        ConcatString obj =  (s,d) ->  s.concat(d);

        String result =  obj.concat("Yes","Done");
        System.out.println(result);
    }


}

