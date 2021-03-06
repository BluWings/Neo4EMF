/**
 * Copyright (c) 2013 Atlanmod INRIA LINA Mines Nantes
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Atlanmod INRIA LINA Mines Nantes - initial API and implementation
 * Descritpion ! To come
 * @author Amine BENELALLAM
**/
package fr.inria.atlanmod.neo4emf.testdata;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getVString <em>VString</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getATransientInteger <em>ATransient Integer</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getADate <em>ADate</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getAVolatileDate <em>AVolatile Date</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#isABoolean <em>ABoolean</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getAReal <em>AReal</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getAnIntegerArray <em>An Integer Array</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getARealArray <em>AReal Array</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getAStringArray <em>AString Array</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getANonUniqueArray <em>ANon Unique Array</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getANonOrderedArray <em>ANon Ordered Array</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getATenStringArray <em>ATen String Array</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getVcontainer <em>Vcontainer</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getFrom <em>From</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends NamedElement {

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>VString</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>VString</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VString</em>' attribute.
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_VString()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	String getVString(); 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>ATransient Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>ATransient Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATransient Integer</em>' attribute.
	 * @see #setATransientInteger(BigInteger)
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_ATransientInteger()
	 * @model required="true" transient="true"
	 * @generated
	 */
	BigInteger getATransientInteger();
	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getATransientInteger <em>ATransient Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 *YY1-BIS
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATransient Integer</em>' attribute.
	 * @see #getATransientInteger()
	 * @generated
	 */
	void setATransientInteger(BigInteger value);
 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>ADate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>ADate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADate</em>' attribute.
	 * @see #setADate(Date)
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_ADate()
	 * @model dataType="fr.inria.atlanmod.neo4emf.testdata.Date" required="true"
	 * @generated
	 */
	Date getADate();
	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getADate <em>ADate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 *YY1-BIS
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADate</em>' attribute.
	 * @see #getADate()
	 * @generated
	 */
	void setADate(Date value);
 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>AVolatile Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>AVolatile Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AVolatile Date</em>' attribute.
	 * @see #setAVolatileDate(Date)
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_AVolatileDate()
	 * @model dataType="fr.inria.atlanmod.neo4emf.testdata.Date" required="true" volatile="true"
	 * @generated
	 */
	Date getAVolatileDate();
	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getAVolatileDate <em>AVolatile Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 *YY1-BIS
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AVolatile Date</em>' attribute.
	 * @see #getAVolatileDate()
	 * @generated
	 */
	void setAVolatileDate(Date value);
 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>ABoolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>ABoolean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ABoolean</em>' attribute.
	 * @see #setABoolean(boolean)
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_ABoolean()
	 * @model required="true"
	 * @generated
	 */
	boolean isABoolean();
	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#isABoolean <em>ABoolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 *YY1-BIS
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ABoolean</em>' attribute.
	 * @see #isABoolean()
	 * @generated
	 */
	void setABoolean(boolean value);
 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>AReal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>AReal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AReal</em>' attribute.
	 * @see #setAReal(BigDecimal)
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_AReal()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getAReal();
	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getAReal <em>AReal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 *YY1-BIS
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AReal</em>' attribute.
	 * @see #getAReal()
	 * @generated
	 */
	void setAReal(BigDecimal value);
 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>An Integer Array</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>An Integer Array</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Integer Array</em>' attribute list.
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_AnIntegerArray()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BigInteger> getAnIntegerArray(); 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>AReal Array</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>AReal Array</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AReal Array</em>' attribute list.
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_ARealArray()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BigDecimal> getARealArray(); 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>AString Array</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>AString Array</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AString Array</em>' attribute list.
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_AStringArray()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getAStringArray(); 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>ANon Unique Array</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>ANon Unique Array</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANon Unique Array</em>' attribute list.
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_ANonUniqueArray()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<BigDecimal> getANonUniqueArray(); 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>ANon Ordered Array</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>ANon Ordered Array</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANon Ordered Array</em>' attribute list.
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_ANonOrderedArray()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<Boolean> getANonOrderedArray(); 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>ATen String Array</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>ATen String Array</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATen String Array</em>' attribute list.
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_ATenStringArray()
	 * @model lower="10" upper="10" ordered="false"
	 * @generated
	 */
	EList<String> getATenStringArray(); 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.atlanmod.neo4emf.testdata.Temperature}.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see fr.inria.atlanmod.neo4emf.testdata.Temperature
	 * @see #setTemperature(Temperature)
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_Temperature()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Temperature getTemperature();
	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 *YY1-BIS
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see fr.inria.atlanmod.neo4emf.testdata.Temperature
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(Temperature value);
 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>Vcontainer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.neo4emf.testdata.ContainerType#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>Vcontainer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vcontainer</em>' container reference.
	 * @see #setVcontainer(ContainerType)
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_Vcontainer()
	 * @see fr.inria.atlanmod.neo4emf.testdata.ContainerType#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	ContainerType getVcontainer();
	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.neo4emf.testdata.Vertex#getVcontainer <em>Vcontainer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 *YY1-BIS
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcontainer</em>' container reference.
	 * @see #getVcontainer()
	 * @generated
	 */
	void setVcontainer(ContainerType value);
 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.neo4emf.testdata.Link}.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.neo4emf.testdata.Link#getOutGoing <em>Out Going</em>}'.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_From()
	 * @see fr.inria.atlanmod.neo4emf.testdata.Link#getOutGoing
	 * @model opposite="outGoing"
	 * @generated
	 */
	EList<Link> getFrom(); 

/** genFeaure.override.javajetinc **/
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.atlanmod.neo4emf.testdata.Link}.
	 * It is bidirectional and its opposite is '{@link fr.inria.atlanmod.neo4emf.testdata.Link#getInComing <em>In Coming</em>}'.
	 * <!-- begin-user-doc -->
	 *XX6a
	 * <p>
	 * If the meaning of the '<em>To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see fr.inria.atlanmod.neo4emf.testdata.TestPackage#getVertex_To()
	 * @see fr.inria.atlanmod.neo4emf.testdata.Link#getInComing
	 * @model opposite="inComing"
	 * @generated
	 */
	EList<Link> getTo(); 

/*
* Neo4EMF inserted code -- begin
*/
// vcontainer : ContainerType, bi:true, chan:true, list:false, change:true, kind:container reference
// from : EList<Link>, bi:true, chan:true, list:true, change:true, kind:reference list
// to : EList<Link>, bi:true, chan:true, list:true, change:true, kind:reference list
/*
* Neo4EMF inserted code -- end
*/




} // Vertex





