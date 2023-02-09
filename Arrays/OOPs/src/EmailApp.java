public class EmailApp {
    public static void main(String[] args) {
        Email eml =new Email("Amish" ,"Sheikh");
        eml.setAlternateEmail("amish20@gmail.com");
        System.out.println("Your alternate email is: "+    eml.getAlternateEmail());
        System.out.println(eml.ShowInfo());
    }
}

