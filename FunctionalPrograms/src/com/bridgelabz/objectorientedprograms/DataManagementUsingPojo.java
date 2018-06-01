package com.bridgelabz.objectorientedprograms;

import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class DataManagementUsingPojo {

	static final String PATH="/home/adminsitrator/Documents/JavaProgramming/FunctionalPrograms/src/com/bridgelabz/objectorientedprograms/inventory.json";
	public static void main(String[] args) {
		
		PulsesDetails pulse=new PulsesDetails();
		pulse.setName("Toor");
		pulse.setPrice(160);
		pulse.setWeight(5);
		
		RiceDetails rice=new RiceDetails();
		rice.setName("Basamati");
		rice.setPrice(200);
		rice.setWeight(2);
		
		WheatsDetails wheat=new WheatsDetails();
		wheat.setName("Toor");
		wheat.setPrice(50);
		wheat.setWeight(3);
		
		ObjectMapper mapper=new ObjectMapper();
		
			
			try {
					@SuppressWarnings("resource")
					FileWriter writer= new FileWriter(PATH);
					String input=mapper.writeValueAsString(pulse);
					writer.write(input);
					writer.flush();
					
					String input1=mapper.writeValueAsString(rice);
					writer.write(input);
					writer.flush();
					
					String input2=mapper.writeValueAsString(wheat);
					writer.write(input);
					writer.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		
	}

}
