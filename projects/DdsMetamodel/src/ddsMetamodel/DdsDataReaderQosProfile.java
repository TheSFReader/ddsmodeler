/**
 */
package ddsMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Reader Qos Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getUserDataQos <em>User Data Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getDurabilityQos <em>Durability Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getDeadlineQos <em>Deadline Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getLatencyBudgetQos <em>Latency Budget Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getLivelinessQos <em>Liveliness Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getOwnershipQos <em>Ownership Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getTimeBasedFilterQos <em>Time Based Filter Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getReliabilityQos <em>Reliability Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getDestinationOrderQos <em>Destination Order Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getHistoryQos <em>History Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getResourceLimitsQos <em>Resource Limits Qos</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReaderQosProfile#getDataReaderLifecycleQos <em>Data Reader Lifecycle Qos</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile()
 * @model
 * @generated
 */
public interface DdsDataReaderQosProfile extends DdsQosProfile {
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_UserDataQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsUserDataQos getUserDataQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getUserDataQos <em>User Data Qos</em>}' containment reference.
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_DurabilityQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsDurabilityQos getDurabilityQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getDurabilityQos <em>Durability Qos</em>}' containment reference.
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_DeadlineQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsDeadlineQos getDeadlineQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getDeadlineQos <em>Deadline Qos</em>}' containment reference.
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_LatencyBudgetQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsLatencyBudgetQos getLatencyBudgetQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getLatencyBudgetQos <em>Latency Budget Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Budget Qos</em>' containment reference.
	 * @see #getLatencyBudgetQos()
	 * @generated
	 */
	void setLatencyBudgetQos(DdsLatencyBudgetQos value);

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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_LivelinessQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsLivelinessQos getLivelinessQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getLivelinessQos <em>Liveliness Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liveliness Qos</em>' containment reference.
	 * @see #getLivelinessQos()
	 * @generated
	 */
	void setLivelinessQos(DdsLivelinessQos value);

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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_OwnershipQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsOwnershipQos getOwnershipQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getOwnershipQos <em>Ownership Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ownership Qos</em>' containment reference.
	 * @see #getOwnershipQos()
	 * @generated
	 */
	void setOwnershipQos(DdsOwnershipQos value);

	/**
	 * Returns the value of the '<em><b>Time Based Filter Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Based Filter Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Based Filter Qos</em>' containment reference.
	 * @see #setTimeBasedFilterQos(DdsTimeBasedFilterQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_TimeBasedFilterQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsTimeBasedFilterQos getTimeBasedFilterQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getTimeBasedFilterQos <em>Time Based Filter Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Based Filter Qos</em>' containment reference.
	 * @see #getTimeBasedFilterQos()
	 * @generated
	 */
	void setTimeBasedFilterQos(DdsTimeBasedFilterQos value);

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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_ReliabilityQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsReliabilityQos getReliabilityQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getReliabilityQos <em>Reliability Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability Qos</em>' containment reference.
	 * @see #getReliabilityQos()
	 * @generated
	 */
	void setReliabilityQos(DdsReliabilityQos value);

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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_DestinationOrderQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsDestinationOrderQos getDestinationOrderQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getDestinationOrderQos <em>Destination Order Qos</em>}' containment reference.
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_HistoryQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsHistoryQos getHistoryQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getHistoryQos <em>History Qos</em>}' containment reference.
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
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_ResourceLimitsQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsResourceLimits getResourceLimitsQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getResourceLimitsQos <em>Resource Limits Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Limits Qos</em>' containment reference.
	 * @see #getResourceLimitsQos()
	 * @generated
	 */
	void setResourceLimitsQos(DdsResourceLimits value);

	/**
	 * Returns the value of the '<em><b>Data Reader Lifecycle Qos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Reader Lifecycle Qos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Reader Lifecycle Qos</em>' containment reference.
	 * @see #setDataReaderLifecycleQos(DdsDataReaderLifecycleQos)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReaderQosProfile_DataReaderLifecycleQos()
	 * @model containment="true"
	 * @generated
	 */
	DdsDataReaderLifecycleQos getDataReaderLifecycleQos();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReaderQosProfile#getDataReaderLifecycleQos <em>Data Reader Lifecycle Qos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Reader Lifecycle Qos</em>' containment reference.
	 * @see #getDataReaderLifecycleQos()
	 * @generated
	 */
	void setDataReaderLifecycleQos(DdsDataReaderLifecycleQos value);

} // DdsDataReaderQosProfile
