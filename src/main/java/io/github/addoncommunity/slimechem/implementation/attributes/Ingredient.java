package io.github.addoncommunity.slimechem.implementation.attributes;

import javax.annotation.Nonnull;

import io.github.addoncommunity.slimechem.implementation.atomic.Molecule;
import io.github.addoncommunity.slimechem.implementation.atomic.MoleculeIngredient;

/**
 * This interface should be implemented by any {@link Object}
 * that could be an {@link MoleculeIngredient} of a {@link Molecule}
 *
 * @author Mooy1
 *
 */
public interface Ingredient extends Itemable {

    @Nonnull
    String getFormula(int i);

    @Nonnull
    MoleculeIngredient asIngredient(int amount);

    @Nonnull
    MoleculeIngredient asIngredient();
}