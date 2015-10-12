/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.event.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.omg.kdm.event.Event;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.event.EventAction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EventActionValidator {
	boolean validate();

	boolean validateKind(String value);
	boolean validateEventElement(EList<Event> value);
}