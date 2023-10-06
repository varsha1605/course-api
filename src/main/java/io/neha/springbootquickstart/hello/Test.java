package io.neha.springbootquickstart.hello;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;

public class Test {

	private static final String SCAN_CLUSTER_USING_DRAFT_URL = "https://%s/api/esx/settings/clusters/%s/software/drafts/%s?action=scan&vmw-task=true";

	public static void main(String args[]) {
		String hardware = "hardware_support:9099:9090;9909";
		String str = "\n" + "{\n" + "    \"3\": {\n" + "        \"metadata\": {\n"
				+ "            \"creation_time\": \"2023-01-06T11:21:57.284Z\",\n"
				+ "            \"owner\": \"Administrator@VSPHERE.LOCAL\",\n" + "            \"status\": \"VALID\"\n"
				+ "        }\n" + "    },\n" + "    \"4\": {\n" + "        \"metadata\": {\n"
				+ "            \"creation_time\": \"2023-01-06T11:21:57.284Z\",\n"
				+ "            \"owner\": \"Administrator@VSPHERE.LOCAL\",\n" + "            \"status\": \"VALID\"\n"
				+ "        }\n" + "    }\n" + "}";
		String value = "  com.vmware.hsm  , com.vmware.nsxt.vi";
		List<String> list = Arrays
				.asList(StringUtils.trimArrayElements(StringUtils.commaDelimitedListToStringArray(value)));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// list = new ArrayList<String>();
		Map<String, String> mp = new HashMap<>();
		mp.put("com.vmware.hsm", "1");
		mp.put("com.vmware.nsxt.vi", "2");
		// mp.put("com.vmware.nsxt", "2");
		// mp.put("", "2");
		System.out.println(list.stream().allMatch(mp::containsKey));
		System.out.println(mp.keySet().stream().allMatch(list::contains));
		try {
			if (hardware.contains("hardware_support")) {
				// System.out.println("true");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		List<String> testList = new ArrayList<>();
		testList.add("Hello");
		List<String> nonActiveHosts =
				testList.stream()
                        .filter(esxi -> esxi.equalsIgnoreCase("Hsert"))
                        .collect(Collectors.toList());
		//System.out.print(nonActiveHosts);
		
		List<String> ll = new ArrayList<>(Arrays
                .asList("      MONDAY ",  "  WEDNESDAY",      "THURSDAY", "FRIDAY"));
		String x = "{\"autoDownloadDaysOfWeek\" : [\"MONDAY\",\"TUESDAY\"]}";
		ll = ll.stream().map(String::trim).collect(Collectors.toList());
		String sstr= String.join(",", ll);
		System.out.println(sstr);
		List<String> xx = Arrays.asList(sstr);
		System.out.println(xx);
		
		Calendar mycal = new GregorianCalendar(2023, 06, 04);
        mycal.set(Calendar.HOUR, 23);
        mycal.set(Calendar.MINUTE, 58);	
        mycal.set(Calendar.SECOND, 0);
        
        System.out.println(mycal.getTime());
        
        LocalDateTime todaydate = LocalDateTime.now();
        //LocalDate localDate = todaydate.withDayOfMonth(1);
//        System.out.println("Months first date in yyyy-mm-dd: " +localDate.getYear());
//        System.out.println("Months first date in yyyy-mm-dd: " +localDate.getMonthValue());
//        System.out.println("Months first date in yyyy-mm-dd: " +localDate.getDayOfMonth());
        Calendar expiryTime =
                new GregorianCalendar(
                		todaydate.getYear(),
                		todaydate.getMonthValue()-1,
                		todaydate.getDayOfMonth(),
                		todaydate.getHour(),
                		todaydate.getMinute());
        System.out.println("Months first date in yyyy-mm-dd: " +expiryTime.getTime());
        
        Calendar newTime = new GregorianCalendar();
        newTime.add(Calendar.HOUR_OF_DAY, 2);
        
        System.out.println("NewTime   " +newTime.getTime());
        

	}
}
