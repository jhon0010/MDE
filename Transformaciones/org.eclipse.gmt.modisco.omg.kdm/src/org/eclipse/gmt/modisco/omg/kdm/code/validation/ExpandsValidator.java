/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.code.validation;

import org.eclipse.gmt.modisco.omg.kdm.code.MacroUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.PreprocessorDirective;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.code.Expands}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExpandsValidator {
	boolean validate();

	boolean validateTo(MacroUnit value);
	boolean validateFrom(PreprocessorDirective value);
}