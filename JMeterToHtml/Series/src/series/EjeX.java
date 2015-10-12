/**
 */
package series;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eje X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link series.EjeX#getEjeXCategoria <em>Eje XCategoria</em>}</li>
 *   <li>{@link series.EjeX#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see series.SeriesPackage#getEjeX()
 * @model
 * @generated
 */
public interface EjeX extends EObject {
	/**
	 * Returns the value of the '<em><b>Eje XCategoria</b></em>' containment reference list.
	 * The list contents are of type {@link series.Categoria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eje XCategoria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eje XCategoria</em>' containment reference list.
	 * @see series.SeriesPackage#getEjeX_EjeXCategoria()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Categoria> getEjeXCategoria();

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
	 * @see series.SeriesPackage#getEjeX_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link series.EjeX#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EjeX
