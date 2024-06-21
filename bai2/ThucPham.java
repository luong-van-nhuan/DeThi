package bai2;

public class ThucPham extends SanPham {
	private Data ngaySX;
	private Data ngayHHSD;

	public ThucPham(String maSP, String tenSP, Double dongiaSP, Data ngaySX, Data ngayHHSD) {
		super(maSP, tenSP, dongiaSP);
		this.ngaySX = ngaySX;
		this.ngayHHSD = ngayHHSD;
	}

	public ThucPham() {
	}

	public ThucPham(String maSP, String tenSP, Double dongiaSP) {
		super(maSP, tenSP, dongiaSP);
	}

	public Data getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(Data ngaySX) {
		this.ngaySX = ngaySX;
	}

	public Data getNgayHHSD() {
		return ngayHHSD;
	}

	public void setNgayHHSD(Data ngayHHSD) {
		this.ngayHHSD = ngayHHSD;
	}

	public void xuat() {
		super.xuat();
		System.out.println("Ngày sản xuất: " + ngaySX.getNgay() + "/" + ngaySX.getThang() + "/" + ngaySX.getNam());
		System.out.println("Ngày  hết hạn sử dụng: " + ngayHHSD.getNgay() + "/" + ngayHHSD.getThang() + "/" + ngayHHSD.getNam());
	}
}
