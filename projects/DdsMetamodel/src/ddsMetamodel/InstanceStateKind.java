/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instance State Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getInstanceStateKind()
 * @model
 * @generated
 */
public enum InstanceStateKind implements Enumerator {
	/**
	 * The '<em><b>ALIVE INSTANCE STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIVE_INSTANCE_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	ALIVE_INSTANCE_STATE(0, "ALIVE_INSTANCE_STATE", "ALIVE_INSTANCE_STATE"),

	/**
	 * The '<em><b>NOT ALIVE DISPOSED INSTANCE STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ALIVE_DISPOSED_INSTANCE_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ALIVE_DISPOSED_INSTANCE_STATE(1, "NOT_ALIVE_DISPOSED_INSTANCE_STATE", "NOT_ALIVE_DISPOSED_INSTANCE_STATE"),

	/**
	 * The '<em><b>NOT ALIVE NO WRITERS INSTANCE STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ALIVE_NO_WRITERS_INSTANCE_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ALIVE_NO_WRITERS_INSTANCE_STATE(2, "NOT_ALIVE_NO_WRITERS_INSTANCE_STATE", "NOT_ALIVE_NO_WRITERS_INSTANCE_STATE"), /**
	 * The '<em><b>ANY INSTANCE STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_INSTANCE_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_INSTANCE_STATE(3, "ANY_INSTANCE_STATE", "ANY_INSTANCE_STATE");

	/**
	 * The '<em><b>ALIVE INSTANCE STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALIVE INSTANCE STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALIVE_INSTANCE_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALIVE_INSTANCE_STATE_VALUE = 0;

	/**
	 * The '<em><b>NOT ALIVE DISPOSED INSTANCE STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT ALIVE DISPOSED INSTANCE STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_ALIVE_DISPOSED_INSTANCE_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ALIVE_DISPOSED_INSTANCE_STATE_VALUE = 1;

	/**
	 * The '<em><b>NOT ALIVE NO WRITERS INSTANCE STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT ALIVE NO WRITERS INSTANCE STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_ALIVE_NO_WRITERS_INSTANCE_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ALIVE_NO_WRITERS_INSTANCE_STATE_VALUE = 2;

	/**
	 * The '<em><b>ANY INSTANCE STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY INSTANCE STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_INSTANCE_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_INSTANCE_STATE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Instance State Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InstanceStateKind[] VALUES_ARRAY =
		new InstanceStateKind[] {
			ALIVE_INSTANCE_STATE,
			NOT_ALIVE_DISPOSED_INSTANCE_STATE,
			NOT_ALIVE_NO_WRITERS_INSTANCE_STATE,
			ANY_INSTANCE_STATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Instance State Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InstanceStateKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instance State Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceStateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceStateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance State Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceStateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceStateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance State Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceStateKind get(int value) {
		switch (value) {
			case ALIVE_INSTANCE_STATE_VALUE: return ALIVE_INSTANCE_STATE;
			case NOT_ALIVE_DISPOSED_INSTANCE_STATE_VALUE: return NOT_ALIVE_DISPOSED_INSTANCE_STATE;
			case NOT_ALIVE_NO_WRITERS_INSTANCE_STATE_VALUE: return NOT_ALIVE_NO_WRITERS_INSTANCE_STATE;
			case ANY_INSTANCE_STATE_VALUE: return ANY_INSTANCE_STATE;
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
	private InstanceStateKind(int value, String name, String literal) {
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
	
} //InstanceStateKind
