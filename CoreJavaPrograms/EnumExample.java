package exercisePackage.CoreJavaPrograms;


enum Designation{
    CEO(2),GeneralManager(4),RegionalManager(20),BranchManager(30);
    private int noofEmployees;
    Designation(int noofEmployees)
    {
        this.noofEmployees=noofEmployees;
    }
    public int getNoofEmployees(){
        return noofEmployees;
    }
}
class EnumExample{
    public void reportees(Designation designation){
        System.out.println(designation.getNoofEmployees());
    }
    public static void main(String[] args){
        EnumExample Enum=new EnumExample();
        Enum.reportees(Designation.CEO);
    }
}


