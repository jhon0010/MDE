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
package org.eclipse.gmt.modisco.omg.kdm.source.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.omg.kdm.core.Element;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.gmt.modisco.omg.kdm.core.ModelElement;

import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMFramework;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel;

import org.eclipse.gmt.modisco.omg.kdm.source.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.omg.kdm.source.SourcePackage
 * @generated
 */
public class SourceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SourcePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SourcePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceSwitch<Adapter> modelSwitch =
		new SourceSwitch<Adapter>() {
			@Override
			public Adapter caseInventoryModel(InventoryModel object) {
				return createInventoryModelAdapter();
			}
			@Override
			public Adapter caseAbstractInventoryElement(AbstractInventoryElement object) {
				return createAbstractInventoryElementAdapter();
			}
			@Override
			public Adapter caseAbstractInventoryRelationship(AbstractInventoryRelationship object) {
				return createAbstractInventoryRelationshipAdapter();
			}
			@Override
			public Adapter caseInventoryItem(InventoryItem object) {
				return createInventoryItemAdapter();
			}
			@Override
			public Adapter caseSourceFile(SourceFile object) {
				return createSourceFileAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseResourceDescription(ResourceDescription object) {
				return createResourceDescriptionAdapter();
			}
			@Override
			public Adapter caseBinaryFile(BinaryFile object) {
				return createBinaryFileAdapter();
			}
			@Override
			public Adapter caseExecutableFile(ExecutableFile object) {
				return createExecutableFileAdapter();
			}
			@Override
			public Adapter caseInventoryContainer(InventoryContainer object) {
				return createInventoryContainerAdapter();
			}
			@Override
			public Adapter caseDirectory(Directory object) {
				return createDirectoryAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseDependsOn(DependsOn object) {
				return createDependsOnAdapter();
			}
			@Override
			public Adapter caseSourceRef(SourceRef object) {
				return createSourceRefAdapter();
			}
			@Override
			public Adapter caseSourceRegion(SourceRegion object) {
				return createSourceRegionAdapter();
			}
			@Override
			public Adapter caseInventoryElement(InventoryElement object) {
				return createInventoryElementAdapter();
			}
			@Override
			public Adapter caseInventoryRelationship(InventoryRelationship object) {
				return createInventoryRelationshipAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseKDMFramework(KDMFramework object) {
				return createKDMFrameworkAdapter();
			}
			@Override
			public Adapter caseKDMModel(KDMModel object) {
				return createKDMModelAdapter();
			}
			@Override
			public Adapter caseKDMRelationship(KDMRelationship object) {
				return createKDMRelationshipAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.InventoryModel <em>Inventory Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.InventoryModel
	 * @generated
	 */
	public Adapter createInventoryModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.AbstractInventoryElement <em>Abstract Inventory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.AbstractInventoryElement
	 * @generated
	 */
	public Adapter createAbstractInventoryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.AbstractInventoryRelationship <em>Abstract Inventory Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.AbstractInventoryRelationship
	 * @generated
	 */
	public Adapter createAbstractInventoryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.InventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.InventoryItem
	 * @generated
	 */
	public Adapter createInventoryItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.SourceFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.SourceFile
	 * @generated
	 */
	public Adapter createSourceFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.ResourceDescription <em>Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.ResourceDescription
	 * @generated
	 */
	public Adapter createResourceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.BinaryFile <em>Binary File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.BinaryFile
	 * @generated
	 */
	public Adapter createBinaryFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.ExecutableFile <em>Executable File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.ExecutableFile
	 * @generated
	 */
	public Adapter createExecutableFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.InventoryContainer <em>Inventory Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.InventoryContainer
	 * @generated
	 */
	public Adapter createInventoryContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.Directory
	 * @generated
	 */
	public Adapter createDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.DependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.DependsOn
	 * @generated
	 */
	public Adapter createDependsOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.SourceRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.SourceRef
	 * @generated
	 */
	public Adapter createSourceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.SourceRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.SourceRegion
	 * @generated
	 */
	public Adapter createSourceRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.InventoryElement <em>Inventory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.InventoryElement
	 * @generated
	 */
	public Adapter createInventoryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.source.InventoryRelationship <em>Inventory Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.source.InventoryRelationship
	 * @generated
	 */
	public Adapter createInventoryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.kdm.KDMFramework <em>KDM Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.kdm.KDMFramework
	 * @generated
	 */
	public Adapter createKDMFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel <em>KDM Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel
	 * @generated
	 */
	public Adapter createKDMModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship <em>KDM Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship
	 * @generated
	 */
	public Adapter createKDMRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SourceAdapterFactory
