/**
 */
package series;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see series.SeriesFactory
 * @model kind="package"
 * @generated
 */
public interface SeriesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "series";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/series";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "series";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeriesPackage eINSTANCE = series.impl.SeriesPackageImpl.init();

	/**
	 * The meta object id for the '{@link series.impl.GraficaImpl <em>Grafica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see series.impl.GraficaImpl
	 * @see series.impl.SeriesPackageImpl#getGrafica()
	 * @generated
	 */
	int GRAFICA = 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFICA__TITULO = 0;

	/**
	 * The feature id for the '<em><b>Subtitulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFICA__SUBTITULO = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFICA__TIPO = 2;

	/**
	 * The feature id for the '<em><b>Grafica Serie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFICA__GRAFICA_SERIE = 3;

	/**
	 * The feature id for the '<em><b>Grafica Eje X</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFICA__GRAFICA_EJE_X = 4;

	/**
	 * The feature id for the '<em><b>Grafica Eje Y</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFICA__GRAFICA_EJE_Y = 5;

	/**
	 * The number of structural features of the '<em>Grafica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFICA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Grafica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFICA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link series.impl.DatoImpl <em>Dato</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see series.impl.DatoImpl
	 * @see series.impl.SeriesPackageImpl#getDato()
	 * @generated
	 */
	int DATO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATO__NAME = 0;

	/**
	 * The number of structural features of the '<em>Dato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link series.impl.SerieImpl <em>Serie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see series.impl.SerieImpl
	 * @see series.impl.SeriesPackageImpl#getSerie()
	 * @generated
	 */
	int SERIE = 2;

	/**
	 * The feature id for the '<em><b>Serie Dato</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE__SERIE_DATO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Serie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Serie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link series.impl.CategoriaImpl <em>Categoria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see series.impl.CategoriaImpl
	 * @see series.impl.SeriesPackageImpl#getCategoria()
	 * @generated
	 */
	int CATEGORIA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link series.impl.EjeXImpl <em>Eje X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see series.impl.EjeXImpl
	 * @see series.impl.SeriesPackageImpl#getEjeX()
	 * @generated
	 */
	int EJE_X = 4;

	/**
	 * The feature id for the '<em><b>Eje XCategoria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJE_X__EJE_XCATEGORIA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJE_X__NAME = 1;

	/**
	 * The number of structural features of the '<em>Eje X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJE_X_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eje X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJE_X_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link series.impl.EjeYImpl <em>Eje Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see series.impl.EjeYImpl
	 * @see series.impl.SeriesPackageImpl#getEjeY()
	 * @generated
	 */
	int EJE_Y = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJE_Y__NAME = 0;

	/**
	 * The number of structural features of the '<em>Eje Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJE_Y_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Eje Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJE_Y_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link series.TipoGrafica <em>Tipo Grafica</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see series.TipoGrafica
	 * @see series.impl.SeriesPackageImpl#getTipoGrafica()
	 * @generated
	 */
	int TIPO_GRAFICA = 6;


	/**
	 * Returns the meta object for class '{@link series.Grafica <em>Grafica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grafica</em>'.
	 * @see series.Grafica
	 * @generated
	 */
	EClass getGrafica();

	/**
	 * Returns the meta object for the attribute '{@link series.Grafica#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see series.Grafica#getTitulo()
	 * @see #getGrafica()
	 * @generated
	 */
	EAttribute getGrafica_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link series.Grafica#getSubtitulo <em>Subtitulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitulo</em>'.
	 * @see series.Grafica#getSubtitulo()
	 * @see #getGrafica()
	 * @generated
	 */
	EAttribute getGrafica_Subtitulo();

	/**
	 * Returns the meta object for the attribute '{@link series.Grafica#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see series.Grafica#getTipo()
	 * @see #getGrafica()
	 * @generated
	 */
	EAttribute getGrafica_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link series.Grafica#getGraficaSerie <em>Grafica Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grafica Serie</em>'.
	 * @see series.Grafica#getGraficaSerie()
	 * @see #getGrafica()
	 * @generated
	 */
	EReference getGrafica_GraficaSerie();

	/**
	 * Returns the meta object for the containment reference list '{@link series.Grafica#getGraficaEjeX <em>Grafica Eje X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grafica Eje X</em>'.
	 * @see series.Grafica#getGraficaEjeX()
	 * @see #getGrafica()
	 * @generated
	 */
	EReference getGrafica_GraficaEjeX();

	/**
	 * Returns the meta object for the containment reference list '{@link series.Grafica#getGraficaEjeY <em>Grafica Eje Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grafica Eje Y</em>'.
	 * @see series.Grafica#getGraficaEjeY()
	 * @see #getGrafica()
	 * @generated
	 */
	EReference getGrafica_GraficaEjeY();

	/**
	 * Returns the meta object for class '{@link series.Dato <em>Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dato</em>'.
	 * @see series.Dato
	 * @generated
	 */
	EClass getDato();

	/**
	 * Returns the meta object for the attribute '{@link series.Dato#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see series.Dato#getName()
	 * @see #getDato()
	 * @generated
	 */
	EAttribute getDato_Name();

	/**
	 * Returns the meta object for class '{@link series.Serie <em>Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serie</em>'.
	 * @see series.Serie
	 * @generated
	 */
	EClass getSerie();

	/**
	 * Returns the meta object for the containment reference list '{@link series.Serie#getSerieDato <em>Serie Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serie Dato</em>'.
	 * @see series.Serie#getSerieDato()
	 * @see #getSerie()
	 * @generated
	 */
	EReference getSerie_SerieDato();

	/**
	 * Returns the meta object for the attribute '{@link series.Serie#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see series.Serie#getName()
	 * @see #getSerie()
	 * @generated
	 */
	EAttribute getSerie_Name();

	/**
	 * Returns the meta object for class '{@link series.Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categoria</em>'.
	 * @see series.Categoria
	 * @generated
	 */
	EClass getCategoria();

	/**
	 * Returns the meta object for the attribute '{@link series.Categoria#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see series.Categoria#getName()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_Name();

	/**
	 * Returns the meta object for class '{@link series.EjeX <em>Eje X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eje X</em>'.
	 * @see series.EjeX
	 * @generated
	 */
	EClass getEjeX();

	/**
	 * Returns the meta object for the containment reference list '{@link series.EjeX#getEjeXCategoria <em>Eje XCategoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eje XCategoria</em>'.
	 * @see series.EjeX#getEjeXCategoria()
	 * @see #getEjeX()
	 * @generated
	 */
	EReference getEjeX_EjeXCategoria();

	/**
	 * Returns the meta object for the attribute '{@link series.EjeX#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see series.EjeX#getName()
	 * @see #getEjeX()
	 * @generated
	 */
	EAttribute getEjeX_Name();

	/**
	 * Returns the meta object for class '{@link series.EjeY <em>Eje Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eje Y</em>'.
	 * @see series.EjeY
	 * @generated
	 */
	EClass getEjeY();

	/**
	 * Returns the meta object for the attribute '{@link series.EjeY#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see series.EjeY#getName()
	 * @see #getEjeY()
	 * @generated
	 */
	EAttribute getEjeY_Name();

	/**
	 * Returns the meta object for enum '{@link series.TipoGrafica <em>Tipo Grafica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Grafica</em>'.
	 * @see series.TipoGrafica
	 * @generated
	 */
	EEnum getTipoGrafica();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SeriesFactory getSeriesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link series.impl.GraficaImpl <em>Grafica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see series.impl.GraficaImpl
		 * @see series.impl.SeriesPackageImpl#getGrafica()
		 * @generated
		 */
		EClass GRAFICA = eINSTANCE.getGrafica();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFICA__TITULO = eINSTANCE.getGrafica_Titulo();

		/**
		 * The meta object literal for the '<em><b>Subtitulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFICA__SUBTITULO = eINSTANCE.getGrafica_Subtitulo();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFICA__TIPO = eINSTANCE.getGrafica_Tipo();

		/**
		 * The meta object literal for the '<em><b>Grafica Serie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFICA__GRAFICA_SERIE = eINSTANCE.getGrafica_GraficaSerie();

		/**
		 * The meta object literal for the '<em><b>Grafica Eje X</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFICA__GRAFICA_EJE_X = eINSTANCE.getGrafica_GraficaEjeX();

		/**
		 * The meta object literal for the '<em><b>Grafica Eje Y</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFICA__GRAFICA_EJE_Y = eINSTANCE.getGrafica_GraficaEjeY();

		/**
		 * The meta object literal for the '{@link series.impl.DatoImpl <em>Dato</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see series.impl.DatoImpl
		 * @see series.impl.SeriesPackageImpl#getDato()
		 * @generated
		 */
		EClass DATO = eINSTANCE.getDato();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATO__NAME = eINSTANCE.getDato_Name();

		/**
		 * The meta object literal for the '{@link series.impl.SerieImpl <em>Serie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see series.impl.SerieImpl
		 * @see series.impl.SeriesPackageImpl#getSerie()
		 * @generated
		 */
		EClass SERIE = eINSTANCE.getSerie();

		/**
		 * The meta object literal for the '<em><b>Serie Dato</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIE__SERIE_DATO = eINSTANCE.getSerie_SerieDato();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIE__NAME = eINSTANCE.getSerie_Name();

		/**
		 * The meta object literal for the '{@link series.impl.CategoriaImpl <em>Categoria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see series.impl.CategoriaImpl
		 * @see series.impl.SeriesPackageImpl#getCategoria()
		 * @generated
		 */
		EClass CATEGORIA = eINSTANCE.getCategoria();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__NAME = eINSTANCE.getCategoria_Name();

		/**
		 * The meta object literal for the '{@link series.impl.EjeXImpl <em>Eje X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see series.impl.EjeXImpl
		 * @see series.impl.SeriesPackageImpl#getEjeX()
		 * @generated
		 */
		EClass EJE_X = eINSTANCE.getEjeX();

		/**
		 * The meta object literal for the '<em><b>Eje XCategoria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJE_X__EJE_XCATEGORIA = eINSTANCE.getEjeX_EjeXCategoria();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJE_X__NAME = eINSTANCE.getEjeX_Name();

		/**
		 * The meta object literal for the '{@link series.impl.EjeYImpl <em>Eje Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see series.impl.EjeYImpl
		 * @see series.impl.SeriesPackageImpl#getEjeY()
		 * @generated
		 */
		EClass EJE_Y = eINSTANCE.getEjeY();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJE_Y__NAME = eINSTANCE.getEjeY_Name();

		/**
		 * The meta object literal for the '{@link series.TipoGrafica <em>Tipo Grafica</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see series.TipoGrafica
		 * @see series.impl.SeriesPackageImpl#getTipoGrafica()
		 * @generated
		 */
		EEnum TIPO_GRAFICA = eINSTANCE.getTipoGrafica();

	}

} //SeriesPackage
