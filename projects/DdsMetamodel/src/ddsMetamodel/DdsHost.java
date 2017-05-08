/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsHost#getHostName <em>Host Name</em>}</li>
 *   <li>{@link ddsMetamodel.DdsHost#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsHost()
 * @model
 * @generated
 */
public interface DdsHost extends EObject {
	/**
	 * Returns the value of the '<em><b>Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Name</em>' attribute.
	 * @see #setHostName(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsHost_HostName()
	 * @model
	 * @generated
	 */
	String getHostName();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsHost#getHostName <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Name</em>' attribute.
	 * @see #getHostName()
	 * @generated
	 */
	void setHostName(String value);

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link ddsMetamodel.DdsApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsHost_Applications()
	 * @model containment="true"
	 * @generated
	 */
	EList<DdsApplication> getApplications();

} // DdsHost
