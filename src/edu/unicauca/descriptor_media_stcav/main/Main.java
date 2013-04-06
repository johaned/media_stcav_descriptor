package edu.unicauca.descriptor_media_stcav.main;

import edu.unicauca.descriptor_media_stcav.logic.ContentProcessorGenerator;
import edu.unicauca.descriptor_media_stcav.logic.ParserXML;
import edu.unicauca.descriptor_media_stcav.logic.SkeletonProcessor;
import edu.unicauca.descriptor_media_stcav.miscellaneus.Log;
import edu.unicauca.descriptor_media_stcav.miscellaneus.TimeOfLife;
import edu.unicauca.descriptor_media_stcav.model.mongoskeleton.ManRes;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TimeOfLife tol = new TimeOfLife();
		tol.set_home_time(System.currentTimeMillis());
		ManRes contentProcessorServer = ContentProcessorGenerator.do_create_man_res();
		ParserXML.document_to_single_xml_myMBeanInfo(SkeletonProcessor.do_object_to_jmx(contentProcessorServer));
		tol.set_end_time(System.currentTimeMillis());
		Log.print("Tiempo de proceso: "+tol.get_tot_());
		

	}

}
