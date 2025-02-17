package mage.cards.p;

import mage.abilities.Ability;
import mage.abilities.triggers.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterControlledLandPermanent;
import mage.filter.predicate.permanent.TappedPredicate;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.players.Player;
import mage.watchers.Watcher;

import java.util.UUID;

/**
 * @author MTGfan
 */
public final class PowerSurge extends CardImpl {

    public PowerSurge(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{R}{R}");

        // At the beginning of each player's upkeep, Power Surge deals X damage to that player, where X is the number of untapped lands they controlled at the beginning of this turn.
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(TargetController.EACH_PLAYER, new PowerSurgeDamageEffect(), false), new PowerSurgeWatcher());
    }

    private PowerSurge(final PowerSurge card) {
        super(card);
    }

    @Override
    public PowerSurge copy() {
        return new PowerSurge(this);
    }
}

class PowerSurgeDamageEffect extends OneShotEffect {

    PowerSurgeDamageEffect() {
        super(Outcome.Damage);
        this.staticText = "{this} deals X damage to that player, where X is the number of untapped lands they controlled at the beginning of this turn";
    }

    private PowerSurgeDamageEffect(final PowerSurgeDamageEffect copy) {
        super(copy);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(getTargetPointer().getFirst(game, source));
        if (player != null) {
            PowerSurgeWatcher watcher = game.getState().getWatcher(PowerSurgeWatcher.class);
            if (watcher != null) {
                int damage = watcher.getUntappedLandCount();
                player.damage(damage, source.getSourceId(), source, game);
                return true;
            }
        }
        return false;
    }

    @Override
    public PowerSurgeDamageEffect copy() {
        return new PowerSurgeDamageEffect(this);
    }
}

class PowerSurgeWatcher extends Watcher {

    private static final FilterPermanent filter = new FilterControlledLandPermanent();

    static {
        filter.add(TappedPredicate.UNTAPPED);
    }

    private int untappedLandCount;

    public PowerSurgeWatcher() {
        super(WatcherScope.GAME);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        if (event.getType() == GameEvent.EventType.BEGINNING_PHASE_PRE
                && game.getPhase() != null) {
            untappedLandCount = game.getBattlefield().countAll(filter, game.getActivePlayerId(), game);
        }
    }

    public int getUntappedLandCount() {
        return untappedLandCount;
    }

    @Override
    public void reset() {
        untappedLandCount = 0;
    }
}
