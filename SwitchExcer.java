import java.sql.SQLOutput;

public class SwitchExcer {
    public static void main(String[] args) {
        int tag = 3;

        switch (tag) {
            case 1 :
                System.out.println("On this Monday, we will have tofu cutlets for lunch.");
                break;
            case 2:
                System.out.println("On this Tuesday, we will have vegan burgers with sweet potatoes for lunch.");
                break;
            case 3:
                System.out.println("On this Wednesday, we will have almond curry with chicken breast for lunch.");
                break;
            case 4:
                System.out.println("On this Thursday, we will have fried rice with salmon for lunch.");
                break;
            case 5:
                System.out.println("On this Friday, we will have tuna steak with brown rice for lunch.");
                break;
            case 6:
                System.out.println("On this Saturday, we will have mandu dumplings with fortune cookies for lunch.");
                break;
            case 7:
                System.out.println("On this Sunday, we will have beef steak with seasonal vegetables for lunch.");
            default:
                System.out.println("Today we are close. See you tomorrow!");
                break;
        }
    }
}
