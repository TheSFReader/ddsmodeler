/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Presentation Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsPresentationQos#getAccess_scope <em>Access scope</em>}</li>
 *   <li>{@link ddsMetamodel.DdsPresentationQos#isCoherent_access <em>Coherent access</em>}</li>
 *   <li>{@link ddsMetamodel.DdsPresentationQos#isOrdered_access <em>Ordered access</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPresentationQos()
 * @model
 * @generated
 */
public interface DdsPresentationQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Access scope</b></em>' attribute.
	 * The literals are from the enumeration {@link ddsMetamodel.PresentationQosPolicyAccessScopeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access scope</em>' attribute.
	 * @see ddsMetamodel.PresentationQosPolicyAccessScopeKind
	 * @see #setAccess_scope(PresentationQosPolicyAccessScopeKind)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPresentationQos_Access_scope()
	 * @model
	 * @generated
	 */
	PresentationQosPolicyAccessScopeKind getAccess_scope();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPresentationQos#getAccess_scope <em>Access scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access scope</em>' attribute.
	 * @see ddsMetamodel.PresentationQosPolicyAccessScopeKind
	 * @see #getAccess_scope()
	 * @generated
	 */
	void setAccess_scope(PresentationQosPolicyAccessScopeKind value);

	/**
	 * Returns the value of the '<em><b>Coherent access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coherent access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coherent access</em>' attribute.
	 * @see #setCoherent_access(boolean)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPresentationQos_Coherent_access()
	 * @model
	 * @generated
	 */
	boolean isCoherent_access();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPresentationQos#isCoherent_access <em>Coherent access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coherent access</em>' attribute.
	 * @see #isCoherent_access()
	 * @generated
	 */
	void setCoherent_access(boolean value);

	/**
	 * Returns the value of the '<em><b>Ordered access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered access</em>' attribute.
	 * @see #setOrdered_access(boolean)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPresentationQos_Ordered_access()
	 * @model
	 * @generated
	 */
	boolean isOrdered_access();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPresentationQos#isOrdered_access <em>Ordered access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered access</em>' attribute.
	 * @see #isOrdered_access()
	 * @generated
	 */
	void setOrdered_access(boolean value);

} // DdsPresentationQos
