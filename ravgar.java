import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class MyBot extends ListenerAdapter {

    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("Bot Token").build();
        jda.addEventListener(new MyBot());
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        if (message.getContentRaw().equalsIgnoreCase(".benkimim")) {
            TextChannel channel = event.getTextChannel();
            channel.sendMessage("Selamlar Ben Ravgar ve Kendini Sürekli Geliştiren Bir Coder Olarak Anılıyorum").queue();
        }
    }
}
