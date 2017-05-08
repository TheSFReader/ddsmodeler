/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsApplication#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsApplication#getDomainParticipants <em>Domain Participants</em>}</li>
 *   <li>{@link ddsMetamodel.DdsApplication#getWaitset <em>Waitset</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsApplication()
 * @model
 * @generated
 */
public interface DdsApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Name</em>' attribute.
	 * @see #setApplicationName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsApplication_ApplicationName()
	 * @model
	 * @generated
	 */
	String getApplicationName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsApplication#getApplicationName <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Name</em>' attribute.
	 * @see #getApplicationName()
	 * @generated
	 */
	void setApplicationName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Participants</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsDomainParticipant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Participants</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsApplication_DomainParticipants()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsDomainParticipant> getDomainParticipants();

	/**
	 * Returns the value of the '<em><b>Waitset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waitset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waitset</em>' containment reference.
	 * @see #setWaitset(DdsWaitSet)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsApplication_Waitset()
	 * @model containment="true"
	 * @generated
	 */
	DdsWaitSet getWaitset();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsApplication#getWaitset <em>Waitset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waitset</em>' containment reference.
	 * @see #getWaitset()
	 * @generated
	 */
	void setWaitset(DdsWaitSet value);

} // DdsApplication
