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

public interface NurseToStaffRule__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public HospitalExample.Department getCONTEXT__SRC__d();
    
    public void setCONTEXT__SRC__d(HospitalExample.Department value);
    
    public HospitalExample.Hospital getCONTEXT__SRC__h();
    
    public void setCONTEXT__SRC__h(HospitalExample.Hospital value);
    
    public HospitalExample.Nurse getCREATE__SRC__s1();
    
    public void setCREATE__SRC__s1(HospitalExample.Nurse value);
    
    public AdministrationExample.Staff getCREATE__TRG__s2();
    
    public void setCREATE__TRG__s2(AdministrationExample.Staff value);
    
    public AdministrationExample.Shift getCREATE__TRG__sh();
    
    public void setCREATE__TRG__sh(AdministrationExample.Shift value);
    
    public AdministrationExample.Shiftplan getCREATE__TRG__sp();
    
    public void setCREATE__TRG__sp(AdministrationExample.Shiftplan value);
    
    public AdministrationExample.Administration getCONTEXT__TRG__v();
    
    public void setCONTEXT__TRG__v(AdministrationExample.Administration value);
    
    public Hospital2Administration.HospitalToAdministration getCONTEXT__CORR__htov();
    
    public void setCONTEXT__CORR__htov(Hospital2Administration.HospitalToAdministration value);
    
    public Hospital2Administration.StaffToStaff getCREATE__CORR__stot();
    
    public void setCREATE__CORR__stot(Hospital2Administration.StaffToStaff value);
    

}
