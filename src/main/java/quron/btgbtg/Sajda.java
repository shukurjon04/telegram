package quron.btgbtg;

import com.google.gson.annotations.SerializedName;

public class Sajda{

	@SerializedName("obligatory")
	private boolean obligatory;

	@SerializedName("id")
	private int id;

	@SerializedName("recommended")
	private boolean recommended;

	public void setObligatory(boolean obligatory){
		this.obligatory = obligatory;
	}

	public boolean isObligatory(){
		return obligatory;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setRecommended(boolean recommended){
		this.recommended = recommended;
	}

	public boolean isRecommended(){
		return recommended;
	}

	@Override
 	public String toString(){
		return 
			"Sajda{" + 
			"obligatory = '" + obligatory + '\'' + 
			",id = '" + id + '\'' + 
			",recommended = '" + recommended + '\'' + 
			"}";
		}
}