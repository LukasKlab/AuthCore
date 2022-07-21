package net.labindustries.authcore.utilites;


import com.warrenstrange.googleauth.GoogleAuthenticator;
import net.labindustries.authcore.AuthCore;

import java.util.ArrayList;
import java.util.UUID;

public class AuthenticationUtils {

    private final AuthCore authCore;

  public AuthenticationUtils(AuthCore authCore) {

    this.authCore = authCore;
   }



    public AuthCore getAuthCore() {
        return authCore;
    }

}
