package mage.cards.i;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.combat.CantBlockAllEffect;
import mage.abilities.keyword.DevoidAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.mageobject.ToughnessGreaterThanPowerPredicate;

import java.util.UUID;

/**
 *
 * @author LevelX2
 */
public final class ImmobilizerEldrazi extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("Each creature with toughness greater than its power");

    static {
        filter.add(ToughnessGreaterThanPowerPredicate.instance);
    }

    public ImmobilizerEldrazi(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{1}{R}");
        this.subtype.add(SubType.ELDRAZI);
        this.subtype.add(SubType.DRONE);
        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // Devoid
        this.addAbility(new DevoidAbility(this.color));

        // {2}{C}: Each creature with toughness greater than its power can't block this turn.
        Ability ability = new SimpleActivatedAbility(new CantBlockAllEffect(filter, Duration.EndOfTurn), new ManaCostsImpl<>("{2}{C}"));

        this.addAbility(ability);

    }

    private ImmobilizerEldrazi(final ImmobilizerEldrazi card) {
        super(card);
    }

    @Override
    public ImmobilizerEldrazi copy() {
        return new ImmobilizerEldrazi(this);
    }
}
