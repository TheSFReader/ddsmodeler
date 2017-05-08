/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Invalid Sample Visibility Qos Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getInvalidSampleVisibilityQosPolicy()
 * @model
 * @generated
 */
public enum InvalidSampleVisibilityQosPolicy implements Enumerator {
	/**
	 * The '<em><b>NO INVALID SAMPLES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_INVALID_SAMPLES_VALUE
	 * @generated
	 * @ordered
	 */
	NO_INVALID_SAMPLES(0, "NO_INVALID_SAMPLES", "NO_INVALID_SAMPLES"),

	/**
	 * The '<em><b>MINIMUM INVALID SAMPLES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMUM_INVALID_SAMPLES_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMUM_INVALID_SAMPLES(1, "MINIMUM_INVALID_SAMPLES", "MINIMUM_INVALID_SAMPLES"),

	/**
	 * The '<em><b>ALL INVALID SAMPLES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_INVALID_SAMPLES_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_INVALID_SAMPLES(2, "ALL_INVALID_SAMPLES", "ALL_INVALID_SAMPLES");

	/**
	 * The '<em><b>NO INVALID SAMPLES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO INVALID SAMPLES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_INVALID_SAMPLES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_INVALID_SAMPLES_VALUE = 0;

	/**
	 * The '<em><b>MINIMUM INVALID SAMPLES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINIMUM INVALID SAMPLES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINIMUM_INVALID_SAMPLES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINIMUM_INVALID_SAMPLES_VALUE = 1;

	/**
	 * The '<em><b>ALL INVALID SAMPLES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALL INVALID SAMPLES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_INVALID_SAMPLES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_INVALID_SAMPLES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Invalid Sample Visibility Qos Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InvalidSampleVisibilityQosPolicy[] VALUES_ARRAY =
		new InvalidSampleVisibilityQosPolicy[] {
			NO_INVALID_SAMPLES,
			MINIMUM_INVALID_SAMPLES,
			ALL_INVALID_SAMPLES,
		};

	/**
	 * A public read-only list of all the '<em><b>Invalid Sample Visibility Qos Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InvalidSampleVisibilityQosPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Invalid Sample Visibility Qos Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InvalidSampleVisibilityQosPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InvalidSampleVisibilityQosPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Invalid Sample Visibility Qos Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InvalidSampleVisibilityQosPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InvalidSampleVisibilityQosPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Invalid Sample Visibility Qos Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InvalidSampleVisibilityQosPolicy get(int value) {
		switch (value) {
			case NO_INVALID_SAMPLES_VALUE: return NO_INVALID_SAMPLES;
			case MINIMUM_INVALID_SAMPLES_VALUE: return MINIMUM_INVALID_SAMPLES;
			case ALL_INVALID_SAMPLES_VALUE: return ALL_INVALID_SAMPLES;
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
	private InvalidSampleVisibilityQosPolicy(int value, String name, String literal) {
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
	
} //InvalidSampleVisibilityQosPolicy
