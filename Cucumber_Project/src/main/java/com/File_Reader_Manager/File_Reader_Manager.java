package com.File_Reader_Manager;

import com.Configuration_Reader.Configuration_Reader;


	public class File_Reader_Manager {
		
		private void file_Reader_Manager() {

			}
			
		public static File_Reader_Manager getInstanceFRM() {
			File_Reader_Manager frm=new File_Reader_Manager();
			return frm;
		}
		public Configuration_Reader getInstanceCR() throws Throwable {
				Configuration_Reader reader = new Configuration_Reader();
				return reader;		
			}
	}

