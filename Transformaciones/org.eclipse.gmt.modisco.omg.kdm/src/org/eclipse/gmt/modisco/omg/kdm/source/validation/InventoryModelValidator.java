/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.source.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.omg.kdm.source.AbstractInventoryElement;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.source.InventoryModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InventoryModelValidator {
	boolean validate();

	boolean validateInventoryElement(EList<AbstractInventoryElement> value);
}
