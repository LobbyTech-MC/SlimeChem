package io.github.mooy1.slimechem.implementation.subatomic;

import io.github.mooy1.slimechem.implementation.atomic.DecayProduct;
import io.github.mooy1.slimechem.utils.Util;
import lombok.Getter;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

/**
 * Enum of leptons
 *
 * @author Mooy1
 */
@Getter
public enum Lepton implements Fermion, DecayProduct {

    ELECTRON(),
    ELECTRON_NEUTRINO(),
    MUON(),
    MUON_NEUTRINO(),
    TAU(),
    TAU_NEUTRINO();

    private final SlimefunItemStack item;

    Lepton() {
        String name = this.toString();
        item = new SlimefunItemStack(
            name,
            Material.YELLOW_DYE,
            "&7" + Util.enumNameToTitleCaseString(name),
            "&7Type: lepton",
            "&7This particle does not interact via the strong force"
        );
    }
}
