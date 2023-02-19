public class Card {

    private int hp;
    // Pontos de vida
    private int baseAtk;
    // Ataque base
    private int def;
    // Pontos de defesa
    private String cardName;
    // Nome da carta
    private String desc;

    // Descrição da carta

    public void attack(Card c1, Card c2) {
        c2.hp -= c1.baseAtk + c1.def;


    }

}