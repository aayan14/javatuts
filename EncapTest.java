package phase1.codes;



class EncapTest {
	
	private String securityCode;
	private String branchName;
	private String branchCode;
	private String deptName;
	private char deptCode;
	
	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public char getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(char deptCode) {
		this.deptCode = deptCode;
	}

	public static void main(String[] args) {
		
		EncapTest et = new EncapTest();
		et.setSecurityCode("1234");
		et.setBranchName("Yehlanka");
		et.setBranchCode("YEL");
		et.setDeptName("Electric");
		et.setDeptCode('E');
		
		System.out.println("Security Code: " + et.getSecurityCode());
		System.out.println("Branch Name: " + et.getBranchName());
		System.out.println("Branch Code: " + et.getBranchCode());
		System.out.println("Department Name: " + et.getDeptName());
		System.out.println("Department Code: " + et.getDeptCode());
		

	}

}
// security code
// branch name
// branch code
// dept name
// dept code