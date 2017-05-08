/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Durability Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDurabilityQos#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDurabilityQos()
 * @model
 * @generated
 */
public interface DdsDurabilityQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ddsMetamodel.DurabilityQosPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.DurabilityQosPolicyKind
	 * @see #setKind(DurabilityQosPolicyKind)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDurabilityQos_Kind()
	 * @model
	 * @generated
	 */
	DurabilityQosPolicyKind getKind();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDurabilityQos#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.DurabilityQosPolicyKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DurabilityQosPolicyKind value);

} // DdsDurabilityQos
