package io.github.addoncommunity.slimechem;

import javax.annotation.Nonnull;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.addoncommunity.slimechem.implementation.atomic.isotopes.IsotopeLoader;
import io.github.addoncommunity.slimechem.setup.Registry;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import lombok.Getter;
import net.guizhanss.minecraft.guizhanlib.updater.GuizhanUpdater;


public class SlimeChem extends JavaPlugin implements SlimefunAddon {

    @Getter
    private static SlimeChem instance;
    
    @Override
    public void onEnable() {
        instance = this;

        if (getConfig().getBoolean("auto-update")
                && getDescription().getVersion().startsWith("Build")) {
            GuizhanUpdater.start(this, getFile(), "SlimefunGuguProject", "SlimeChem", "master");
        }
        
        @SuppressWarnings("unused")
        final Metrics metrics = new Metrics(this, 9490);

        IsotopeLoader isotopeLoader = new IsotopeLoader();
        isotopeLoader.load();
        isotopeLoader.loadDecayProducts();

        Registry.setup(this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/Slimefun-Addon-Community/SlimeChem/issues";
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}
