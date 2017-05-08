/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsPresentationQos;
import ddsMetamodel.PresentationQosPolicyAccessScopeKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Presentation Qos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsPresentationQosImpl#getAccess_scope <em>Access scope</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsPresentationQosImpl#isCoherent_access <em>Coherent access</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsPresentationQosImpl#isOrdered_access <em>Ordered access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsPresentationQosImpl extends MinimalEObjectImpl.Container implements DdsPresentationQos {
	/**
	 * The default value of the '{@link #getAccess_scope() <em>Access scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_scope()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationQosPolicyAccessScopeKind ACCESS_SCOPE_EDEFAULT = PresentationQosPolicyAccessScopeKind.INSTANCE_PRESENTATION_QOS;

	/**
	 * The cached value of the '{@link #getAccess_scope() <em>Access scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_scope()
	 * @generated
	 * @ordered
	 */
	protected PresentationQosPolicyAccessScopeKind access_scope = ACCESS_SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCoherent_access() <em>Coherent access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCoherent_access()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COHERENT_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCoherent_access() <em>Coherent access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCoherent_access()
	 * @generated
	 * @ordered
	 */
	protected boolean coherent_access = COHERENT_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrdered_access() <em>Ordered access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered_access()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered_access() <em>Ordered access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered_access()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered_access = ORDERED_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsPresentationQosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_PRESENTATION_QOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationQosPolicyAccessScopeKind getAccess_scope() {
		return access_scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess_scope(PresentationQosPolicyAccessScopeKind newAccess_scope) {
		PresentationQosPolicyAccessScopeKind oldAccess_scope = access_scope;
		access_scope = newAccess_scope == null ? ACCESS_SCOPE_EDEFAULT : newAccess_scope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PRESENTATION_QOS__ACCESS_SCOPE, oldAccess_scope, access_scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCoherent_access() {
		return coherent_access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoherent_access(boolean newCoherent_access) {
		boolean oldCoherent_access = coherent_access;
		coherent_access = newCoherent_access;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PRESENTATION_QOS__COHERENT_ACCESS, oldCoherent_access, coherent_access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered_access() {
		return ordered_access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered_access(boolean newOrdered_access) {
		boolean oldOrdered_access = ordered_access;
		ordered_access = newOrdered_access;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_PRESENTATION_QOS__ORDERED_ACCESS, oldOrdered_access, ordered_access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__ACCESS_SCOPE:
				return getAccess_scope();
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__COHERENT_ACCESS:
				return isCoherent_access();
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__ORDERED_ACCESS:
				return isOrdered_access();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__ACCESS_SCOPE:
				setAccess_scope((PresentationQosPolicyAccessScopeKind)newValue);
				return;
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__COHERENT_ACCESS:
				setCoherent_access((Boolean)newValue);
				return;
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__ORDERED_ACCESS:
				setOrdered_access((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__ACCESS_SCOPE:
				setAccess_scope(ACCESS_SCOPE_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__COHERENT_ACCESS:
				setCoherent_access(COHERENT_ACCESS_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__ORDERED_ACCESS:
				setOrdered_access(ORDERED_ACCESS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__ACCESS_SCOPE:
				return access_scope != ACCESS_SCOPE_EDEFAULT;
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__COHERENT_ACCESS:
				return coherent_access != COHERENT_ACCESS_EDEFAULT;
			case DdsMetamodelPackage.DDS_PRESENTATION_QOS__ORDERED_ACCESS:
				return ordered_access != ORDERED_ACCESS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (access_scope: ");
		result.append(access_scope);
		result.append(", coherent_access: ");
		result.append(coherent_access);
		result.append(", ordered_access: ");
		result.append(ordered_access);
		result.append(')');
		return result.toString();
	}

} //DdsPresentationQosImpl
