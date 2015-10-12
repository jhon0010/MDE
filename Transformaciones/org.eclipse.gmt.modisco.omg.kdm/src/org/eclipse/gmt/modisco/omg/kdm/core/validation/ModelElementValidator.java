/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.core.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtendedValue;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.core.ModelElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModelElementValidator {
	boolean validate();

	boolean validateStereotype(EList<Stereotype> value);
	boolean validateTaggedValue(EList<ExtendedValue> value);
}
