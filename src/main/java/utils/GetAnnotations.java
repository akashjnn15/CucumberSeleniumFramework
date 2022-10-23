package utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class GetAnnotations {
	
	@Retention(RetentionPolicy.RUNTIME)
	public static @interface Given{
		
		
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	public static @interface Then{
		
		
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	public static @interface When{
		
		
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	public static @interface And{
		
		
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	public static @interface But{
		
		
	}



}
