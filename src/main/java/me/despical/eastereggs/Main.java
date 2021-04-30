package me.despical.eastereggs;

import me.despical.commandframework.CommandFramework;
import me.despical.commons.compat.VersionResolver;
import me.despical.eastereggs.command.AdminCommands;
import me.despical.eastereggs.egg.EasterEggHandler;
import me.despical.eastereggs.util.Debugger;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Despical
 * <p>
 * Created at 30.04.2021
 */
public class Main extends JavaPlugin {

	private boolean forceDisable;

	private EasterEggHandler easterEggHandler;
	private CommandFramework commandFramework;

	@Override
	public void onEnable() {
		if (!shouldWeStart()) {
			getServer().getPluginManager().disablePlugin(this);
			return;
		}

		saveDefaultConfig();
		loadClasses();
	}

	private boolean shouldWeStart() {
		forceDisable = VersionResolver.isAllSupported();

		if (!forceDisable) {
			Debugger.sendConsoleMessage("&cYour server version is outdated for Easter Eggs!");
			Debugger.sendConsoleMessage("&cMaybe consider to change your server version.");
			return false;
		}

		return true;
	}

	@Override
	public void onDisable() {
		if (forceDisable) return;
	}

	private void loadClasses() {
		easterEggHandler = new EasterEggHandler(this);
		easterEggHandler.registerEggs();

		commandFramework = new CommandFramework(this);

		new AdminCommands(this);
	}

	public void registerCommands(Object instance) {
		commandFramework.registerCommands(instance);
	}

	public EasterEggHandler getEasterEggHandler() {
		return easterEggHandler;
	}
}