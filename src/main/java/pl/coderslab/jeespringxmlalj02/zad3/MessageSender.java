package pl.coderslab.jeespringxmlalj02.zad3;

// Zadanie 3
//Zmodyfikuj plik konfiguracyjny tak by wstrzyknięcie napisu Witaj Spring - by setter obyło się za pomocą metody ustawiającej.
//Pobierz ziarno w metodzie main, a następnie wywołaj na nim metodę getMessage.
//W pakiecie pl.coderslab.beans utwórz interfejs MessageService z jedną metodą void send();.
//Utwórz klasę EmailService implementującą interfejs MessageService.
//Dodaj w konfiguracji xml wpisy definiujące klasę EmailService jako ziarno Springa.
//W metodzie send wyświetl na konsoli Sending email.
//Pobierz w metodzie main utworzone ziarno, a następnie wywołaj na nim metodę send.

public class MessageSender {
    private MessageService service;

    public MessageSender(MessageService service) {
        this.service = service;
    }

    public void sendMessage(String msg) {
        String formatted = msg.toUpperCase();
        service.send(formatted);
    }
}
