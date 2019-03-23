package gp018328.com.gupaoedu.homework.pattern.prototype.homework1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Columns {
	private String owner;
	private String tableName;
	private List<Column> columns=new ArrayList<Column>();
	Map<String,Column> mColumns = new HashMap<String,Column>();
	private boolean hasPk=false;
	private List<Column> pkColumns=new ArrayList<Column>();
	//Map<String,Column> mPkColumns = new HashMap<String,Column>();

	
	private boolean hasLob=false;
	private List<Column> lobColumns=new ArrayList<Column>();
	
	public Columns(String owner,String tableName) throws Exception{
	}
	
	public Columns(String owner,String tableName,Class c) throws Exception{
	}

	public String getInsertSql(){
		return "";
	}
	
	public String getUpdateSql(){
		return "";
	}
	
	
	public String getUpdateLobSql(){

		return "";
	}	
	
	public String getLockSql(){
			return "";
	}	
	
	public String getSelectByIdSql(){
		return "";
	}		
	
	public String getSelectSql(){
		return "";
	}		
	
	
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public boolean isHasPk() {
		return hasPk;
	}

	public void setHasPk(boolean hasPk) {
		this.hasPk = hasPk;
	}

	public List<Column> getPkColumns() {
		return pkColumns;
	}

	public void setPkColumns(List<Column> pkColumns) {
		this.pkColumns = pkColumns;
	}

	public boolean isHasLob() {
		return hasLob;
	}

	public void setHasLob(boolean hasLob) {
		this.hasLob = hasLob;
	}

	public List<Column> getLobColumns() {
		return lobColumns;
	}

	public void setLobColumns(List<Column> lobColumns) {
		this.lobColumns = lobColumns;
	}

	public Map<String, Column> getMColumns() {
		return mColumns;
	}

	public void setMColumns(Map<String, Column> columns) {
		mColumns = columns;
	}	
	
}
