package me.despical.eastereggs.gui.components;

import me.despical.commons.compat.XMaterial;
import me.despical.commons.item.ItemBuilder;
import me.despical.eastereggs.egg.EasterEgg;
import me.despical.inventoryframework.GuiItem;
import me.despical.inventoryframework.pane.StaticPane;

import java.util.List;

/**
 * @author Despical
 * <p>
 * Created at 30.04.2021
 */
public class MainComponents implements GuiComponent {

	@Override
	public void implementPanes(StaticPane pane) {
		pane.addItem(new GuiItem(new ItemBuilder(XMaterial.REDSTONE).build(), event -> event.getWhoClicked().closeInventory()), 4, pane.getHeight());

		List<EasterEgg> easterEggs = plugin.getEasterEggHandler().getEasterEggs();

		// not implemented yet
	}
}