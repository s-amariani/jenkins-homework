import org.junit.Assert;
import org.junit.Test;

public class jenkinsTest {
    @Test
    public void test(){
        //validate System.getenv("USERDOMAIN_ROAMINGPROFILE")
        String userdomain_roamingprofile = System.getenv("USERDOMAIN_ROAMINGPROFILE");
//        System.out.println("userdomain_roamingprofile = "+ userdomain_roamingprofile);
        Assert.assertEquals("SERGI-PC", userdomain_roamingprofile);
    }
}
