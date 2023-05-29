import java.util.Collections;
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        int suitValue = c1.getSuit().ordinal() - c2.getSuit().ordinal();

        if(suitValue == 0){
            return c1.compareTo(c2);
        }

        return suitValue;
    }
}
