/**
 */
package ddsMetamodel.provider;


import ddsMetamodel.DdsDomainParticipant;
import ddsMetamodel.DdsMetamodelFactory;
import ddsMetamodel.DdsMetamodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ddsMetamodel.DdsDomainParticipant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DdsDomainParticipantItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsDomainParticipantItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDomainParticipantNamePropertyDescriptor(object);
			addDdsdomainparticipantqosprofilePropertyDescriptor(object);
			addDomainIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Domain Participant Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainParticipantNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DdsDomainParticipant_domainParticipantName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DdsDomainParticipant_domainParticipantName_feature", "_UI_DdsDomainParticipant_type"),
				 DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ddsdomainparticipantqosprofile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDdsdomainparticipantqosprofilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DdsDomainParticipant_ddsdomainparticipantqosprofile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DdsDomainParticipant_ddsdomainparticipantqosprofile_feature", "_UI_DdsDomainParticipant_type"),
				 DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT__DDSDOMAINPARTICIPANTQOSPROFILE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DdsDomainParticipant_domainId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DdsDomainParticipant_domainId_feature", "_UI_DdsDomainParticipant_type"),
				 DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT__DOMAIN_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER);
			childrenFeatures.add(DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DdsDomainParticipant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DdsDomainParticipant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DdsDomainParticipant)object).getDomainParticipantName();
		return label == null || label.length() == 0 ?
			getString("_UI_DdsDomainParticipant_type") :
			getString("_UI_DdsDomainParticipant_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DdsDomainParticipant.class)) {
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_NAME:
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER:
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER:
			case DdsMetamodelPackage.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT__DDSSUBSCRIBER,
				 DdsMetamodelFactory.eINSTANCE.createDdsSubscriber()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT__DDSPUBLISHER,
				 DdsMetamodelFactory.eINSTANCE.createDdsPublisher()));

		newChildDescriptors.add
			(createChildParameter
				(DdsMetamodelPackage.Literals.DDS_DOMAIN_PARTICIPANT__DOMAIN_PARTICIPANT_LISTENER,
				 DdsMetamodelFactory.eINSTANCE.createDdsDomainParticipantListener()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DdsMetamodelEditPlugin.INSTANCE;
	}

}
