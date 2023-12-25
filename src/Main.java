import creatures.gods.*;
import creatures.humans.*;
import exceptions.*;
import objects.*;
import enums.*;

public class Main {
    public static void main(String[] args) throws NoClothesException, EmptySpeechException {
        Human[] porters = new Human[4];
        MainGod mainGod = new MainGod("Бог");
        Rachel rachel = new Rachel("Рачэл", 27, 2, 0);
        Ellie ellie = new Ellie("Элли", 8, 3, 0);
        Louis louis = new Louis("Луис", 28, 3, 0);
        Jude jude = new Jude("Джуд", 30, 2, 0);
        Hedge hedge = new Hedge("Гэдж", 2, 0, 0);
        Norma norma = new Norma("Норма", 40, 0, 0);
        Parishioner parishioners = new Parishioner("Прихожане", 0, 0, 0);
        Reverend reverendLaughing = new Reverend("Преподобный Лафлин", 40, 0, 0, mainGod);
        JudeNephew firstNephew = new JudeNephew("Первый племянник Джуда", 30, 0, 0);
        JudeNephew secondNephew = new JudeNephew("Второй племянник Джуда", 31, 0, 0);
        NormaBrother normaBrother = new NormaBrother("Брат Нормы", 50, 0, 0);
        NightScene nightScene = new NightScene();
        BlackSuit blackSuit = new BlackSuit();
        BlueDress blueDress = new BlueDress();
        rachel.speak("И не обижайся, если я заболею, когда будут хоронить Норму.");
        louis.speak("Нет, дорогая, не обижусь.");
        louis.beSlow();
        rachel.holdHand(louis);
        louis.speak("А можно мне взять Элли?");
        rachel.shakeHand();
        rachel.speak("О, Луис, я даже не знаю. Она еще маленькая...");
        louis.speak("Но она уже год знает, откуда берутся дети.");
        rachel.lookAtCeiling();
        rachel.speak("Если тебе кажется, что так нужно, можешь ее взять.");
        louis.speak("Давай спать");
        nightScene.nightEmbraceAndWhisper(louis, rachel);
        System.out.println("Непонимание Элли: " + ellie.getConfusion());
        System.out.println("Красота Элли: " + ellie.getBeauty());
        System.out.println("Усталость Элли: " + ellie.getFatigue());
        System.out.println("Усталость Луиса: " + louis.getFatigue());
        System.out.println("Удивление Луиса: " + louis.getSurprise());
        System.out.println("Слепота из-за любви Луиса: " + louis.getBlindness());
        ellie.sit(null);
        louis.sit(ellie);
        try {
            ellie.wear(blueDress.getName());
        } catch (NoClothesException ignored) {

        }
        louis.performHear(ellie);
        ellie.beInChurch();
        ellie.beOnFuneral();
        louis.seeFromSide(Adjectives.USUAL.getName(), ellie, hedge);
        louis.seeFromSide(Adjectives.RARELY.getName(), ellie, hedge);
        louis.think(ellie);
        jude.wear("");
        jude.wear(blackSuit.getName());
        louis.seeOnly(jude);
        jude.lean(ellie);
        jude.kiss(ellie, Nouns.FOREHEAD.getName());
        ellie.openEyes(jude, norma);
        reverendLaughing.pray(norma);
        reverendLaughing.speak("Готовы ли носильщики?");
        ellie.grabPerson(louis);
        louis.speak("Я один из носильщиков, дорогая");
        porters[0] = louis;
        norma.grabAndCarry(porters);
        louis.almostSit();
        louis.putHand(ellie);
        louis.speak("Мы должны вынести Норму. Вчетвером — я, двое племянников Джуда и брат Нормы");
        porters[1] = firstNephew;
        porters[2] = secondNephew;
        porters[3] = normaBrother;
        norma.grabAndCarry(porters);
        ellie.speak("А как я тебя найду?");
        normaBrother.comeClose(jude);
        firstNephew.comeClose(jude);
        secondNephew.comeClose(jude);
        louis.lookBack(normaBrother, firstNephew, secondNephew);
        louis.comeClose(jude);
        parishioners.goAway();
        parishioners.cry();
        louis.speak("Сойдешь со ступенек, и я буду там.");
        ellie.speak("Ну хорошо, только не потеряйся.");
        louis.speak("Нет-нет.");
        ellie.catchHand(louis);
        ellie.speak("Папа?");
        louis.speak("Что, малышка?");
        ellie.whisper("Смотри не урони ее");
    }
}