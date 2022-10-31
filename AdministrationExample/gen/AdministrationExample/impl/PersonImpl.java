package AdministrationExample.impl;

import AdministrationExample.AdministrationExamplePackage;
import AdministrationExample.AdministrationExamplePackage;

import org.emoflon.smartemf.runtime.*;
import org.emoflon.smartemf.runtime.collections.*;
import org.emoflon.smartemf.persistence.SmartEMFResource;
import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.notification.NotifyStatus;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class PersonImpl extends SmartObject implements AdministrationExample.Person {

    protected java.lang.String firstName = null;
    protected java.lang.String lastName = null;
	
	protected PersonImpl() {
		super(AdministrationExamplePackage.Literals.PERSON);
	}
	
    
    @Override
    public java.lang.String getFirstName() {
    	return this.firstName;
    }
    
    @Override
    public void setFirstName(java.lang.String value) {
    	Object oldValue = this.firstName;
    	this.firstName = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.PERSON__FIRST_NAME, oldValue, value, -1));
    }
    
    
    @Override
    public java.lang.String getLastName() {
    	return this.lastName;
    }
    
    @Override
    public void setLastName(java.lang.String value) {
    	Object oldValue = this.lastName;
    	this.lastName = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.PERSON__LAST_NAME, oldValue, value, -1));
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (AdministrationExamplePackage.Literals.PERSON__FIRST_NAME.equals(eFeature)) {
    		setFirstName((java.lang.String) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.PERSON__LAST_NAME.equals(eFeature)) {
    		setLastName((java.lang.String) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.PERSON__FIRST_NAME.equals(eFeature)) {
    		setFirstName((java.lang.String)null); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.PERSON__LAST_NAME.equals(eFeature)) {
    		setLastName((java.lang.String)null); 
    		return;
    	}
    	eDynamicUnset(eFeature);
    }

    @Override
    public String toString(){
		StringBuilder b = new StringBuilder();
		b.append(super.toString());
		b.append(" (");
		if (SmartEMFConfig.simpleStringRepresentations()) {
			b.append("firstName: ");
			b.append(getFirstName());
		} else {
			b.append("firstName: ");
			b.append(getFirstName());b.append(", ");
			b.append("lastName: ");
			b.append(getLastName());
		}
		b.append(")");
		return b.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.PERSON__FIRST_NAME.equals(eFeature))
    		return getFirstName();
    	if (AdministrationExamplePackage.Literals.PERSON__LAST_NAME.equals(eFeature))
    		return getLastName();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    		    		
    	eDynamicInverseRemove(otherEnd, feature);
	    	}
    
    @Override
    /**
    * This method sets the resource and generates REMOVING_ADAPTER and ADD notifications
    */
    protected void setResourceOfContainments(Consumer<SmartObject> setResourceCall) {
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
	    	}
}
