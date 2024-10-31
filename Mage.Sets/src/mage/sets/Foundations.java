package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class Foundations extends ExpansionSet {

    private static final Foundations instance = new Foundations();

    public static Foundations getInstance() {
        return instance;
    }

    private Foundations() {
        super("Foundations", "FDN", ExpansionSet.buildDate(2024, 11, 15), SetType.EXPANSION);
        this.blockName = "Foundations"; // for sorting in GUI
        this.hasBasicLands = true;
        this.hasBoosters = false; // temporary

        cards.add(new SetCardInfo("Abrade", 188, Rarity.UNCOMMON, mage.cards.a.Abrade.class));
        cards.add(new SetCardInfo("Adaptive Automaton", 723, Rarity.RARE, mage.cards.a.AdaptiveAutomaton.class));
        cards.add(new SetCardInfo("Adventuring Gear", 249, Rarity.UNCOMMON, mage.cards.a.AdventuringGear.class));
        cards.add(new SetCardInfo("Aetherize", 151, Rarity.UNCOMMON, mage.cards.a.Aetherize.class));
        cards.add(new SetCardInfo("Ajani's Pridemate", 135, Rarity.UNCOMMON, mage.cards.a.AjanisPridemate.class));
        cards.add(new SetCardInfo("Ajani, Caller of the Pride", 134, Rarity.MYTHIC, mage.cards.a.AjaniCallerOfThePride.class));
        cards.add(new SetCardInfo("Alesha, Who Laughs at Fate", 115, Rarity.RARE, mage.cards.a.AleshaWhoLaughsAtFate.class));
        cards.add(new SetCardInfo("An Offer You Can't Refuse", 160, Rarity.UNCOMMON, mage.cards.a.AnOfferYouCantRefuse.class));
        cards.add(new SetCardInfo("Angel of Finality", 136, Rarity.UNCOMMON, mage.cards.a.AngelOfFinality.class));
        cards.add(new SetCardInfo("Angel of Vitality", 706, Rarity.UNCOMMON, mage.cards.a.AngelOfVitality.class));
        cards.add(new SetCardInfo("Angelic Destiny", 565, Rarity.MYTHIC, mage.cards.a.AngelicDestiny.class));
        cards.add(new SetCardInfo("Angelic Edict", 490, Rarity.COMMON, mage.cards.a.AngelicEdict.class));
        cards.add(new SetCardInfo("Anthem of Champions", 116, Rarity.RARE, mage.cards.a.AnthemOfChampions.class));
        cards.add(new SetCardInfo("Arahbo, the First Fang", 2, Rarity.RARE, mage.cards.a.ArahboTheFirstFang.class));
        cards.add(new SetCardInfo("Arbiter of Woe", 55, Rarity.UNCOMMON, mage.cards.a.ArbiterOfWoe.class));
        cards.add(new SetCardInfo("Arcane Epiphany", 29, Rarity.UNCOMMON, mage.cards.a.ArcaneEpiphany.class));
        cards.add(new SetCardInfo("Arcanis the Omnipotent", 585, Rarity.RARE, mage.cards.a.ArcanisTheOmnipotent.class));
        cards.add(new SetCardInfo("Archmage of Runes", 30, Rarity.RARE, mage.cards.a.ArchmageOfRunes.class));
        cards.add(new SetCardInfo("Archway Angel", 566, Rarity.UNCOMMON, mage.cards.a.ArchwayAngel.class));
        cards.add(new SetCardInfo("Aurelia, the Warleader", 651, Rarity.MYTHIC, mage.cards.a.AureliaTheWarleader.class));
        cards.add(new SetCardInfo("Ayli, Eternal Pilgrim", 652, Rarity.RARE, mage.cards.a.AyliEternalPilgrim.class));
        cards.add(new SetCardInfo("Azorius Guildgate", 683, Rarity.COMMON, mage.cards.a.AzoriusGuildgate.class));
        cards.add(new SetCardInfo("Ball Lightning", 618, Rarity.RARE, mage.cards.b.BallLightning.class));
        cards.add(new SetCardInfo("Ballyrush Banneret", 567, Rarity.COMMON, mage.cards.b.BallyrushBanneret.class));
        cards.add(new SetCardInfo("Balmor, Battlemage Captain", 237, Rarity.UNCOMMON, mage.cards.b.BalmorBattlemageCaptain.class));
        cards.add(new SetCardInfo("Basilisk Collar", 669, Rarity.RARE, mage.cards.b.BasiliskCollar.class));
        cards.add(new SetCardInfo("Battlesong Berserker", 78, Rarity.UNCOMMON, mage.cards.b.BattlesongBerserker.class));
        cards.add(new SetCardInfo("Billowing Shriekmass", 56, Rarity.UNCOMMON, mage.cards.b.BillowingShriekmass.class));
        cards.add(new SetCardInfo("Blanchwood Armor", 213, Rarity.UNCOMMON, mage.cards.b.BlanchwoodArmor.class));
        cards.add(new SetCardInfo("Bloodthirsty Conqueror", 58, Rarity.MYTHIC, mage.cards.b.BloodthirstyConqueror.class));
        cards.add(new SetCardInfo("Bloodtithe Collector", 516, Rarity.UNCOMMON, mage.cards.b.BloodtitheCollector.class));
        cards.add(new SetCardInfo("Bolt Bend", 619, Rarity.UNCOMMON, mage.cards.b.BoltBend.class));
        cards.add(new SetCardInfo("Boros Charm", 721, Rarity.UNCOMMON, mage.cards.b.BorosCharm.class));
        cards.add(new SetCardInfo("Boros Guildgate", 684, Rarity.COMMON, mage.cards.b.BorosGuildgate.class));
        cards.add(new SetCardInfo("Brass's Bounty", 190, Rarity.RARE, mage.cards.b.BrasssBounty.class));
        cards.add(new SetCardInfo("Brineborn Cutthroat", 152, Rarity.UNCOMMON, mage.cards.b.BrinebornCutthroat.class));
        cards.add(new SetCardInfo("Bulk Up", 80, Rarity.UNCOMMON, mage.cards.b.BulkUp.class));
        cards.add(new SetCardInfo("Burst Lightning", 192, Rarity.COMMON, mage.cards.b.BurstLightning.class));
        cards.add(new SetCardInfo("Charming Prince", 568, Rarity.RARE, mage.cards.c.CharmingPrince.class));
        cards.add(new SetCardInfo("Chart a Course", 586, Rarity.UNCOMMON, mage.cards.c.ChartACourse.class));
        cards.add(new SetCardInfo("Circuitous Route", 635, Rarity.UNCOMMON, mage.cards.c.CircuitousRoute.class));
        cards.add(new SetCardInfo("Claws Out", 6, Rarity.UNCOMMON, mage.cards.c.ClawsOut.class));
        cards.add(new SetCardInfo("Clinquant Skymage", 33, Rarity.UNCOMMON, mage.cards.c.ClinquantSkymage.class));
        cards.add(new SetCardInfo("Cloudblazer", 653, Rarity.UNCOMMON, mage.cards.c.Cloudblazer.class));
        cards.add(new SetCardInfo("Confiscate", 709, Rarity.UNCOMMON, mage.cards.c.Confiscate.class));
        cards.add(new SetCardInfo("Consuming Aberration", 238, Rarity.RARE, mage.cards.c.ConsumingAberration.class));
        cards.add(new SetCardInfo("Crash Through", 620, Rarity.COMMON, mage.cards.c.CrashThrough.class));
        cards.add(new SetCardInfo("Crawling Barrens", 685, Rarity.RARE, mage.cards.c.CrawlingBarrens.class));
        cards.add(new SetCardInfo("Crossway Troublemakers", 518, Rarity.RARE, mage.cards.c.CrosswayTroublemakers.class));
        cards.add(new SetCardInfo("Crusader of Odric", 569, Rarity.COMMON, mage.cards.c.CrusaderOfOdric.class));
        cards.add(new SetCardInfo("Crypt Feaster", 59, Rarity.COMMON, mage.cards.c.CryptFeaster.class));
        cards.add(new SetCardInfo("Cryptic Caves", 686, Rarity.UNCOMMON, mage.cards.c.CrypticCaves.class));
        cards.add(new SetCardInfo("Crystal Barricade", 7, Rarity.RARE, mage.cards.c.CrystalBarricade.class));
        cards.add(new SetCardInfo("Cultivator's Caravan", 670, Rarity.RARE, mage.cards.c.CultivatorsCaravan.class));
        cards.add(new SetCardInfo("Darksteel Colossus", 671, Rarity.MYTHIC, mage.cards.d.DarksteelColossus.class));
        cards.add(new SetCardInfo("Dawnwing Marshal", 570, Rarity.UNCOMMON, mage.cards.d.DawnwingMarshal.class));
        cards.add(new SetCardInfo("Day of Judgment", 140, Rarity.RARE, mage.cards.d.DayOfJudgment.class));
        cards.add(new SetCardInfo("Deadly Brew", 654, Rarity.UNCOMMON, mage.cards.d.DeadlyBrew.class));
        cards.add(new SetCardInfo("Deathmark", 601, Rarity.UNCOMMON, mage.cards.d.Deathmark.class));
        cards.add(new SetCardInfo("Demolition Field", 687, Rarity.UNCOMMON, mage.cards.d.DemolitionField.class));
        cards.add(new SetCardInfo("Demonic Pact", 602, Rarity.MYTHIC, mage.cards.d.DemonicPact.class));
        cards.add(new SetCardInfo("Desecration Demon", 603, Rarity.RARE, mage.cards.d.DesecrationDemon.class));
        cards.add(new SetCardInfo("Devout Decree", 571, Rarity.UNCOMMON, mage.cards.d.DevoutDecree.class));
        cards.add(new SetCardInfo("Diamond Mare", 672, Rarity.UNCOMMON, mage.cards.d.DiamondMare.class));
        cards.add(new SetCardInfo("Dictate of Kruphix", 587, Rarity.RARE, mage.cards.d.DictateOfKruphix.class));
        cards.add(new SetCardInfo("Dimir Guildgate", 688, Rarity.COMMON, mage.cards.d.DimirGuildgate.class));
        cards.add(new SetCardInfo("Disenchant", 572, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Dive Down", 588, Rarity.COMMON, mage.cards.d.DiveDown.class));
        cards.add(new SetCardInfo("Doubling Season", 216, Rarity.MYTHIC, mage.cards.d.DoublingSeason.class));
        cards.add(new SetCardInfo("Dragon Mage", 621, Rarity.UNCOMMON, mage.cards.d.DragonMage.class));
        cards.add(new SetCardInfo("Dragonmaster Outcast", 622, Rarity.MYTHIC, mage.cards.d.DragonmasterOutcast.class));
        cards.add(new SetCardInfo("Dread Summons", 604, Rarity.RARE, mage.cards.d.DreadSummons.class));
        cards.add(new SetCardInfo("Driver of the Dead", 605, Rarity.COMMON, mage.cards.d.DriverOfTheDead.class));
        cards.add(new SetCardInfo("Drogskol Reaver", 655, Rarity.RARE, mage.cards.d.DrogskolReaver.class));
        cards.add(new SetCardInfo("Dryad Militant", 656, Rarity.UNCOMMON, mage.cards.d.DryadMilitant.class));
        cards.add(new SetCardInfo("Duress", 606, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Dwynen, Gilt-Leaf Daen", 217, Rarity.UNCOMMON, mage.cards.d.DwynenGiltLeafDaen.class));
        cards.add(new SetCardInfo("Elspeth's Smite", 493, Rarity.UNCOMMON, mage.cards.e.ElspethsSmite.class));
        cards.add(new SetCardInfo("Elvish Archdruid", 219, Rarity.RARE, mage.cards.e.ElvishArchdruid.class));
        cards.add(new SetCardInfo("Elvish Regrower", 104, Rarity.UNCOMMON, mage.cards.e.ElvishRegrower.class));
        cards.add(new SetCardInfo("Empyrean Eagle", 239, Rarity.UNCOMMON, mage.cards.e.EmpyreanEagle.class));
        cards.add(new SetCardInfo("Enigma Drake", 657, Rarity.UNCOMMON, mage.cards.e.EnigmaDrake.class));
        cards.add(new SetCardInfo("Erudite Wizard", 37, Rarity.COMMON, mage.cards.e.EruditeWizard.class));
        cards.add(new SetCardInfo("Essence Scatter", 153, Rarity.UNCOMMON, mage.cards.e.EssenceScatter.class));
        cards.add(new SetCardInfo("Etali, Primal Storm", 194, Rarity.RARE, mage.cards.e.EtaliPrimalStorm.class));
        cards.add(new SetCardInfo("Expedition Map", 724, Rarity.COMMON, mage.cards.e.ExpeditionMap.class));
        cards.add(new SetCardInfo("Exsanguinate", 173, Rarity.UNCOMMON, mage.cards.e.Exsanguinate.class));
        cards.add(new SetCardInfo("Extravagant Replication", 154, Rarity.RARE, mage.cards.e.ExtravagantReplication.class));
        cards.add(new SetCardInfo("Faebloom Trick", 38, Rarity.UNCOMMON, mage.cards.f.FaebloomTrick.class));
        cards.add(new SetCardInfo("Feed the Swarm", 712, Rarity.COMMON, mage.cards.f.FeedTheSwarm.class));
        cards.add(new SetCardInfo("Feldon's Cane", 673, Rarity.UNCOMMON, mage.cards.f.FeldonsCane.class));
        cards.add(new SetCardInfo("Felidar Cub", 573, Rarity.COMMON, mage.cards.f.FelidarCub.class));
        cards.add(new SetCardInfo("Felidar Retreat", 574, Rarity.RARE, mage.cards.f.FelidarRetreat.class));
        cards.add(new SetCardInfo("Felidar Savior", 12, Rarity.COMMON, mage.cards.f.FelidarSavior.class));
        cards.add(new SetCardInfo("Fierce Empath", 636, Rarity.COMMON, mage.cards.f.FierceEmpath.class));
        cards.add(new SetCardInfo("Fiery Annihilation", 86, Rarity.UNCOMMON, mage.cards.f.FieryAnnihilation.class));
        cards.add(new SetCardInfo("Finale of Revelation", 589, Rarity.MYTHIC, mage.cards.f.FinaleOfRevelation.class));
        cards.add(new SetCardInfo("Fireshrieker", 674, Rarity.UNCOMMON, mage.cards.f.Fireshrieker.class));
        cards.add(new SetCardInfo("Firespitter Whelp", 197, Rarity.UNCOMMON, mage.cards.f.FirespitterWhelp.class));
        cards.add(new SetCardInfo("Flamewake Phoenix", 198, Rarity.RARE, mage.cards.f.FlamewakePhoenix.class));
        cards.add(new SetCardInfo("Flashfreeze", 590, Rarity.UNCOMMON, mage.cards.f.Flashfreeze.class));
        cards.add(new SetCardInfo("Fog Bank", 591, Rarity.UNCOMMON, mage.cards.f.FogBank.class));
        cards.add(new SetCardInfo("Forest", 280, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fumigate", 575, Rarity.RARE, mage.cards.f.Fumigate.class));
        cards.add(new SetCardInfo("Fynn, the Fangbearer", 637, Rarity.UNCOMMON, mage.cards.f.FynnTheFangbearer.class));
        cards.add(new SetCardInfo("Garna, Bloodfist of Keld", 658, Rarity.UNCOMMON, mage.cards.g.GarnaBloodfistOfKeld.class));
        cards.add(new SetCardInfo("Gate Colossus", 675, Rarity.UNCOMMON, mage.cards.g.GateColossus.class));
        cards.add(new SetCardInfo("Gatekeeper of Malakir", 713, Rarity.UNCOMMON, mage.cards.g.GatekeeperOfMalakir.class));
        cards.add(new SetCardInfo("Gateway Sneak", 592, Rarity.UNCOMMON, mage.cards.g.GatewaySneak.class));
        cards.add(new SetCardInfo("Genesis Wave", 221, Rarity.RARE, mage.cards.g.GenesisWave.class));
        cards.add(new SetCardInfo("Ghalta, Primal Hunger", 222, Rarity.RARE, mage.cards.g.GhaltaPrimalHunger.class));
        cards.add(new SetCardInfo("Ghitu Lavarunner", 623, Rarity.COMMON, mage.cards.g.GhituLavarunner.class));
        cards.add(new SetCardInfo("Giada, Font of Hope", 141, Rarity.RARE, mage.cards.g.GiadaFontOfHope.class));
        cards.add(new SetCardInfo("Giant Cindermaw", 624, Rarity.UNCOMMON, mage.cards.g.GiantCindermaw.class));
        cards.add(new SetCardInfo("Giant Growth", 223, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Gigantosaurus", 718, Rarity.RARE, mage.cards.g.Gigantosaurus.class));
        cards.add(new SetCardInfo("Gilded Lotus", 725, Rarity.RARE, mage.cards.g.GildedLotus.class));
        cards.add(new SetCardInfo("Gnarlback Rhino", 638, Rarity.UNCOMMON, mage.cards.g.GnarlbackRhino.class));
        cards.add(new SetCardInfo("Golgari Guildgate", 689, Rarity.COMMON, mage.cards.g.GolgariGuildgate.class));
        cards.add(new SetCardInfo("Grappling Kraken", 39, Rarity.UNCOMMON, mage.cards.g.GrapplingKraken.class));
        cards.add(new SetCardInfo("Gratuitous Violence", 715, Rarity.RARE, mage.cards.g.GratuitousViolence.class));
        cards.add(new SetCardInfo("Gruul Guildgate", 690, Rarity.COMMON, mage.cards.g.GruulGuildgate.class));
        cards.add(new SetCardInfo("Guttersnipe", 716, Rarity.UNCOMMON, mage.cards.g.Guttersnipe.class));
        cards.add(new SetCardInfo("Halana and Alena, Partners", 659, Rarity.RARE, mage.cards.h.HalanaAndAlenaPartners.class));
        cards.add(new SetCardInfo("Harbinger of the Tides", 593, Rarity.RARE, mage.cards.h.HarbingerOfTheTides.class));
        cards.add(new SetCardInfo("Harmless Offering", 625, Rarity.RARE, mage.cards.h.HarmlessOffering.class));
        cards.add(new SetCardInfo("Heartfire Immolator", 201, Rarity.UNCOMMON, mage.cards.h.HeartfireImmolator.class));
        cards.add(new SetCardInfo("Hedron Archive", 726, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Helpful Hunter", 16, Rarity.COMMON, mage.cards.h.HelpfulHunter.class));
        cards.add(new SetCardInfo("Herald of Eternal Dawn", 17, Rarity.MYTHIC, mage.cards.h.HeraldOfEternalDawn.class));
        cards.add(new SetCardInfo("Hero's Downfall", 175, Rarity.UNCOMMON, mage.cards.h.HerosDownfall.class));
        cards.add(new SetCardInfo("Heroes' Bane", 639, Rarity.RARE, mage.cards.h.HeroesBane.class));
        cards.add(new SetCardInfo("Heroic Reinforcements", 241, Rarity.UNCOMMON, mage.cards.h.HeroicReinforcements.class));
        cards.add(new SetCardInfo("Hidetsugu's Second Rite", 202, Rarity.UNCOMMON, mage.cards.h.HidetsugusSecondRite.class));
        cards.add(new SetCardInfo("High Fae Trickster", 40, Rarity.RARE, mage.cards.h.HighFaeTrickster.class));
        cards.add(new SetCardInfo("Highborn Vampire", 522, Rarity.COMMON, mage.cards.h.HighbornVampire.class));
        cards.add(new SetCardInfo("Hoarding Dragon", 626, Rarity.UNCOMMON, mage.cards.h.HoardingDragon.class));
        cards.add(new SetCardInfo("Homunculus Horde", 41, Rarity.RARE, mage.cards.h.HomunculusHorde.class));
        cards.add(new SetCardInfo("Immersturm Predator", 660, Rarity.RARE, mage.cards.i.ImmersturmPredator.class));
        cards.add(new SetCardInfo("Impact Tremors", 717, Rarity.COMMON, mage.cards.i.ImpactTremors.class));
        cards.add(new SetCardInfo("Imperious Perfect", 719, Rarity.UNCOMMON, mage.cards.i.ImperiousPerfect.class));
        cards.add(new SetCardInfo("Imprisoned in the Moon", 156, Rarity.UNCOMMON, mage.cards.i.ImprisonedInTheMoon.class));
        cards.add(new SetCardInfo("Ingenious Leonin", 495, Rarity.UNCOMMON, mage.cards.i.IngeniousLeonin.class));
        cards.add(new SetCardInfo("Island", 274, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Izzet Guildgate", 691, Rarity.COMMON, mage.cards.i.IzzetGuildgate.class));
        cards.add(new SetCardInfo("Jazal Goldmane", 497, Rarity.RARE, mage.cards.j.JazalGoldmane.class));
        cards.add(new SetCardInfo("Juggernaut", 255, Rarity.UNCOMMON, mage.cards.j.Juggernaut.class));
        cards.add(new SetCardInfo("Kalastria Highborn", 607, Rarity.RARE, mage.cards.k.KalastriaHighborn.class));
        cards.add(new SetCardInfo("Knight of Grace", 576, Rarity.UNCOMMON, mage.cards.k.KnightOfGrace.class));
        cards.add(new SetCardInfo("Knight of Malice", 608, Rarity.UNCOMMON, mage.cards.k.KnightOfMalice.class));
        cards.add(new SetCardInfo("Koma, World-Eater", 121, Rarity.RARE, mage.cards.k.KomaWorldEater.class));
        cards.add(new SetCardInfo("Krenko, Mob Boss", 204, Rarity.RARE, mage.cards.k.KrenkoMobBoss.class));
        cards.add(new SetCardInfo("Lathliss, Dragon Queen", 627, Rarity.RARE, mage.cards.l.LathlissDragonQueen.class));
        cards.add(new SetCardInfo("Leonin Skyhunter", 498, Rarity.UNCOMMON, mage.cards.l.LeoninSkyhunter.class));
        cards.add(new SetCardInfo("Leonin Vanguard", 499, Rarity.UNCOMMON, mage.cards.l.LeoninVanguard.class));
        cards.add(new SetCardInfo("Leyline Axe", 129, Rarity.RARE, mage.cards.l.LeylineAxe.class));
        cards.add(new SetCardInfo("Lightshell Duo", 157, Rarity.COMMON, mage.cards.l.LightshellDuo.class));
        cards.add(new SetCardInfo("Liliana, Dreadhorde General", 176, Rarity.MYTHIC, mage.cards.l.LilianaDreadhordeGeneral.class));
        cards.add(new SetCardInfo("Linden, the Steadfast Queen", 577, Rarity.RARE, mage.cards.l.LindenTheSteadfastQueen.class));
        cards.add(new SetCardInfo("Llanowar Elves", 227, Rarity.COMMON, mage.cards.l.LlanowarElves.class));
        cards.add(new SetCardInfo("Lunar Insight", 46, Rarity.RARE, mage.cards.l.LunarInsight.class));
        cards.add(new SetCardInfo("Lyra Dawnbringer", 707, Rarity.MYTHIC, mage.cards.l.LyraDawnbringer.class));
        cards.add(new SetCardInfo("Maelstrom Pulse", 661, Rarity.RARE, mage.cards.m.MaelstromPulse.class));
        cards.add(new SetCardInfo("Make a Stand", 708, Rarity.UNCOMMON, mage.cards.m.MakeAStand.class));
        cards.add(new SetCardInfo("Massacre Wurm", 714, Rarity.MYTHIC, mage.cards.m.MassacreWurm.class));
        cards.add(new SetCardInfo("Maze's End", 727, Rarity.MYTHIC, mage.cards.m.MazesEnd.class));
        cards.add(new SetCardInfo("Mazemind Tome", 676, Rarity.RARE, mage.cards.m.MazemindTome.class));
        cards.add(new SetCardInfo("Mentor of the Meek", 578, Rarity.RARE, mage.cards.m.MentorOfTheMeek.class));
        cards.add(new SetCardInfo("Meteor Golem", 256, Rarity.UNCOMMON, mage.cards.m.MeteorGolem.class));
        cards.add(new SetCardInfo("Micromancer", 158, Rarity.UNCOMMON, mage.cards.m.Micromancer.class));
        cards.add(new SetCardInfo("Midnight Reaper", 609, Rarity.RARE, mage.cards.m.MidnightReaper.class));
        cards.add(new SetCardInfo("Mild-Mannered Librarian", 228, Rarity.UNCOMMON, mage.cards.m.MildManneredLibrarian.class));
        cards.add(new SetCardInfo("Mindsparker", 628, Rarity.UNCOMMON, mage.cards.m.Mindsparker.class));
        cards.add(new SetCardInfo("Mischievous Mystic", 47, Rarity.UNCOMMON, mage.cards.m.MischievousMystic.class));
        cards.add(new SetCardInfo("Mold Adder", 640, Rarity.UNCOMMON, mage.cards.m.MoldAdder.class));
        cards.add(new SetCardInfo("Moment of Craving", 524, Rarity.COMMON, mage.cards.m.MomentOfCraving.class));
        cards.add(new SetCardInfo("Moment of Triumph", 500, Rarity.COMMON, mage.cards.m.MomentOfTriumph.class));
        cards.add(new SetCardInfo("Mortify", 662, Rarity.UNCOMMON, mage.cards.m.Mortify.class));
        cards.add(new SetCardInfo("Mossborn Hydra", 107, Rarity.RARE, mage.cards.m.MossbornHydra.class));
        cards.add(new SetCardInfo("Mountain", 278, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Muldrotha, the Gravetide", 243, Rarity.MYTHIC, mage.cards.m.MuldrothaTheGravetide.class));
        cards.add(new SetCardInfo("Myojin of Night's Reach", 610, Rarity.RARE, mage.cards.m.MyojinOfNightsReach.class));
        cards.add(new SetCardInfo("Mystical Teachings", 594, Rarity.UNCOMMON, mage.cards.m.MysticalTeachings.class));
        cards.add(new SetCardInfo("Needletooth Pack", 108, Rarity.UNCOMMON, mage.cards.n.NeedletoothPack.class));
        cards.add(new SetCardInfo("Negate", 710, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Nessian Hornbeetle", 229, Rarity.UNCOMMON, mage.cards.n.NessianHornbeetle.class));
        cards.add(new SetCardInfo("Niv-Mizzet, Visionary", 123, Rarity.MYTHIC, mage.cards.n.NivMizzetVisionary.class));
        cards.add(new SetCardInfo("Nullpriest of Oblivion", 611, Rarity.RARE, mage.cards.n.NullpriestOfOblivion.class));
        cards.add(new SetCardInfo("Obliterating Bolt", 629, Rarity.UNCOMMON, mage.cards.o.ObliteratingBolt.class));
        cards.add(new SetCardInfo("Offer Immortality", 525, Rarity.COMMON, mage.cards.o.OfferImmortality.class));
        cards.add(new SetCardInfo("Omniscience", 161, Rarity.MYTHIC, mage.cards.o.Omniscience.class));
        cards.add(new SetCardInfo("Ordeal of Nylea", 641, Rarity.UNCOMMON, mage.cards.o.OrdealOfNylea.class));
        cards.add(new SetCardInfo("Orzhov Guildgate", 692, Rarity.COMMON, mage.cards.o.OrzhovGuildgate.class));
        cards.add(new SetCardInfo("Overrun", 230, Rarity.UNCOMMON, mage.cards.o.Overrun.class));
        cards.add(new SetCardInfo("Ovika, Enigma Goliath", 663, Rarity.RARE, mage.cards.o.OvikaEnigmaGoliath.class));
        cards.add(new SetCardInfo("Pacifism", 501, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Painful Quandary", 179, Rarity.RARE, mage.cards.p.PainfulQuandary.class));
        cards.add(new SetCardInfo("Pelakka Wurm", 720, Rarity.UNCOMMON, mage.cards.p.PelakkaWurm.class));
        cards.add(new SetCardInfo("Phyrexian Arena", 180, Rarity.RARE, mage.cards.p.PhyrexianArena.class));
        cards.add(new SetCardInfo("Plains", 272, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Predator Ooze", 642, Rarity.RARE, mage.cards.p.PredatorOoze.class));
        cards.add(new SetCardInfo("Prideful Parent", 21, Rarity.COMMON, mage.cards.p.PridefulParent.class));
        cards.add(new SetCardInfo("Primal Might", 643, Rarity.RARE, mage.cards.p.PrimalMight.class));
        cards.add(new SetCardInfo("Prime Speaker Zegana", 664, Rarity.RARE, mage.cards.p.PrimeSpeakerZegana.class));
        cards.add(new SetCardInfo("Primeval Bounty", 644, Rarity.MYTHIC, mage.cards.p.PrimevalBounty.class));
        cards.add(new SetCardInfo("Progenitus", 244, Rarity.MYTHIC, mage.cards.p.Progenitus.class));
        cards.add(new SetCardInfo("Pulse Tracker", 612, Rarity.COMMON, mage.cards.p.PulseTracker.class));
        cards.add(new SetCardInfo("Pyromancer's Goggles", 677, Rarity.MYTHIC, mage.cards.p.PyromancersGoggles.class));
        cards.add(new SetCardInfo("Rakdos Guildgate", 693, Rarity.COMMON, mage.cards.r.RakdosGuildgate.class));
        cards.add(new SetCardInfo("Ramos, Dragon Engine", 678, Rarity.MYTHIC, mage.cards.r.RamosDragonEngine.class));
        cards.add(new SetCardInfo("Rampaging Baloths", 645, Rarity.RARE, mage.cards.r.RampagingBaloths.class));
        cards.add(new SetCardInfo("Ravenous Giant", 630, Rarity.UNCOMMON, mage.cards.r.RavenousGiant.class));
        cards.add(new SetCardInfo("Reassembling Skeleton", 182, Rarity.UNCOMMON, mage.cards.r.ReassemblingSkeleton.class));
        cards.add(new SetCardInfo("Redcap Gutter-Dweller", 631, Rarity.RARE, mage.cards.r.RedcapGutterDweller.class));
        cards.add(new SetCardInfo("Refute", 48, Rarity.COMMON, mage.cards.r.Refute.class));
        cards.add(new SetCardInfo("Regal Caracal", 579, Rarity.RARE, mage.cards.r.RegalCaracal.class));
        cards.add(new SetCardInfo("Release the Dogs", 580, Rarity.UNCOMMON, mage.cards.r.ReleaseTheDogs.class));
        cards.add(new SetCardInfo("Rite of Replication", 711, Rarity.RARE, mage.cards.r.RiteOfReplication.class));
        cards.add(new SetCardInfo("River's Rebuke", 595, Rarity.RARE, mage.cards.r.RiversRebuke.class));
        cards.add(new SetCardInfo("Rogue's Passage", 264, Rarity.UNCOMMON, mage.cards.r.RoguesPassage.class));
        cards.add(new SetCardInfo("Sanguine Indulgence", 613, Rarity.COMMON, mage.cards.s.SanguineIndulgence.class));
        cards.add(new SetCardInfo("Savage Ventmaw", 665, Rarity.UNCOMMON, mage.cards.s.SavageVentmaw.class));
        cards.add(new SetCardInfo("Savannah Lions", 146, Rarity.UNCOMMON, mage.cards.s.SavannahLions.class));
        cards.add(new SetCardInfo("Scavenging Ooze", 232, Rarity.RARE, mage.cards.s.ScavengingOoze.class));
        cards.add(new SetCardInfo("Scrawling Crawler", 132, Rarity.RARE, mage.cards.s.ScrawlingCrawler.class));
        cards.add(new SetCardInfo("Searslicer Goblin", 93, Rarity.RARE, mage.cards.s.SearslicerGoblin.class));
        cards.add(new SetCardInfo("Seeker's Folly", 69, Rarity.UNCOMMON, mage.cards.s.SeekersFolly.class));
        cards.add(new SetCardInfo("Seismic Rupture", 205, Rarity.UNCOMMON, mage.cards.s.SeismicRupture.class));
        cards.add(new SetCardInfo("Selesnya Guildgate", 694, Rarity.COMMON, mage.cards.s.SelesnyaGuildgate.class));
        cards.add(new SetCardInfo("Self-Reflection", 163, Rarity.UNCOMMON, mage.cards.s.SelfReflection.class));
        cards.add(new SetCardInfo("Serra Angel", 147, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Shipwreck Dowser", 596, Rarity.UNCOMMON, mage.cards.s.ShipwreckDowser.class));
        cards.add(new SetCardInfo("Shivan Dragon", 206, Rarity.UNCOMMON, mage.cards.s.ShivanDragon.class));
        cards.add(new SetCardInfo("Simic Guildgate", 695, Rarity.COMMON, mage.cards.s.SimicGuildgate.class));
        cards.add(new SetCardInfo("Sire of Seven Deaths", 1, Rarity.MYTHIC, mage.cards.s.SireOfSevenDeaths.class));
        cards.add(new SetCardInfo("Skyship Buccaneer", 50, Rarity.UNCOMMON, mage.cards.s.SkyshipBuccaneer.class));
        cards.add(new SetCardInfo("Slagstorm", 207, Rarity.RARE, mage.cards.s.Slagstorm.class));
        cards.add(new SetCardInfo("Slumbering Cerberus", 94, Rarity.UNCOMMON, mage.cards.s.SlumberingCerberus.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 257, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Sorcerous Spyglass", 679, Rarity.UNCOMMON, mage.cards.s.SorcerousSpyglass.class));
        cards.add(new SetCardInfo("Soul-Guide Lantern", 680, Rarity.UNCOMMON, mage.cards.s.SoulGuideLantern.class));
        cards.add(new SetCardInfo("Spectral Sailor", 164, Rarity.UNCOMMON, mage.cards.s.SpectralSailor.class));
        cards.add(new SetCardInfo("Sphinx of the Final Word", 597, Rarity.MYTHIC, mage.cards.s.SphinxOfTheFinalWord.class));
        cards.add(new SetCardInfo("Springbloom Druid", 646, Rarity.COMMON, mage.cards.s.SpringbloomDruid.class));
        cards.add(new SetCardInfo("Stasis Snare", 581, Rarity.UNCOMMON, mage.cards.s.StasisSnare.class));
        cards.add(new SetCardInfo("Steel Hellkite", 681, Rarity.RARE, mage.cards.s.SteelHellkite.class));
        cards.add(new SetCardInfo("Stroke of Midnight", 148, Rarity.UNCOMMON, mage.cards.s.StrokeOfMidnight.class));
        cards.add(new SetCardInfo("Stromkirk Bloodthief", 185, Rarity.UNCOMMON, mage.cards.s.StromkirkBloodthief.class));
        cards.add(new SetCardInfo("Stromkirk Noble", 632, Rarity.RARE, mage.cards.s.StromkirkNoble.class));
        cards.add(new SetCardInfo("Surrak, the Hunt Caller", 647, Rarity.RARE, mage.cards.s.SurrakTheHuntCaller.class));
        cards.add(new SetCardInfo("Swamp", 276, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swiftblade Vindicator", 246, Rarity.RARE, mage.cards.s.SwiftbladeVindicator.class));
        cards.add(new SetCardInfo("Swiftfoot Boots", 258, Rarity.UNCOMMON, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Syr Alin, the Lion's Claw", 582, Rarity.UNCOMMON, mage.cards.s.SyrAlinTheLionsClaw.class));
        cards.add(new SetCardInfo("Tatyova, Benthic Druid", 247, Rarity.UNCOMMON, mage.cards.t.TatyovaBenthicDruid.class));
        cards.add(new SetCardInfo("Taurean Mauler", 633, Rarity.RARE, mage.cards.t.TaureanMauler.class));
        cards.add(new SetCardInfo("Teach by Example", 666, Rarity.UNCOMMON, mage.cards.t.TeachByExample.class));
        cards.add(new SetCardInfo("Tempest Djinn", 598, Rarity.RARE, mage.cards.t.TempestDjinn.class));
        cards.add(new SetCardInfo("Temple of Abandon", 696, Rarity.RARE, mage.cards.t.TempleOfAbandon.class));
        cards.add(new SetCardInfo("Temple of Deceit", 697, Rarity.RARE, mage.cards.t.TempleOfDeceit.class));
        cards.add(new SetCardInfo("Temple of Enlightenment", 698, Rarity.RARE, mage.cards.t.TempleOfEnlightenment.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 699, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Malady", 700, Rarity.RARE, mage.cards.t.TempleOfMalady.class));
        cards.add(new SetCardInfo("Temple of Malice", 701, Rarity.RARE, mage.cards.t.TempleOfMalice.class));
        cards.add(new SetCardInfo("Temple of Mystery", 702, Rarity.RARE, mage.cards.t.TempleOfMystery.class));
        cards.add(new SetCardInfo("Temple of Plenty", 703, Rarity.RARE, mage.cards.t.TempleOfPlenty.class));
        cards.add(new SetCardInfo("Temple of Silence", 704, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of Triumph", 705, Rarity.RARE, mage.cards.t.TempleOfTriumph.class));
        cards.add(new SetCardInfo("Think Twice", 165, Rarity.COMMON, mage.cards.t.ThinkTwice.class));
        cards.add(new SetCardInfo("Thousand-Year Storm", 248, Rarity.RARE, mage.cards.t.ThousandYearStorm.class));
        cards.add(new SetCardInfo("Three Tree Mascot", 682, Rarity.COMMON, mage.cards.t.ThreeTreeMascot.class));
        cards.add(new SetCardInfo("Time Stop", 166, Rarity.RARE, mage.cards.t.TimeStop.class));
        cards.add(new SetCardInfo("Tolarian Terror", 167, Rarity.COMMON, mage.cards.t.TolarianTerror.class));
        cards.add(new SetCardInfo("Tragic Banshee", 73, Rarity.UNCOMMON, mage.cards.t.TragicBanshee.class));
        cards.add(new SetCardInfo("Tribute to Hunger", 614, Rarity.UNCOMMON, mage.cards.t.TributeToHunger.class));
        cards.add(new SetCardInfo("Trygon Predator", 667, Rarity.UNCOMMON, mage.cards.t.TrygonPredator.class));
        cards.add(new SetCardInfo("Uncharted Haven", 564, Rarity.COMMON, mage.cards.u.UnchartedHaven.class));
        cards.add(new SetCardInfo("Unflinching Courage", 722, Rarity.UNCOMMON, mage.cards.u.UnflinchingCourage.class));
        cards.add(new SetCardInfo("Unsummon", 599, Rarity.COMMON, mage.cards.u.Unsummon.class));
        cards.add(new SetCardInfo("Untamed Hunger", 529, Rarity.COMMON, mage.cards.u.UntamedHunger.class));
        cards.add(new SetCardInfo("Valorous Stance", 583, Rarity.UNCOMMON, mage.cards.v.ValorousStance.class));
        cards.add(new SetCardInfo("Vampire Gourmand", 74, Rarity.UNCOMMON, mage.cards.v.VampireGourmand.class));
        cards.add(new SetCardInfo("Vampire Interloper", 530, Rarity.COMMON, mage.cards.v.VampireInterloper.class));
        cards.add(new SetCardInfo("Vampire Neonate", 531, Rarity.COMMON, mage.cards.v.VampireNeonate.class));
        cards.add(new SetCardInfo("Vampire Spawn", 532, Rarity.COMMON, mage.cards.v.VampireSpawn.class));
        cards.add(new SetCardInfo("Vampiric Rites", 615, Rarity.UNCOMMON, mage.cards.v.VampiricRites.class));
        cards.add(new SetCardInfo("Vengeful Bloodwitch", 76, Rarity.UNCOMMON, mage.cards.v.VengefulBloodwitch.class));
        cards.add(new SetCardInfo("Venom Connoisseur", 648, Rarity.UNCOMMON, mage.cards.v.VenomConnoisseur.class));
        cards.add(new SetCardInfo("Viashino Pyromancer", 634, Rarity.COMMON, mage.cards.v.ViashinoPyromancer.class));
        cards.add(new SetCardInfo("Vile Entomber", 616, Rarity.UNCOMMON, mage.cards.v.VileEntomber.class));
        cards.add(new SetCardInfo("Vivien Reid", 234, Rarity.MYTHIC, mage.cards.v.VivienReid.class));
        cards.add(new SetCardInfo("Vizier of the Menagerie", 649, Rarity.MYTHIC, mage.cards.v.VizierOfTheMenagerie.class));
        cards.add(new SetCardInfo("Voracious Greatshark", 600, Rarity.RARE, mage.cards.v.VoraciousGreatshark.class));
        cards.add(new SetCardInfo("Wildborn Preserver", 650, Rarity.RARE, mage.cards.w.WildbornPreserver.class));
        cards.add(new SetCardInfo("Wildwood Scourge", 236, Rarity.UNCOMMON, mage.cards.w.WildwoodScourge.class));
        cards.add(new SetCardInfo("Wilt-Leaf Liege", 668, Rarity.RARE, mage.cards.w.WiltLeafLiege.class));
        cards.add(new SetCardInfo("Wishclaw Talisman", 617, Rarity.RARE, mage.cards.w.WishclawTalisman.class));
        cards.add(new SetCardInfo("Youthful Valkyrie", 149, Rarity.UNCOMMON, mage.cards.y.YouthfulValkyrie.class));
        cards.add(new SetCardInfo("Zetalpa, Primal Dawn", 584, Rarity.RARE, mage.cards.z.ZetalpaPrimalDawn.class));
        cards.add(new SetCardInfo("Zombify", 187, Rarity.UNCOMMON, mage.cards.z.Zombify.class));
    }
}
