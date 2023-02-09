import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private  int defaultPasswordLength=10;
    private String CompanySuffix = "company.com";
    private String alternateEmail;
    private int mailCapacity=500;


    //constructor to receive firstName and lastName;
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email is created:"+this.firstName+" "+this.lastName);
//        call a method asking for the department =  return the department
        this.department =setDepartment(); // calling the class
        System.out.println("Department: "+this.department);
//        call method that return random password
        this.password =randomPass(defaultPasswordLength);
        System.out.println("Your password is:"+this.password  );


//        combine element to generate email .

        email = firstName.toLowerCase() +""+lastName.toLowerCase()+"@"+department+CompanySuffix;
        System.out.println("Your email is : "+ email);

    }

    //Ask for the department
    private String setDepartment(){
        System.out.println("Enter the department \n1 for sales \n2 for development\n3 for Accounting\n0 for none\n Enter department code: ");
        Scanner in  =new Scanner(System.in);
        int choice = in.nextInt();
        if (choice==1){
            return "sales";
        }
        else  if (choice==2){
            return "dev";
        }
       else if (choice==3){
            return "Acct";
        }
       else {
            return "none";
        }

    }
//    generate random password
    private String randomPass(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[]  password =new char[length];
        for (int i = 0; i <length; i++) {
        int ra = (int) (Math.random()*passwordSet.length());
        password[i] = passwordSet.charAt(ra);
        }
        return new String(password);
    }

//    Set the mailbox capacity

    public void setMailCapacity(int capacity){
        this.mailCapacity = capacity;
    }
    public int getMailCapacity(){
        return mailCapacity;
    }

//    set the alternate email
    public void  setAlternateEmail(String altemail){
        this.alternateEmail = altemail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    //    Change the password
public void changePassword(String password){
        this.password=password;
}
public String getPassword(){
        return password;
}

public String ShowInfo(){
        return "Display Name: " +firstName+" "+lastName+
                "\ncompany name: " + email +
                "\nMailboxCapacity: "+ mailCapacity + "mb";
}

}
