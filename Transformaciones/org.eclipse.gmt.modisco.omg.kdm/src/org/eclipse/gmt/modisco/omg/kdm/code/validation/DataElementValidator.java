/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.code.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.omg.kdm.code.Datatype;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.code.DataElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataElementValidator {
	boolean validate();

	boolean validateType(Datatype value);
	boolean validateExt(String value);
	boolean validateSize(Integer value);
	boolean validateCodeElement(EList<Datatype> value);
}