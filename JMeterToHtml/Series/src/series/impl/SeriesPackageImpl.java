/**
 */
package series.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import series.Categoria;
import series.Dato;
import series.EjeX;
import series.EjeY;
import series.Grafica;
import series.Serie;
import series.SeriesFactory;
import series.SeriesPackage;
import series.TipoGrafica;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeriesPackageImpl extends EPackageImpl implements SeriesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graficaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejeXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejeYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoGraficaEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see series.SeriesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SeriesPackageImpl() {
		super(eNS_URI, SeriesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SeriesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SeriesPackage init() {
		if (isInited) return (SeriesPackage)EPackage.Registry.INSTANCE.getEPackage(SeriesPackage.eNS_URI);

		// Obtain or create and register package
		SeriesPackageImpl theSeriesPackage = (SeriesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SeriesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SeriesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSeriesPackage.createPackageContents();

		// Initialize created meta-data
		theSeriesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSeriesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SeriesPackage.eNS_URI, theSeriesPackage);
		return theSeriesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafica() {
		return graficaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafica_Titulo() {
		return (EAttribute)graficaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafica_Subtitulo() {
		return (EAttribute)graficaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrafica_Tipo() {
		return (EAttribute)graficaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafica_GraficaSerie() {
		return (EReference)graficaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafica_GraficaEjeX() {
		return (EReference)graficaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafica_GraficaEjeY() {
		return (EReference)graficaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDato() {
		return datoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDato_Name() {
		return (EAttribute)datoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerie() {
		return serieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerie_SerieDato() {
		return (EReference)serieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerie_Name() {
		return (EAttribute)serieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoria() {
		return categoriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoria_Name() {
		return (EAttribute)categoriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjeX() {
		return ejeXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjeX_EjeXCategoria() {
		return (EReference)ejeXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjeX_Name() {
		return (EAttribute)ejeXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjeY() {
		return ejeYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjeY_Name() {
		return (EAttribute)ejeYEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoGrafica() {
		return tipoGraficaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesFactory getSeriesFactory() {
		return (SeriesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		graficaEClass = createEClass(GRAFICA);
		createEAttribute(graficaEClass, GRAFICA__TITULO);
		createEAttribute(graficaEClass, GRAFICA__SUBTITULO);
		createEAttribute(graficaEClass, GRAFICA__TIPO);
		createEReference(graficaEClass, GRAFICA__GRAFICA_SERIE);
		createEReference(graficaEClass, GRAFICA__GRAFICA_EJE_X);
		createEReference(graficaEClass, GRAFICA__GRAFICA_EJE_Y);

		datoEClass = createEClass(DATO);
		createEAttribute(datoEClass, DATO__NAME);

		serieEClass = createEClass(SERIE);
		createEReference(serieEClass, SERIE__SERIE_DATO);
		createEAttribute(serieEClass, SERIE__NAME);

		categoriaEClass = createEClass(CATEGORIA);
		createEAttribute(categoriaEClass, CATEGORIA__NAME);

		ejeXEClass = createEClass(EJE_X);
		createEReference(ejeXEClass, EJE_X__EJE_XCATEGORIA);
		createEAttribute(ejeXEClass, EJE_X__NAME);

		ejeYEClass = createEClass(EJE_Y);
		createEAttribute(ejeYEClass, EJE_Y__NAME);

		// Create enums
		tipoGraficaEEnum = createEEnum(TIPO_GRAFICA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(graficaEClass, Grafica.class, "Grafica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrafica_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Grafica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafica_Subtitulo(), ecorePackage.getEString(), "subtitulo", null, 0, 1, Grafica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrafica_Tipo(), this.getTipoGrafica(), "tipo", null, 0, 1, Grafica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafica_GraficaSerie(), this.getSerie(), null, "graficaSerie", null, 0, -1, Grafica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafica_GraficaEjeX(), this.getEjeX(), null, "graficaEjeX", null, 0, -1, Grafica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafica_GraficaEjeY(), this.getEjeY(), null, "graficaEjeY", null, 0, -1, Grafica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datoEClass, Dato.class, "Dato", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDato_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serieEClass, Serie.class, "Serie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSerie_SerieDato(), this.getDato(), null, "serieDato", null, 0, -1, Serie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerie_Name(), ecorePackage.getEString(), "name", null, 0, 1, Serie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoriaEClass, Categoria.class, "Categoria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoria_Name(), ecorePackage.getEString(), "name", null, 0, 1, Categoria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejeXEClass, EjeX.class, "EjeX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEjeX_EjeXCategoria(), this.getCategoria(), null, "ejeXCategoria", null, 1, -1, EjeX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEjeX_Name(), ecorePackage.getEString(), "name", null, 0, 1, EjeX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejeYEClass, EjeY.class, "EjeY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEjeY_Name(), ecorePackage.getEString(), "name", null, 0, 1, EjeY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoGraficaEEnum, TipoGrafica.class, "TipoGrafica");
		addEEnumLiteral(tipoGraficaEEnum, TipoGrafica.STACKED_COLUMN);
		addEEnumLiteral(tipoGraficaEEnum, TipoGrafica.BASIC_COLUMN);
		addEEnumLiteral(tipoGraficaEEnum, TipoGrafica.BASIC_BAR);
		addEEnumLiteral(tipoGraficaEEnum, TipoGrafica.LINE_CHART);

		// Create resource
		createResource(eNS_URI);
	}

} //SeriesPackageImpl
