package creatures.humans;

import creatures.humans.moves.Embraceable;
import creatures.humans.moves.Pursing;
import creatures.humans.moves.Speakable;
import exceptions.EmptySpeechException;

public class Rachel extends Human implements Speakable, Embraceable {

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    private boolean isSick;

    public String getPartOfBody() {
        return partOfBody;
    }

    public void setPartOfBody(String partOfBody) {
        this.partOfBody = partOfBody;
    }

    private String partOfBody;

    public Rachel(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
        this.isSick = false;
        this.partOfBody = "рука";
    }

    @Override
    public void speak(String phrase) throws EmptySpeechException {
        if (phrase != null && !phrase.isEmpty()) {
            System.out.println(name + " говорит: " + phrase);
            if (phrase.equals("И не обижайся, если я заболею, когда будут хоронить Норму.")) {
                setSick(true);
                System.out.println("Рачэл чувствует себя больной. Болезнь: " + isSick());
            }
        } else {
            throw new EmptySpeechException(name);
        }
    }

    public void holdHand(Human human) {
        if (human instanceof Louis) {
            human.setFatigue(human.getFatigue() - 1);
            setFatigue(getFatigue() - 1);
            System.out.println(human.getName() + " берёт " + getName() + " за " + getPartOfBody() + ". Усталость Рачэл: " + getFatigue() + ". Усталость Луиса: " + human.getFatigue());
        } else {
            System.out.println("Не может взять " + getName() + " за " + getPartOfBody());
        }
    }

    public void shakeHand() {
        setFatigue(getFatigue() + 1);
        System.out.println(name + " дергает " + partOfBody + ". Усталость: " + getFatigue());
    }

    public void lookAtCeiling() {
        class LipsPursing implements Pursing {
            @Override
            public void purseLips() {
                setSurprise(getSurprise() + 1);
                System.out.println(name + " кусает губы. Удивление: " + getSurprise());
            }

        }
        Pursing purse = new LipsPursing();
        purse.purseLips();
        setFatigue(getFatigue() + 1);
        System.out.println(name + " смотрит в потолок. Усталость: " + getFatigue());
    }

    @Override
    public void embrace() {
        System.out.println(name + " обнимает Луиса.");
    }
}
