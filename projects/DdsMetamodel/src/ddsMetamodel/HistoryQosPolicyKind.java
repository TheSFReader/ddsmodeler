/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>History Qos Policy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getHistoryQosPolicyKind()
 * @model
 * @generated
 */
public enum HistoryQosPolicyKind implements Enumerator {
	/**
	 * The '<em><b>KEEP LAST HISTORY QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_LAST_HISTORY_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP_LAST_HISTORY_QOS(0, "KEEP_LAST_HISTORY_QOS", "KEEP_LAST_HISTORY_QOS"),

	/**
	 * The '<em><b>KEEP ALL HISTORY QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_ALL_HISTORY_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP_ALL_HISTORY_QOS(1, "KEEP_ALL_HISTORY_QOS", "KEEP_ALL_HISTORY_QOS");

	/**
	 * The '<em><b>KEEP LAST HISTORY QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEEP LAST HISTORY QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEEP_LAST_HISTORY_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_LAST_HISTORY_QOS_VALUE = 0;

	/**
	 * The '<em><b>KEEP ALL HISTORY QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEEP ALL HISTORY QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEEP_ALL_HISTORY_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_ALL_HISTORY_QOS_VALUE = 1;

	/**
	 * An array of all the '<em><b>History Qos Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HistoryQosPolicyKind[] VALUES_ARRAY =
		new HistoryQosPolicyKind[] {
			KEEP_LAST_HISTORY_QOS,
			KEEP_ALL_HISTORY_QOS,
		};

	/**
	 * A public read-only list of all the '<em><b>History Qos Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HistoryQosPolicyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>History Qos Policy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HistoryQosPolicyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HistoryQosPolicyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>History Qos Policy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HistoryQosPolicyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HistoryQosPolicyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>History Qos Policy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HistoryQosPolicyKind get(int value) {
		switch (value) {
			case KEEP_LAST_HISTORY_QOS_VALUE: return KEEP_LAST_HISTORY_QOS;
			case KEEP_ALL_HISTORY_QOS_VALUE: return KEEP_ALL_HISTORY_QOS;
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
	private HistoryQosPolicyKind(int value, String name, String literal) {
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
	
} //HistoryQosPolicyKind
