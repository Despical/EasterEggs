package me.despical.eastereggs.gui.components;

import me.despical.eastereggs.Main;
import me.despical.inventoryframework.pane.StaticPane;
import org.bukkit.plugin.java.JavaPlugin;

public interface GuiComponent {

	Main plugin = JavaPlugin.getPlugin(Main.class);

	void implementPanes(StaticPane pane);
}