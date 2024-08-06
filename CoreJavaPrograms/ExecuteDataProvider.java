package exercisePackage.CoreJavaPrograms;


class Trainee implements DataProvider{
    int markSecured;
    Trainee(int markSecured){
        this.markSecured = markSecured;

    }
    @Override
    public void calcPercentage() {

        System.out.println("The total aggregate percentage secured is: "+ ((double) markSecured / totalMarks) * 100);
    }
}


class Intern implements DataProvider{
    int markSecure;
    int graceMark;
    Intern(int markSecure,int graceMark){
        this.markSecure = markSecure;
        this.graceMark = graceMark;
    }

    @Override
    public void calcPercentage() {
        int totalSecureMark = markSecure + graceMark;
        System.out.println("The total aggregate percentage secured is: "+ ((double) totalSecureMark/ totalMarks) * 100);
    }
}


public class ExecuteDataProvider {
    public static void main(String[] args) {
        Trainee t = new Trainee(6000);
        t.calcPercentage();
        Intern i = new Intern(5000,500);
        i.calcPercentage();


    }
}
