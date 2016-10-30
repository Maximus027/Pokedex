package nyc.c4q.maxrosado.pokedex;

import android.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by maxrosado on 10/27/16.
 */
public class PokedexAdapter extends RecyclerView.Adapter {
    List<Pokemon> pokemonList = Arrays.asList(
            new Pokemon(1, R.drawable.bulbasaur, "Bulbasaur", "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokémon."),
            new Pokemon(2, R.drawable.ivysaur, "Ivysaur", "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs."),
            new Pokemon(3, R.drawable.venusaur, "Venusaur", "The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight."),
            new Pokemon(4, R.drawable.charmander, "Charmander", "Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail."),
            new Pokemon(5, R.drawable.charmeleon, "Charmeleon", "When it swings its burning tail, it elevates the temperature to unbearably high levels."),
            new Pokemon(6, R.drawable.charizard, "Charizard", "Spits fire that is hot enough to melt boulders. Known to cause forest fires unintentionally."),
            new Pokemon(7, R.drawable.squirtle, "Squirtle", "After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth"),
            new Pokemon(8, R.drawable.wartortle, "Wartortle", "Often hides in water to stalk unwary prey. For swimming fast, it moves its ears to maintain balance."),
            new Pokemon(9, R.drawable.blastoise, "Blastoise", "Blastoise Info"),
            new Pokemon(10, R.drawable.caterpie, "Caterpie", "Caterpie Info"),
            new Pokemon(11, R.drawable.metapod, "Metapod", "Metapod Info"),
            new Pokemon(12, R.drawable.butterfree, "Butterfree", "Butterfree Info"),
            new Pokemon(13, R.drawable.weedle, "Weedle", "Weedle Info"),
            new Pokemon(14, R.drawable.kakuna, "Kakuna", "Kakuna Info"),
            new Pokemon(15, R.drawable.beedrill, "Beedrill", "Beedrill Info"),
            new Pokemon(16, R.drawable.pidgey, "Pidgey", "Pidgey Info"),
            new Pokemon(17, R.drawable.pidgeotto, "Pidgeotto", "Pigeotto Info"),
            new Pokemon(18, R.drawable.pidgeot, "Pidgeot", "Pidgeot Info"),
            new Pokemon(19, R.drawable.rattata, "Rattata", "Rattata Info"),
            new Pokemon(20, R.drawable.raticate, "Raticate", "Raticate Info"),
            new Pokemon(21, R.drawable.spearow, "Spearow", "Spearow Info"),
            new Pokemon(22, R.drawable.fearow, "Fearow", "Fearow Info"),
            new Pokemon(23, R.drawable.ekans, "Ekans", "Ekans Info"),
            new Pokemon(24, R.drawable.arbok, "Arbok", "Arbok Info"),
            new Pokemon(25, R.drawable.pikachu, "Pikachu", "Pikachu Info"),
            new Pokemon(26, R.drawable.raichu, "Raichu", "Raichu Info"),
            new Pokemon(27, R.drawable.sandshrew, "Sandshrew", "Sandshrew Info"),
            new Pokemon(28, R.drawable.sandslash, "Sandslash", "Sandslash Info"),
            new Pokemon(29, R.drawable.nidoran_f, "Nidoran F", "Nidoran F Info"),
            new Pokemon(30, R.drawable.nidorina, "Nidorina", "Nidorina Info"),
            new Pokemon(31, R.drawable.nidoqueen, "Nidoqueen", "Nidoqueen Info"),
            new Pokemon(32, R.drawable.nidoran_m, "Nidoran M", "Nidoran M Info"),
            new Pokemon(33, R.drawable.nidorino, "Nidorino", "Nidorino Info"),
            new Pokemon(34, R.drawable.nidoking, "NidoKing", "Nidoking Info"),
            new Pokemon(35, R.drawable.clefairy, "Clefairy", "Clefairy Info"),
            new Pokemon(36, R.drawable.clefable, "Clefable", "Clefable Info"),
            new Pokemon(37, R.drawable.vulpix, "Vulpix", "Vulpix Info"),
            new Pokemon(38, R.drawable.ninetales, "Ninetales", "Ninetales Info"),
            new Pokemon(39, R.drawable.jigglypuff, "Jiggypuff", "Jigglypuff Info"),
            new Pokemon(40, R.drawable.wigglytuff, "Wigglytuff", "Wigglytuff Info"),
            new Pokemon(41, R.drawable.zubat, "Zubat", "Zubat Info"),
            new Pokemon(42, R.drawable.golbat, "Golbat", "Golbat Info"),
            new Pokemon(43, R.drawable.oddish, "Oddish", "Oddish Info"),
            new Pokemon(44, R.drawable.gloom, "Gloom", "Gloom Info"),
            new Pokemon(45, R.drawable.vileplume, "Vileplume", "Vileplume Info"),
            new Pokemon(46, R.drawable.paras, "Paras", "Paras Info"),
            new Pokemon(47, R.drawable.parasect, "Parasect", "Parasect Info"),
            new Pokemon(48, R.drawable.venonat, "Venonat", "Venonat Info"),
            new Pokemon(49, R.drawable.venomoth, "Venomoth", "Venomoth Info"),
            new Pokemon(50, R.drawable.diglett, "Diglett", "Diglett Info"),
            new Pokemon(51, R.drawable.dugtrio, "Dugtrio", "Dugtrio Info"),
            new Pokemon(52, R.drawable.meowth, "Meowth", "Meowth Info"),
            new Pokemon(53, R.drawable.persian, "Persian", "Persian Info"),
            new Pokemon(54, R.drawable.psyduck, "Psyduck", "Psyduck Info"),
            new Pokemon(55, R.drawable.golduck, "Golduck", "Golduck Info"),
            new Pokemon(56, R.drawable.mankey, "Mankey", "Mankey Info"),
            new Pokemon(57, R.drawable.primeape, "Primeape", "Primeape Info"),
            new Pokemon(58, R.drawable.arcanine, "Arcanine", "Arcanine Info"),
            new Pokemon(59, R.drawable.poliwag, "Poliwag", "Poliwag Info"),
            new Pokemon(60, R.drawable.poliwhirl, "Poliwhirl", "Poliwhirl Info"),
            new Pokemon(61, R.drawable.poliwrath, "Poliwrath", "Poliwrath Info"),
            new Pokemon(62, R.drawable.abra, "Abra", "Abra Info"),
            new Pokemon(63, R.drawable.kadabra, "Kadabra", "Kadabra Info"),
            new Pokemon(64, R.drawable.alakazam, "Alakazam", "Alakazam Info"),
            new Pokemon(65, R.drawable.machop, "Machop", "Machop Info"),
            new Pokemon(66, R.drawable.machoke, "Machoke", "Machoke Info"),
            new Pokemon(67, R.drawable.machamp, "Machamp", "Machamp Info"),
            new Pokemon(68, R.drawable.bellsprout, "Bellsprout", "Bellsprout Info"),
            new Pokemon(69, R.drawable.weepinbell, "Weepinbell", "Weepinbell Info"),
            new Pokemon(70, R.drawable.victreebel, "Victreebel", "Victreebel Info"),
            new Pokemon(71, R.drawable.tentacool, "Tentacool", "Tentacall Info"),
            new Pokemon(72, R.drawable.tentacruel, "Tentacruel", "Tentacruel Info"),
            new Pokemon(73, R.drawable.geodude, "Geodude", "Geodude Info"),
            new Pokemon(74, R.drawable.graveler, "Graveler", "Graveler Info"),
            new Pokemon(75, R.drawable.golem, "Golem", "Golem Info"),
            new Pokemon(76, R.drawable.ponyta, "Ponyta", "Ponyta Info"),
            new Pokemon(77, R.drawable.rapidash, "Rapidash", "Rapidash Info"),
            new Pokemon(78, R.drawable.slowpoke, "Slowpoke", "Slowpoke Info"),
            new Pokemon(79, R.drawable.slowbro, "Slowbro", "Slowbro Info"),
            new Pokemon(80, R.drawable.magnemite, "Magnemite", "Magnemite Info"),
            new Pokemon(81, R.drawable.magneton, "Magneton", "Magneton Info"),
            new Pokemon(82, R.drawable.farfetchd, "Farfetch'd", "Farfetch'd Info"),
            new Pokemon(83, R.drawable.doduo, "Doduo", "Doduo Info"),
            new Pokemon(84, R.drawable.dodrio, "Dodrio", "Dodrio Info"),
            new Pokemon(85, R.drawable.seel, "Seel", "Seel Info"),
            new Pokemon(86, R.drawable.dewgong, "Dewgong", "Dewgong Info"),
            new Pokemon(87, R.drawable.grimer, "Grimer", "Grimer Info"),
            new Pokemon(88, R.drawable.muk, "Muk", "Muk Info"),
            new Pokemon(89, R.drawable.shellder, "Shellder", "Shellder Info"),
            new Pokemon(90, R.drawable.cloyster, "Cloyster", "Cloyster Info"),
            new Pokemon(91, R.drawable.gastly, "Gastly", "Gastly Info"),
            new Pokemon(92, R.drawable.haunter, "Haunter", "Haunter Info"),
            new Pokemon(93, R.drawable.gengar, "Gengar", "Gengar Info"),
            new Pokemon(94, R.drawable.onix, "Onix", "Onix Info"),
            new Pokemon(95, R.drawable.drowzee, "Drowsee", "Drowsee Info"),
            new Pokemon(96, R.drawable.hypno, "Hypno", "Hypno Info"),
            new Pokemon(97, R.drawable.krabby, "Krabby", "Krabby Info"),
            new Pokemon(98, R.drawable.kingler, "Kingler", "Kingler Info"),
            new Pokemon(99, R.drawable.voltorb, "Voltorb", "Voltorb Info"),
            new Pokemon(100, R.drawable.electrode, "Electrode", "Electrode Info"),
            new Pokemon(101, R.drawable.exeggcute, "Exeggcute", "Exeggcute"),
            new Pokemon(102, R.drawable.exeggutor, "Exeggutor", "Exeggutor Info"),
            new Pokemon(103, R.drawable.cubone, "Cubone", "Cubone Info"),
            new Pokemon(104, R.drawable.marowak, "Marowak", "Marowak Info"),
            new Pokemon(105, R.drawable.hitmonlee, "Hitmonlee", "Hitmonlee Info"),
            new Pokemon(106, R.drawable.hitmonchan, "Hitmonchan", "Hitmonchan Info"),
            new Pokemon(107, R.drawable.lickitung, "Lickitung", "Lickitung Info"),
            new Pokemon(108, R.drawable.koffing, "Koffing", "Koffing Info"),
            new Pokemon(109, R.drawable.weezing, "Weezing", "Weezing Info"),
            new Pokemon(110, R.drawable.rhyhorn, "Rhyhorn", "Rhyhorn Info"),
            new Pokemon(111, R.drawable.rhydon, "Rhydon", "Rhydon Info"),
            new Pokemon(112, R.drawable.chansey, "Chansey", "Chansey Info"),
            new Pokemon(113, R.drawable.tangela, "Tangela", "Tangela Info"),
            new Pokemon(114, R.drawable.kangaskhan, "Kangaskhan", "Kangaskhan Info"),
            new Pokemon(115, R.drawable.horsea, "Horsea", "Horsea Info"),
            new Pokemon(116, R.drawable.seadra, "Seadra", "Seadra Info"),
            new Pokemon(117, R.drawable.goldeen, "Goldeen", "Goldeen Info"),
            new Pokemon(118, R.drawable.seaking, "Seaking", "Seaking Info"),
            new Pokemon(119, R.drawable.staryu, "Staryu", "Staryu Info"),
            new Pokemon(120, R.drawable.starmie, "Starmie", "Starmie Info"),
            new Pokemon(121, R.drawable.mr_mime, "Mr.Mime", "Mr.Mime Info"),
            new Pokemon(122, R.drawable.scyther, "Scyther", "Scyther Info"),
            new Pokemon(123, R.drawable.jynx, "Jynx", "Jynx Info"),
            new Pokemon(124, R.drawable.electabuzz, "Electabuzz", "Electabuzz Info"),
            new Pokemon(125, R.drawable.magmar, "Magmar", "Magmar Info"),
            new Pokemon(126, R.drawable.pinsir, "Pinsir", "Pinsir Info"),
            new Pokemon(127, R.drawable.tauros, "Tauros", "Tauros Info"),
            new Pokemon(128, R.drawable.magikarp, "Magikarp", "Magikarp Info"),
            new Pokemon(129, R.drawable.gyarados, "Gyarados", "Gyarados Info"),
            new Pokemon(130, R.drawable.lapras, "Lapras", "Lapras Info"),
            new Pokemon(131, R.drawable.ditto, "Ditto", "Ditto Info"),
            new Pokemon(132, R.drawable.eevee, "Eevee", "Eevee Info"),
            new Pokemon(133, R.drawable.vaporeon, "Vaporean", "Vaporean Info"),
            new Pokemon(134, R.drawable.jolteon, "Jolteon", "Jolteon Info"),
            new Pokemon(135, R.drawable.flareon, "Flareon", "Flareon Info"),
            new Pokemon(136, R.drawable.porygon, "Porygon", "Porygon Info"),
            new Pokemon(137, R.drawable.omanyte, "Omanyte", "Omanyte Info"),
            new Pokemon(139, R.drawable.omastar, "Omastar", "Omastar Info"),
            new Pokemon(140, R.drawable.kabuto, "Kabuto", "Kabuto Info"),
            new Pokemon(141, R.drawable.kabutops, "Kabutops", "Kabutops Info"),
            new Pokemon(142, R.drawable.aerodactyl, "Aerodactyl", "Aerodactyl Info"),
            new Pokemon(143, R.drawable.snorlax, "Snorlax", "Snorlax Info"),
            new Pokemon(144, R.drawable.articuno, "Articuno", "Articuno Info"),
            new Pokemon(145, R.drawable.zapdos, "Zapdos", "Zapdos Info"),
            new Pokemon(146, R.drawable.moltres, "Moltres", "Moltres Info"),
            new Pokemon(147, R.drawable.dratini, "Dratini", "Dratini Info"),
            new Pokemon(148, R.drawable.dragonair, "Dragonair", "Dragonair Info"),
            new Pokemon(149, R.drawable.dragonite, "Dragonite", "Dragonite Info"),
            new Pokemon(150, R.drawable.mewtwo, "Mewtwo", "Mewtwo Info"),
            new Pokemon(151, R.drawable.mew, "Mew", "Mew Info")
            );

    FragmentManager fragmentManager;

    public PokedexAdapter(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PokeViewHolder(parent,fragmentManager);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PokeViewHolder viewHolder = (PokeViewHolder) holder;
        viewHolder.bind(pokemonList.get(position));
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }
}
