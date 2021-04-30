package me.despical.eastereggs.util;

import me.despical.commons.util.Strings;
import org.bukkit.Bukkit;

/**
 * @author Despical
 * <p>
 * Created at 30.04.2021
 */
public class Debugger {

	public static void sendConsoleMessage(String message) {
		Bukkit.getConsoleSender().sendMessage(Strings.format(message));
	}
}