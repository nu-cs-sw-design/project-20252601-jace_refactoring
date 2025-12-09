package domain.game;

public interface CardEffect {
    CardType getType();
    void play(PlayContext context);
}
