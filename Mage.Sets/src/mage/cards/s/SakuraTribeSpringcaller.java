package mage.cards.s;

import mage.MageInt;
import mage.Mana;
import mage.abilities.triggers.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.effects.mana.UntilEndOfTurnManaEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author LevelX2
 */
public final class SakuraTribeSpringcaller extends CardImpl {

    public SakuraTribeSpringcaller(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{G}");
        this.subtype.add(SubType.SNAKE);
        this.subtype.add(SubType.SHAMAN);

        this.power = new MageInt(2);
        this.toughness = new MageInt(4);

        // At the beginning of your upkeep, add {G}. Until end of turn, you don't lose this mana as steps and phases end.
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(new UntilEndOfTurnManaEffect(Mana.GreenMana(1))
        ));
    }

    private SakuraTribeSpringcaller(final SakuraTribeSpringcaller card) {
        super(card);
    }

    @Override
    public SakuraTribeSpringcaller copy() {
        return new SakuraTribeSpringcaller(this);
    }
}
