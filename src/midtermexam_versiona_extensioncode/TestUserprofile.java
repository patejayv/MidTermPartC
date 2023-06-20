package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author jaypa
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose genre from the following : " + "\nComedy \nAction \nDrama \nMystery ");
        String genre = sc.next();
        UserProfile profile1 = new UserProfile("JayPatel_2911", genre);
        System.out.println("User profile created with userID : " + profile1.getUserID());
    }
}
