/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reliability Qos Policy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getReliabilityQosPolicyKind()
 * @model
 * @generated
 */
public enum ReliabilityQosPolicyKind implements Enumerator {
	/**
	 * The '<em><b>RELIABLE RELIABILITY QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELIABLE_RELIABILITY_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	RELIABLE_RELIABILITY_QOS(0, "RELIABLE_RELIABILITY_QOS", "RELIABLE_RELIABILITY_QOS"), /**
	 * The '<em><b>BEST EFFORT RELIABILITY QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_EFFORT_RELIABILITY_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_EFFORT_RELIABILITY_QOS(1, "BEST_EFFORT_RELIABILITY_QOS", "BEST_EFFORT_RELIABILITY_QOS");

	/**
	 * The '<em><b>RELIABLE RELIABILITY QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELIABLE RELIABILITY QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELIABLE_RELIABILITY_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELIABLE_RELIABILITY_QOS_VALUE = 0;

	/**
	 * The '<em><b>BEST EFFORT RELIABILITY QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEST EFFORT RELIABILITY QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEST_EFFORT_RELIABILITY_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEST_EFFORT_RELIABILITY_QOS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Reliability Qos Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReliabilityQosPolicyKind[] VALUES_ARRAY =
		new ReliabilityQosPolicyKind[] {
			RELIABLE_RELIABILITY_QOS,
			BEST_EFFORT_RELIABILITY_QOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Reliability Qos Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReliabilityQosPolicyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reliability Qos Policy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReliabilityQosPolicyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReliabilityQosPolicyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reliability Qos Policy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReliabilityQosPolicyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReliabilityQosPolicyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reliability Qos Policy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReliabilityQosPolicyKind get(int value) {
		switch (value) {
			case RELIABLE_RELIABILITY_QOS_VALUE: return RELIABLE_RELIABILITY_QOS;
			case BEST_EFFORT_RELIABILITY_QOS_VALUE: return BEST_EFFORT_RELIABILITY_QOS;
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
	private ReliabilityQosPolicyKind(int value, String name, String literal) {
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
	
} //ReliabilityQosPolicyKind
