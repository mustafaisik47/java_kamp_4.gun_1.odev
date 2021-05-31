
public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	public void add() {
			//buraya is kodlar� yaz�l�r!
		customerDal.add();
	}
}
