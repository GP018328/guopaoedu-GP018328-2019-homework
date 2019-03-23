// $Header: /cvsroot/daoexamples/daoexamples/src/java/daoexamples/movie/MovieDAO.java,v 1.3 2003/08/13 04:04:23 sullis Exp $    
    
/*  
 *   
 *  
 *   
 *   
 */   
package gp018328.com.gupaoedu.homework.pattern.prototype.homework1;
   
import java.util.List;

   
/**  
 *
 */   
public interface IDao{   
	
    public boolean findById(ATable table)throws  Exception;   
    
    public int findByWhereCondition(ATable table, String whereCondition)throws  Exception;
       
    public List<ATable> findByWhereCondition(String whereCondition)throws Exception;
    
    public int findBySql(ATable table, String sql)throws  Exception;
    
    public List<ATable> findBySql(String sql)throws Exception;
    
    public void insert(ATable table)throws Exception;
    
    public void insert(List<ATable> list)throws Exception;    
    
    public void update(ATable table)throws Exception;
    
    public void update(List<ATable> list)throws Exception;     

    public void delete(ATable table)throws Exception;       

    public void delete(List<ATable> list)throws Exception;   
    
    public void persist(ATable table)throws Exception;
    
    public void persist(List<ATable> list)throws Exception;    
    
    public void copyFrom(ATable table)throws Exception;
        
}   