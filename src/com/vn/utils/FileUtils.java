package com.vn.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtils {

	public static Object readFile(String path) {

		try (FileInputStream inputStream =  new FileInputStream(path)){
			if(inputStream.read() == -1) {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));) {
			return objectInputStream.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	public static boolean writeFile(String path, Object object) throws IOException {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));) {
			objectOutputStream.writeObject(object);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}
	
}
