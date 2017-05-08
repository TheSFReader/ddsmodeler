/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Liveliness Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsLivelinessQos#getKind <em>Kind</em>}</li>
 *   <li>{@link ddsMetamodel.DdsLivelinessQos#getLease_duration <em>Lease duration</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsLivelinessQos()
 * @model
 * @generated
 */
public interface DdsLivelinessQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ddsMetamodel.LivelinessQosPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.LivelinessQosPolicyKind
	 * @see #setKind(LivelinessQosPolicyKind)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsLivelinessQos_Kind()
	 * @model
	 * @generated
	 */
	LivelinessQosPolicyKind getKind();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsLivelinessQos#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ddsMetamodel.LivelinessQosPolicyKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(LivelinessQosPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Lease duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lease duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lease duration</em>' containment reference.
	 * @see #setLease_duration(DdsDuration)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsLivelinessQos_Lease_duration()
	 * @model containment="true"
	 * @generated
	 */
	DdsDuration getLease_duration();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsLivelinessQos#getLease_duration <em>Lease duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lease duration</em>' containment reference.
	 * @see #getLease_duration()
	 * @generated
	 */
	void setLease_duration(DdsDuration value);

} // DdsLivelinessQos
