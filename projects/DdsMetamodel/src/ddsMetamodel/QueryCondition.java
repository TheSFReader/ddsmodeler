/**
 */
package ddsMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.QueryCondition#getQuery <em>Query</em>}</li>
 *   <li>{@link ddsMetamodel.QueryCondition#getQueryParameters <em>Query Parameters</em>}</li>
 * </ul>
 *
 * @see ddsMetamodel.DdsMetamodelPackage#getQueryCondition()
 * @model
 * @generated
 */
public interface QueryCondition extends DdsReadCondition {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see ddsMetamodel.DdsMetamodelPackage#getQueryCondition_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link ddsMetamodel.QueryCondition#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Query Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Parameters</em>' attribute list.
	 * @see ddsMetamodel.DdsMetamodelPackage#getQueryCondition_QueryParameters()
	 * @model
	 * @generated
	 */
	EList<String> getQueryParameters();

} // QueryCondition
