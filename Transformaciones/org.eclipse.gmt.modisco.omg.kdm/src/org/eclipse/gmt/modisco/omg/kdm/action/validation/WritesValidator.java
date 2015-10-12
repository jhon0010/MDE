/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.action.validation;

import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;

import org.eclipse.gmt.modisco.omg.kdm.code.DataElement;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.action.Writes}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WritesValidator {
	boolean validate();

	boolean validateTo(DataElement value);
	boolean validateFrom(ActionElement value);
}
