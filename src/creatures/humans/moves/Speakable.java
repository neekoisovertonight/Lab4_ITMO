package creatures.humans.moves;

import exceptions.EmptySpeechException;

public interface Speakable {

    void speak(String phrase) throws EmptySpeechException;

}

