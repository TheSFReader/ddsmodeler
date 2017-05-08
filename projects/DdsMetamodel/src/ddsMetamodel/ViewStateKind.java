/**
 */
package ddsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>View State Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ddsMetamodel.DdsMetamodelPackage#getViewStateKind()
 * @model
 * @generated
 */
public enum ViewStateKind implements Enumerator {
	/**
	 * The '<em><b>NEW VIEW STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_VIEW_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_VIEW_STATE(0, "NEW_VIEW_STATE", "NEW_VIEW_STATE"),

	/**
	 * The '<em><b>NOT NEW VIEW STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_NEW_VIEW_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_NEW_VIEW_STATE(1, "NOT_NEW_VIEW_STATE", "NOT_NEW_VIEW_STATE"),

	/**
	 * The '<em><b>ANY VIEW STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VIEW_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_VIEW_STATE(2, "ANY_VIEW_STATE", "ANY_VIEW_STATE");

	/**
	 * The '<em><b>NEW VIEW STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEW VIEW STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW_VIEW_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEW_VIEW_STATE_VALUE = 0;

	/**
	 * The '<em><b>NOT NEW VIEW STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT NEW VIEW STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_NEW_VIEW_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_NEW_VIEW_STATE_VALUE = 1;

	/**
	 * The '<em><b>ANY VIEW STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY VIEW STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_VIEW_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VIEW_STATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>View State Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ViewStateKind[] VALUES_ARRAY =
		new ViewStateKind[] {
			NEW_VIEW_STATE,
			NOT_NEW_VIEW_STATE,
			ANY_VIEW_STATE,
		};

	/**
	 * A public read-only list of all the '<em><b>View State Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ViewStateKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>View State Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ViewStateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViewStateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>View State Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ViewStateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViewStateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>View State Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ViewStateKind get(int value) {
		switch (value) {
			case NEW_VIEW_STATE_VALUE: return NEW_VIEW_STATE;
			case NOT_NEW_VIEW_STATE_VALUE: return NOT_NEW_VIEW_STATE;
			case ANY_VIEW_STATE_VALUE: return ANY_VIEW_STATE;
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
	private ViewStateKind(int value, String name, String literal) {
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
	
} //ViewStateKind
