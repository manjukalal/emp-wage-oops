public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("welcome to employee wage computation program");

        int ispresent = 1;
        int rateperhour = 20;
        int mysalary = 0;
        int hours = 8;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (ispresent == empcheck) {
            mysalary = (rateperhour * hours);
            System.out.println("salary for full time is:" + mysalary);
        }else{
            System.out.println("employee absent salary is 0");
        }
    }
}
