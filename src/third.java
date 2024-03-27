public class third {
    public static void main(String[] args) {
        String direction = "До низу";
        int floor = 6;
        if (direction.equals("До гори")) {
            switch (floor) {
                case 1:
                    System.out.println("Ви піднялись на 1 поверх");
                    break;
                case 2:
                case 3:
                    System.out.println("Ви піднялись на 3 поверх");
                    break;
                case 4:
                    System.out.println("Ви піднялись на 4 поверх");
                    break;
                case 5:
                    System.out.println("Ви піднялись на 5 поверх");
                    break;
                case 6:
                    System.out.println("Ви піднялись на 6 поверх");
                    break;
                case 7:
                    System.out.println("Ви піднялись на 7 поверх");
                    break;
                case 8:
                    System.out.println("Ви піднялись на 8 поверх");
                    break;
                case 9:
                    System.out.println("Ви піднялись на 9 поверх");
                    break;
                default:
                    System.out.println("Ви вказали неіснуючий поверх!");
            }
        } else if (direction.equals("До низу")) {
            switch (floor) {
                case 9:
                    System.out.println("Ви спустились на 9 поверх");
                    break;
                case 8:
                    System.out.println("Ви спустились на 8 поверх");
                    break;
                case 7:
                    System.out.println("Ви спустились на 7 поверх");
                    break;
                case 6:
                    System.out.println("Ви спустились на 6 поверх");
                    break;
                case 5:
                    System.out.println("Ви спустились на 5 поверх");
                    break;
                case 4:
                    System.out.println("Ви спустились на 4 поверх");
                    break;
                case 3:
                    System.out.println("Ви спустились на 3 поверх");
                    break;
                case 2:
                case 1:
                    System.out.println("Ви спустились на 1 поверх");
                    break;
                default:
                    System.out.println("Ви вказали неіснуючий поверх!");
            }
        }
    }
}






