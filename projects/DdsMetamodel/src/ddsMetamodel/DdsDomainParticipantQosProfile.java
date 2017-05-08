/**
 */
package ddsMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Domain Participant Qos Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDomainParticipantQosProfile#getUserDataQos <em>User Data Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDomainParticipantQosProfile#getEntityFactoryQos <em>Entity Factory Qos</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipantQosProfile()
 * @model
 * @generated
 */
public interface DdsDomainParticipantQosProfile extends DdsQosProfile {
	/**
	 * Returns the value of the '<em><b>User Data Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Data Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data Qos</em>' containment reference.
	 * @see #setUserDataQos(DdsUserDataQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipantQosProfile_UserDataQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsUserDataQos getUserDataQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDomainParticipantQosProfile#getUserDataQos <em>User Data Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data Qos</em>' containment reference.
	 * @see #getUserDataQos()
	 * @generated
	 */
	void setUserDataQos(DdsUserDataQos value);

	/**
	 * Returns the value of the '<em><b>Entity Factory Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Factory Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Factory Qos</em>' containment reference.
	 * @see #setEntityFactoryQos(DdsEntityFactoryQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDomainParticipantQosProfile_EntityFactoryQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsEntityFactoryQos getEntityFactoryQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDomainParticipantQosProfile#getEntityFactoryQos <em>Entity Factory Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Factory Qos</em>' containment reference.
	 * @see #getEntityFactoryQos()
	 * @generated
	 */
	void setEntityFactoryQos(DdsEntityFactoryQos value);

} // DdsDomainParticipantQosProfile
