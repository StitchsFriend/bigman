package bigman;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.xml.stream.events.Comment;
import javax.security.auth.login.LoginException;

public class BotStartUp {

    public static void main(String[] args)throws LoginException
    {
        JDA bot= JDABuilder.createDefault("MTAxNjg5NzIzNDkzNzMxNTM3OA.Gm8PpX.kBEl2JPFCMrxZC6mQh67Qq1ld2fz_xhcIjNEQI")
           .setActivity(Activity.playing("!test"))
           .build();
           .addEventListeners(new PingPongBot());
           a
    }

    private static void addEventListeners(PingPongBot pingPongBot) {
    }

}
