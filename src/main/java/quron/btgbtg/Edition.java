package quron.btgbtg;

import com.google.gson.annotations.SerializedName;

public class Edition{

	@SerializedName("identifier")
	private String identifier;

	@SerializedName("englishName")
	private String englishName;

	@SerializedName("name")
	private String name;

	@SerializedName("format")
	private String format;

	@SerializedName("language")
	private String language;

	@SerializedName("type")
	private String type;

	public void setIdentifier(String identifier){
		this.identifier = identifier;
	}

	public String getIdentifier(){
		return identifier;
	}

	public void setEnglishName(String englishName){
		this.englishName = englishName;
	}

	public String getEnglishName(){
		return englishName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"Edition{" + 
			"identifier = '" + identifier + '\'' + 
			",englishName = '" + englishName + '\'' + 
			",name = '" + name + '\'' + 
			",format = '" + format + '\'' + 
			",language = '" + language + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}