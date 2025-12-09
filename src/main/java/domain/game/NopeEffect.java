package domain.game;

public class NopeEffect implements CardEffect {
    @Override
    public CardType getType(){ return domain.game.CardType.NOPE;};

    @Override
    public void play(PlayContext context) {

    }
}
