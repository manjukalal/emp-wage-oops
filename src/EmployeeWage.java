public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("welcome to employee wage computation program");

        int Rateperhrs = 20;
        int Fulltime = 1;
        int Parttime = 2;
        int empwage = 0;
        int emphr = 0;
        int workdays = 20;
        int totalWage = 0;

        for ( int days = 0; days<=workdays; days++ ) {
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empcheck) {
                case 1:
                    emphr = 4;
                    break;

                case 2:
                    emphr = 8;
                    break;

                default:
                    emphr = 0;
                    break;
            }
            empwage = (emphr * Rateperhrs);
            totalWage = empwage;
            System.out.println("day:" +days+ "employee wage is :" +empwage);
        }
        System.out.println("salary is:" +totalWage);


    }
}
