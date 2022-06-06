

public class EmployeeWage {

        public static void bridgeLabz(int emprateperhrs, int empnoworkingdays, int empmaxhrs) {
            int emphr = 0;
            int totalemphrs = 0;
            int emptotalworkingdays = 0;
            int empwage = 0;
            while (totalemphrs <= empmaxhrs && emptotalworkingdays < empnoworkingdays) {
                emptotalworkingdays++;
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
                }
                totalemphrs += emphr;

            }
            empwage = (emphr * emprateperhrs);
            System.out.println("bridgelabz company wage:");
            System.out.println("per day emp wage for " + emphr + "is:" + empwage);
            int hrs = totalemphrs * emprateperhrs;
            System.out.println("total wage for " + totalemphrs + "hrs is :" + hrs);
        }



        static void gmr(int emprateperhrs, int empnoworkingdays, int empmaxhrs) {
            int emphr = 0;
            int totalemphrs = 0;
            int emptotalworkingdays = 0;
            int empwage = 0;
            while (totalemphrs <= empmaxhrs && emptotalworkingdays < empnoworkingdays) {
                emptotalworkingdays++;
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
                }
                totalemphrs += emphr;

            }
            empwage = (emphr * emprateperhrs);
            System.out.println("GMR company wage:");
            System.out.println("per day emp wage for " + emphr + "is:" + empwage);
            int hrs = totalemphrs * emprateperhrs;
            System.out.println("total wage for " + totalemphrs + "hrs is :" + hrs);
        }



        static void Tesla(int emprateperhrs, int empnoworkingdays, int empmaxhrs) {
            int emphr = 0;
            int totalemphrs = 0;
            int emptotalworkingdays = 0;
            int empwage = 0;
            while (totalemphrs <= empmaxhrs && emptotalworkingdays < empnoworkingdays) {
                emptotalworkingdays++;
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
                }
                totalemphrs += emphr;
            }
            empwage = (emphr * emprateperhrs);
            System.out.println("Tesla company wage:");
            System.out.println("per day emp wage for " + emphr + "is:" + empwage);
            int hrs = totalemphrs * emprateperhrs;
            System.out.println("total wage for " + totalemphrs + "hrs is :" + hrs);
        }


        public static void main(String[] args)
        {
            EmployeeWage wage = new EmployeeWage();
            wage.bridgeLabz(20, 20, 100);
            wage.gmr(30,25,120);
            wage.Tesla(40,30,150);

        }
    }

