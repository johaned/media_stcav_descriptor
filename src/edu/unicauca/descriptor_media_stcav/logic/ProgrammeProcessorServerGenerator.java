package edu.unicauca.descriptor_media_stcav.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import edu.unicauca.descriptor_media_stcav.model.mbean.MyMBeanNotificationInfo;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.Attr;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.ManRes;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.Mcratr;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.Notif;

public class ProgrammeProcessorServerGenerator {

	public static ManRes do_create_man_res() {
		ManRes mr = new ManRes();
		List<Mcratr> mas = new ArrayList<Mcratr>();
		Attr a = new Attr();
		Notif n = new Notif();
		mr.setDomain("MediaServer");
		mr.setLyr("Servicios");
		mr.setName("ProgrammeProcessorServer");
		mr.setRefProt("1.2");
		mr.setImpact("1");
		mr.setDescr("Recurso gestionable encargado de gestionar los programas interactivos del STCAV");
		mr.setRegDate("190213");
		mr.setAlertable(true);
		mr.setMngable(true);
		mr.setMother(0L);
		mr.setMcratr(do_create_mcattrs(mr.getRefProt()));

		return mr;
	}

	private static List<Mcratr> do_create_mcattrs(String refprot) {
		List<Mcratr> mas = new ArrayList<Mcratr>();
		Mcratr ma = new Mcratr();

		// MacroAttribute Program  History
		ma = new Mcratr();
		ma.setId(1);
		ma.setName("ProgramHistory");
		ma.setType("simple");
		ma.setDescr("Gestiona los procesos del historial de programas");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs_ProgramHistory(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		// MacroAttribute Event History
		ma = new Mcratr();
		ma.setId(2);
		ma.setName("EventHistory");
		ma.setType("simple");
		ma.setDescr("Gestiona los procesos del historial de eventos");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs_EventHistory(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		// MacroAttribute InteractiveEvent
		ma = new Mcratr();
		ma.setId(3);
		ma.setName("InteractiveEvent");
		ma.setType("simple");
		ma.setDescr("Gestiona los procesos relacionados con eventos interactivos de TD");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs_interactiveEvent(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		return mas;
	}

	private static List<Attr> do_create_attrs_ProgramHistory(String refprot) {
		List<Attr> as = new ArrayList<Attr>();
		Attr attr = new Attr();
		// UserContentCounts
		attr.setId(1);
		attr.setName("ProgramListCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de historial de programas");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentPlayCounts
		attr = new Attr();
		attr.setId(2);
		attr.setName("DeleteProgramCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de eliminacion de un programa");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentUpgradeCounts
		attr = new Attr();
		attr.setId(3);
		attr.setName("CreateProgramCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de creacion de programas");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentInfoCounts
		attr = new Attr();
		attr.setId(4);
		attr.setName("EditProgramCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de edicion de programas");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// UserContentTime
		attr = new Attr();
		attr.setId(5);
		attr.setName("ProgramListTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de historial de programas");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentPlayTime
		attr = new Attr();
		attr.setId(6);
		attr.setName("DeleteProgramTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de eliminacion  de programas");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentUpgradeTime
		attr = new Attr();
		attr.setId(7);
		attr.setName("CreateProgramTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de creacion de programas");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentInfoTime
		attr = new Attr();
		attr.setId(8);
		attr.setName("EditProgramTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de edicion de programas");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);

		return as;
	}
	
	private static List<Attr> do_create_attrs_EventHistory(String refprot) {
		List<Attr> as = new ArrayList<Attr>();
		Attr attr = new Attr();
		// UserContentCounts
		attr.setId(1);
		attr.setName("EventListCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de historial de eventos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentPlayCounts
		attr = new Attr();
		attr.setId(2);
		attr.setName("PlayEventCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de reproduccion de un evento");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentInfoCounts
		attr = new Attr();
		attr.setId(3);
		attr.setName("EditEventCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de edicion de eventos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentUpgradeCounts
		attr = new Attr();
		attr.setId(4);
		attr.setName("DeleteEventCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de eliminacion de eventos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// UserContentTime
		attr = new Attr();
		attr.setId(5);
		attr.setName("EventListTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de historial de eventos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentPlayTime
		attr = new Attr();
		attr.setId(6);
		attr.setName("PlayEventTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de reproduccion de un evento");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentInfoTime
		attr = new Attr();
		attr.setId(7);
		attr.setName("EditEventTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de edicion de eventos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentUpgradeTime
		attr = new Attr();
		attr.setId(8);
		attr.setName("DeleteEventTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de eliminacion de eventos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);

		return as;
	}

	private static List<Attr> do_create_attrs_interactiveEvent(String refprot) {
		List<Attr> as = new ArrayList<Attr>();
		Attr attr = new Attr();
		// UserReferenceCounts
		attr.setId(1);
		attr.setName("CreateInteractiveEventCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de creacion de un evento interactivo");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// CommunityReferenceTime
		attr = new Attr();
		attr.setId(2);
		attr.setName("CreateInteractiveEventTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de un evento interactivo");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		return as;
	}

}
