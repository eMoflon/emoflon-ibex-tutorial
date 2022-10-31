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

public class NurseShiftplanRule__MarkerImpl extends SmartObject implements Hospital2Administration.NurseShiftplanRule__Marker {

    protected runtime.Protocol protocol = null;
    protected HospitalExample.Patient CONTEXT__SRC__p1 = null;
    protected HospitalExample.Room CONTEXT__SRC__ro = null;
    protected HospitalExample.Nurse CONTEXT__SRC__s1 = null;
    protected AdministrationExample.Patient CONTEXT__TRG__p2 = null;
    protected AdministrationExample.Staff CONTEXT__TRG__s2 = null;
    protected AdministrationExample.Shift CONTEXT__TRG__sh = null;
    protected AdministrationExample.Shiftplan CONTEXT__TRG__sp = null;
    protected Hospital2Administration.PatientToPatient CONTEXT__CORR__pToP = null;
    protected Hospital2Administration.StaffToStaff CONTEXT__CORR__sToS = null;
	
	protected NurseShiftplanRule__MarkerImpl() {
		super(Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER);
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
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public HospitalExample.Room getCONTEXT__SRC__ro() {
    	return this.CONTEXT__SRC__ro;
    }
    
    @Override
    public void setCONTEXT__SRC__ro(HospitalExample.Room value) {
    	
    	Object oldValue = this.CONTEXT__SRC__ro;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__ro = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public HospitalExample.Nurse getCONTEXT__SRC__s1() {
    	return this.CONTEXT__SRC__s1;
    }
    
    @Override
    public void setCONTEXT__SRC__s1(HospitalExample.Nurse value) {
    	
    	Object oldValue = this.CONTEXT__SRC__s1;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__s1 = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1.getEOpposite());
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
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public AdministrationExample.Staff getCONTEXT__TRG__s2() {
    	return this.CONTEXT__TRG__s2;
    }
    
    @Override
    public void setCONTEXT__TRG__s2(AdministrationExample.Staff value) {
    	
    	Object oldValue = this.CONTEXT__TRG__s2;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__s2 = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public AdministrationExample.Shift getCONTEXT__TRG__sh() {
    	return this.CONTEXT__TRG__sh;
    }
    
    @Override
    public void setCONTEXT__TRG__sh(AdministrationExample.Shift value) {
    	
    	Object oldValue = this.CONTEXT__TRG__sh;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__sh = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public AdministrationExample.Shiftplan getCONTEXT__TRG__sp() {
    	return this.CONTEXT__TRG__sp;
    }
    
    @Override
    public void setCONTEXT__TRG__sp(AdministrationExample.Shiftplan value) {
    	
    	Object oldValue = this.CONTEXT__TRG__sp;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__sp = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Hospital2Administration.PatientToPatient getCONTEXT__CORR__pToP() {
    	return this.CONTEXT__CORR__pToP;
    }
    
    @Override
    public void setCONTEXT__CORR__pToP(Hospital2Administration.PatientToPatient value) {
    	
    	Object oldValue = this.CONTEXT__CORR__pToP;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__pToP = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Hospital2Administration.StaffToStaff getCONTEXT__CORR__sToS() {
    	return this.CONTEXT__CORR__sToS;
    }
    
    @Override
    public void setCONTEXT__CORR__sToS(Hospital2Administration.StaffToStaff value) {
    	
    	Object oldValue = this.CONTEXT__CORR__sToS;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__sToS = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1.equals(eFeature)) {
    		setCONTEXT__SRC__p1((HospitalExample.Patient) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO.equals(eFeature)) {
    		setCONTEXT__SRC__ro((HospitalExample.Room) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1.equals(eFeature)) {
    		setCONTEXT__SRC__s1((HospitalExample.Nurse) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2.equals(eFeature)) {
    		setCONTEXT__TRG__p2((AdministrationExample.Patient) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2.equals(eFeature)) {
    		setCONTEXT__TRG__s2((AdministrationExample.Staff) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH.equals(eFeature)) {
    		setCONTEXT__TRG__sh((AdministrationExample.Shift) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP.equals(eFeature)) {
    		setCONTEXT__TRG__sp((AdministrationExample.Shiftplan) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP.equals(eFeature)) {
    		setCONTEXT__CORR__pToP((Hospital2Administration.PatientToPatient) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS.equals(eFeature)) {
    		setCONTEXT__CORR__sToS((Hospital2Administration.StaffToStaff) newValue); 
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
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1.equals(eFeature)) {
    		setCONTEXT__SRC__p1((HospitalExample.Patient)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO.equals(eFeature)) {
    		setCONTEXT__SRC__ro((HospitalExample.Room)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1.equals(eFeature)) {
    		setCONTEXT__SRC__s1((HospitalExample.Nurse)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2.equals(eFeature)) {
    		setCONTEXT__TRG__p2((AdministrationExample.Patient)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2.equals(eFeature)) {
    		setCONTEXT__TRG__s2((AdministrationExample.Staff)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH.equals(eFeature)) {
    		setCONTEXT__TRG__sh((AdministrationExample.Shift)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP.equals(eFeature)) {
    		setCONTEXT__TRG__sp((AdministrationExample.Shiftplan)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP.equals(eFeature)) {
    		setCONTEXT__CORR__pToP((Hospital2Administration.PatientToPatient)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS.equals(eFeature)) {
    		setCONTEXT__CORR__sToS((Hospital2Administration.StaffToStaff)null); 
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
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1.equals(eFeature))
    		return getCONTEXT__SRC__p1();
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO.equals(eFeature))
    		return getCONTEXT__SRC__ro();
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1.equals(eFeature))
    		return getCONTEXT__SRC__s1();
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2.equals(eFeature))
    		return getCONTEXT__TRG__p2();
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2.equals(eFeature))
    		return getCONTEXT__TRG__s2();
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH.equals(eFeature))
    		return getCONTEXT__TRG__sh();
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP.equals(eFeature))
    		return getCONTEXT__TRG__sp();
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP.equals(eFeature))
    		return getCONTEXT__CORR__pToP();
    	if (Hospital2AdministrationPackage.Literals.NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS.equals(eFeature))
    		return getCONTEXT__CORR__sToS();
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
