package exercisePackage;

public class TryMathCube {
    public int cube(int n) {
        return n * n * n;
    }
    public static void main(String[] args) {
        try {
            TryMathCube tc = new TryMathCube();
            int num = Integer.parseInt(args[0]);
            System.out.println(tc.cube(num));
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}