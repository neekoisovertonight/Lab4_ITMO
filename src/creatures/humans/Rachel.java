package creatures.humans;

import creatures.humans.moves.Speakable;
import exceptions.EmptySpeechException;

public class Rachel extends Human implements Speakable {
    public Rachel(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
    }

    @Override
    public void speak(String phrase) throws EmptySpeechException {
        if (phrase != null && !phrase.isEmpty()) {
            System.out.println(name + " говорит: " + phrase);
        } else {
            throw new EmptySpeechException(name);
        }
    }
}
