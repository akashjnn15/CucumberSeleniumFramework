package utils;

import java.lang.reflect.Method;

import cucumber.api.java.en.Then;

public class AddToReportMethod {

	public static String annontxt = null;

	public static void insertData(final Class cls, final String MethodName, final String AnnoType) {
		switch (AnnoType) {

		case "Then": {
			System.out.println(cls.getName());
			Method[] methods = cls.getMethods();
			for (Method m : methods) {
				if (m.getName().equalsIgnoreCase(MethodName)) {
					Then annotation = m.getAnnotation(Then.class);
					System.out.println(annotation.value());
					AddToReportMethod.annontxt = annotation.value();
					AddToReportMethod.annontxt = AddToReportMethod.annontxt
							.replace("^", "").toUpperCase().replace("$", "");
				}
			}
			break;
		}
		
		
		case "When": {
			System.out.println(cls.getName());
			Method[] methods = cls.getMethods();
			for (Method m : methods) {
				if (m.getName().equalsIgnoreCase(MethodName)) {
					Then annotation = m.getAnnotation(Then.class);
					System.out.println(annotation.value());
					AddToReportMethod.annontxt = annotation.value();
					AddToReportMethod.annontxt = AddToReportMethod.annontxt
							.replace("^", "").toUpperCase().replace("$", "");
				}
			}
			break;
		}

		
		
		
		
		
		case "And": {
			System.out.println(cls.getName());
			Method[] methods = cls.getMethods();
			for (Method m : methods) {
				if (m.getName().equalsIgnoreCase(MethodName)) {
					Then annotation = m.getAnnotation(Then.class);
					System.out.println(annotation.value());
					AddToReportMethod.annontxt = annotation.value();
					AddToReportMethod.annontxt = AddToReportMethod.annontxt
							.replace("^", "").toUpperCase().replace("$", "");
				}
			}
			break;
		}

		
		
		case "But": {
			System.out.println(cls.getName());
			Method[] methods = cls.getMethods();
			for (Method m : methods) {
				if (m.getName().equalsIgnoreCase(MethodName)) {
					Then annotation = m.getAnnotation(Then.class);
					System.out.println(annotation.value());
					AddToReportMethod.annontxt = annotation.value();
					AddToReportMethod.annontxt = AddToReportMethod.annontxt
							.replace("^", "").toUpperCase().replace("$", "");
				}
			}
			break;
		}
		
		
		case "Given": {
			System.out.println(cls.getName());
			Method[] methods = cls.getMethods();
			for (Method m : methods) {
				if (m.getName().equalsIgnoreCase(MethodName)) {
					Then annotation = m.getAnnotation(Then.class);
					System.out.println(annotation.value());
					AddToReportMethod.annontxt = annotation.value();
					AddToReportMethod.annontxt = AddToReportMethod.annontxt
							.replace("^", "").toUpperCase().replace("$", "");
				}
			}
			break;
		}
		
		
		
		}
		
	}
	
	
	
	public static String getAnotationText(final Class cls, final String MethodName, final String AnnoType){
		
switch(AnnoType){
case "Then":{
	
	System.out.println(cls.getName());
	Method[] methods =cls.getMethods();
	
	for(Method m : methods){
		if (m.getName().equalsIgnoreCase(MethodName)) {
			Then annotation = m.getAnnotation(Then.class);
			System.out.println(annotation.value());
			AddToReportMethod.annontxt = annotation.value();
			AddToReportMethod.annontxt = AddToReportMethod.annontxt
					.replace("^", "").toUpperCase().replace("$", "");
		
	}
	
}

break;
}

case "When":{
	
	System.out.println(cls.getName());
	Method[] methods =cls.getMethods();
	
	for(Method m : methods){
		if (m.getName().equalsIgnoreCase(MethodName)) {
			Then annotation = m.getAnnotation(Then.class);
			System.out.println(annotation.value());
			AddToReportMethod.annontxt = annotation.value();
			AddToReportMethod.annontxt = AddToReportMethod.annontxt
					.replace("^", "").toUpperCase().replace("$", "");
		
	}
	
}

break;
}
		
		
		



case "And":{
	
	System.out.println(cls.getName());
	Method[] methods =cls.getMethods();
	
	for(Method m : methods){
		if (m.getName().equalsIgnoreCase(MethodName)) {
			Then annotation = m.getAnnotation(Then.class);
			System.out.println(annotation.value());
			AddToReportMethod.annontxt = annotation.value();
			AddToReportMethod.annontxt = AddToReportMethod.annontxt
					.replace("^", "").toUpperCase().replace("$", "");
		
	}
	
}

break;
}

case "Given":{
	
	System.out.println(cls.getName());
	Method[] methods =cls.getMethods();
	
	for(Method m : methods){
		if (m.getName().equalsIgnoreCase(MethodName)) {
			Then annotation = m.getAnnotation(Then.class);
			System.out.println(annotation.value());
			AddToReportMethod.annontxt = annotation.value();
			AddToReportMethod.annontxt = AddToReportMethod.annontxt
					.replace("^", "").toUpperCase().replace("$", "");
		
	}
	
}

break;
}
case "But":{
	
	System.out.println(cls.getName());
	Method[] methods =cls.getMethods();
	
	for(Method m : methods){
		if (m.getName().equalsIgnoreCase(MethodName)) {
			Then annotation = m.getAnnotation(Then.class);
			System.out.println(annotation.value());
			AddToReportMethod.annontxt = annotation.value();
			AddToReportMethod.annontxt = AddToReportMethod.annontxt
					.replace("^", "").toUpperCase().replace("$", "");
		
	}
	
}

break;
}
		
		
		
}		
		
		return annontxt;
	}
	
	
	
	
	
	
	
	
	
	
}
