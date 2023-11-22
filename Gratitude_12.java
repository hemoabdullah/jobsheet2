public class Gratitude_12 {

    public void sayThankyou() {
        System.out.println("Thank you for being awesome!");
    }


    public void sayAdditionalGreetings(String additionalMessage) {
        System.out.println("Additional Greetings: " + additionalMessage);
    }

    public static void main(String[] args) {
 
        Gratitude_12 gratitudeInstance = new Gratitude_12();


        gratitudeInstance.sayThankyou();


        gratitudeInstance.sayAdditionalGreetings("Wishing you a fantastic day!");
    }
}
