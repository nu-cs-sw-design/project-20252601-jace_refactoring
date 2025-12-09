package domain.game;

public class DefuseEffect implements CardEffect{
    @Override
    public CardType getType() {
        return CardType.DEFUSE;
    }

    @Override
    public void play(PlayContext context) {
//        Game game = context.getGame();
//        int playerIndex = context.getCurrentPlayerIndex();
//        Integer idx = context.getDefuseInsertIndex();
//
//        if (idx == null) {
//            throw new IllegalStateException("DefuseEffect requires defuseInsertIndex in PlayContext");
//        }
//
//        game.playDefuse(idx, playerIndex);
    }
}
