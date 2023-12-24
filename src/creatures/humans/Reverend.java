package creatures.humans;

import creatures.gods.God;
import creatures.gods.MainGod;
import creatures.humans.moves.IsDead;
import creatures.humans.moves.Speakable;
import exceptions.EmptySpeechException;

public class Reverend extends Human implements Speakable {
    private God god;

    public Reverend(String name, int age, int fatigue, int surprise, God god) {
        super(name, age, fatigue, surprise);
    }

    public void pray(IsDead human){
        System.out.print(name + " произносит молитву, просит " + this.god + " о вечном благословлении. ");
        human.blessing();
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

