package com.edubridge.Smart_Tv;
import java.util.List;
import java.util.Scanner;
import com.edubridge.Smart_Tv.model.SmartTv;
import com.edubridge.Smart_Tv.service.SmartTvServices;
public class App {
	public static void main(String[] args) {
		int option = 0;
		Scanner in = new Scanner(System.in);
		SmartTvServices service = new SmartTvServices();
		String tvName, displaySize, displayResolution,displayTechnology,conectivityOption,audioQuality,warranty,refreshRate;
		int price=0;
		tvName = displaySize = displayResolution = displayTechnology=conectivityOption=audioQuality=warranty=refreshRate=null;
		int status = 0;
		do {
			System.out.println("Welcome to Contact Application");
			System.out.println("==============================");
			System.out.println("1. Add Smart Tv");
			System.out.println("2. View All Smart Tv's");
			System.out.println("3. Search Smart Tv");
			System.out.println("4. Update Smart Tv");
			System.out.println("5. Delete Smart Tv");
			System.out.println("6. Delete All Smart Tv's");
			System.out.println("0. Exit");
			System.out.println("Please choose option: ");
			option = in.nextInt();

			switch (option) {
			case 1:
				System.out.println("Add New Smart Tv");
				System.out.println("------------");
				System.out.println("Enter Smart Tv Name: ");
				tvName = in.next();
				System.out.println("Enter displaySize: ");
				displaySize = in.next();
				System.out.println("Enter displayResolution : ");
				displayResolution = in.next();
				System.out.println("Enter displayTechnology : ");
				displayTechnology = in.next();
				System.out.println("Enter conectivityOption : ");
				conectivityOption = in.next();
				System.out.println("Enter audioQuality : ");
				audioQuality = in.next();
				System.out.println("Enter warranty : ");
				warranty = in.next();
				System.out.println("Enter refreshRate : ");
				refreshRate = in.next();
				System.out.println("Enter price : ");
				price = in.nextInt();
				

				SmartTv smartTv = new SmartTv();
				smartTv.setTvName(tvName);;
				smartTv.setDisplaySize(displaySize);
				smartTv.setDisplayTechnology(displayTechnology);
				smartTv.setDisplayResolution(displayResolution);
				smartTv.setConnectivityOptions(conectivityOption);
				smartTv.setAudioQuality(audioQuality);
				smartTv.setWarranty(warranty);
				smartTv.setRefreshRate(refreshRate);
				smartTv.setPrice(price);

				service.addSmartTv(smartTv);
				break;

			case 2:
				System.out.println("View All Contacts");
				System.out.println("-----------------");
				List<SmartTv> smarttv = service.getAllSmartTvs();
				if (smarttv.size() != 0) {
					for (SmartTv st : smarttv) {
						System.out.println(st.getId() + "\t" + st.getTvName() + "\t" + st.getDisplaySize() + "\t" + st.getDisplayResolution()+ "\t" +st.getDisplayTechnology()+ "\t" +st.getConnectivityOptions()+ "\t" +st.getAudioQuality()+ "\t" +st.getWarranty()+ "\t" +st.getRefreshRate()+ "\t" +st.getPrice());
					}
				} else {
					System.out.println("no smart tv found");
				}
				break;

			case 3:
				System.out.println("Search Contact");
				System.out.println("---------------");
				System.out.println("Please enter contact id: ");
				int id = in.nextInt();
				SmartTv st = service.getSmartTvById(id);
				if (st != null) {
					System.out.println("Smart tv name Name: " + st.getTvName());
					System.out.println("Smart tv getDisplaySize: " + st.getDisplaySize());
					System.out.println("Smart tv getDisplayResolution: " + st.getDisplayResolution());
					System.out.println("Smart tv getDisplayTechnology: " + st.getDisplayTechnology());
					System.out.println("Smart tv getConnectivityOptions: " + st.getConnectivityOptions());
					System.out.println("Smart tv getAudioQuality: " + st.getAudioQuality());
					System.out.println("Smart tv getRefreshRate: " + st.getRefreshRate());
					System.out.println("Smart tv getWarranty: " + st.getWarranty());
					System.out.println("Smart tv getPrice: " + st.getPrice());
				} else {
					System.out.println("No Smart Tv found with id: " + id);
				}
				break;
				
			case 4:
				System.out.println("Update Smart Tv Details");
				System.out.println("----------------------");
				System.out.println("Enter Smart Tv Id: ");
				int smartTvId = in.nextInt();
				System.out.println("Enter Smart Tv Name: ");
				tvName = in.next();
				System.out.println("Enter displaySize : ");
				displaySize = in.next();
				System.out.println("Enter displayResolution: ");
				displayResolution = in.next();
				System.out.println("Enter displayTechnology: ");
				displayTechnology = in.next();
				System.out.println("Enter conectivityOption: ");
				conectivityOption = in.next();
				System.out.println("Enter audioQuality: ");
				audioQuality = in.next();
				System.out.println("Enter warranty: ");
				warranty = in.next();
				System.out.println("Enter refreshRate: ");
				refreshRate = in.next();
				System.out.println("Enter price: ");
				price = in.nextInt();
				
				SmartTv updatedCSmartTv = new SmartTv();
				updatedCSmartTv.setId(smartTvId);
				updatedCSmartTv.setTvName(tvName);
				updatedCSmartTv.setDisplaySize(displaySize);
				updatedCSmartTv.setDisplayResolution(displayResolution);
				updatedCSmartTv.setDisplayTechnology(displayTechnology);
				updatedCSmartTv.setConnectivityOptions(conectivityOption);
				updatedCSmartTv.setAudioQuality(audioQuality);
				updatedCSmartTv.getWarranty();
				updatedCSmartTv.getRefreshRate();
				updatedCSmartTv.getPrice();
				service.updateSmartTv(updatedCSmartTv);
				break;
				
			case 5:
				System.out.println("Delete Contact");
				System.out.println("--------------");
				System.out.println("Please enter contact id: ");
				int stid = in.nextInt();
				service.deleteSmartTv(stid);				
				break;

			case 6:
				System.out.println("Are sure delete all contacts? [Y/N]");
				String confirm = in.next();
				if(confirm.equalsIgnoreCase("Y")) {
					service.deleteAllSmartTvs();			
				}
				break;
				
			case 0:
				System.out.println("Bye!!!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Please choose correct option: ");
				break;
			}

		} while (option != 0);
	}
}
