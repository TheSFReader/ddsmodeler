/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsApplication;
import ddsMetamodel.DdsDomainParticipant;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsWaitSet;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsApplicationImpl#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsApplicationImpl#getDomainParticipants <em>Domain Participants</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsApplicationImpl#getWaitset <em>Waitset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsApplicationImpl extends MinimalEObjectImpl.Container implements DdsApplication {
	/**
	 * The default value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected String applicationName = APPLICATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainParticipants() <em>Domain Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsDomainParticipant> domainParticipants;

	/**
	 * The cached value of the '{@link #getWaitset() <em>Waitset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitset()
	 * @generated
	 * @ordered
	 */
	protected DdsWaitSet waitset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationName(String newApplicationName) {
		String oldApplicationName = applicationName;
		applicationName = newApplicationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_APPLICATION__APPLICATION_NAME, oldApplicationName, applicationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsDomainParticipant> getDomainParticipants() {
		if (domainParticipants == null) {
			domainParticipants = new EObjectContainmentEList<DdsDomainParticipant>(DdsDomainParticipant.class, this, DdsMetamodelPackage.DDS_APPLICATION__DOMAIN_PARTICIPANTS);
		}
		return domainParticipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsWaitSet getWaitset() {
		return waitset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaitset(DdsWaitSet newWaitset, NotificationChain msgs) {
		DdsWaitSet oldWaitset = waitset;
		waitset = newWaitset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_APPLICATION__WAITSET, oldWaitset, newWaitset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitset(DdsWaitSet newWaitset) {
		if (newWaitset != waitset) {
			NotificationChain msgs = null;
			if (waitset != null)
				msgs = ((InternalEObject)waitset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_APPLICATION__WAITSET, null, msgs);
			if (newWaitset != null)
				msgs = ((InternalEObject)newWaitset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdsMetamodelPackage.DDS_APPLICATION__WAITSET, null, msgs);
			msgs = basicSetWaitset(newWaitset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_APPLICATION__WAITSET, newWaitset, newWaitset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_APPLICATION__DOMAIN_PARTICIPANTS:
				return ((InternalEList<?>)getDomainParticipants()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_APPLICATION__WAITSET:
				return basicSetWaitset(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_APPLICATION__APPLICATION_NAME:
				return getApplicationName();
			case DdsMetamodelPackage.DDS_APPLICATION__DOMAIN_PARTICIPANTS:
				return getDomainParticipants();
			case DdsMetamodelPackage.DDS_APPLICATION__WAITSET:
				return getWaitset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_APPLICATION__APPLICATION_NAME:
				setApplicationName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_APPLICATION__DOMAIN_PARTICIPANTS:
				getDomainParticipants().clear();
				getDomainParticipants().addAll((Collection<? extends DdsDomainParticipant>)newValue);
				return;
			case DdsMetamodelPackage.DDS_APPLICATION__WAITSET:
				setWaitset((DdsWaitSet)newValue);
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
			case DdsMetamodelPackage.DDS_APPLICATION__APPLICATION_NAME:
				setApplicationName(APPLICATION_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_APPLICATION__DOMAIN_PARTICIPANTS:
				getDomainParticipants().clear();
				return;
			case DdsMetamodelPackage.DDS_APPLICATION__WAITSET:
				setWaitset((DdsWaitSet)null);
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
			case DdsMetamodelPackage.DDS_APPLICATION__APPLICATION_NAME:
				return APPLICATION_NAME_EDEFAULT == null ? applicationName != null : !APPLICATION_NAME_EDEFAULT.equals(applicationName);
			case DdsMetamodelPackage.DDS_APPLICATION__DOMAIN_PARTICIPANTS:
				return domainParticipants != null && !domainParticipants.isEmpty();
			case DdsMetamodelPackage.DDS_APPLICATION__WAITSET:
				return waitset != null;
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
		result.append(" (applicationName: ");
		result.append(applicationName);
		result.append(')');
		return result.toString();
	}

} //DdsApplicationImpl
