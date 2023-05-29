import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void add(Card card){
        this.cards.add(card);
    }

    public void print(){
        cards.stream()
                .forEach(card -> System.out.println(card));
    }

    public void sort(){
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        Collections.sort(this.cards, comparator);
    }

    public void sortBySuit(){
        Comparator<Card> suitComparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);

        Collections.sort(this.cards, suitComparator);
    }

    @Override
    public int compareTo(Hand o) {
        int sum1 = 0;
        int sum2 = 0;
        for(Card card : this.cards){
            sum1 += card.getValue();
        }
        for(Card card : o.cards){
            sum2 += card.getValue();
        }
        return sum1 - sum2;
    }
}
