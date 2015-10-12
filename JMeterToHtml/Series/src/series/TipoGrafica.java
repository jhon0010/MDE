/**
 */
package series;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Grafica</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see series.SeriesPackage#getTipoGrafica()
 * @model
 * @generated
 */
public enum TipoGrafica implements Enumerator {
	/**
	 * The '<em><b>Stacked Column</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACKED_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	STACKED_COLUMN(0, "stackedColumn", "stackedColumn"),

	/**
	 * The '<em><b>Basic Column</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_COLUMN(0, "basicColumn", "basicColumn"),

	/**
	 * The '<em><b>Basic Bar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_BAR_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_BAR(0, "basicBar", "basicBar"),

	/**
	 * The '<em><b>Line Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_CHART(0, "lineChart", "lineChart");

	/**
	 * The '<em><b>Stacked Column</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stacked Column</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STACKED_COLUMN
	 * @model name="stackedColumn"
	 * @generated
	 * @ordered
	 */
	public static final int STACKED_COLUMN_VALUE = 0;

	/**
	 * The '<em><b>Basic Column</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basic Column</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIC_COLUMN
	 * @model name="basicColumn"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_COLUMN_VALUE = 0;

	/**
	 * The '<em><b>Basic Bar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basic Bar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIC_BAR
	 * @model name="basicBar"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_BAR_VALUE = 0;

	/**
	 * The '<em><b>Line Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line Chart</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_CHART
	 * @model name="lineChart"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_CHART_VALUE = 0;

	/**
	 * An array of all the '<em><b>Tipo Grafica</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoGrafica[] VALUES_ARRAY =
		new TipoGrafica[] {
			STACKED_COLUMN,
			BASIC_COLUMN,
			BASIC_BAR,
			LINE_CHART,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Grafica</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoGrafica> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Grafica</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoGrafica get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoGrafica result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Grafica</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoGrafica getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoGrafica result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Grafica</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoGrafica get(int value) {
		switch (value) {
			case STACKED_COLUMN_VALUE: return STACKED_COLUMN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoGrafica(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TipoGrafica
