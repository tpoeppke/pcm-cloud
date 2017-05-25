/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud;
import org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceenvironmentcloudFactory;
import org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceenvironmentcloudPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.resourceenvironmentprivacy.provider.ResourceContainerPrivacyItemProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceContainerCloudItemProvider extends ResourceContainerPrivacyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainerCloudItemProvider(AdapterFactory adapterFactory) {
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

			addCloudProviderNamePropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addExternalAddressPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addInstanceTypePropertyDescriptor(object);
			addManagementAddressPropertyDescriptor(object);
			addGroupNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cloud Provider Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudProviderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceContainerCloud_cloudProviderName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceContainerCloud_cloudProviderName_feature", "_UI_ResourceContainerCloud_type"),
				 ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__CLOUD_PROVIDER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceContainerCloud_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceContainerCloud_location_feature", "_UI_ResourceContainerCloud_type"),
				 ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceContainerCloud_externalAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceContainerCloud_externalAddress_feature", "_UI_ResourceContainerCloud_type"),
				 ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__EXTERNAL_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Username feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsernamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceContainerCloud_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceContainerCloud_username_feature", "_UI_ResourceContainerCloud_type"),
				 ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__USERNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceContainerCloud_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceContainerCloud_password_feature", "_UI_ResourceContainerCloud_type"),
				 ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceContainerCloud_instanceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceContainerCloud_instanceType_feature", "_UI_ResourceContainerCloud_type"),
				 ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__INSTANCE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Management Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManagementAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceContainerCloud_managementAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceContainerCloud_managementAddress_feature", "_UI_ResourceContainerCloud_type"),
				 ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__MANAGEMENT_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceContainerCloud_groupName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceContainerCloud_groupName_feature", "_UI_ResourceContainerCloud_type"),
				 ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__GROUP_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ResourceContainerCloud.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourceContainerCloud"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourceContainerCloud)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourceContainerCloud_type") :
			getString("_UI_ResourceContainerCloud_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceContainerCloud.class)) {
			case ResourceenvironmentcloudPackage.RESOURCE_CONTAINER_CLOUD__CLOUD_PROVIDER_NAME:
			case ResourceenvironmentcloudPackage.RESOURCE_CONTAINER_CLOUD__LOCATION:
			case ResourceenvironmentcloudPackage.RESOURCE_CONTAINER_CLOUD__EXTERNAL_ADDRESS:
			case ResourceenvironmentcloudPackage.RESOURCE_CONTAINER_CLOUD__USERNAME:
			case ResourceenvironmentcloudPackage.RESOURCE_CONTAINER_CLOUD__PASSWORD:
			case ResourceenvironmentcloudPackage.RESOURCE_CONTAINER_CLOUD__INSTANCE_TYPE:
			case ResourceenvironmentcloudPackage.RESOURCE_CONTAINER_CLOUD__MANAGEMENT_ADDRESS:
			case ResourceenvironmentcloudPackage.RESOURCE_CONTAINER_CLOUD__GROUP_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
				(ResourceenvironmentPackage.Literals.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER,
				 ResourceenvironmentcloudFactory.eINSTANCE.createResourceContainerCloud()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ResourceenvironmentcloudEditPlugin.INSTANCE;
	}

}
