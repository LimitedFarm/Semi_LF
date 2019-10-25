package LF.product.model.vo;

public class ProductList {
	private int pId;
	private String pName;
	private int pPrice;
	private String pAdd;
	private String fPath;
	private int CateId;
	public ProductList() {}
	
	public ProductList(int pId, String pName, int pPrice, String pAdd, String fPath, int cateId) {
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pAdd = pAdd;
		this.fPath = fPath;
		CateId = cateId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public String getpAdd() {
		return pAdd;
	}

	public void setpAdd(String pAdd) {
		this.pAdd = pAdd;
	}

	public String getfPath() {
		return fPath;
	}

	public void setfPath(String fPath) {
		this.fPath = fPath;
	}

	public int getCateId() {
		return CateId;
	}

	public void setCateId(int cateId) {
		CateId = cateId;
	}

	@Override
	public String toString() {
		return "ProductList [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pAdd=" + pAdd + ", fPath="
				+ fPath + ", CateId=" + CateId + "]";
	}
	
	
}
