package quron.btgbtg;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data{

	@SerializedName("edition")
	private Edition edition;

	@SerializedName("surahs")
	private List<SurahsItem> surahs;

	public void setEdition(Edition edition){
		this.edition = edition;
	}

	public Edition getEdition(){
		return edition;
	}

	public void setSurahs(List<SurahsItem> surahs){
		this.surahs = surahs;
	}

	public List<SurahsItem> getSurahs(){
		return surahs;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"edition = '" + edition + '\'' + 
			",surahs = '" + surahs + '\'' + 
			"}";
		}
}