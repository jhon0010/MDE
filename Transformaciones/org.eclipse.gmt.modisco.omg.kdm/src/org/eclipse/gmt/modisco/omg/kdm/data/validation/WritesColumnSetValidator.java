/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.data.validation;

import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;

import org.eclipse.gmt.modisco.omg.kdm.data.ColumnSet;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.data.WritesColumnSet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WritesColumnSetValidator {
	boolean validate();

	boolean validateTo(ColumnSet value);
	boolean validateFrom(ActionElement value);
}
