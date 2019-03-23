// $Header: /cvsroot/daoexamples/daoexamples/src/java/daoexamples/movie/MovieDAOImplJTA.java,v 1.7 2003/08/25 03:30:12 sullis Exp $    
    
/*  
 *   
 *  
 *   
 *   
 */   
   
package gp018328.com.gupaoedu.homework.pattern.prototype.homework1;
   

import java.lang.reflect.Field;
import java.sql.*;   
import java.util.*;   

public  abstract class Dao extends ATable implements IDao   {   
       
	public abstract void setTableColumns();
    
    public abstract Columns getTableColumns();
   
    public abstract Class getTableClass(); 
    
    @Override
	public boolean findById(ATable object)throws Exception{

		return true;
    }

	@Override
    public int findByWhereCondition(ATable object,String whereCondition)throws Exception{

		return 0;
    }

	@Override
    public List<ATable> findByWhereCondition(String whereCondition)throws Exception{
		return null;
    }

	@Override
	public int findBySql(ATable object,String sql)throws Exception{
		return 0;
    }

	@Override
    public List<ATable> findBySql(String sql)throws Exception{

		return null;
    }

	@Override
    public void insert(List<ATable> list)throws Exception{

    }

	@Override
    public void insert(ATable object)throws Exception{

		
    }

	@Override
    public void update(List<ATable> list)throws Exception{

    }

	@Override
    public void update(ATable object)throws Exception{

	
    }

	@Override
    public void delete(List<ATable> list)throws Exception{

    }

	@Override
    public void delete(ATable object)throws Exception{

    }

	@Override
    public void persist(ATable object)throws Exception{

    }

    static public String nextSequence(String sequenceName) throws Exception{

	    return "";
	}


    static public Timestamp sysDate() throws Exception{   

	    return null;
	}

    static public String sysDate(String format) throws Exception{

	    return "";
    	
    }
    
    

    static public String sysDate(String format,int i) throws Exception{

	    return "";
    	
    }   
    
    public static int execute(String sql) throws Exception{

    	return 0;
    }

    @Override
    public void copyFrom(ATable object)throws Exception{
    	Object value=null;
    	
    	 try{
    		 Field[] srcFields = object.getClass().getFields();
    		 Field[] objFields = this.getClass().getFields();
    		 for (int i=0;i<objFields.length;i++) {
    			 String objFieldName=objFields[i].getName().toUpperCase(); 
    			 for(int j=0;j<srcFields.length;j++) { 
    				 String srcFieldName=srcFields[j].getName().toUpperCase();
    				 if(srcFieldName.equals(objFieldName)){
    					 value = srcFields[j].get(object);
    					 objFields[i].set(this, value);
    					 break;
    					 }
    				 }					
    			}	
    	 }catch(Exception e){ 
			if(e instanceof Exception ){
				throw (Exception)e;
			}else{
				throw new Exception(e);
			}      
		}
    	
    }
 
    
}   