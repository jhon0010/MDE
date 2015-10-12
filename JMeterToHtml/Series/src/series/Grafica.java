/**
 */
package series;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grafica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link series.Grafica#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link series.Grafica#getSubtitulo <em>Subtitulo</em>}</li>
 *   <li>{@link series.Grafica#getTipo <em>Tipo</em>}</li>
 *   <li>{@link series.Grafica#getGraficaSerie <em>Grafica Serie</em>}</li>
 *   <li>{@link series.Grafica#getGraficaEjeX <em>Grafica Eje X</em>}</li>
 *   <li>{@link series.Grafica#getGraficaEjeY <em>Grafica Eje Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see series.SeriesPackage#getGrafica()
 * @model
 * @generated
 */
public interface Grafica extends EObject {
	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see series.SeriesPackage#getGrafica_Titulo()
	 * @model
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link series.Grafica#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Subtitulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitulo</em>' attribute.
	 * @see #setSubtitulo(String)
	 * @see series.SeriesPackage#getGrafica_Subtitulo()
	 * @model
	 * @generated
	 */
	String getSubtitulo();

	/**
	 * Sets the value of the '{@link series.Grafica#getSubtitulo <em>Subtitulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitulo</em>' attribute.
	 * @see #getSubtitulo()
	 * @generated
	 */
	void setSubtitulo(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link series.TipoGrafica}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see series.TipoGrafica
	 * @see #setTipo(TipoGrafica)
	 * @see series.SeriesPackage#getGrafica_Tipo()
	 * @model
	 * @generated
	 */
	TipoGrafica getTipo();

	/**
	 * Sets the value of the '{@link series.Grafica#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see series.TipoGrafica
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoGrafica value);

	/**
	 * Returns the value of the '<em><b>Grafica Serie</b></em>' containment reference list.
	 * The list contents are of type {@link series.Serie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grafica Serie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafica Serie</em>' containment reference list.
	 * @see series.SeriesPackage#getGrafica_GraficaSerie()
	 * @model containment="true"
	 * @generated
	 */
	EList<Serie> getGraficaSerie();

	/**
	 * Returns the value of the '<em><b>Grafica Eje X</b></em>' containment reference list.
	 * The list contents are of type {@link series.EjeX}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grafica Eje X</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafica Eje X</em>' containment reference list.
	 * @see series.SeriesPackage#getGrafica_GraficaEjeX()
	 * @model containment="true"
	 * @generated
	 */
	EList<EjeX> getGraficaEjeX();

	/**
	 * Returns the value of the '<em><b>Grafica Eje Y</b></em>' containment reference list.
	 * The list contents are of type {@link series.EjeY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grafica Eje Y</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafica Eje Y</em>' containment reference list.
	 * @see series.SeriesPackage#getGrafica_GraficaEjeY()
	 * @model containment="true"
	 * @generated
	 */
	EList<EjeY> getGraficaEjeY();

} // Grafica
