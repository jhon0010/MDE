/**
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.code.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.omg.kdm.action.EntryFlow;

import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeRelationship;
import org.eclipse.gmt.modisco.omg.kdm.code.CommentUnit;

import org.eclipse.gmt.modisco.omg.kdm.source.SourceRef;

/**
 * A sample validator interface for {@link org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractCodeElementValidator {
	boolean validate();

	boolean validateSource(EList<SourceRef> value);
	boolean validateComment(EList<CommentUnit> value);
	boolean validateCodeRelation(EList<AbstractCodeRelationship> value);
	boolean validateEntryFlow(EList<EntryFlow> value);
}