package edu.unicauca.descriptor_media_stcav.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import edu.unicauca.descriptor_media_stcav.model.mbean.MyMBeanNotificationInfo;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.Attr;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.ManRes;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.Mcratr;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.Notif;

public class EvaProcessorServerGenerator {

	public static ManRes do_create_man_res() {
		ManRes mr = new ManRes();
		List<Mcratr> mas = new ArrayList<Mcratr>();
		Attr a = new Attr();
		Notif n = new Notif();
		mr.setDomain("MediaServer");
		mr.setLyr("Servicios");
		mr.setName("EvaProcessorServer");
		mr.setRefProt("1.3");
		mr.setImpact("1");
		mr.setDescr("Recurso gestionable encargado de gestionar el procesamiento de los contenidos multimedia del STCAV");
		mr.setRegDate("240213");
		mr.setAlertable(true);
		mr.setMngable(true);
		mr.setMother(0L);
		mr.setMcratr(do_create_mcattrs(mr.getRefProt()));

		return mr;
	}

	private static List<Mcratr> do_create_mcattrs(String refprot) {
		List<Mcratr> mas = new ArrayList<Mcratr>();
		Mcratr ma = new Mcratr();

		// MacroAttribute ResizeVideoHD
		ma.setId(1);
		ma.setName("ResizeVideoHD");
		ma.setType("composite");
		ma.setDescr("Proceso de redimensionamiento y transcodificacion a MPEG4 720p");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		// MacroAttribute TranscodeVideoPalMpeg2
		ma = new Mcratr();
		ma.setId(2);
		ma.setName("TranscodeVideoPalMpeg2");
		ma.setType("composite");
		ma.setDescr("Transcodifica solo video a mpeg 2");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		// MacroAttribute TranscodeAudioPalMpeg2
		ma = new Mcratr();
		ma.setId(3);
		ma.setName("TranscodeAudioPalMpeg2");
		ma.setType("composite");
		ma.setDescr("Transcodifica solo audio a mpeg 2");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		// MacroAttribute CutVideoHd
		ma = new Mcratr();
		ma.setId(4);
		ma.setName("CutVideoHd");
		ma.setType("simple");
		ma.setDescr("Fragmenta un video desde un punto inicial a un punto final respecto del video original");
		ma.setRefProt(refprot + "." + ma.getId());
		ma.setAttr(do_create_attrs(ma.getRefProt()));
		ma.setNotif(new ArrayList<Notif>());
		mas.add(ma);

		return mas;
	}
	
	private static List<Attr> do_create_attrs(String refprot) {
		List<Attr> as = new ArrayList<Attr>();
		Attr attr = new Attr();
		// VCodec
		attr.setId(1);
		attr.setName("VCodec");
		attr.setDataType("java.lang.String");
		attr.setDescr("Codificacion del video");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ACodec
		attr = new Attr();
		attr.setId(2);
		attr.setName("ACodec");
		attr.setDataType("java.lang.String");
		attr.setDescr("Codificacion de audio");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// UserReferenceTime
		attr = new Attr();
		attr.setId(3);
		attr.setName("Duration");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("tiempo en segundos que dura el contenido multimedia");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// ProcessDuration
		attr = new Attr();
		attr.setId(4);
		attr.setName("ProcessDuration");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("tiempo en segundos que dura el proceso de transformacion asociado al contenido multimedia");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// Bitrate
		attr = new Attr();
		attr.setId(5);
		attr.setName("Bitrate");
		attr.setDataType("java.lang.Integer");
		attr.setDescr("tasa de bits del video del contenido multimedia");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		// Resolution
		attr = new Attr();
		attr.setId(6);
		attr.setName("Resolution");
		attr.setDataType("java.lang.String");
		attr.setDescr("Resolucion del video en formato: ppxpp");
		attr.setRefProt(refprot + "." + attr.getId());
		as.add(attr);
		return as;
	}

}
