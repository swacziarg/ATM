import java.util.HashMap;

public class atmain {
	HashMap<Integer, Double> accs;
	public atmain() {
		accs = new HashMap<Integer, Double>();
	}
	public void openAccount(int accountNum){
		
		accs.put(accountNum, 0.0);
	}
	public void openAccount(int accountNum, double deposit) {
		accs.put(accountNum, deposit);
		
	}
	public void closeAccount(int accountNum){
		accs.remove(accountNum);
	}
	public double checkBalance(int accountNum) {
		if (accs.get(accountNum) != null) {
			return accs.get(accountNum);
		}
		return 0.0;
	}
	public boolean depositMoney(int accountNum, double deposit) {
		if (accs.get(accountNum) != null) {
			accs.put(accountNum, (accs.get(accountNum) + deposit));
			return true;
		}
		return false;
	}
	public boolean withdrawMoney(int accountNum, double wAmt) {
		if (accs.get(accountNum) != null) {
			accs.put(accountNum, accs.get(accountNum) - wAmt);
			return true;
		}
		return false;
	}
}
