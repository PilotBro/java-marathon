package day13;

public class Task1 {
    public static void main(String[] args) {
        User masha = new User("mashka");
        User pasha = new User("pashka");
        User farhat = new User("uvazaemiy");

        masha.sendMessage(pasha, "Hi.");
        masha.sendMessage(pasha, "How are you?");

        pasha.sendMessage(masha, "Привет. Хватит прикалываься. Ты же знаешь я не знаю ангдийского.");
        pasha.sendMessage(masha, "Что сегодня делаешь? Поехали к Фархату? У него сегодня вечер Лермонтова.");
        pasha.sendMessage(masha, "Говорят сам Лермонтов приедет. Будет интересно.");

        farhat.sendMessage(masha, "Доброе утро, Машенька.");
        farhat.sendMessage(masha, "Позвольте пригласить Вас сегодня в наше родовое поместье на Барановке. Планируется интереснейшее мероприятие.");
        farhat.sendMessage(masha, "Кстати Его светлость Вениамин Григорьевич, также планирует присутствовать");

        masha.sendMessage(farhat, "Добрый день, голубчик!");
        masha.sendMessage(farhat, "С удовольствием приму Ваше приглашение.");
        masha.sendMessage(farhat, "Буду у Вас к назначенному часу.");

        farhat.sendMessage(masha, "Благодарю Машенька, что приняли мое приглашеине.");
        farhat.sendMessage(masha, "Моя тонированная Лада Карета будет ждать Вас у подъезда в 19:00.");
        farhat.sendMessage(masha, "Сгораю, как дядины шашлыки на майские праздники, от нетерпения встретиться с Вами.");

        MessageDatabase.showDialog(masha, farhat);

        System.out.println(MessageDatabase.getMessages().get(1));

    }
}
