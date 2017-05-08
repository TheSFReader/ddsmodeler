/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Reader Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getDataReaderStatus()
 * @model
 * @generated
 */
public enum DataReaderStatus implements Enumerator {
	/**
	 * The '<em><b>DATA AVAILABLE STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AVAILABLE_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_AVAILABLE_STATUS(0, "DATA_AVAILABLE_STATUS", "DATA_AVAILABLE_STATUS"),

	/**
	 * The '<em><b>LIVELINESS CHANGED STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVELINESS_CHANGED_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	LIVELINESS_CHANGED_STATUS(1, "LIVELINESS_CHANGED_STATUS", "LIVELINESS_CHANGED_STATUS"),

	/**
	 * The '<em><b>SAMPLE REJECTED STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_REJECTED_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLE_REJECTED_STATUS(2, "SAMPLE_REJECTED_STATUS", "SAMPLE_REJECTED_STATUS"),

	/**
	 * The '<em><b>REQUESTED DEADLINE MISSED STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_DEADLINE_MISSED_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTED_DEADLINE_MISSED_STATUS(3, "REQUESTED_DEADLINE_MISSED_STATUS", "REQUESTED_DEADLINE_MISSED_STATUS"),

	/**
	 * The '<em><b>REQUESTED INCOMPATIBLE QOS STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_INCOMPATIBLE_QOS_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTED_INCOMPATIBLE_QOS_STATUS(4, "REQUESTED_INCOMPATIBLE_QOS_STATUS", "REQUESTED_INCOMPATIBLE_QOS_STATUS"),

	/**
	 * The '<em><b>SAMPLE LOST STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_LOST_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLE_LOST_STATUS(5, "SAMPLE_LOST_STATUS", "SAMPLE_LOST_STATUS"),

	/**
	 * The '<em><b>SUBSCRIPTION MATCHED STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION_MATCHED_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION_MATCHED_STATUS(6, "SUBSCRIPTION_MATCHED_STATUS", "SUBSCRIPTION_MATCHED_STATUS");

	/**
	 * The '<em><b>DATA AVAILABLE STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA AVAILABLE STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_AVAILABLE_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_AVAILABLE_STATUS_VALUE = 0;

	/**
	 * The '<em><b>LIVELINESS CHANGED STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIVELINESS CHANGED STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIVELINESS_CHANGED_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIVELINESS_CHANGED_STATUS_VALUE = 1;

	/**
	 * The '<em><b>SAMPLE REJECTED STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAMPLE REJECTED STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_REJECTED_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLE_REJECTED_STATUS_VALUE = 2;

	/**
	 * The '<em><b>REQUESTED DEADLINE MISSED STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUESTED DEADLINE MISSED STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_DEADLINE_MISSED_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTED_DEADLINE_MISSED_STATUS_VALUE = 3;

	/**
	 * The '<em><b>REQUESTED INCOMPATIBLE QOS STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUESTED INCOMPATIBLE QOS STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_INCOMPATIBLE_QOS_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTED_INCOMPATIBLE_QOS_STATUS_VALUE = 4;

	/**
	 * The '<em><b>SAMPLE LOST STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAMPLE LOST STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_LOST_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLE_LOST_STATUS_VALUE = 5;

	/**
	 * The '<em><b>SUBSCRIPTION MATCHED STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBSCRIPTION MATCHED STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION_MATCHED_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_MATCHED_STATUS_VALUE = 6;

	/**
	 * An array of all the '<em><b>Data Reader Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataReaderStatus[] VALUES_ARRAY =
		new DataReaderStatus[] {
			DATA_AVAILABLE_STATUS,
			LIVELINESS_CHANGED_STATUS,
			SAMPLE_REJECTED_STATUS,
			REQUESTED_DEADLINE_MISSED_STATUS,
			REQUESTED_INCOMPATIBLE_QOS_STATUS,
			SAMPLE_LOST_STATUS,
			SUBSCRIPTION_MATCHED_STATUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Reader Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataReaderStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Reader Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataReaderStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataReaderStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Reader Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataReaderStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataReaderStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Reader Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataReaderStatus get(int value) {
		switch (value) {
			case DATA_AVAILABLE_STATUS_VALUE: return DATA_AVAILABLE_STATUS;
			case LIVELINESS_CHANGED_STATUS_VALUE: return LIVELINESS_CHANGED_STATUS;
			case SAMPLE_REJECTED_STATUS_VALUE: return SAMPLE_REJECTED_STATUS;
			case REQUESTED_DEADLINE_MISSED_STATUS_VALUE: return REQUESTED_DEADLINE_MISSED_STATUS;
			case REQUESTED_INCOMPATIBLE_QOS_STATUS_VALUE: return REQUESTED_INCOMPATIBLE_QOS_STATUS;
			case SAMPLE_LOST_STATUS_VALUE: return SAMPLE_LOST_STATUS;
			case SUBSCRIPTION_MATCHED_STATUS_VALUE: return SUBSCRIPTION_MATCHED_STATUS;
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
	private DataReaderStatus(int value, String name, String literal) {
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
	
} //DataReaderStatus
