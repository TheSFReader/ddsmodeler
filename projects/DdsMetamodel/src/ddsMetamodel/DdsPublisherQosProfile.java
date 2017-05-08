/**
 */
package ddsMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Publisher Qos Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsPublisherQosProfile#getGroupDataQos <em>Group Data Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsPublisherQosProfile#getEntityFactoryQos <em>Entity Factory Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsPublisherQosProfile#getPresentationQos <em>Presentation Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsPublisherQosProfile#getPartitionQos <em>Partition Qos</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherQosProfile()
 * @model
 * @generated
 */
public interface DdsPublisherQosProfile extends DdsQosProfile {
	/**
	 * Returns the value of the '<em><b>Group Data Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Data Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Data Qos</em>' containment reference.
	 * @see #setGroupDataQos(DdsGroupDataQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherQosProfile_GroupDataQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsGroupDataQos getGroupDataQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPublisherQosProfile#getGroupDataQos <em>Group Data Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Data Qos</em>' containment reference.
	 * @see #getGroupDataQos()
	 * @generated
	 */
	void setGroupDataQos(DdsGroupDataQos value);

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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherQosProfile_EntityFactoryQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsEntityFactoryQos getEntityFactoryQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPublisherQosProfile#getEntityFactoryQos <em>Entity Factory Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Factory Qos</em>' containment reference.
	 * @see #getEntityFactoryQos()
	 * @generated
	 */
	void setEntityFactoryQos(DdsEntityFactoryQos value);

	/**
	 * Returns the value of the '<em><b>Presentation Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Qos</em>' containment reference.
	 * @see #setPresentationQos(DdsPresentationQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherQosProfile_PresentationQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsPresentationQos getPresentationQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPublisherQosProfile#getPresentationQos <em>Presentation Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Qos</em>' containment reference.
	 * @see #getPresentationQos()
	 * @generated
	 */
	void setPresentationQos(DdsPresentationQos value);

	/**
	 * Returns the value of the '<em><b>Partition Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Qos</em>' containment reference.
	 * @see #setPartitionQos(DdsPartitionQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsPublisherQosProfile_PartitionQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsPartitionQos getPartitionQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsPublisherQosProfile#getPartitionQos <em>Partition Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Qos</em>' containment reference.
	 * @see #getPartitionQos()
	 * @generated
	 */
	void setPartitionQos(DdsPartitionQos value);

} // DdsPublisherQosProfile
