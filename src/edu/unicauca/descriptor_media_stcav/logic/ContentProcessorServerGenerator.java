package edu.unicauca.descriptor_media_stcav.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import edu.unicauca.descriptor_media_stcav.model.mbean.MyMBeanNotificationInfo;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.Attr;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.ManRes;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.Mcratr;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.Notif;

public class ContentProcessorServerGenerator {

	public static ManRes do_create_man_res() {
		ManRes mr = new ManRes();
		List<Mcratr> mas = new ArrayList<Mcratr>();
		Attr a = new Attr();
		Notif n = new Notif();
		mr.setDomain("MediaServer");
		mr.setLyr("Servicios");
		mr.setName("ContentProcessorServer");
		mr.setRefProt("1.1");
		mr.setImpact("1");
		mr.setDescr("Recurso gestionable encargado de gestionar los contenidos multimedia atomicos del STCAV");
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

		// MacroAttribute ReferenceSession
		ma.setId(1);
		ma.setName("ReferenceSession");
		ma.setType("simple");
		ma.setDescr("Establece la referencia cruzada entre el servidor de usuarios y el de contenidos multimedia");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs_referenceSession(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		// MacroAttribute ContentRecord
		ma = new Mcratr();
		ma.setId(2);
		ma.setName("ContentHistory");
		ma.setType("simple");
		ma.setDescr("Gestiona los procesos del historial de usuarios");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs_ContentHistory(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		// MacroAttribute ContentUpload
		ma = new Mcratr();
		ma.setId(3);
		ma.setName("ContentUploading");
		ma.setType("simple");
		ma.setDescr("Gestiona los procesos de carga de contenidos de usuario");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs_ContentUpload(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		// MacroAttribute ContentEditing
		ma = new Mcratr();
		ma.setId(4);
		ma.setName("ContentEditing");
		ma.setType("simple");
		ma.setDescr("Gestiona los procesos de edicion de contenidos de usuario");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs_ContentEditing(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		return mas;
	}

	private static List<Attr> do_create_attrs_ContentEditing(String refprot) {
		List<Attr> as = new ArrayList<Attr>();
		Attr attr = new Attr();
		// VideoEditedSavingCounts
		attr = new Attr();
		attr.setId(1);
		attr.setName("VideoEditedSavingCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de guardar la edicion de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// VideoEditedSavingTime
		attr = new Attr();
		attr.setId(2);
		attr.setName("VideoEditedSavingTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de guardar la edicion de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		
		return as;
	}

	private static List<Attr> do_create_attrs_ContentUpload(String refprot) {
		List<Attr> as = new ArrayList<Attr>();
		Attr attr = new Attr();
		// ContentUploadingCounts
		attr.setId(1);
		attr.setName("ContentUploadingCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de carga de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentLabelingCounts
		attr = new Attr();
		attr.setId(2);
		attr.setName("ContentLabelingCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de rotulacion de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentLabelEditCounts
		attr = new Attr();
		attr.setId(3);
		attr.setName("ContentLabelEditCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de edicion de informacion del contenido cargado");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentUploadingTime
		attr = new Attr();
		attr.setId(4);
		attr.setName("ContentUploadingTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de carga de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentLabelingTime
		attr = new Attr();
		attr.setId(5);
		attr.setName("ContentLabelingTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de rotulacion de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentLabelEditTime
		attr = new Attr();
		attr.setId(6);
		attr.setName("ContentLabelEditTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de informacion del contenido cargado");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		return as;
	}

	private static List<Attr> do_create_attrs_ContentHistory(String refprot) {
		List<Attr> as = new ArrayList<Attr>();
		Attr attr = new Attr();
		// UserContentCounts
		attr.setId(1);
		attr.setName("UserContentCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de contenidos del usuario");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentPlayCounts
		attr = new Attr();
		attr.setId(2);
		attr.setName("ContentPlayCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de reproduccion de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentUpgradeCounts
		attr = new Attr();
		attr.setId(3);
		attr.setName("ContentUpgradeCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de edicion de metainfo de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentInfoCounts
		attr = new Attr();
		attr.setId(4);
		attr.setName("ContentInfoCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de visualizacion de metainfo de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// UserContentTime
		attr = new Attr();
		attr.setId(5);
		attr.setName("UserContentTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de contenidos del usuario");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentPlayTime
		attr = new Attr();
		attr.setId(6);
		attr.setName("ContentPlayTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de reproduccion de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentUpgradeTime
		attr = new Attr();
		attr.setId(7);
		attr.setName("ContentUpgradeTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de edicion de metainfo de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ContentInfoTime
		attr = new Attr();
		attr.setId(8);
		attr.setName("ContentInfoTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de metainfo de contenidos");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);

		return as;
	}

	private static List<Attr> do_create_attrs_referenceSession(String refprot) {
		List<Attr> as = new ArrayList<Attr>();
		Attr attr = new Attr();
		// UserReferenceCounts
		attr.setId(1);
		attr.setName("UserReferenceCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de referencia cruzada para una sesion de usuario");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// CommunityReferenceCounts
		attr = new Attr();
		attr.setId(2);
		attr.setName("CommunityReferenceCounts");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("Numero de veces que se accede al servicio de referencia cruzada para una sesion de comunidad");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// UserReferenceTime
		attr = new Attr();
		attr.setId(1);
		attr.setName("UserReferenceTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de referencia cruzada para la sesison de usuario");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// CommunityReferenceTime
		attr = new Attr();
		attr.setId(2);
		attr.setName("CommunityReferenceTime");
		attr.setDataType("java.lang.Long");
		attr.setDescr("tiempo en milisegundos que se demora en ejecutar el proceso de referencia cruzada ara la sesion de comunidad");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		return as;
	}

}
