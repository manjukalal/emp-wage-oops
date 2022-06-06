public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("welcome to employee wage computation program");

        int ispresent=1;

        double attendence = Math.floor( Math.random()*10) %2;
        if (attendence == ispresent)
            System.out.println("emp is present");
        else
            System.out.println("emp is absent");

    }
}
