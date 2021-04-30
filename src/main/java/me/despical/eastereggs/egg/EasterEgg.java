package me.despical.eastereggs.egg;

import me.despical.commons.item.ItemUtils;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * @author Despical
 * <p>
 * Created at 30.04.2021
 */
public class EasterEgg extends BukkitRunnable {

	private final ItemStack skull;

	public EasterEgg(String url) {
		this.skull = ItemUtils.getSkull(url);
	}

	@Override
	public void run() {
		// not implemented yet
	}

	public ItemStack getSkull() {
		return skull;
	}
}