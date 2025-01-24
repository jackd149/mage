package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class AetherdriftCommander extends ExpansionSet {

    private static final AetherdriftCommander instance = new AetherdriftCommander();

    public static AetherdriftCommander getInstance() {
        return instance;
    }

    private AetherdriftCommander() {
        super("Aetherdrift Commander", "DRC", ExpansionSet.buildDate(2025, 1, 21), SetType.SUPPLEMENTAL);
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Academy Ruins", 58, Rarity.RARE, mage.cards.a.AcademyRuins.class));
        cards.add(new SetCardInfo("Adarkar Wastes", 144, Rarity.RARE, mage.cards.a.AdarkarWastes.class));
        cards.add(new SetCardInfo("Aether Hub", 145, Rarity.UNCOMMON, mage.cards.a.AetherHub.class));
        cards.add(new SetCardInfo("Aethersquall Ancient", 68, Rarity.RARE, mage.cards.a.AethersquallAncient.class));
        cards.add(new SetCardInfo("Aethertide Whale", 69, Rarity.RARE, mage.cards.a.AethertideWhale.class));
        cards.add(new SetCardInfo("Aetherwind Basker", 107, Rarity.MYTHIC, mage.cards.a.AetherwindBasker.class));
        cards.add(new SetCardInfo("Aetherworks Marvel", 123, Rarity.MYTHIC, mage.cards.a.AetherworksMarvel.class));
        cards.add(new SetCardInfo("Angel of Sanctions", 62, Rarity.MYTHIC, mage.cards.a.AngelOfSanctions.class));
        cards.add(new SetCardInfo("Arcane Denial", 70, Rarity.COMMON, mage.cards.a.ArcaneDenial.class));
        cards.add(new SetCardInfo("Arcane Sanctum", 146, Rarity.UNCOMMON, mage.cards.a.ArcaneSanctum.class));
        cards.add(new SetCardInfo("Arcane Signet", 51, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Archfiend of Ifnir", 86, Rarity.RARE, mage.cards.a.ArchfiendOfIfnir.class));
        cards.add(new SetCardInfo("Architect of the Untamed", 108, Rarity.RARE, mage.cards.a.ArchitectOfTheUntamed.class));
        cards.add(new SetCardInfo("Ash Barrens", 147, Rarity.COMMON, mage.cards.a.AshBarrens.class));
        cards.add(new SetCardInfo("Attune with Aether", 109, Rarity.COMMON, mage.cards.a.AttuneWithAether.class));
        cards.add(new SetCardInfo("Bespoke Battlewagon", 71, Rarity.UNCOMMON, mage.cards.b.BespokeBattlewagon.class));
        cards.add(new SetCardInfo("Binding Mummy", 63, Rarity.COMMON, mage.cards.b.BindingMummy.class));
        cards.add(new SetCardInfo("Blasphemous Act", 101, Rarity.RARE, mage.cards.b.BlasphemousAct.class));
        cards.add(new SetCardInfo("Bontu's Monument", 124, Rarity.UNCOMMON, mage.cards.b.BontusMonument.class));
        cards.add(new SetCardInfo("Bootleggers' Stash", 110, Rarity.MYTHIC, mage.cards.b.BootleggersStash.class));
        cards.add(new SetCardInfo("Cast Out", 64, Rarity.UNCOMMON, mage.cards.c.CastOut.class));
        cards.add(new SetCardInfo("Caves of Koilos", 148, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Cemetery Reaper", 87, Rarity.RARE, mage.cards.c.CemeteryReaper.class));
        cards.add(new SetCardInfo("Chain Reaction", 47, Rarity.RARE, mage.cards.c.ChainReaction.class));
        cards.add(new SetCardInfo("Champion of Wits", 72, Rarity.RARE, mage.cards.c.ChampionOfWits.class));
        cards.add(new SetCardInfo("Chaos Warp", 48, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Chromatic Lantern", 53, Rarity.RARE, mage.cards.c.ChromaticLantern.class));
        cards.add(new SetCardInfo("Combustible Gearhulk", 102, Rarity.MYTHIC, mage.cards.c.CombustibleGearhulk.class));
        cards.add(new SetCardInfo("Command Tower", 59, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 125, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Commence the Endgame", 38, Rarity.RARE, mage.cards.c.CommenceTheEndgame.class));
        cards.add(new SetCardInfo("Confiscation Coup", 73, Rarity.RARE, mage.cards.c.ConfiscationCoup.class));
        cards.add(new SetCardInfo("Conjurer's Closet", 126, Rarity.RARE, mage.cards.c.ConjurersCloset.class));
        cards.add(new SetCardInfo("Corpse Augur", 40, Rarity.UNCOMMON, mage.cards.c.CorpseAugur.class));
        cards.add(new SetCardInfo("Corpse Knight", 50, Rarity.UNCOMMON, mage.cards.c.CorpseKnight.class));
        cards.add(new SetCardInfo("Crowded Crypt", 88, Rarity.RARE, mage.cards.c.CrowdedCrypt.class));
        cards.add(new SetCardInfo("Cryptbreaker", 41, Rarity.RARE, mage.cards.c.Cryptbreaker.class));
        cards.add(new SetCardInfo("Cultivator's Caravan", 127, Rarity.RARE, mage.cards.c.CultivatorsCaravan.class));
        cards.add(new SetCardInfo("Damn", 89, Rarity.RARE, mage.cards.d.Damn.class));
        cards.add(new SetCardInfo("Decoction Module", 128, Rarity.UNCOMMON, mage.cards.d.DecoctionModule.class));
        cards.add(new SetCardInfo("Desert of the Glorified", 149, Rarity.COMMON, mage.cards.d.DesertOfTheGlorified.class));
        cards.add(new SetCardInfo("Desert of the Mindful", 150, Rarity.COMMON, mage.cards.d.DesertOfTheMindful.class));
        cards.add(new SetCardInfo("Desert of the True", 151, Rarity.COMMON, mage.cards.d.DesertOfTheTrue.class));
        cards.add(new SetCardInfo("Despark", 115, Rarity.UNCOMMON, mage.cards.d.Despark.class));
        cards.add(new SetCardInfo("Dimir Signet", 129, Rarity.UNCOMMON, mage.cards.d.DimirSignet.class));
        cards.add(new SetCardInfo("Disallow", 74, Rarity.RARE, mage.cards.d.Disallow.class));
        cards.add(new SetCardInfo("Dread Summons", 90, Rarity.RARE, mage.cards.d.DreadSummons.class));
        cards.add(new SetCardInfo("Dreadhorde Invasion", 91, Rarity.RARE, mage.cards.d.DreadhordeInvasion.class));
        cards.add(new SetCardInfo("Drowned Catacomb", 152, Rarity.RARE, mage.cards.d.DrownedCatacomb.class));
        cards.add(new SetCardInfo("Druid of Purification", 49, Rarity.RARE, mage.cards.d.DruidOfPurification.class));
        cards.add(new SetCardInfo("Duplicant", 54, Rarity.RARE, mage.cards.d.Duplicant.class));
        cards.add(new SetCardInfo("Dusk // Dawn", 65, Rarity.RARE, mage.cards.d.DuskDawn.class));
        cards.add(new SetCardInfo("Elder Gargaroth", 111, Rarity.MYTHIC, mage.cards.e.ElderGargaroth.class));
        cards.add(new SetCardInfo("Era of Innovation", 75, Rarity.UNCOMMON, mage.cards.e.EraOfInnovation.class));
        cards.add(new SetCardInfo("Eternal Skylord", 76, Rarity.UNCOMMON, mage.cards.e.EternalSkylord.class));
        cards.add(new SetCardInfo("Evolving Wilds", 153, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exotic Orchard", 155, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Explosive Vegetation", 112, Rarity.UNCOMMON, mage.cards.e.ExplosiveVegetation.class));
        cards.add(new SetCardInfo("Fetid Pools", 156, Rarity.RARE, mage.cards.f.FetidPools.class));
        cards.add(new SetCardInfo("Fleshbag Marauder", 92, Rarity.UNCOMMON, mage.cards.f.FleshbagMarauder.class));
        cards.add(new SetCardInfo("Forgotten Creation", 77, Rarity.RARE, mage.cards.f.ForgottenCreation.class));
        cards.add(new SetCardInfo("Frontier Bivouac", 157, Rarity.UNCOMMON, mage.cards.f.FrontierBivouac.class));
        cards.add(new SetCardInfo("Frostboil Snarl", 158, Rarity.RARE, mage.cards.f.FrostboilSnarl.class));
        cards.add(new SetCardInfo("Gate to the Afterlife", 130, Rarity.UNCOMMON, mage.cards.g.GateToTheAfterlife.class));
        cards.add(new SetCardInfo("Gempalm Polluter", 93, Rarity.COMMON, mage.cards.g.GempalmPolluter.class));
        cards.add(new SetCardInfo("Glacial Fortress", 159, Rarity.RARE, mage.cards.g.GlacialFortress.class));
        cards.add(new SetCardInfo("Gleaming Overseer", 116, Rarity.UNCOMMON, mage.cards.g.GleamingOverseer.class));
        cards.add(new SetCardInfo("Glimmer of Genius", 78, Rarity.UNCOMMON, mage.cards.g.GlimmerOfGenius.class));
        cards.add(new SetCardInfo("God-Eternal Oketra", 66, Rarity.MYTHIC, mage.cards.g.GodEternalOketra.class));
        cards.add(new SetCardInfo("God-Pharaoh's Gift", 131, Rarity.RARE, mage.cards.g.GodPharaohsGift.class));
        cards.add(new SetCardInfo("Grave Titan", 42, Rarity.MYTHIC, mage.cards.g.GraveTitan.class));
        cards.add(new SetCardInfo("Gravecrawler", 43, Rarity.RARE, mage.cards.g.Gravecrawler.class));
        cards.add(new SetCardInfo("Hinterland Harbor", 160, Rarity.RARE, mage.cards.h.HinterlandHarbor.class));
        cards.add(new SetCardInfo("Irrigated Farmland", 161, Rarity.RARE, mage.cards.i.IrrigatedFarmland.class));
        cards.add(new SetCardInfo("Isolated Chapel", 162, Rarity.RARE, mage.cards.i.IsolatedChapel.class));
        cards.add(new SetCardInfo("Karplusan Forest", 163, Rarity.RARE, mage.cards.k.KarplusanForest.class));
        cards.add(new SetCardInfo("Lazotep Chancellor", 117, Rarity.UNCOMMON, mage.cards.l.LazotepChancellor.class));
        cards.add(new SetCardInfo("Lightning Greaves", 55, Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Lightning Runner", 103, Rarity.MYTHIC, mage.cards.l.LightningRunner.class));
        cards.add(new SetCardInfo("Liliana, Death's Majesty", 94, Rarity.MYTHIC, mage.cards.l.LilianaDeathsMajesty.class));
        cards.add(new SetCardInfo("Lord of the Accursed", 95, Rarity.UNCOMMON, mage.cards.l.LordOfTheAccursed.class));
        cards.add(new SetCardInfo("Loyal Apprentice", 104, Rarity.UNCOMMON, mage.cards.l.LoyalApprentice.class));
        cards.add(new SetCardInfo("Maskwood Nexus", 132, Rarity.RARE, mage.cards.m.MaskwoodNexus.class));
        cards.add(new SetCardInfo("Midnight Clock", 79, Rarity.RARE, mage.cards.m.MidnightClock.class));
        cards.add(new SetCardInfo("Midnight Reaper", 44, Rarity.RARE, mage.cards.m.MidnightReaper.class));
        cards.add(new SetCardInfo("Murderous Rider", 45, Rarity.RARE, mage.cards.m.MurderousRider.class));
        cards.add(new SetCardInfo("Never // Return", 96, Rarity.RARE, mage.cards.n.NeverReturn.class));
        cards.add(new SetCardInfo("On Wings of Gold", 5, Rarity.RARE, mage.cards.o.OnWingsOfGold.class));
        cards.add(new SetCardInfo("One with the Machine", 80, Rarity.RARE, mage.cards.o.OneWithTheMachine.class));
        cards.add(new SetCardInfo("Ornithopter of Paradise", 133, Rarity.COMMON, mage.cards.o.OrnithopterOfParadise.class));
        cards.add(new SetCardInfo("Orzhov Basilica", 164, Rarity.UNCOMMON, mage.cards.o.OrzhovBasilica.class));
        cards.add(new SetCardInfo("Orzhov Signet", 134, Rarity.UNCOMMON, mage.cards.o.OrzhovSignet.class));
        cards.add(new SetCardInfo("Overflowing Basin", 165, Rarity.RARE, mage.cards.o.OverflowingBasin.class));
        cards.add(new SetCardInfo("Panharmonicon", 135, Rarity.RARE, mage.cards.p.Panharmonicon.class));
        cards.add(new SetCardInfo("Path of Ancestry", 61, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Peema Aether-Seer", 113, Rarity.UNCOMMON, mage.cards.p.PeemaAetherSeer.class));
        cards.add(new SetCardInfo("Pia and Kiran Nalaar", 105, Rarity.RARE, mage.cards.p.PiaAndKiranNalaar.class));
        cards.add(new SetCardInfo("Plague Belcher", 97, Rarity.RARE, mage.cards.p.PlagueBelcher.class));
        cards.add(new SetCardInfo("Prairie Stream", 167, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Prophet of the Scarab", 9, Rarity.RARE, mage.cards.p.ProphetOfTheScarab.class));
        cards.add(new SetCardInfo("Pull from Tomorrow", 81, Rarity.RARE, mage.cards.p.PullFromTomorrow.class));
        cards.add(new SetCardInfo("Reality Shift", 39, Rarity.UNCOMMON, mage.cards.r.RealityShift.class));
        cards.add(new SetCardInfo("Reckless Fireweaver", 106, Rarity.COMMON, mage.cards.r.RecklessFireweaver.class));
        cards.add(new SetCardInfo("Retrofitter Foundry", 136, Rarity.RARE, mage.cards.r.RetrofitterFoundry.class));
        cards.add(new SetCardInfo("Rogue Refiner", 118, Rarity.UNCOMMON, mage.cards.r.RogueRefiner.class));
        cards.add(new SetCardInfo("Rootbound Crag", 168, Rarity.RARE, mage.cards.r.RootboundCrag.class));
        cards.add(new SetCardInfo("Rot Hulk", 98, Rarity.MYTHIC, mage.cards.r.RotHulk.class));
        cards.add(new SetCardInfo("Saheeli, Sublime Artificer", 119, Rarity.UNCOMMON, mage.cards.s.SaheeliSublimeArtificer.class));
        cards.add(new SetCardInfo("Sai, Master Thopterist", 82, Rarity.RARE, mage.cards.s.SaiMasterThopterist.class));
        cards.add(new SetCardInfo("Servant of the Conduit", 114, Rarity.UNCOMMON, mage.cards.s.ServantOfTheConduit.class));
        cards.add(new SetCardInfo("Sheltered Thicket", 169, Rarity.RARE, mage.cards.s.ShelteredThicket.class));
        cards.add(new SetCardInfo("Shivan Reef", 170, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Slagwoods Bridge", 171, Rarity.COMMON, mage.cards.s.SlagwoodsBridge.class));
        cards.add(new SetCardInfo("Sol Ring", 56, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solar Transformer", 137, Rarity.UNCOMMON, mage.cards.s.SolarTransformer.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 138, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Soul-Guide Lantern", 139, Rarity.UNCOMMON, mage.cards.s.SoulGuideLantern.class));
        cards.add(new SetCardInfo("Spire of Industry", 172, Rarity.RARE, mage.cards.s.SpireOfIndustry.class));
        cards.add(new SetCardInfo("Sulfur Falls", 173, Rarity.RARE, mage.cards.s.SulfurFalls.class));
        cards.add(new SetCardInfo("Sunken Hollow", 174, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 37, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Talisman of Curiosity", 140, Rarity.UNCOMMON, mage.cards.t.TalismanOfCuriosity.class));
        cards.add(new SetCardInfo("Talisman of Dominance", 141, Rarity.UNCOMMON, mage.cards.t.TalismanOfDominance.class));
        cards.add(new SetCardInfo("Talisman of Hierarchy", 142, Rarity.UNCOMMON, mage.cards.t.TalismanOfHierarchy.class));
        cards.add(new SetCardInfo("Tanglepool Bridge", 175, Rarity.COMMON, mage.cards.t.TanglepoolBridge.class));
        cards.add(new SetCardInfo("Temmet, Naktamun's Will", 4, Rarity.MYTHIC, mage.cards.t.TemmetNaktamunsWill.class));
        cards.add(new SetCardInfo("Temple of Deceit", 176, Rarity.RARE, mage.cards.t.TempleOfDeceit.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 177, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Silence", 178, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 179, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("The Scarab God", 120, Rarity.MYTHIC, mage.cards.t.TheScarabGod.class));
        cards.add(new SetCardInfo("Thopter Spy Network", 83, Rarity.RARE, mage.cards.t.ThopterSpyNetwork.class));
        cards.add(new SetCardInfo("Timeless Dragon", 67, Rarity.RARE, mage.cards.t.TimelessDragon.class));
        cards.add(new SetCardInfo("Treasure Vault", 180, Rarity.RARE, mage.cards.t.TreasureVault.class));
        cards.add(new SetCardInfo("Triplicate Titan", 143, Rarity.RARE, mage.cards.t.TriplicateTitan.class));
        cards.add(new SetCardInfo("Twisted Abomination", 99, Rarity.COMMON, mage.cards.t.TwistedAbomination.class));
        cards.add(new SetCardInfo("Undead Augur", 100, Rarity.UNCOMMON, mage.cards.u.UndeadAugur.class));
        cards.add(new SetCardInfo("Underground River", 181, Rarity.RARE, mage.cards.u.UndergroundRiver.class));
        cards.add(new SetCardInfo("Unholy Grotto", 182, Rarity.RARE, mage.cards.u.UnholyGrotto.class));
        cards.add(new SetCardInfo("Vineglimmer Snarl", 183, Rarity.RARE, mage.cards.v.VineglimmerSnarl.class));
        cards.add(new SetCardInfo("Vizier of Many Faces", 84, Rarity.RARE, mage.cards.v.VizierOfManyFaces.class));
        cards.add(new SetCardInfo("Wayward Servant", 121, Rarity.UNCOMMON, mage.cards.w.WaywardServant.class));
        cards.add(new SetCardInfo("Whirler Rogue", 85, Rarity.UNCOMMON, mage.cards.w.WhirlerRogue.class));
        cards.add(new SetCardInfo("Whirler Virtuoso", 122, Rarity.UNCOMMON, mage.cards.w.WhirlerVirtuoso.class));
        cards.add(new SetCardInfo("Wizened Mentor", 8, Rarity.RARE, mage.cards.w.WizenedMentor.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 184, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
    }
}
