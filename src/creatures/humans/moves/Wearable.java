package creatures.humans.moves;

import exceptions.NoClothesException;

public interface Wearable {
    void wear(String clothing) throws NoClothesException;
}