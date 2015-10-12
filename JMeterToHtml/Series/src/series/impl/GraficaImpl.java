/**
 */
package series.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import series.EjeX;
import series.EjeY;
import series.Grafica;
import series.Serie;
import series.SeriesPackage;
import series.TipoGrafica;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grafica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link series.impl.GraficaImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link series.impl.GraficaImpl#getSubtitulo <em>Subtitulo</em>}</li>
 *   <li>{@link series.impl.GraficaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link series.impl.GraficaImpl#getGraficaSerie <em>Grafica Serie</em>}</li>
 *   <li>{@link series.impl.GraficaImpl#getGraficaEjeX <em>Grafica Eje X</em>}</li>
 *   <li>{@link series.impl.GraficaImpl#getGraficaEjeY <em>Grafica Eje Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraficaImpl extends MinimalEObjectImpl.Container implements Grafica {
	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtitulo() <em>Subtitulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtitulo() <em>Subtitulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitulo()
	 * @generated
	 * @ordered
	 */
	protected String subtitulo = SUBTITULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoGrafica TIPO_EDEFAULT = TipoGrafica.STACKED_COLUMN;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoGrafica tipo = TIPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGraficaSerie() <em>Grafica Serie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraficaSerie()
	 * @generated
	 * @ordered
	 */
	protected EList<Serie> graficaSerie;

	/**
	 * The cached value of the '{@link #getGraficaEjeX() <em>Grafica Eje X</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraficaEjeX()
	 * @generated
	 * @ordered
	 */
	protected EList<EjeX> graficaEjeX;

	/**
	 * The cached value of the '{@link #getGraficaEjeY() <em>Grafica Eje Y</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraficaEjeY()
	 * @generated
	 * @ordered
	 */
	protected EList<EjeY> graficaEjeY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraficaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeriesPackage.Literals.GRAFICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeriesPackage.GRAFICA__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtitulo() {
		return subtitulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitulo(String newSubtitulo) {
		String oldSubtitulo = subtitulo;
		subtitulo = newSubtitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeriesPackage.GRAFICA__SUBTITULO, oldSubtitulo, subtitulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoGrafica getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoGrafica newTipo) {
		TipoGrafica oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeriesPackage.GRAFICA__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Serie> getGraficaSerie() {
		if (graficaSerie == null) {
			graficaSerie = new EObjectContainmentEList<Serie>(Serie.class, this, SeriesPackage.GRAFICA__GRAFICA_SERIE);
		}
		return graficaSerie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjeX> getGraficaEjeX() {
		if (graficaEjeX == null) {
			graficaEjeX = new EObjectContainmentEList<EjeX>(EjeX.class, this, SeriesPackage.GRAFICA__GRAFICA_EJE_X);
		}
		return graficaEjeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjeY> getGraficaEjeY() {
		if (graficaEjeY == null) {
			graficaEjeY = new EObjectContainmentEList<EjeY>(EjeY.class, this, SeriesPackage.GRAFICA__GRAFICA_EJE_Y);
		}
		return graficaEjeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeriesPackage.GRAFICA__GRAFICA_SERIE:
				return ((InternalEList<?>)getGraficaSerie()).basicRemove(otherEnd, msgs);
			case SeriesPackage.GRAFICA__GRAFICA_EJE_X:
				return ((InternalEList<?>)getGraficaEjeX()).basicRemove(otherEnd, msgs);
			case SeriesPackage.GRAFICA__GRAFICA_EJE_Y:
				return ((InternalEList<?>)getGraficaEjeY()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SeriesPackage.GRAFICA__TITULO:
				return getTitulo();
			case SeriesPackage.GRAFICA__SUBTITULO:
				return getSubtitulo();
			case SeriesPackage.GRAFICA__TIPO:
				return getTipo();
			case SeriesPackage.GRAFICA__GRAFICA_SERIE:
				return getGraficaSerie();
			case SeriesPackage.GRAFICA__GRAFICA_EJE_X:
				return getGraficaEjeX();
			case SeriesPackage.GRAFICA__GRAFICA_EJE_Y:
				return getGraficaEjeY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SeriesPackage.GRAFICA__TITULO:
				setTitulo((String)newValue);
				return;
			case SeriesPackage.GRAFICA__SUBTITULO:
				setSubtitulo((String)newValue);
				return;
			case SeriesPackage.GRAFICA__TIPO:
				setTipo((TipoGrafica)newValue);
				return;
			case SeriesPackage.GRAFICA__GRAFICA_SERIE:
				getGraficaSerie().clear();
				getGraficaSerie().addAll((Collection<? extends Serie>)newValue);
				return;
			case SeriesPackage.GRAFICA__GRAFICA_EJE_X:
				getGraficaEjeX().clear();
				getGraficaEjeX().addAll((Collection<? extends EjeX>)newValue);
				return;
			case SeriesPackage.GRAFICA__GRAFICA_EJE_Y:
				getGraficaEjeY().clear();
				getGraficaEjeY().addAll((Collection<? extends EjeY>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SeriesPackage.GRAFICA__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case SeriesPackage.GRAFICA__SUBTITULO:
				setSubtitulo(SUBTITULO_EDEFAULT);
				return;
			case SeriesPackage.GRAFICA__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case SeriesPackage.GRAFICA__GRAFICA_SERIE:
				getGraficaSerie().clear();
				return;
			case SeriesPackage.GRAFICA__GRAFICA_EJE_X:
				getGraficaEjeX().clear();
				return;
			case SeriesPackage.GRAFICA__GRAFICA_EJE_Y:
				getGraficaEjeY().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SeriesPackage.GRAFICA__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case SeriesPackage.GRAFICA__SUBTITULO:
				return SUBTITULO_EDEFAULT == null ? subtitulo != null : !SUBTITULO_EDEFAULT.equals(subtitulo);
			case SeriesPackage.GRAFICA__TIPO:
				return tipo != TIPO_EDEFAULT;
			case SeriesPackage.GRAFICA__GRAFICA_SERIE:
				return graficaSerie != null && !graficaSerie.isEmpty();
			case SeriesPackage.GRAFICA__GRAFICA_EJE_X:
				return graficaEjeX != null && !graficaEjeX.isEmpty();
			case SeriesPackage.GRAFICA__GRAFICA_EJE_Y:
				return graficaEjeY != null && !graficaEjeY.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (titulo: ");
		result.append(titulo);
		result.append(", subtitulo: ");
		result.append(subtitulo);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //GraficaImpl
