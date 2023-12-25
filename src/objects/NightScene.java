package objects;

import creatures.humans.*;
import creatures.humans.moves.*;

public class NightScene {
    static class NightlyEmbrace implements Embraceable {
        private final Louis louis;
        private final Rachel rachel;

        public NightlyEmbrace(Louis louis, Rachel rachel) {
            this.louis = louis;
            this.rachel = rachel;
        }

        @Override
        public void embrace() {
            louis.embrace();
            rachel.embrace();
        }
    }

    private final Whisperer whisperer = new Whisperer() {
        @Override
        public void whisper(String message) {
            System.out.println("Луис шепчет: " + message);
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

        whisperer.whisper("Все хорошо.");

        class Sleeping {
            public void sleep(Rachel rachel) {
                rachel.setFatigue(0);
                System.out.println(rachel.getName() + " усыпает. Усталость: " + rachel.getFatigue());
            }
        }

        Sleeping sleeping = new Sleeping();
        sleeping.sleep(rachel);
    }
}
