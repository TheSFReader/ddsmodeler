/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsSystem#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsSystem#getHosts <em>Hosts</em>}</li>
 *   <li>{@link ddsMetamodel.DdsSystem#getQosProfiles <em>Qos Profiles</em>}</li>
 *   <li>{@link ddsMetamodel.DdsSystem#getDataModules <em>Data Modules</em>}</li>
 *   <li>{@link ddsMetamodel.DdsSystem#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSystem()
 * @model
 * @generated
 */
public interface DdsSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSystem_SystemName()
	 * @model
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsSystem#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Hosts</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsHost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosts</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSystem_Hosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsHost> getHosts();

	/**
	 * Returns the value of the '<em><b>Qos Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsQosProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qos Profiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qos Profiles</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSystem_QosProfiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsQosProfile> getQosProfiles();

	/**
	 * Returns the value of the '<em><b>Data Modules</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsDataModule}.
	 * It is bidirectional and its opposite is '{@link ddsMetamodel.DdsDataModule#getContainingSystem <em>Containing System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Modules</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSystem_DataModules()
	 * @see ddsMetamodel.DdsDataModule#getContainingSystem
	 * @model opposite="containingSystem" containment="true"
	 * @generated
	 */
	EList<DdsDataModule> getDataModules();

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsTopic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsSystem_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsTopic> getTopics();

} // DdsSystem
