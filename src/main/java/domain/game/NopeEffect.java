package domain.game;

public class NopeEffect implements CardEffect {
    @Override
    public CardType getType(){ return domain.game.CardType.NOPE;};

    @Override
    public void play(PlayContext context) {
        Game game = context.getGame();
        int playerIndex = context.getCurrentPlayerIndex();

        game.removeCardFromHand(playerIndex, CardType.NOPE);

        context.setCancelled(true);
    }
}
