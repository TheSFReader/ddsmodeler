/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Liveliness Qos Policy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getLivelinessQosPolicyKind()
 * @model
 * @generated
 */
public enum LivelinessQosPolicyKind implements Enumerator {
	/**
	 * The '<em><b>AUTOMATIC LIVELINESS QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_LIVELINESS_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATIC_LIVELINESS_QOS(0, "AUTOMATIC_LIVELINESS_QOS", "AUTOMATIC_LIVELINESS_QOS"), /**
	 * The '<em><b>MANUAL LIVELINESS QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_LIVELINESS_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_LIVELINESS_QOS(1, "MANUAL_LIVELINESS_QOS", "MANUAL_LIVELINESS_QOS"), /**
	 * The '<em><b>MANUAL BY PARTICIPANT LIVELINESS QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_BY_PARTICIPANT_LIVELINESS_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_BY_PARTICIPANT_LIVELINESS_QOS(2, "MANUAL_BY_PARTICIPANT_LIVELINESS_QOS", "MANUAL_BY_PARTICIPANT_LIVELINESS_QOS"), /**
	 * The '<em><b>MANUAL BY TOPIC LIVELINESS QOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_BY_TOPIC_LIVELINESS_QOS_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_BY_TOPIC_LIVELINESS_QOS(3, "MANUAL_BY_TOPIC_LIVELINESS_QOS", "MANUAL_BY_TOPIC_LIVELINESS_QOS");

	/**
	 * The '<em><b>AUTOMATIC LIVELINESS QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTOMATIC LIVELINESS QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_LIVELINESS_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATIC_LIVELINESS_QOS_VALUE = 0;

	/**
	 * The '<em><b>MANUAL LIVELINESS QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANUAL LIVELINESS QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_LIVELINESS_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_LIVELINESS_QOS_VALUE = 1;

	/**
	 * The '<em><b>MANUAL BY PARTICIPANT LIVELINESS QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANUAL BY PARTICIPANT LIVELINESS QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_BY_PARTICIPANT_LIVELINESS_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_BY_PARTICIPANT_LIVELINESS_QOS_VALUE = 2;

	/**
	 * The '<em><b>MANUAL BY TOPIC LIVELINESS QOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANUAL BY TOPIC LIVELINESS QOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_BY_TOPIC_LIVELINESS_QOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_BY_TOPIC_LIVELINESS_QOS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Liveliness Qos Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LivelinessQosPolicyKind[] VALUES_ARRAY =
		new LivelinessQosPolicyKind[] {
			AUTOMATIC_LIVELINESS_QOS,
			MANUAL_LIVELINESS_QOS,
			MANUAL_BY_PARTICIPANT_LIVELINESS_QOS,
			MANUAL_BY_TOPIC_LIVELINESS_QOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Liveliness Qos Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LivelinessQosPolicyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Liveliness Qos Policy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LivelinessQosPolicyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LivelinessQosPolicyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Liveliness Qos Policy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LivelinessQosPolicyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LivelinessQosPolicyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Liveliness Qos Policy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LivelinessQosPolicyKind get(int value) {
		switch (value) {
			case AUTOMATIC_LIVELINESS_QOS_VALUE: return AUTOMATIC_LIVELINESS_QOS;
			case MANUAL_LIVELINESS_QOS_VALUE: return MANUAL_LIVELINESS_QOS;
			case MANUAL_BY_PARTICIPANT_LIVELINESS_QOS_VALUE: return MANUAL_BY_PARTICIPANT_LIVELINESS_QOS;
			case MANUAL_BY_TOPIC_LIVELINESS_QOS_VALUE: return MANUAL_BY_TOPIC_LIVELINESS_QOS;
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
	private LivelinessQosPolicyKind(int value, String name, String literal) {
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
	
} //LivelinessQosPolicyKind
