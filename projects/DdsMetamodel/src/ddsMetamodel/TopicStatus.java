/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Topic Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getTopicStatus()
 * @model
 * @generated
 */
public enum TopicStatus implements Enumerator {
	/**
	 * The '<em><b>INCONSISTENT TOPIC STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENT_TOPIC_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	INCONSISTENT_TOPIC_STATUS(0, "INCONSISTENT_TOPIC_STATUS", "INCONSISTENT_TOPIC_STATUS");

	/**
	 * The '<em><b>INCONSISTENT TOPIC STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCONSISTENT TOPIC STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENT_TOPIC_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCONSISTENT_TOPIC_STATUS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Topic Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TopicStatus[] VALUES_ARRAY =
		new TopicStatus[] {
			INCONSISTENT_TOPIC_STATUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Topic Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TopicStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Topic Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TopicStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TopicStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Topic Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TopicStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TopicStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Topic Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TopicStatus get(int value) {
		switch (value) {
			case INCONSISTENT_TOPIC_STATUS_VALUE: return INCONSISTENT_TOPIC_STATUS;
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
	private TopicStatus(int value, String name, String literal) {
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
	
} //TopicStatus
