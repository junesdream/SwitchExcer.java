public class MethodeExcer {
    public static void main(String[] args) {
        //Methode execute
        // Variable für AB 1
        int num1, num2;

        duplicate(3);

        int result = sume(35);
        System.out.println(sume(45));

        // Output von AB1
        int addSume = addieren(23, 45);
        System.out.println(addSume);

       //Output Methode 2
        String newSume = testSume(20, 40);
        System.out.println(newSume);
        //Output Methode 3
        System.out.println(isBiggerThan100(34, 55));

        String name = "Alice Wonderland";
        System.out.println(name.toLowerCase());

        //String bookName = "Alice in Woderland in fancy";
       System.out.println(longerThan20("Das Fazit fancy Studien zu Resilienz und innerer Stärke - Ernährung, Bewegung, Meditation"));
       System.out.println(nameContainsFan("The nony garden is so nice one!"));
       System.out.println(beideWahr("The fanxcy garden is so nice one!"));
    }
    //Methode, Function
    // void: ich gebe gar keine Information
    public static void duplicate(int value) {

        System.out.println("duplicate " + value *2);
    }
    public static int sume(int value) {

        return value *2;
    }

    //AB1: Merthode 1
    public static int addieren(int num1, int num2) {

        return num1 + num2;
    }
    //Methode 2
    public static String testSume(int num1, int num2) {

        return "Summe: " + num1 + num2;
    }
    //Bonus-AB
    public static boolean isBiggerThan100(int a, int b) {
        if (a > 100 || b > 100) {
            return true;
        } else {
            return false;
        }
    }

    // AB 2.1
    public static boolean longerThan20(String bookName) {
        return bookName.length() > 20;
    }
    // AB 2.2.
    public static boolean nameContainsFan(String bookName) {
        return bookName.contains("fancy");
    }

    //AB 2.3: Eine Methode, die eine andere Methode von mir aufruft.
    public static boolean beideWahr(String bookName) {
        return longerThan20(bookName) && nameContainsFan(bookName);
    }
}
