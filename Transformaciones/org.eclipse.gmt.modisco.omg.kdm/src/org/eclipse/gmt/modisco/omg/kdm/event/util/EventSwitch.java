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
package org.eclipse.gmt.modisco.omg.kdm.event.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gmt.modisco.omg.kdm.action.AbstractActionRelationship;

import org.eclipse.gmt.modisco.omg.kdm.core.Element;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.gmt.modisco.omg.kdm.core.ModelElement;

import org.eclipse.gmt.modisco.omg.kdm.event.*;

import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMFramework;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.omg.kdm.event.EventPackage
 * @generated
 */
public class EventSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EventPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSwitch() {
		if (modelPackage == null) {
			modelPackage = EventPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EventPackage.EVENT_MODEL: {
				EventModel eventModel = (EventModel)theEObject;
				T result = caseEventModel(eventModel);
				if (result == null) result = caseKDMModel(eventModel);
				if (result == null) result = caseKDMFramework(eventModel);
				if (result == null) result = caseModelElement(eventModel);
				if (result == null) result = caseElement(eventModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.ABSTRACT_EVENT_ELEMENT: {
				AbstractEventElement abstractEventElement = (AbstractEventElement)theEObject;
				T result = caseAbstractEventElement(abstractEventElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseAbstractEventElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.ABSTRACT_EVENT_RELATIONSHIP: {
				AbstractEventRelationship abstractEventRelationship = (AbstractEventRelationship)theEObject;
				T result = caseAbstractEventRelationship(abstractEventRelationship);
				if (result == null) result = caseKDMRelationship(abstractEventRelationship);
				if (result == null) result = caseModelElement(abstractEventRelationship);
				if (result == null) result = caseElement(abstractEventRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.EVENT_RELATIONSHIP: {
				EventRelationship eventRelationship = (EventRelationship)theEObject;
				T result = caseEventRelationship(eventRelationship);
				if (result == null) result = caseAbstractEventRelationship(eventRelationship);
				if (result == null) result = caseKDMRelationship(eventRelationship);
				if (result == null) result = caseModelElement(eventRelationship);
				if (result == null) result = caseElement(eventRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.EVENT_RESOURCE: {
				EventResource eventResource = (EventResource)theEObject;
				T result = caseEventResource(eventResource);
				if (result == null) result = caseAbstractEventElement(eventResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseEventResource(state);
				if (result == null) result = caseAbstractEventElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseEventResource(transition);
				if (result == null) result = caseAbstractEventElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.ON_ENTRY: {
				OnEntry onEntry = (OnEntry)theEObject;
				T result = caseOnEntry(onEntry);
				if (result == null) result = caseTransition(onEntry);
				if (result == null) result = caseEventResource(onEntry);
				if (result == null) result = caseAbstractEventElement(onEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.ON_EXIT: {
				OnExit onExit = (OnExit)theEObject;
				T result = caseOnExit(onExit);
				if (result == null) result = caseTransition(onExit);
				if (result == null) result = caseEventResource(onExit);
				if (result == null) result = caseAbstractEventElement(onExit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.EVENT_ACTION: {
				EventAction eventAction = (EventAction)theEObject;
				T result = caseEventAction(eventAction);
				if (result == null) result = caseAbstractEventElement(eventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.READS_STATE: {
				ReadsState readsState = (ReadsState)theEObject;
				T result = caseReadsState(readsState);
				if (result == null) result = caseAbstractActionRelationship(readsState);
				if (result == null) result = caseKDMRelationship(readsState);
				if (result == null) result = caseModelElement(readsState);
				if (result == null) result = caseElement(readsState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.PRODUCES_EVENT: {
				ProducesEvent producesEvent = (ProducesEvent)theEObject;
				T result = caseProducesEvent(producesEvent);
				if (result == null) result = caseAbstractActionRelationship(producesEvent);
				if (result == null) result = caseKDMRelationship(producesEvent);
				if (result == null) result = caseModelElement(producesEvent);
				if (result == null) result = caseElement(producesEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.CONSUMES_EVENT: {
				ConsumesEvent consumesEvent = (ConsumesEvent)theEObject;
				T result = caseConsumesEvent(consumesEvent);
				if (result == null) result = caseAbstractEventRelationship(consumesEvent);
				if (result == null) result = caseKDMRelationship(consumesEvent);
				if (result == null) result = caseModelElement(consumesEvent);
				if (result == null) result = caseElement(consumesEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.NEXT_STATE: {
				NextState nextState = (NextState)theEObject;
				T result = caseNextState(nextState);
				if (result == null) result = caseAbstractEventRelationship(nextState);
				if (result == null) result = caseKDMRelationship(nextState);
				if (result == null) result = caseModelElement(nextState);
				if (result == null) result = caseElement(nextState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.INITIAL_STATE: {
				InitialState initialState = (InitialState)theEObject;
				T result = caseInitialState(initialState);
				if (result == null) result = caseState(initialState);
				if (result == null) result = caseEventResource(initialState);
				if (result == null) result = caseAbstractEventElement(initialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.EVENT_ELEMENT: {
				EventElement eventElement = (EventElement)theEObject;
				T result = caseEventElement(eventElement);
				if (result == null) result = caseAbstractEventElement(eventElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventPackage.HAS_STATE: {
				HasState hasState = (HasState)theEObject;
				T result = caseHasState(hasState);
				if (result == null) result = caseAbstractActionRelationship(hasState);
				if (result == null) result = caseKDMRelationship(hasState);
				if (result == null) result = caseModelElement(hasState);
				if (result == null) result = caseElement(hasState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventModel(EventModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Event Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Event Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEventElement(AbstractEventElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Event Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Event Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEventRelationship(AbstractEventRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventRelationship(EventRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventResource(EventResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnEntry(OnEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnExit(OnExit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventAction(EventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reads State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reads State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadsState(ReadsState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Produces Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Produces Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProducesEvent(ProducesEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumes Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumes Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumesEvent(ConsumesEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextState(NextState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialState(InitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventElement(EventElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasState(HasState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMFramework(KDMFramework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMModel(KDMModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDM Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDM Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDMRelationship(KDMRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Action Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Action Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractActionRelationship(AbstractActionRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EventSwitch
