package creatures.humans;

import creatures.humans.moves.Speakable;
import exceptions.EmptySpeechException;

public class Rachel extends Human implements Speakable {

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    private boolean isSick;
    public Rachel(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
        this.isSick = false;
    }

    @Override
    public void speak(String phrase) throws EmptySpeechException {
        if (phrase != null && !phrase.isEmpty()) {
            System.out.println(name + " говорит: " + phrase);
            if (phrase == ""
        } else {
            throw new EmptySpeechException(name);
        }
    }
}
