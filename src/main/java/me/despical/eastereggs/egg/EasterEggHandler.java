package me.despical.eastereggs.egg;

import me.despical.eastereggs.Main;
import me.despical.eastereggs.util.Debugger;
import org.bukkit.configuration.ConfigurationSection;

import java.util.List;

/**
 * @author Despical
 * <p>
 * Created at 30.04.2021
 */
public class EasterEggHandler {

	// not implemented yet

	private List<EasterEgg> easterEggs;
	private final Main plugin;

	public EasterEggHandler(Main plugin) {
		this.plugin = plugin;
	}

	public void registerEggs() {
		ConfigurationSection section = plugin.getConfig().getConfigurationSection("EasterEggs");

		if (section == null) {
			Debugger.sendConsoleMessage("&cCouldn't find any easter egg URLs in config, ignoring it!");
			return;
		}

		easterEggs.clear();

		section.getKeys(false).stream().map(EasterEgg::new).forEach(easterEggs::add);
	}

	public List<EasterEgg> getEasterEggs() {
		return easterEggs;
	}
}