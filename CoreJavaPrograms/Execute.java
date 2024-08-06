package exercisePackage.CoreJavaPrograms;

class EmployeeData{
    private String employeeId;
    EmployeeData(String employeeId){
        this.employeeId=employeeId;
    }
    public int reward(double...fixedDeposit){    //Variable argument
        double sum=0;
        int rewardPoint=0;
        for(double deposit:fixedDeposit){
            sum=sum+deposit;
        }
        System.out.println(employeeId+"'s Sum is: "+sum);
        if(sum>1000000){
            rewardPoint=20000;
        }
        else if(sum<1000000 && sum>=500000){
            rewardPoint=10000;
        }
        else{
            rewardPoint = 20000;
        }
        return rewardPoint;
    }
    public String getEmployeeId(){
        return employeeId;
    }
}

class Execute{
    public static void main(String[] args){
        EmployeeData employee1=new EmployeeData("E1001");
        int rewardPoint=employee1.reward(100000,200000,300000);
        System.out.println(employee1.getEmployeeId() +" has got a reward of "+rewardPoint);
        EmployeeData employee2=new EmployeeData("E1002");
        int rewardPoint1=employee2.reward(100000,100000);
        System.out.println(employee2.getEmployeeId() +" has got a reward of "+rewardPoint1);
    }
}