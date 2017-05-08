/**
 */
package ddsMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Writer Qos Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getUserDataQos <em>User Data Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getDurabilityQos <em>Durability Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getDeadlineQos <em>Deadline Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getLatencyBudgetQos <em>Latency Budget Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getOwnershipQos <em>Ownership Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getOwnershipStrength <em>Ownership Strength</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getLivelinessQos <em>Liveliness Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getReliabilityQos <em>Reliability Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getTransportPriorityQos <em>Transport Priority Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getLifespanQos <em>Lifespan Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getDestinationOrderQos <em>Destination Order Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getHistoryQos <em>History Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getResourceLimitsQos <em>Resource Limits Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriterQosProfile#getDataWriterLifecycleQos <em>Data Writer Lifecycle Qos</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile()
 * @model
 * @generated
 */
public interface DdsDataWriterQosProfile extends DdsQosProfile {
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_UserDataQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsUserDataQos getUserDataQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getUserDataQos <em>User Data Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data Qos</em>' containment reference.
	 * @see #getUserDataQos()
	 * @generated
	 */
	void setUserDataQos(DdsUserDataQos value);

	/**
	 * Returns the value of the '<em><b>Durability Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durability Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durability Qos</em>' containment reference.
	 * @see #setDurabilityQos(DdsDurabilityQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_DurabilityQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsDurabilityQos getDurabilityQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getDurabilityQos <em>Durability Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durability Qos</em>' containment reference.
	 * @see #getDurabilityQos()
	 * @generated
	 */
	void setDurabilityQos(DdsDurabilityQos value);

	/**
	 * Returns the value of the '<em><b>Deadline Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline Qos</em>' containment reference.
	 * @see #setDeadlineQos(DdsDeadlineQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_DeadlineQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsDeadlineQos getDeadlineQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getDeadlineQos <em>Deadline Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline Qos</em>' containment reference.
	 * @see #getDeadlineQos()
	 * @generated
	 */
	void setDeadlineQos(DdsDeadlineQos value);

	/**
	 * Returns the value of the '<em><b>Latency Budget Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency Budget Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency Budget Qos</em>' containment reference.
	 * @see #setLatencyBudgetQos(DdsLatencyBudgetQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_LatencyBudgetQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsLatencyBudgetQos getLatencyBudgetQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getLatencyBudgetQos <em>Latency Budget Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Budget Qos</em>' containment reference.
	 * @see #getLatencyBudgetQos()
	 * @generated
	 */
	void setLatencyBudgetQos(DdsLatencyBudgetQos value);

	/**
	 * Returns the value of the '<em><b>Ownership Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownership Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownership Qos</em>' containment reference.
	 * @see #setOwnershipQos(DdsOwnershipQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_OwnershipQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsOwnershipQos getOwnershipQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getOwnershipQos <em>Ownership Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ownership Qos</em>' containment reference.
	 * @see #getOwnershipQos()
	 * @generated
	 */
	void setOwnershipQos(DdsOwnershipQos value);

	/**
	 * Returns the value of the '<em><b>Ownership Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownership Strength</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownership Strength</em>' containment reference.
	 * @see #setOwnershipStrength(DdsOwnershipStrengthQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_OwnershipStrength()
	 * @model containment="true"
	 * @generated
	 */
	DdsOwnershipStrengthQos getOwnershipStrength();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getOwnershipStrength <em>Ownership Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ownership Strength</em>' containment reference.
	 * @see #getOwnershipStrength()
	 * @generated
	 */
	void setOwnershipStrength(DdsOwnershipStrengthQos value);

	/**
	 * Returns the value of the '<em><b>Liveliness Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liveliness Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liveliness Qos</em>' containment reference.
	 * @see #setLivelinessQos(DdsLivelinessQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_LivelinessQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsLivelinessQos getLivelinessQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getLivelinessQos <em>Liveliness Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liveliness Qos</em>' containment reference.
	 * @see #getLivelinessQos()
	 * @generated
	 */
	void setLivelinessQos(DdsLivelinessQos value);

	/**
	 * Returns the value of the '<em><b>Reliability Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability Qos</em>' containment reference.
	 * @see #setReliabilityQos(DdsReliabilityQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_ReliabilityQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsReliabilityQos getReliabilityQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getReliabilityQos <em>Reliability Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability Qos</em>' containment reference.
	 * @see #getReliabilityQos()
	 * @generated
	 */
	void setReliabilityQos(DdsReliabilityQos value);

	/**
	 * Returns the value of the '<em><b>Transport Priority Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Priority Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Priority Qos</em>' containment reference.
	 * @see #setTransportPriorityQos(DdsTransportPriorityQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_TransportPriorityQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsTransportPriorityQos getTransportPriorityQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getTransportPriorityQos <em>Transport Priority Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Priority Qos</em>' containment reference.
	 * @see #getTransportPriorityQos()
	 * @generated
	 */
	void setTransportPriorityQos(DdsTransportPriorityQos value);

	/**
	 * Returns the value of the '<em><b>Lifespan Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifespan Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifespan Qos</em>' containment reference.
	 * @see #setLifespanQos(DdsLifespan)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_LifespanQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsLifespan getLifespanQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getLifespanQos <em>Lifespan Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifespan Qos</em>' containment reference.
	 * @see #getLifespanQos()
	 * @generated
	 */
	void setLifespanQos(DdsLifespan value);

	/**
	 * Returns the value of the '<em><b>Destination Order Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Order Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Order Qos</em>' containment reference.
	 * @see #setDestinationOrderQos(DdsDestinationOrderQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_DestinationOrderQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsDestinationOrderQos getDestinationOrderQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getDestinationOrderQos <em>Destination Order Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Order Qos</em>' containment reference.
	 * @see #getDestinationOrderQos()
	 * @generated
	 */
	void setDestinationOrderQos(DdsDestinationOrderQos value);

	/**
	 * Returns the value of the '<em><b>History Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Qos</em>' containment reference.
	 * @see #setHistoryQos(DdsHistoryQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_HistoryQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsHistoryQos getHistoryQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getHistoryQos <em>History Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Qos</em>' containment reference.
	 * @see #getHistoryQos()
	 * @generated
	 */
	void setHistoryQos(DdsHistoryQos value);

	/**
	 * Returns the value of the '<em><b>Resource Limits Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Limits Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Limits Qos</em>' containment reference.
	 * @see #setResourceLimitsQos(DdsResourceLimits)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_ResourceLimitsQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsResourceLimits getResourceLimitsQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getResourceLimitsQos <em>Resource Limits Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Limits Qos</em>' containment reference.
	 * @see #getResourceLimitsQos()
	 * @generated
	 */
	void setResourceLimitsQos(DdsResourceLimits value);

	/**
	 * Returns the value of the '<em><b>Data Writer Lifecycle Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Writer Lifecycle Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Writer Lifecycle Qos</em>' containment reference.
	 * @see #setDataWriterLifecycleQos(DdsDataWriterLifecycleQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriterQosProfile_DataWriterLifecycleQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsDataWriterLifecycleQos getDataWriterLifecycleQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriterQosProfile#getDataWriterLifecycleQos <em>Data Writer Lifecycle Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Writer Lifecycle Qos</em>' containment reference.
	 * @see #getDataWriterLifecycleQos()
	 * @generated
	 */
	void setDataWriterLifecycleQos(DdsDataWriterLifecycleQos value);

} // DdsDataWriterQosProfile
