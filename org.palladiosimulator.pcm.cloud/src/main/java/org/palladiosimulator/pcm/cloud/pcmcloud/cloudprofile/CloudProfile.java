/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProfile#getCloudProviders <em>Cloud Providers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProfile#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage#getCloudProfile()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface CloudProfile extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Cloud Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Providers</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage#getCloudProfile_CloudProviders()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudProvider> getCloudProviders();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage#getCloudProfile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProfile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CloudProfile
