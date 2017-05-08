/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Domain Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDomainParticipant#getDomainParticipantName <em>Domain Participant Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDomainParticipant#getDdssubscriber <em>Ddssubscriber</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDomainParticipant#getDdspublisher <em>Ddspublisher</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDomainParticipant#getDdsdomainparticipantqosprofile <em>Ddsdomainparticipantqosprofile</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDomainParticipant#getDomainParticipantListener <em>Domain Participant Listener</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDomainParticipant#getDomainId <em>Domain Id</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipant()
 * @model
 * @generated
 */
public interface DdsDomainParticipant extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Participant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Participant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Participant Name</em>' attribute.
	 * @see #setDomainParticipantName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipant_DomainParticipantName()
	 * @model
	 * @generated
	 */
	String getDomainParticipantName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDomainParticipant#getDomainParticipantName <em>Domain Participant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Participant Name</em>' attribute.
	 * @see #getDomainParticipantName()
	 * @generated
	 */
	void setDomainParticipantName(String value);

	/**
	 * Returns the value of the '<em><b>Ddssubscriber</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsSubscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ddssubscriber</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddssubscriber</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipant_Ddssubscriber()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsSubscriber> getDdssubscriber();

	/**
	 * Returns the value of the '<em><b>Ddspublisher</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsPublisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ddspublisher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddspublisher</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipant_Ddspublisher()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsPublisher> getDdspublisher();

	/**
	 * Returns the value of the '<em><b>Ddsdomainparticipantqosprofile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ddsdomainparticipantqosprofile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddsdomainparticipantqosprofile</em>' reference.
	 * @see #setDdsdomainparticipantqosprofile(DdsDomainParticipantQosProfile)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipant_Ddsdomainparticipantqosprofile()
	 * @model
	 * @generated
	 */
	DdsDomainParticipantQosProfile getDdsdomainparticipantqosprofile();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDomainParticipant#getDdsdomainparticipantqosprofile <em>Ddsdomainparticipantqosprofile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ddsdomainparticipantqosprofile</em>' reference.
	 * @see #getDdsdomainparticipantqosprofile()
	 * @generated
	 */
	void setDdsdomainparticipantqosprofile(DdsDomainParticipantQosProfile value);

	/**
	 * Returns the value of the '<em><b>Domain Participant Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Participant Listener</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Participant Listener</em>' containment reference.
	 * @see #setDomainParticipantListener(DdsDomainParticipantListener)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipant_DomainParticipantListener()
	 * @model containment="true"
	 * @generated
	 */
	DdsDomainParticipantListener getDomainParticipantListener();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDomainParticipant#getDomainParticipantListener <em>Domain Participant Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Participant Listener</em>' containment reference.
	 * @see #getDomainParticipantListener()
	 * @generated
	 */
	void setDomainParticipantListener(DdsDomainParticipantListener value);

	/**
	 * Returns the value of the '<em><b>Domain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Id</em>' attribute.
	 * @see #setDomainId(int)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipant_DomainId()
	 * @model
	 * @generated
	 */
	int getDomainId();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDomainParticipant#getDomainId <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Id</em>' attribute.
	 * @see #getDomainId()
	 * @generated
	 */
	void setDomainId(int value);

} // DdsDomainParticipant
