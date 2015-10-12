/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.build.validation;

import org.eclipse.gmt.modisco.omg.kdm.build.AbstractBuildElement;
import org.eclipse.gmt.modisco.omg.kdm.build.Supplier;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.build.SuppliedBy}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SuppliedByValidator {
	boolean validate();

	boolean validateTo(Supplier value);
	boolean validateFrom(AbstractBuildElement value);
}
