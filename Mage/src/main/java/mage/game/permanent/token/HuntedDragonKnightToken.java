package mage.game.permanent.token;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mage.MageInt;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.constants.CardType;

/**
 *
 * @author spjspj
 */
public class HuntedDragonKnightToken extends Token {

    final static private List<String> tokenImageSets = new ArrayList<>();

    static {
        tokenImageSets.addAll(Arrays.asList("ORI", "RTR", "C15"));
    }

    public HuntedDragonKnightToken() {
        super("Knight", "2/2 white Knight creature tokens with first strike");
        cardType.add(CardType.CREATURE);
        color.setWhite(true);

        subtype.add("Knight");
        power = new MageInt(2);
        toughness = new MageInt(2);
        this.addAbility(FirstStrikeAbility.getInstance());
    }
}
