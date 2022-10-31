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

public class ShiftImpl extends SmartObject implements AdministrationExample.Shift {

    protected AdministrationExample.Daytime time = AdministrationExample.Daytime.NIGHT;
	
	protected ShiftImpl() {
		super(AdministrationExamplePackage.Literals.SHIFT);
	}
	
    
    @Override
    public AdministrationExample.Daytime getTime() {
    	return this.time;
    }
    
    @Override
    public void setTime(AdministrationExample.Daytime value) {
    	Object oldValue = this.time;
    	this.time = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.SHIFT__TIME, oldValue, value, -1));
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (AdministrationExamplePackage.Literals.SHIFT__TIME.equals(eFeature)) {
    		setTime((AdministrationExample.Daytime) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.SHIFT__TIME.equals(eFeature)) {
    		setTime((AdministrationExample.Daytime)AdministrationExample.Daytime.NIGHT); 
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
			b.append("time: ");
			b.append(getTime());
		} else {
			b.append("time: ");
			b.append(getTime());
		}
		b.append(")");
		return b.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.SHIFT__TIME.equals(eFeature))
    		return getTime();
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
