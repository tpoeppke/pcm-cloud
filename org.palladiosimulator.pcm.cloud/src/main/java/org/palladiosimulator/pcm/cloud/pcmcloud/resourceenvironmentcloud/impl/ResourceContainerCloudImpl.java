/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.VMType;

import org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceContainerCloud;
import org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.ResourceenvironmentcloudPackage;

import org.palladiosimulator.pcm.resourceenvironmentprivacy.impl.ResourceContainerPrivacyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Container Cloud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceContainerCloudImpl#getExternalAddress <em>External Address</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceContainerCloudImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceContainerCloudImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceContainerCloudImpl#getManagementAddress <em>Management Address</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceContainerCloudImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.resourceenvironmentcloud.impl.ResourceContainerCloudImpl#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceContainerCloudImpl extends ResourceContainerPrivacyImpl implements ResourceContainerCloud {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainerCloudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalAddress() {
		return (String)eGet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__EXTERNAL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalAddress(String newExternalAddress) {
		eSet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__EXTERNAL_ADDRESS, newExternalAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return (String)eGet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__USERNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		eSet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__USERNAME, newUsername);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return (String)eGet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		eSet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__PASSWORD, newPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManagementAddress() {
		return (String)eGet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__MANAGEMENT_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementAddress(String newManagementAddress) {
		eSet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__MANAGEMENT_ADDRESS, newManagementAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return (String)eGet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__GROUP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		eSet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__GROUP_NAME, newGroupName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMType getInstanceType() {
		return (VMType)eGet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__INSTANCE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(VMType newInstanceType) {
		eSet(ResourceenvironmentcloudPackage.Literals.RESOURCE_CONTAINER_CLOUD__INSTANCE_TYPE, newInstanceType);
	}

} //ResourceContainerCloudImpl
