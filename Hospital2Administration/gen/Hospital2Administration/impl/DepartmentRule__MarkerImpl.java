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

public class DepartmentRule__MarkerImpl extends SmartObject implements Hospital2Administration.DepartmentRule__Marker {

    protected runtime.Protocol protocol = null;
    protected HospitalExample.Department CREATE__SRC__d = null;
    protected HospitalExample.Hospital CONTEXT__SRC__h = null;
	
	protected DepartmentRule__MarkerImpl() {
		super(Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER);
	}
	
    
    @Override
    public runtime.Protocol getProtocol() {
    	return this.protocol;
    }
    
    @Override
    public void setProtocol(runtime.Protocol value) {
    	
    	Object oldValue = this.protocol;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.protocol = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL, oldValue, value, -1));
    	        	
    	
    	        	if(oldValue != null) {
    	        		((SmartObject) oldValue).eInverseRemove(this, RuntimePackage.Literals.PROTOCOL__STEPS);
    	        	}
    	        	if(value != null) {
    	        		((SmartObject) value).eInverseAdd(this, RuntimePackage.Literals.PROTOCOL__STEPS);
    	        	}
    }
    
    private void setProtocolAsInverse(runtime.Protocol value) {
			    
			    Object oldValue = this.protocol;
			    
			    if(value == null && oldValue == null)
			    	return;
			    	
			    if(value != null && value.equals(oldValue))
			    	return;
			    	
			    
			    
			    	        this.protocol = value;
			    
			    
			            	sendNotification(SmartEMFNotification.createSetNotification(this, RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL, oldValue, value, -1));
			            	
    }
    
    @Override
    public HospitalExample.Department getCREATE__SRC__d() {
    	return this.CREATE__SRC__d;
    }
    
    @Override
    public void setCREATE__SRC__d(HospitalExample.Department value) {
    	
    	Object oldValue = this.CREATE__SRC__d;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__d = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CREAT_E__SR_C__D, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CREAT_E__SR_C__D.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CREAT_E__SR_C__D.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CREAT_E__SR_C__D.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public HospitalExample.Hospital getCONTEXT__SRC__h() {
    	return this.CONTEXT__SRC__h;
    }
    
    @Override
    public void setCONTEXT__SRC__h(HospitalExample.Hospital value) {
    	
    	Object oldValue = this.CONTEXT__SRC__h;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__h = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CONTEX_T__SR_C__H, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CONTEX_T__SR_C__H.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CONTEX_T__SR_C__H.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CONTEX_T__SR_C__H.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CREAT_E__SR_C__D.equals(eFeature)) {
    		setCREATE__SRC__d((HospitalExample.Department) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CONTEX_T__SR_C__H.equals(eFeature)) {
    		setCONTEXT__SRC__h((HospitalExample.Hospital) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CREAT_E__SR_C__D.equals(eFeature)) {
    		setCREATE__SRC__d((HospitalExample.Department)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CONTEX_T__SR_C__H.equals(eFeature)) {
    		setCONTEXT__SRC__h((HospitalExample.Hospital)null); 
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
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature))
    		return getProtocol();
    	if (Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CREAT_E__SR_C__D.equals(eFeature))
    		return getCREATE__SRC__d();
    	if (Hospital2AdministrationPackage.Literals.DEPARTMENT_RULE___MARKER__CONTEX_T__SR_C__H.equals(eFeature))
    		return getCONTEXT__SRC__h();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(feature)) {
setProtocolAsInverse((runtime.Protocol) otherEnd); 
 	return;
			        }	
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(feature)) {
setProtocolAsInverse(null); 
 	return;
			        }
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
