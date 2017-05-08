/**
 */
package ddsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dds Entity Factory Qos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.DdsEntityFactoryQos#isAutoenable_created_entities <em>Autoenable created entities</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getDdsEntityFactoryQos()
 * @model
 * @generated
 */
public interface DdsEntityFactoryQos extends EObject {
	/**
	 * Returns the value of the '<em><b>Autoenable created entities</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autoenable created entities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoenable created entities</em>' attribute.
	 * @see #setAutoenable_created_entities(boolean)
	 * @see ddsMetamodel.DdsMetamodelPackage#getDdsEntityFactoryQos_Autoenable_created_entities()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutoenable_created_entities();

	/**
	 * Sets the value of the '{@link ddsMetamodel.DdsEntityFactoryQos#isAutoenable_created_entities <em>Autoenable created entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoenable created entities</em>' attribute.
	 * @see #isAutoenable_created_entities()
	 * @generated
	 */
	void setAutoenable_created_entities(boolean value);

} // DdsEntityFactoryQos
