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
package org.eclipse.gmt.modisco.omg.kdm.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The set of aggregated relationships for a given entity represents all primitive relationships between the entities that are
 * transitively owned by the given entity as well as the entity itself. This is a concrete class, because an
 * AggregatedRelationship can be instantiated, and exchanged. AggregatedRelations are meant to be built on demand (and
 * exchanged too, if necessary). The lifecycle of the Aggregated Relationships can be explicitly managed by the operations
 * of the KDMEntity class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getDensity <em>Density</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.core.CorePackage#getAggregatedRelationship()
 * @model
 * @generated
 */
public interface AggregatedRelationship extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of primitive KDM relationships represented by the aggregated relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relation</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.CorePackage#getAggregatedRelationship_Relation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KDMRelationship> getRelation();

	/**
	 * Returns the value of the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of primitive relationships in the aggregated set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Density</em>' attribute.
	 * @see #setDensity(Integer)
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.CorePackage#getAggregatedRelationship_Density()
	 * @model dataType="org.eclipse.gmt.modisco.omg.kdm.core.Integer"
	 * @generated
	 */
	Integer getDensity();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.core.AggregatedRelationship#getDensity <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Density</em>' attribute.
	 * @see #getDensity()
	 * @generated
	 */
	void setDensity(Integer value);

} // AggregatedRelationship
