import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {
    public static void main(String[] args) {

        //  Initialize Api Context
        ApiContextInitializer.init();
        //  Instantilate Telegram Bots API
        TelegramBotsApi botsApi = new TelegramBotsApi();
        //  Register our bot
        try {
            botsApi.registerBot(new Myamazingbot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}

