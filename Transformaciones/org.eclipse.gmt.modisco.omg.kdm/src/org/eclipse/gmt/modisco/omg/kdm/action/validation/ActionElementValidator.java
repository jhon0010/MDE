/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.action.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.omg.kdm.action.AbstractActionRelationship;

import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.action.ActionElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActionElementValidator {
	boolean validate();

	boolean validateKind(String value);
	boolean validateCodeElement(EList<AbstractCodeElement> value);
	boolean validateActionRelation(EList<AbstractActionRelationship> value);
}
