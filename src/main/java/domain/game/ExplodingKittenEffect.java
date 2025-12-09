package domain.game;

public class ExplodingKittenEffect implements CardEffect{
    @Override
    public void play(PlayContext context) {
        int currentPlayerIndex = context.getCurrentPlayerIndex();
        Game game = context.getGame();

        boolean exploded = game.playExplodingKitten(currentPlayerIndex);
        //defuse flow for later
    }
    @Override
    public CardType getType() {
        return CardType.EXPLODING_KITTEN;
    }
}
