/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sample State Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getSampleStateKind()
 * @model
 * @generated
 */
public enum SampleStateKind implements Enumerator {
	/**
	 * The '<em><b>READ SAMPLE STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_SAMPLE_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_SAMPLE_STATE(0, "READ_SAMPLE_STATE", "READ_SAMPLE_STATE"),

	/**
	 * The '<em><b>NOT READ SAMPLE STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_READ_SAMPLE_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_READ_SAMPLE_STATE(1, "NOT_READ_SAMPLE_STATE", "NOT_READ_SAMPLE_STATE"),

	/**
	 * The '<em><b>ANY READ SAMPLE STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_READ_SAMPLE_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_READ_SAMPLE_STATE(2, "ANY_READ_SAMPLE_STATE", "ANY_READ_SAMPLE_STATE");

	/**
	 * The '<em><b>READ SAMPLE STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ SAMPLE STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_SAMPLE_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_SAMPLE_STATE_VALUE = 0;

	/**
	 * The '<em><b>NOT READ SAMPLE STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT READ SAMPLE STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_READ_SAMPLE_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_READ_SAMPLE_STATE_VALUE = 1;

	/**
	 * The '<em><b>ANY READ SAMPLE STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY READ SAMPLE STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_READ_SAMPLE_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_READ_SAMPLE_STATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sample State Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SampleStateKind[] VALUES_ARRAY =
		new SampleStateKind[] {
			READ_SAMPLE_STATE,
			NOT_READ_SAMPLE_STATE,
			ANY_READ_SAMPLE_STATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Sample State Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SampleStateKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sample State Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SampleStateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SampleStateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sample State Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SampleStateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SampleStateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sample State Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SampleStateKind get(int value) {
		switch (value) {
			case READ_SAMPLE_STATE_VALUE: return READ_SAMPLE_STATE;
			case NOT_READ_SAMPLE_STATE_VALUE: return NOT_READ_SAMPLE_STATE;
			case ANY_READ_SAMPLE_STATE_VALUE: return ANY_READ_SAMPLE_STATE;
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
	private SampleStateKind(int value, String name, String literal) {
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
	
} //SampleStateKind
