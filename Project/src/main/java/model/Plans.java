package model;

public class Plans {
	private int pid,wp_id,noofguest;
	private String budget,style,vanue,photosvideos,noofguestfortransport;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getWp_id() {
		return wp_id;
	}
	public void setWp_id(int wp_id) {
		this.wp_id = wp_id;
	}
	public int getNoofguest() {
		return noofguest;
	}
	public void setNoofguest(int noofguest) {
		this.noofguest = noofguest;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getVanue() {
		return vanue;
	}
	public void setVanue(String vanue) {
		this.vanue = vanue;
	}
	public String getPhotosvideos() {
		return photosvideos;
	}
	public void setPhotosvideos(String photosvideos) {
		this.photosvideos = photosvideos;
	}
	public String getNoofguestfortransport() {
		return noofguestfortransport;
	}
	public void setNoofguestfortransport(String noofguestfortransport) {
		this.noofguestfortransport = noofguestfortransport;
	}
	@Override
	public String toString() {
		return "Plans [pid=" + pid + ", wp_id=" + wp_id + ", noofguest=" + noofguest + ", budget=" + budget + ", style="
				+ style + ", vanue=" + vanue + ", photosvideos=" + photosvideos + ", noofguestfortransport="
				+ noofguestfortransport + "]";
	}
	
}
