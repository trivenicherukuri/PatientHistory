package com.psic;

public class TimeTable {

	public void displayTimeTable() {

		int physicianID[] = { 101, 102, 103, 104, 105, 106 };
		String physicianName[] = { "Ram", "John", "Henry", "Geta", "Sadeep", "Unnati" };
		String physicianAddress[] = { "Hereford", "Manchester", "Chichester", "Hereford", "Liverpool", "Hereford" };
		int physicianPhNumber[] = { 12345, 43234, 44444, 65676, 87654, 34523 };
		String specialized[] = { "Osteopathy", "Rehabilitation", "Paediatrics", "Neurology", "Geriatrics",
				"Neurology" };
		String workDate[] = { "03-05-2021", "04-05-2021", "05-05-2021", "06-05-2021", "07-05-2021", "10-05-2021" };
		String room[] = {"A ward" , "B ward", "C ward" , "gym", "swimming pool", "D ward"};
		
		

		System.out.println("********************************************************************************************************************************************");
		System.out.println(
				"PhysicianID\tPhysicianName\tPhysicianAddress\tPhysicianPhNumber\tSpecialized   \t         Date   \t  Room Available");
		System.out.println("********************************************************************************************************************************************");

		for (int count = 0; count < physicianID.length; count++) {

			System.out.println(physicianID[count] + "        \t" + physicianName[count] + "        \t"
					+ physicianAddress[count] + "        \t" + physicianPhNumber[count] + "           \t"
					+ specialized[count] + "        \t" + workDate[count]+ "        \t" +room[count]);

		}
	}

}
