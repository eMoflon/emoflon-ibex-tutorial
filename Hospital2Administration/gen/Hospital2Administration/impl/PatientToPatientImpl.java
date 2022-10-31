package Hospital2Administration.impl;

import Hospital2Administration.Hospital2AdministrationPackage;
import runtime.RuntimePackage;
import Hospital2Administration.Hospital2AdministrationPackage;

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

public class PatientToPatientImpl extends SmartObject implements Hospital2Administration.PatientToPatient {

    protected HospitalExample.Patient source = null;
    protected AdministrationExample.Patient target = null;
	
	protected PatientToPatientImpl() {
		super(Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT);
	}
	
    
    @Override
    public HospitalExample.Patient getSource() {
    	return this.source;
    }
    
    @Override
    public void setSource(HospitalExample.Patient value) {
    	
    	Object oldValue = this.source;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.source = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__SOURCE, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__SOURCE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__SOURCE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__SOURCE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public AdministrationExample.Patient getTarget() {
    	return this.target;
    }
    
    @Override
    public void setTarget(AdministrationExample.Patient value) {
    	
    	Object oldValue = this.target;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.target = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__TARGET, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__TARGET.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__TARGET.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__TARGET.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__SOURCE.equals(eFeature)) {
    		setSource((HospitalExample.Patient) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__TARGET.equals(eFeature)) {
    		setTarget((AdministrationExample.Patient) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__SOURCE.equals(eFeature)) {
    		setSource((HospitalExample.Patient)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__TARGET.equals(eFeature)) {
    		setTarget((AdministrationExample.Patient)null); 
    		return;
    	}
    	eDynamicUnset(eFeature);
    }

    @Override
    public String toString(){
		return super.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__SOURCE.equals(eFeature))
    		return getSource();
    	if (Hospital2AdministrationPackage.Literals.PATIENT_TO_PATIENT__TARGET.equals(eFeature))
    		return getTarget();
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
