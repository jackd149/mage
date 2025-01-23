package mage.abilities.decorator;

import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.Modes;
import mage.abilities.TriggeredAbility;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.condition.Condition;
import mage.abilities.effects.Effect;
import mage.abilities.effects.Effects;
import mage.abilities.hint.Hint;
import mage.constants.EffectType;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.util.CardUtil;
import mage.watchers.Watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * Adds condition to {@link mage.abilities.effects.ContinuousEffect}. Acts as
 * decorator.
 *
 * @author noahg
 */
public class ConditionalTriggeredAbility extends TriggeredAbilityImpl {

    protected TriggeredAbility ability;
    protected Condition condition;
    protected String abilityText;

    /**
     * Triggered ability with a condition. Set the optionality for the trigger
     * ability itself.
     *
     * @param ability
     * @param condition
     * @param text      explicit rule text for the ability, if null or empty, the
     *                  rule text generated by the triggered ability itself is used.
     */
    public ConditionalTriggeredAbility(TriggeredAbility ability, Condition condition, String text) {
        super(ability.getZone(), null);
        this.ability = ability;
        this.condition = condition;
        this.abilityText = text;
        if (ability.isLeavesTheBattlefieldTrigger()) {
            this.setLeavesTheBattlefieldTrigger(true);
        }
    }

    protected ConditionalTriggeredAbility(final ConditionalTriggeredAbility triggered) {
        super(triggered);
        this.ability = triggered.ability.copy();
        this.condition = triggered.condition;
        this.abilityText = triggered.abilityText;
    }

    @Override
    public ConditionalTriggeredAbility copy() {
        return new ConditionalTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return ability.checkEventType(event, game);
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        ability.setSourceId(this.getSourceId());
        ability.setControllerId(this.getControllerId());
        return ability.checkTrigger(event, game) && condition.apply(game, this);
    }

    @Override
    public String getRule() {
        if (abilityText == null || abilityText.isEmpty()) {
            return ability.getRule();
        }
        return (flavorWord != null ? CardUtil.italicizeWithEmDash(flavorWord) : "") +
                (abilityWord != null ? abilityWord.formatWord() : "") +
                abilityText + (abilityText.endsWith(".") || abilityText.endsWith("\"") || abilityText.endsWith(">") ? "" : ".");
    }

    @Override
    public Effects getEffects() {
        return ability.getEffects();
    }

    @Override
    public void addEffect(Effect effect) {
        ability.addEffect(effect);
    }

    @Override
    public Modes getModes() {
        return ability.getModes();
    }

    @Override
    public List<Watcher> getWatchers() {
        return ability.getWatchers();
    }

    @Override
    public void addWatcher(Watcher watcher) {
        ability.addWatcher(watcher);
    }

    @Override
    public List<Hint> getHints() {
        List<Hint> res = new ArrayList<>(super.getHints());
        res.addAll(ability.getHints());
        return res;
    }

    @Override
    public Effects getEffects(Game game, EffectType effectType) {
        return ability.getEffects(game, effectType);
    }

    @Override
    public boolean isOptional() {
        return ability.isOptional();
    }

    @Override
    public Ability withFlavorWord(String flavorWord) {
        ability.withFlavorWord(flavorWord);
        return this;
    }

    @Override
    public boolean isInUseableZone(Game game, MageObject sourceObject, GameEvent event) {
        if (isLeavesTheBattlefieldTrigger()) {
            // TODO: leaves battlefield and die are not same! Is it possible make a diff logic?
            return TriggeredAbilityImpl.isInUseableZoneDiesTrigger(this, sourceObject, event, game);
        } else {
            return super.isInUseableZone(game, sourceObject, event);
        }
    }
}
