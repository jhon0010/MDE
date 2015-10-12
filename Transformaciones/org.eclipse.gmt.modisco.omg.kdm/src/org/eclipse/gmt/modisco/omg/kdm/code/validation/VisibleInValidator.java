/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.code.validation;

import org.eclipse.gmt.modisco.omg.kdm.code.CodeItem;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VisibleInValidator {
	boolean validate();

	boolean validateTo(CodeItem value);
	boolean validateFrom(CodeItem value);
}
