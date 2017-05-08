/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Destination Order Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDestinationOrderQos#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDestinationOrderQos()
 * @model
 * @generated
 */
public interface DdsDestinationOrderQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ddsMetamodel.DestinationOrderQosPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.DestinationOrderQosPolicyKind
	 * @see #setKind(DestinationOrderQosPolicyKind)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDestinationOrderQos_Kind()
	 * @model
	 * @generated
	 */
	DestinationOrderQosPolicyKind getKind();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDestinationOrderQos#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.DestinationOrderQosPolicyKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DestinationOrderQosPolicyKind value);

} // DdsDestinationOrderQos
