/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataReader#getDataReaderName <em>Data Reader Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReader#getReadableTopic <em>Readable Topic</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReader#getDataReaderListener <em>Data Reader Listener</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReader#getDataReaderQosProfile <em>Data Reader Qos Profile</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataReader#getContainingSubscriber <em>Containing Subscriber</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReader()
 * @model
 * @generated
 */
public interface DdsDataReader extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Reader Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Reader Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Reader Name</em>' attribute.
	 * @see #setDataReaderName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReader_DataReaderName()
	 * @model
	 * @generated
	 */
	String getDataReaderName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReader#getDataReaderName <em>Data Reader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Reader Name</em>' attribute.
	 * @see #getDataReaderName()
	 * @generated
	 */
	void setDataReaderName(String value);

	/**
	 * Returns the value of the '<em><b>Readable Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readable Topic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readable Topic</em>' reference.
	 * @see #setReadableTopic(DdsTopic)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReader_ReadableTopic()
	 * @model required="true"
	 * @generated
	 */
	DdsTopic getReadableTopic();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReader#getReadableTopic <em>Readable Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readable Topic</em>' reference.
	 * @see #getReadableTopic()
	 * @generated
	 */
	void setReadableTopic(DdsTopic value);

	/**
	 * Returns the value of the '<em><b>Data Reader Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Reader Listener</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Reader Listener</em>' containment reference.
	 * @see #setDataReaderListener(DdsDataReaderListener)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReader_DataReaderListener()
	 * @model containment="true"
	 * @generated
	 */
	DdsDataReaderListener getDataReaderListener();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReader#getDataReaderListener <em>Data Reader Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Reader Listener</em>' containment reference.
	 * @see #getDataReaderListener()
	 * @generated
	 */
	void setDataReaderListener(DdsDataReaderListener value);

	/**
	 * Returns the value of the '<em><b>Data Reader Qos Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Reader Qos Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Reader Qos Profile</em>' reference.
	 * @see #setDataReaderQosProfile(DdsDataReaderQosProfile)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReader_DataReaderQosProfile()
	 * @model
	 * @generated
	 */
	DdsDataReaderQosProfile getDataReaderQosProfile();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReader#getDataReaderQosProfile <em>Data Reader Qos Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Reader Qos Profile</em>' reference.
	 * @see #getDataReaderQosProfile()
	 * @generated
	 */
	void setDataReaderQosProfile(DdsDataReaderQosProfile value);

	/**
	 * Returns the value of the '<em><b>Containing Subscriber</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsSubscriber#getDdsdatareader <em>Ddsdatareader</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Subscriber</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Subscriber</em>' container reference.
	 * @see #setContainingSubscriber(DdsSubscriber)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataReader_ContainingSubscriber()
	 * @see ddsMetamodel.DdsSubscriber#getDdsdatareader
	 * @model opposite="ddsdatareader" required="true" transient="false"
	 * @generated
	 */
	DdsSubscriber getContainingSubscriber();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataReader#getContainingSubscriber <em>Containing Subscriber</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Subscriber</em>' container reference.
	 * @see #getContainingSubscriber()
	 * @generated
	 */
	void setContainingSubscriber(DdsSubscriber value);

} // DdsDataReader
