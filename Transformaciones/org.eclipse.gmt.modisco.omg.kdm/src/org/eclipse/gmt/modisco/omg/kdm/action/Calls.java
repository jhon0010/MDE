/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 */
package org.eclipse.gmt.modisco.omg.kdm.action;

import org.eclipse.gmt.modisco.omg.kdm.code.ControlElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.action.Calls#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.action.Calls#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.action.ActionPackage#getCalls()
 * @model
 * @generated
 */
public interface Calls extends AbstractActionRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ControlElement)
	 * @see org.eclipse.gmt.modisco.omg.kdm.action.ActionPackage#getCalls_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ControlElement getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.action.Calls#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ControlElement value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ActionElement)
	 * @see org.eclipse.gmt.modisco.omg.kdm.action.ActionPackage#getCalls_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionElement getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.action.Calls#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ActionElement value);

} // Calls