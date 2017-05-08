/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Durability Qos Policy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getDurabilityQosPolicyKind()
 * @model
 * @generated
 */
public enum DurabilityQosPolicyKind implements Enumerator {
	/**
	 * The '<em><b>VOLATILE DURABILITY QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLATILE_DURABILITY_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	VOLATILE_DURABILITY_QOS(0, "VOLATILE_DURABILITY_QOS", "VOLATILE_DURABILITY_QOS"), /**
	 * The '<em><b>TRANSIENT LOCAL DURABILITY QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSIENT_LOCAL_DURABILITY_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSIENT_LOCAL_DURABILITY_QOS(1, "TRANSIENT_LOCAL_DURABILITY_QOS", "TRANSIENT_LOCAL_DURABILITY_QOS"), /**
	 * The '<em><b>TRANSIENT DURABILITY QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSIENT_DURABILITY_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSIENT_DURABILITY_QOS(2, "TRANSIENT_DURABILITY_QOS", "TRANSIENT_DURABILITY_QOS"), /**
	 * The '<em><b>PERSISTENT DURABILITY QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTENT_DURABILITY_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	PERSISTENT_DURABILITY_QOS(3, "PERSISTENT_DURABILITY_QOS", "PERSISTENT_DURABILITY_QOS");

	/**
	 * The '<em><b>VOLATILE DURABILITY QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOLATILE DURABILITY QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLATILE_DURABILITY_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOLATILE_DURABILITY_QOS_VALUE = 0;

	/**
	 * The '<em><b>TRANSIENT LOCAL DURABILITY QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSIENT LOCAL DURABILITY QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSIENT_LOCAL_DURABILITY_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSIENT_LOCAL_DURABILITY_QOS_VALUE = 1;

	/**
	 * The '<em><b>TRANSIENT DURABILITY QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSIENT DURABILITY QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSIENT_DURABILITY_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSIENT_DURABILITY_QOS_VALUE = 2;

	/**
	 * The '<em><b>PERSISTENT DURABILITY QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERSISTENT DURABILITY QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSISTENT_DURABILITY_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERSISTENT_DURABILITY_QOS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Durability Qos Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DurabilityQosPolicyKind[] VALUES_ARRAY =
		new DurabilityQosPolicyKind[] {
			VOLATILE_DURABILITY_QOS,
			TRANSIENT_LOCAL_DURABILITY_QOS,
			TRANSIENT_DURABILITY_QOS,
			PERSISTENT_DURABILITY_QOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Durability Qos Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DurabilityQosPolicyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Durability Qos Policy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DurabilityQosPolicyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DurabilityQosPolicyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Durability Qos Policy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DurabilityQosPolicyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DurabilityQosPolicyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Durability Qos Policy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DurabilityQosPolicyKind get(int value) {
		switch (value) {
			case VOLATILE_DURABILITY_QOS_VALUE: return VOLATILE_DURABILITY_QOS;
			case TRANSIENT_LOCAL_DURABILITY_QOS_VALUE: return TRANSIENT_LOCAL_DURABILITY_QOS;
			case TRANSIENT_DURABILITY_QOS_VALUE: return TRANSIENT_DURABILITY_QOS;
			case PERSISTENT_DURABILITY_QOS_VALUE: return PERSISTENT_DURABILITY_QOS;
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
	private DurabilityQosPolicyKind(int value, String name, String literal) {
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
	
} //DurabilityQosPolicyKind
