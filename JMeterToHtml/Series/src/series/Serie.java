/**
 */
package series;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link series.Serie#getSerieDato <em>Serie Dato</em>}</li>
 *   <li>{@link series.Serie#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see series.SeriesPackage#getSerie()
 * @model
 * @generated
 */
public interface Serie extends EObject {
	/**
	 * Returns the value of the '<em><b>Serie Dato</b></em>' containment reference list.
	 * The list contents are of type {@link series.Dato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serie Dato</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serie Dato</em>' containment reference list.
	 * @see series.SeriesPackage#getSerie_SerieDato()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dato> getSerieDato();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see series.SeriesPackage#getSerie_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link series.Serie#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Serie
