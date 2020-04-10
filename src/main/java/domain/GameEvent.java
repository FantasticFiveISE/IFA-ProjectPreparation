package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GameEvent {
    private static int gameEventCounter = 0;
    private int gameEventId;

    private LocalDateTime dateTime;
    private int gameMinutes;
    private GameAlert eventName;
    private String subscription;

/////////// Constructors ///////////
    public GameEvent(String dateTimeStr, int gameMinutes, GameAlert eventName, String subscription) {
        gameEventCounter++;
        gameEventId = gameEventCounter;
        // Game date string format: "2016-11-09 11:44"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.dateTime = LocalDateTime.parse(dateTimeStr, formatter);

        this.gameMinutes = gameMinutes;
        this.eventName = eventName;
        this.subscription = subscription;
    }


/////////// Getters and Setters ///////////
    public int getGameEventId() {
        return gameEventId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * string format: "2016-11-09 11:44"
     * @param dateTimeStr
     */
    public void setGameDate(String dateTimeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.dateTime = LocalDateTime.parse(dateTimeStr, formatter);
    }

    public int getGameMinutes() {
        return gameMinutes;
    }

    public void setGameMinutes(int gameMinutes) {
        this.gameMinutes = gameMinutes;
    }

    public GameAlert getEventName() {
        return eventName;
    }

    public void setEventName(GameAlert eventName) {
        this.eventName = eventName;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return  dateTime + " " +
                gameMinutes + ", " +
                eventName.toString() +" " +
                subscription;
    }
}
