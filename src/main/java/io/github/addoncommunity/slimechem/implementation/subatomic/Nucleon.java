package io.github.addoncommunity.slimechem.implementation.subatomic;

import javax.annotation.Nonnull;

import org.bukkit.Material;

import io.github.addoncommunity.slimechem.implementation.atomic.Element;
import io.github.addoncommunity.slimechem.implementation.attributes.Itemable;
import io.github.addoncommunity.slimechem.utils.StringUtil;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.Getter;

/**
 * Enum of nucleons
 *
 * @author Mooy1
 * @see Element
 * @see Quark
 */
@Getter
public enum Nucleon implements Itemable {

    NEUTRON(Quark.UP, Quark.DOWN, Quark.DOWN),
    PROTON(Quark.UP, Quark.UP, Quark.DOWN);

    private final Quark[] quarks;
    private final SlimefunItemStack item;

    Nucleon(@Nonnull Quark... quarks) {
        this.quarks = quarks;

        String name = this.toString();
        this.item = new SlimefunItemStack(
            name,
            Material.WHITE_DYE,
            "&7" + StringUtil.enumNameToTitleCaseString(name),
            "&7Type: nucleon",
            "&7This particle does not interact via the strong force"
        );
    }

}
