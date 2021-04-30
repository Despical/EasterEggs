package me.despical.eastereggs.gui;

import me.despical.commons.compat.XMaterial;
import me.despical.eastereggs.Main;
import me.despical.eastereggs.gui.components.MainComponents;
import me.despical.inventoryframework.Gui;
import me.despical.inventoryframework.pane.StaticPane;
import org.bukkit.entity.Player;

/**
 * @author Despical
 * <p>
 * Created at 30.04.2021
 */
public class EasterGui {

	private final Gui gui;

	public EasterGui(Main plugin) {
		this.gui = new Gui(plugin, 9, "Easter Eggs");

		StaticPane pane = new StaticPane(9, 6);
		pane.fillWith(XMaterial.BLACK_STAINED_GLASS_PANE.parseItem());

		this.gui.addPane(pane);

		implementPanes(pane);
	}

	private void implementPanes(StaticPane pane) {
		MainComponents mainComponents = new MainComponents();
		mainComponents.implementPanes(pane);
	}

	public void openGui(Player player) {
		this.gui.show(player);
	}
}