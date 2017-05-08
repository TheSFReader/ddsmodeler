/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Publisher Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getPublisherStatus()
 * @model
 * @generated
 */
public enum PublisherStatus implements Enumerator {
	/**
	 * The '<em><b>LIVELINESS LOST STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVELINESS_LOST_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	LIVELINESS_LOST_STATUS(0, "LIVELINESS_LOST_STATUS", "LIVELINESS_LOST_STATUS"),

	/**
	 * The '<em><b>OFFERED DEADLINE MISSED STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFERED_DEADLINE_MISSED_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	OFFERED_DEADLINE_MISSED_STATUS(1, "OFFERED_DEADLINE_MISSED_STATUS", "OFFERED_DEADLINE_MISSED_STATUS"), /**
	 * The '<em><b>OFFERED INCOMPATIBLE QOS STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFERED_INCOMPATIBLE_QOS_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	OFFERED_INCOMPATIBLE_QOS_STATUS(2, "OFFERED_INCOMPATIBLE_QOS_STATUS", "OFFERED_INCOMPATIBLE_QOS_STATUS"),

	/**
	 * The '<em><b>PUBLICATION MATCHED STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLICATION_MATCHED_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLICATION_MATCHED_STATUS(3, "PUBLICATION_MATCHED_STATUS", "PUBLICATION_MATCHED_STATUS");

	/**
	 * The '<em><b>LIVELINESS LOST STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIVELINESS LOST STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIVELINESS_LOST_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIVELINESS_LOST_STATUS_VALUE = 0;

	/**
	 * The '<em><b>OFFERED DEADLINE MISSED STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OFFERED DEADLINE MISSED STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFFERED_DEADLINE_MISSED_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFFERED_DEADLINE_MISSED_STATUS_VALUE = 1;

	/**
	 * The '<em><b>OFFERED INCOMPATIBLE QOS STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OFFERED INCOMPATIBLE QOS STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFFERED_INCOMPATIBLE_QOS_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFFERED_INCOMPATIBLE_QOS_STATUS_VALUE = 2;

	/**
	 * The '<em><b>PUBLICATION MATCHED STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PUBLICATION MATCHED STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLICATION_MATCHED_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLICATION_MATCHED_STATUS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Publisher Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PublisherStatus[] VALUES_ARRAY =
		new PublisherStatus[] {
			LIVELINESS_LOST_STATUS,
			OFFERED_DEADLINE_MISSED_STATUS,
			OFFERED_INCOMPATIBLE_QOS_STATUS,
			PUBLICATION_MATCHED_STATUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Publisher Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PublisherStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Publisher Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublisherStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PublisherStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Publisher Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublisherStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PublisherStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Publisher Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublisherStatus get(int value) {
		switch (value) {
			case LIVELINESS_LOST_STATUS_VALUE: return LIVELINESS_LOST_STATUS;
			case OFFERED_DEADLINE_MISSED_STATUS_VALUE: return OFFERED_DEADLINE_MISSED_STATUS;
			case OFFERED_INCOMPATIBLE_QOS_STATUS_VALUE: return OFFERED_INCOMPATIBLE_QOS_STATUS;
			case PUBLICATION_MATCHED_STATUS_VALUE: return PUBLICATION_MATCHED_STATUS;
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
	private PublisherStatus(int value, String name, String literal) {
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
	
} //PublisherStatus
