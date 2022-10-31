package Hospital2Administration;

import runtime.RuntimePackage;
import Hospital2Administration.Hospital2AdministrationPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface NurseShiftplanRule__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public HospitalExample.Patient getCONTEXT__SRC__p1();
    
    public void setCONTEXT__SRC__p1(HospitalExample.Patient value);
    
    public HospitalExample.Room getCONTEXT__SRC__ro();
    
    public void setCONTEXT__SRC__ro(HospitalExample.Room value);
    
    public HospitalExample.Nurse getCONTEXT__SRC__s1();
    
    public void setCONTEXT__SRC__s1(HospitalExample.Nurse value);
    
    public AdministrationExample.Patient getCONTEXT__TRG__p2();
    
    public void setCONTEXT__TRG__p2(AdministrationExample.Patient value);
    
    public AdministrationExample.Staff getCONTEXT__TRG__s2();
    
    public void setCONTEXT__TRG__s2(AdministrationExample.Staff value);
    
    public AdministrationExample.Shift getCONTEXT__TRG__sh();
    
    public void setCONTEXT__TRG__sh(AdministrationExample.Shift value);
    
    public AdministrationExample.Shiftplan getCONTEXT__TRG__sp();
    
    public void setCONTEXT__TRG__sp(AdministrationExample.Shiftplan value);
    
    public Hospital2Administration.PatientToPatient getCONTEXT__CORR__pToP();
    
    public void setCONTEXT__CORR__pToP(Hospital2Administration.PatientToPatient value);
    
    public Hospital2Administration.StaffToStaff getCONTEXT__CORR__sToS();
    
    public void setCONTEXT__CORR__sToS(Hospital2Administration.StaffToStaff value);
    

}
