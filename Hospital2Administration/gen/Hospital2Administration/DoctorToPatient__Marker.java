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

public interface DoctorToPatient__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public HospitalExample.Doctor getCONTEXT__SRC__d();
    
    public void setCONTEXT__SRC__d(HospitalExample.Doctor value);
    
    public HospitalExample.Department getCONTEXT__SRC__dep();
    
    public void setCONTEXT__SRC__dep(HospitalExample.Department value);
    
    public HospitalExample.Patient getCONTEXT__SRC__p1();
    
    public void setCONTEXT__SRC__p1(HospitalExample.Patient value);
    
    public HospitalExample.Room getCONTEXT__SRC__ro();
    
    public void setCONTEXT__SRC__ro(HospitalExample.Room value);
    
    public AdministrationExample.Patient getCONTEXT__TRG__p2();
    
    public void setCONTEXT__TRG__p2(AdministrationExample.Patient value);
    
    public AdministrationExample.Staff getCONTEXT__TRG__s();
    
    public void setCONTEXT__TRG__s(AdministrationExample.Staff value);
    
    public AdministrationExample.Treatment getCREATE__TRG__t();
    
    public void setCREATE__TRG__t(AdministrationExample.Treatment value);
    
    public Hospital2Administration.StaffToStaff getCONTEXT__CORR__dToS();
    
    public void setCONTEXT__CORR__dToS(Hospital2Administration.StaffToStaff value);
    
    public Hospital2Administration.PatientToPatient getCONTEXT__CORR__pToP();
    
    public void setCONTEXT__CORR__pToP(Hospital2Administration.PatientToPatient value);
    

}
