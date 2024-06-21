package bai2;

public class SanPham {
	protected String maSP;
	protected String tenSP;
	protected Double dongiaSP;
	public SanPham(String maSP, String tenSP, Double dongiaSP) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.dongiaSP = dongiaSP;
	}
	public SanPham() {
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public Double getDongiaSP() {
		return dongiaSP;
	}
	public void setDongiaSP(Double dongiaSP) {
		this.dongiaSP = dongiaSP;
	}
	public void xuat() {
		System.out.println("Mã sản phẩm: " + maSP);
		System.out.println("Tên sản phẩm: " + tenSP);
		System.out.println("Đơn gia sản phẩm: " + dongiaSP);
	}
	public boolean checkMaSP(String maSP) {
		return this.maSP.equalsIgnoreCase(getMaSP());
	}
}
