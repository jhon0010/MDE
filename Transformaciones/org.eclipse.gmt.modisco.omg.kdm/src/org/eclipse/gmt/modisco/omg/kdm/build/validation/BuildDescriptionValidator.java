/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.build.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.omg.kdm.source.SourceRef;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.build.BuildDescription}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BuildDescriptionValidator {
	boolean validate();

	boolean validateSource(EList<SourceRef> value);
	boolean validateText(String value);
}
