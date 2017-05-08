/**
 */
package ddsMetamodel.impl;

import ddsMetamodel.DdsDataModule;
import ddsMetamodel.DdsHost;
import ddsMetamodel.DdsMetamodelPackage;
import ddsMetamodel.DdsQosProfile;
import ddsMetamodel.DdsSystem;
import ddsMetamodel.DdsTopic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dds System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ddsMetamodel.impl.DdsSystemImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsSystemImpl#getHosts <em>Hosts</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsSystemImpl#getQosProfiles <em>Qos Profiles</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsSystemImpl#getDataModules <em>Data Modules</em>}</li>
 *   <li>{@link ddsMetamodel.impl.DdsSystemImpl#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsSystemImpl extends MinimalEObjectImpl.Container implements DdsSystem {
	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHosts() <em>Hosts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHosts()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsHost> hosts;

	/**
	 * The cached value of the '{@link #getQosProfiles() <em>Qos Profiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQosProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsQosProfile> qosProfiles;

	/**
	 * The cached value of the '{@link #getDataModules() <em>Data Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataModules()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsDataModule> dataModules;

	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsTopic> topics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DdsMetamodelPackage.Literals.DDS_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DdsMetamodelPackage.DDS_SYSTEM__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsHost> getHosts() {
		if (hosts == null) {
			hosts = new EObjectContainmentEList<DdsHost>(DdsHost.class, this, DdsMetamodelPackage.DDS_SYSTEM__HOSTS);
		}
		return hosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsQosProfile> getQosProfiles() {
		if (qosProfiles == null) {
			qosProfiles = new EObjectContainmentEList<DdsQosProfile>(DdsQosProfile.class, this, DdsMetamodelPackage.DDS_SYSTEM__QOS_PROFILES);
		}
		return qosProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsDataModule> getDataModules() {
		if (dataModules == null) {
			dataModules = new EObjectContainmentWithInverseEList<DdsDataModule>(DdsDataModule.class, this, DdsMetamodelPackage.DDS_SYSTEM__DATA_MODULES, DdsMetamodelPackage.DDS_DATA_MODULE__CONTAINING_SYSTEM);
		}
		return dataModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsTopic> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<DdsTopic>(DdsTopic.class, this, DdsMetamodelPackage.DDS_SYSTEM__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_SYSTEM__DATA_MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataModules()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DdsMetamodelPackage.DDS_SYSTEM__HOSTS:
				return ((InternalEList<?>)getHosts()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_SYSTEM__QOS_PROFILES:
				return ((InternalEList<?>)getQosProfiles()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_SYSTEM__DATA_MODULES:
				return ((InternalEList<?>)getDataModules()).basicRemove(otherEnd, msgs);
			case DdsMetamodelPackage.DDS_SYSTEM__TOPICS:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
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
			case DdsMetamodelPackage.DDS_SYSTEM__SYSTEM_NAME:
				return getSystemName();
			case DdsMetamodelPackage.DDS_SYSTEM__HOSTS:
				return getHosts();
			case DdsMetamodelPackage.DDS_SYSTEM__QOS_PROFILES:
				return getQosProfiles();
			case DdsMetamodelPackage.DDS_SYSTEM__DATA_MODULES:
				return getDataModules();
			case DdsMetamodelPackage.DDS_SYSTEM__TOPICS:
				return getTopics();
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
			case DdsMetamodelPackage.DDS_SYSTEM__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case DdsMetamodelPackage.DDS_SYSTEM__HOSTS:
				getHosts().clear();
				getHosts().addAll((Collection<? extends DdsHost>)newValue);
				return;
			case DdsMetamodelPackage.DDS_SYSTEM__QOS_PROFILES:
				getQosProfiles().clear();
				getQosProfiles().addAll((Collection<? extends DdsQosProfile>)newValue);
				return;
			case DdsMetamodelPackage.DDS_SYSTEM__DATA_MODULES:
				getDataModules().clear();
				getDataModules().addAll((Collection<? extends DdsDataModule>)newValue);
				return;
			case DdsMetamodelPackage.DDS_SYSTEM__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends DdsTopic>)newValue);
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
			case DdsMetamodelPackage.DDS_SYSTEM__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case DdsMetamodelPackage.DDS_SYSTEM__HOSTS:
				getHosts().clear();
				return;
			case DdsMetamodelPackage.DDS_SYSTEM__QOS_PROFILES:
				getQosProfiles().clear();
				return;
			case DdsMetamodelPackage.DDS_SYSTEM__DATA_MODULES:
				getDataModules().clear();
				return;
			case DdsMetamodelPackage.DDS_SYSTEM__TOPICS:
				getTopics().clear();
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
			case DdsMetamodelPackage.DDS_SYSTEM__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case DdsMetamodelPackage.DDS_SYSTEM__HOSTS:
				return hosts != null && !hosts.isEmpty();
			case DdsMetamodelPackage.DDS_SYSTEM__QOS_PROFILES:
				return qosProfiles != null && !qosProfiles.isEmpty();
			case DdsMetamodelPackage.DDS_SYSTEM__DATA_MODULES:
				return dataModules != null && !dataModules.isEmpty();
			case DdsMetamodelPackage.DDS_SYSTEM__TOPICS:
				return topics != null && !topics.isEmpty();
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
		result.append(" (systemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //DdsSystemImpl
