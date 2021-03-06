/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProvider#getCloudResources <em>Cloud Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProvider#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProvider#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProvider#getCredential <em>Credential</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage#getCloudProvider()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface CloudProvider extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Cloud Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Resources</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage#getCloudProvider_CloudResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudResourceType> getCloudResources();

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
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage#getCloudProvider_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProvider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(String)
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage#getCloudProvider_Identity()
	 * @model
	 * @generated
	 */
	String getIdentity();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProvider#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(String value);

	/**
	 * Returns the value of the '<em><b>Credential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credential</em>' attribute.
	 * @see #setCredential(String)
	 * @see org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofilePackage#getCloudProvider_Credential()
	 * @model
	 * @generated
	 */
	String getCredential();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProvider#getCredential <em>Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credential</em>' attribute.
	 * @see #getCredential()
	 * @generated
	 */
	void setCredential(String value);

} // CloudProvider
