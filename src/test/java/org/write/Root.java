package org.write;

public class Root {

	private int id;
	private String type;
	private String name;
	private int ppu;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPpu() {
		return ppu;
	}
	public void setPpu(int ppu) {
		this.ppu = ppu;
	}
	public Root(int id, String type, String name, int ppu) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.ppu = ppu;
	}
	
}
