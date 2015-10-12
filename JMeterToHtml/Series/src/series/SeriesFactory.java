/**
 */
package series;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see series.SeriesPackage
 * @generated
 */
public interface SeriesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeriesFactory eINSTANCE = series.impl.SeriesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Grafica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grafica</em>'.
	 * @generated
	 */
	Grafica createGrafica();

	/**
	 * Returns a new object of class '<em>Dato</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dato</em>'.
	 * @generated
	 */
	Dato createDato();

	/**
	 * Returns a new object of class '<em>Serie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serie</em>'.
	 * @generated
	 */
	Serie createSerie();

	/**
	 * Returns a new object of class '<em>Categoria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categoria</em>'.
	 * @generated
	 */
	Categoria createCategoria();

	/**
	 * Returns a new object of class '<em>Eje X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eje X</em>'.
	 * @generated
	 */
	EjeX createEjeX();

	/**
	 * Returns a new object of class '<em>Eje Y</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eje Y</em>'.
	 * @generated
	 */
	EjeY createEjeY();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SeriesPackage getSeriesPackage();

} //SeriesFactory
