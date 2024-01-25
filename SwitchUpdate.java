public class SwitchUpdate {
    public static void main(String[] args) {
        // String day = "Friday";

        // old version
        // switch (day) {
        // case "Saturday", "Sunday":
        // System.out.println("6am");
        // break;
        // case "Monday":
        // System.out.println("8am");
        // break;
        // default:
        // System.out.println("7am");
        // break;
        // }

        // new version
        // switch (day) {
        // case "Saturday", "Sunday" -> System.out.println("6am");

        // case "Monday" -> System.out.println("8am");

        // default -> System.out.println("7am");

        // }

        // simplified of new version

        // String day = "Friday";
        // String result = "";
        // switch (day) {
        // case "Saturday", "Sunday" -> result = "6am";
        // case "Monday" -> result = "8am";
        // default -> result = "7am";
        // }
        // System.out.println(result);

        // even more simplified
        // simplified of new version

        String day = "Friday";
        String result = "";
        result = switch (day) {
            case "Saturday", "Sunday" -> "6am";  
            case "Monday" -> "8am";//you can also use case "Monday": yield "8am";
            default -> "7am";
        };
        System.out.println(result);
    }
}
