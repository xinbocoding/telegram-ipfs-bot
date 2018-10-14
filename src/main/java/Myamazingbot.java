
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Myamazingbot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        // TODO
        if (update.hasMessage() && update.getMessage().hasText()) {
            //define variable to get message and ID
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            //create a object to send a message
            String user_said = new String("小兔子");
            String ans = new String("嘿嘿");
            SendMessage message = new SendMessage()
                       .setChatId(chat_id)
                       .setText(message_text);
                    if (message_text.equals(user_said)) {
                        message.setText(ans);
                    }
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        // TODO
        return "catfunny_bot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "670033216:AAHGnX7D5XHLpxMzp2PP8ygY_A_r7k53fGs";
    }
}
