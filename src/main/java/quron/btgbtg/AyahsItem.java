package quron.btgbtg;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AyahsItem{

	@SerializedName("number")
	private int number;

	@SerializedName("audioSecondary")
	private List<String> audioSecondary;

	@SerializedName("hizbQuarter")
	private int hizbQuarter;

	@SerializedName("ruku")
	private int ruku;

	@SerializedName("manzil")
	private int manzil;

	@SerializedName("audio")
	private String audio;

	@SerializedName("text")
	private String text;

	@SerializedName("page")
	private int page;

	@SerializedName("numberInSurah")
	private int numberInSurah;

	@SerializedName("juz")
	private int juz;

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
	}

	public void setAudioSecondary(List<String> audioSecondary){
		this.audioSecondary = audioSecondary;
	}

	public List<String> getAudioSecondary(){
		return audioSecondary;
	}

	public void setHizbQuarter(int hizbQuarter){
		this.hizbQuarter = hizbQuarter;
	}

	public int getHizbQuarter(){
		return hizbQuarter;
	}

	public void setRuku(int ruku){
		this.ruku = ruku;
	}

	public int getRuku(){
		return ruku;
	}

	public void setManzil(int manzil){
		this.manzil = manzil;
	}

	public int getManzil(){
		return manzil;
	}

	public void setAudio(String audio){
		this.audio = audio;
	}

	public String getAudio(){
		return audio;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setNumberInSurah(int numberInSurah){
		this.numberInSurah = numberInSurah;
	}

	public int getNumberInSurah(){
		return numberInSurah;
	}

	public void setJuz(int juz){
		this.juz = juz;
	}

	public int getJuz(){
		return juz;
	}

	@Override
 	public String toString(){
		return 
			"AyahsItem{" + 
			"number = '" + number + '\'' + 
			",audioSecondary = '" + audioSecondary + '\'' + 
			",hizbQuarter = '" + hizbQuarter + '\'' + 
			",ruku = '" + ruku + '\'' + 
			",manzil = '" + manzil + '\'' + 
			",audio = '" + audio + '\'' + 
			",text = '" + text + '\'' + 
			",page = '" + page + '\'' +
			",numberInSurah = '" + numberInSurah + '\'' + 
			",juz = '" + juz + '\'' + 
			"}";
		}
}