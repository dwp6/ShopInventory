package hooks;

import io.cucumber.java.Before;
import utils.ApiClient;

public class Hooks {

    @Before(order = 1)
    public void loginBeforeTests() {
        ApiClient.authenticate("user06", "secpassword*");
    }
}
