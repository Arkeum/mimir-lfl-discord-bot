package fr.dpeynot;

import fr.dpeynot.listeners.HelloWorld;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MimirBot {
    static void main() throws LoginException, InterruptedException {

        JDA api = JDABuilder.createDefault(System.getenv("BOT_TOKEN"))
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new HelloWorld())
                .build()
                .awaitReady();

    }
}
