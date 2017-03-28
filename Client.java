package Business;

public class Client {

	private String name;
    private int icn;
    private long pnc;
    private String address;
    
    public Client()
    {

    }

    public Client(String name, int icn, long pnc, String address)
    {
        this.setName(name);
        this.setIcn(icn);
        this.setPnc(pnc);
        this.setAddress(address);
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIcn() {
		return icn;
	}
	public void setIcn(int icn) {
		this.icn = icn;
	}
	public long getPnc() {
		return pnc;
	}
	public void setPnc(long pnc) {
		this.pnc = pnc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
