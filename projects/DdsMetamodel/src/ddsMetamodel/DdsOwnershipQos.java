/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Ownership Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsOwnershipQos#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsOwnershipQos()
 * @model
 * @generated
 */
public interface DdsOwnershipQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ddsMetamodel.OwnershipQosPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.OwnershipQosPolicyKind
	 * @see #setKind(OwnershipQosPolicyKind)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsOwnershipQos_Kind()
	 * @model
	 * @generated
	 */
	OwnershipQosPolicyKind getKind();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsOwnershipQos#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.OwnershipQosPolicyKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(OwnershipQosPolicyKind value);

} // DdsOwnershipQos
