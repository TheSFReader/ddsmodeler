/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsTopic#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsTopic#getTopicListener <em>Topic Listener</em>}</li>
 *   <li>{@link ddsMetamodel.DdsTopic#getTopicQosProfile <em>Topic Qos Profile</em>}</li>
 *   <li>{@link ddsMetamodel.DdsTopic#getDdsdatastructure <em>Ddsdatastructure</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsTopic()
 * @model
 * @generated
 */
public interface DdsTopic extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsTopic_TopicName()
	 * @model
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsTopic#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Topic Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Listener</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Listener</em>' containment reference.
	 * @see #setTopicListener(DdsTopicListener)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsTopic_TopicListener()
	 * @model containment="true"
	 * @generated
	 */
	DdsTopicListener getTopicListener();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsTopic#getTopicListener <em>Topic Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Listener</em>' containment reference.
	 * @see #getTopicListener()
	 * @generated
	 */
	void setTopicListener(DdsTopicListener value);

	/**
	 * Returns the value of the '<em><b>Topic Qos Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Qos Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Qos Profile</em>' reference.
	 * @see #setTopicQosProfile(DdsTopicQosProfile)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsTopic_TopicQosProfile()
	 * @model
	 * @generated
	 */
	DdsTopicQosProfile getTopicQosProfile();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsTopic#getTopicQosProfile <em>Topic Qos Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Qos Profile</em>' reference.
	 * @see #getTopicQosProfile()
	 * @generated
	 */
	void setTopicQosProfile(DdsTopicQosProfile value);

	/**
	 * Returns the value of the '<em><b>Ddsdatastructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ddsdatastructure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddsdatastructure</em>' reference.
	 * @see #setDdsdatastructure(DdsDataStructure)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsTopic_Ddsdatastructure()
	 * @model
	 * @generated
	 */
	DdsDataStructure getDdsdatastructure();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsTopic#getDdsdatastructure <em>Ddsdatastructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ddsdatastructure</em>' reference.
	 * @see #getDdsdatastructure()
	 * @generated
	 */
	void setDdsdatastructure(DdsDataStructure value);

} // DdsTopic
