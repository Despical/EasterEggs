package me.despical.eastereggs.command;

import me.despical.commandframework.Command;
import me.despical.commandframework.CommandArguments;
import me.despical.eastereggs.Main;
import me.despical.eastereggs.gui.EasterGui;

/**
 * @author Despical
 * <p>
 * Created at 30.04.2021
 */
public class AdminCommands {

	private final Main plugin;

	public AdminCommands(Main plugin) {
		this.plugin = plugin;

		plugin.registerCommands(this);
	}

	@Command(
		name = "eastereggs",
		senderType = Command.SenderType.PLAYER,
		usage = "/eastereggs",
		desc = "Opens easter eggs editor.",
		permission = "eastereggs.admin"
	)
	public void guiCommand(CommandArguments commandArguments) {
		new EasterGui(plugin).openGui(commandArguments.getSender());
	}

	@Command(
		name = "eastereggs.reload",
		usage = "/eastereggs reload",
		desc = "Reloads all registered easter eggs",
		permission = "eastereggs.admin"
	)
	public void reloadCommand(CommandArguments commandArguments) {
		plugin.getEasterEggHandler().registerEggs();
	}
}