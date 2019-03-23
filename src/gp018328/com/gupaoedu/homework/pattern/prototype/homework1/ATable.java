package gp018328.com.gupaoedu.homework.pattern.prototype.homework1;

import java.lang.reflect.Field;

/**
 * @author 王锋伟
 */
public abstract class  ATable  implements  Cloneable, java.io.Serializable{
	@Override
	public String toString(){
		String returnValue="";
		try {
			Class myClass=this.getClass();
			returnValue="<"+myClass.getSimpleName()+">"+" {";
			Field[] fields = myClass.getFields(); 
			for (int j=0;j<fields.length;j++){ 
				String fieldName=fields[j].getName(); 
				Object value=fields[j].get(this);
				returnValue=returnValue+fieldName+":"+value+", ";	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		returnValue=returnValue+"}";
		return returnValue;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Object result = super.clone(); 
		return result; 
	}
}
