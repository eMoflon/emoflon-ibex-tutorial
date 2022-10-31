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

public class NurseToRoomRule__MarkerImpl extends SmartObject implements Hospital2Administration.NurseToRoomRule__Marker {

    protected runtime.Protocol protocol = null;
    protected HospitalExample.Department CONTEXT__SRC__dep = null;
    protected HospitalExample.Nurse CONTEXT__SRC__n = null;
    protected HospitalExample.Patient CONTEXT__SRC__p1 = null;
    protected HospitalExample.Room CONTEXT__SRC__r = null;
    protected AdministrationExample.Patient CONTEXT__TRG__p2 = null;
    protected AdministrationExample.Staff CONTEXT__TRG__s = null;
    protected Hospital2Administration.StaffToStaff CONTEXT__CORR__nToS = null;
    protected Hospital2Administration.PatientToPatient CONTEXT__CORR__pTop = null;
	
	protected NurseToRoomRule__MarkerImpl() {
		super(Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER);
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
    public HospitalExample.Department getCONTEXT__SRC__dep() {
    	return this.CONTEXT__SRC__dep;
    }
    
    @Override
    public void setCONTEXT__SRC__dep(HospitalExample.Department value) {
    	
    	Object oldValue = this.CONTEXT__SRC__dep;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__dep = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public HospitalExample.Nurse getCONTEXT__SRC__n() {
    	return this.CONTEXT__SRC__n;
    }
    
    @Override
    public void setCONTEXT__SRC__n(HospitalExample.Nurse value) {
    	
    	Object oldValue = this.CONTEXT__SRC__n;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__n = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public HospitalExample.Patient getCONTEXT__SRC__p1() {
    	return this.CONTEXT__SRC__p1;
    }
    
    @Override
    public void setCONTEXT__SRC__p1(HospitalExample.Patient value) {
    	
    	Object oldValue = this.CONTEXT__SRC__p1;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__p1 = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public HospitalExample.Room getCONTEXT__SRC__r() {
    	return this.CONTEXT__SRC__r;
    }
    
    @Override
    public void setCONTEXT__SRC__r(HospitalExample.Room value) {
    	
    	Object oldValue = this.CONTEXT__SRC__r;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__r = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public AdministrationExample.Patient getCONTEXT__TRG__p2() {
    	return this.CONTEXT__TRG__p2;
    }
    
    @Override
    public void setCONTEXT__TRG__p2(AdministrationExample.Patient value) {
    	
    	Object oldValue = this.CONTEXT__TRG__p2;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__p2 = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public AdministrationExample.Staff getCONTEXT__TRG__s() {
    	return this.CONTEXT__TRG__s;
    }
    
    @Override
    public void setCONTEXT__TRG__s(AdministrationExample.Staff value) {
    	
    	Object oldValue = this.CONTEXT__TRG__s;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__s = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Hospital2Administration.StaffToStaff getCONTEXT__CORR__nToS() {
    	return this.CONTEXT__CORR__nToS;
    }
    
    @Override
    public void setCONTEXT__CORR__nToS(Hospital2Administration.StaffToStaff value) {
    	
    	Object oldValue = this.CONTEXT__CORR__nToS;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__nToS = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Hospital2Administration.PatientToPatient getCONTEXT__CORR__pTop() {
    	return this.CONTEXT__CORR__pTop;
    }
    
    @Override
    public void setCONTEXT__CORR__pTop(Hospital2Administration.PatientToPatient value) {
    	
    	Object oldValue = this.CONTEXT__CORR__pTop;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__pTop = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP.equals(eFeature)) {
    		setCONTEXT__SRC__dep((HospitalExample.Department) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N.equals(eFeature)) {
    		setCONTEXT__SRC__n((HospitalExample.Nurse) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1.equals(eFeature)) {
    		setCONTEXT__SRC__p1((HospitalExample.Patient) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R.equals(eFeature)) {
    		setCONTEXT__SRC__r((HospitalExample.Room) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2.equals(eFeature)) {
    		setCONTEXT__TRG__p2((AdministrationExample.Patient) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S.equals(eFeature)) {
    		setCONTEXT__TRG__s((AdministrationExample.Staff) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS.equals(eFeature)) {
    		setCONTEXT__CORR__nToS((Hospital2Administration.StaffToStaff) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP.equals(eFeature)) {
    		setCONTEXT__CORR__pTop((Hospital2Administration.PatientToPatient) newValue); 
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
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP.equals(eFeature)) {
    		setCONTEXT__SRC__dep((HospitalExample.Department)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N.equals(eFeature)) {
    		setCONTEXT__SRC__n((HospitalExample.Nurse)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1.equals(eFeature)) {
    		setCONTEXT__SRC__p1((HospitalExample.Patient)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R.equals(eFeature)) {
    		setCONTEXT__SRC__r((HospitalExample.Room)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2.equals(eFeature)) {
    		setCONTEXT__TRG__p2((AdministrationExample.Patient)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S.equals(eFeature)) {
    		setCONTEXT__TRG__s((AdministrationExample.Staff)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS.equals(eFeature)) {
    		setCONTEXT__CORR__nToS((Hospital2Administration.StaffToStaff)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP.equals(eFeature)) {
    		setCONTEXT__CORR__pTop((Hospital2Administration.PatientToPatient)null); 
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
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP.equals(eFeature))
    		return getCONTEXT__SRC__dep();
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N.equals(eFeature))
    		return getCONTEXT__SRC__n();
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1.equals(eFeature))
    		return getCONTEXT__SRC__p1();
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R.equals(eFeature))
    		return getCONTEXT__SRC__r();
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2.equals(eFeature))
    		return getCONTEXT__TRG__p2();
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S.equals(eFeature))
    		return getCONTEXT__TRG__s();
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS.equals(eFeature))
    		return getCONTEXT__CORR__nToS();
    	if (Hospital2AdministrationPackage.Literals.NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP.equals(eFeature))
    		return getCONTEXT__CORR__pTop();
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
