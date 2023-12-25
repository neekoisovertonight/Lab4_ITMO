package objects;

import creatures.humans.*;
import creatures.humans.moves.*;

public class NightScene {
    static class NightlyEmbrace implements Embraceable {
        private Louis louis;
        private Rachel rachel;

        public NightlyEmbrace(Louis louis, Rachel rachel) {
            this.louis = louis;
            this.rachel = rachel;
        }

        @Override
        public void embrace() {
            louis.embrace();
        }
    }

    private Whisperable whisperable = new Whisperable() {
        @Override
        public void whisper(String message) {
            System.out.println("Луис говорит: " + message);
        }
    };

    public void nightEmbraceAndWhisper(Louis louis, Rachel rachel) {
        NightlyEmbrace nightlyEmbrace = new NightlyEmbrace(louis, rachel);
        nightlyEmbrace.embrace();

        class Shivering {
            public void shiver(Rachel rachel) {
                rachel.setFatigue(rachel.getFatigue() + 1);
                System.out.println(rachel.getName() + " дрожит. Усталость: " + rachel.getFatigue());
            }
        }

        Shivering shivering = new Shivering();
        shivering.shiver(rachel);

        whisperable.whisper("Все хорошо.");

        class Sleeping {
            public void sleep(Rachel rachel) {
                rachel.setFatigue(1);
                System.out.println(rachel.getName() + " усыпает. Усталость: " + rachel.getFatigue());
            }
        }

        Sleeping sleeping = new Sleeping();
        sleeping.sleep(rachel);
    }
}
