/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudProfile;
import org.palladiosimulator.pcm.cloud.pcmcloud.cloudprofile.CloudprofileFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cloud Profile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudProfileTest extends TestCase {

	/**
	 * The fixture for this Cloud Profile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudProfile fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CloudProfileTest.class);
	}

	/**
	 * Constructs a new Cloud Profile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProfileTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cloud Profile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CloudProfile fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cloud Profile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudProfile getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CloudprofileFactory.eINSTANCE.createCloudProfile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CloudProfileTest
