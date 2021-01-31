package io.github.addoncommunity.slimechem.implementation.subatomic;

import lombok.Getter;

/**
 * Enum of quarks
 *
 * @author Mooy1
 * 
 * @see Nucleon
 *
 */
@Getter
public enum Quark implements Fermion {

    UP(),
    DOWN(),
    CHARM(),
    STRANGE(),
    TOP(),
    BOTTOM();
    
}
