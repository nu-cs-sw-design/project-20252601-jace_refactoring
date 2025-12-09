package domain.game;

public class ShuffleEffect implements CardEffect {
    @Override
    public CardType getType() {
        return CardType.SHUFFLE;
    }
    @Override
    public void play(PlayContext context) {
        context.getDeck().shuffleDeck();
    }
}
