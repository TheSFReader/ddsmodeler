/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Data Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsDataWriter#getDataWriterName <em>Data Writer Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriter#getPubliableTopic <em>Publiable Topic</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriter#getDataWriterListener <em>Data Writer Listener</em>}</li>
 *   <li>{@link ddsMetamodel.DdsDataWriter#getDataWriterQosProfile <em>Data Writer Qos Profile</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriter()
 * @model
 * @generated
 */
public interface DdsDataWriter extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Writer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Writer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Writer Name</em>' attribute.
	 * @see #setDataWriterName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriter_DataWriterName()
	 * @model
	 * @generated
	 */
	String getDataWriterName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriter#getDataWriterName <em>Data Writer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Writer Name</em>' attribute.
	 * @see #getDataWriterName()
	 * @generated
	 */
	void setDataWriterName(String value);

	/**
	 * Returns the value of the '<em><b>Publiable Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publiable Topic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publiable Topic</em>' reference.
	 * @see #setPubliableTopic(DdsTopic)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriter_PubliableTopic()
	 * @model required="true"
	 * @generated
	 */
	DdsTopic getPubliableTopic();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriter#getPubliableTopic <em>Publiable Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publiable Topic</em>' reference.
	 * @see #getPubliableTopic()
	 * @generated
	 */
	void setPubliableTopic(DdsTopic value);

	/**
	 * Returns the value of the '<em><b>Data Writer Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Writer Listener</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Writer Listener</em>' containment reference.
	 * @see #setDataWriterListener(DdsDataWriterListener)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriter_DataWriterListener()
	 * @model containment="true"
	 * @generated
	 */
	DdsDataWriterListener getDataWriterListener();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriter#getDataWriterListener <em>Data Writer Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Writer Listener</em>' containment reference.
	 * @see #getDataWriterListener()
	 * @generated
	 */
	void setDataWriterListener(DdsDataWriterListener value);

	/**
	 * Returns the value of the '<em><b>Data Writer Qos Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Writer Qos Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Writer Qos Profile</em>' reference.
	 * @see #setDataWriterQosProfile(DdsDataWriterQosProfile)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsDataWriter_DataWriterQosProfile()
	 * @model
	 * @generated
	 */
	DdsDataWriterQosProfile getDataWriterQosProfile();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsDataWriter#getDataWriterQosProfile <em>Data Writer Qos Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Writer Qos Profile</em>' reference.
	 * @see #getDataWriterQosProfile()
	 * @generated
	 */
	void setDataWriterQosProfile(DdsDataWriterQosProfile value);

} // DdsDataWriter
