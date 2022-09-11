package bigman;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import java.util.EventListener;

public class ListeningToEvents implements EventListener {
    public static void main(String[] args)
            throws InterruptedException
    {
        // Note: It is important to register your ReadyListener before building
        JDA jda = JDABuilder.createDefault("MTAxNjg5NzIzNDkzNzMxNTM3OA.Gm8PpX.kBEl2JPFCMrxZC6mQh67Qq1ld2fz_xhcIjNEQI")
                .addEventListeners(new ReadyListener())
                .build();

        // optionally block until JDA is ready
        jda.awaitReady();
    }

    @Override
    public void onEvent(GenericEvent event)
    {
        if (event instanceof ReadyEvent)
            System.out.println("API is ready!");
    }



}
