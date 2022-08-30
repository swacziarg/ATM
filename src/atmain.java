import java.util.HashMap;

public class atmain {
	HashMap<Integer, Double> accs;
	public atmain() {
		accs = new HashMap<Integer, Double>();
	}
	public void openAccount(int accountNum){
		if (accs.containsKey(accountNum)) {
			System.out.println("FAILURE - Account already exists");
			return;
		}
		accs.put(accountNum, 0.0);
	}
	public void openAccount(int accountNum, double deposit) {
		if (deposit <0) {
			System.out.println("FAILURE - Deposit negative");
			return;
		}
		if (accs.containsKey(accountNum)) {
			System.out.println("FAILURE - Account already exists");
			return;
		}
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
		if (accs.get(accountNum) != null&&deposit>=0) {
			accs.put(accountNum, (accs.get(accountNum) + deposit));
			return true;
		}
		return false;
	}
	public boolean withdrawMoney(int accountNum, double wAmt) {
		if (accs.get(accountNum) != null&& !(accs.get(accountNum)<wAmt)) {
			accs.put(accountNum, accs.get(accountNum) - wAmt);
			return true;
		}
		return false;
	}
	public static void main (String[]args) {
		atmain hi = new atmain();
		hi.openAccount(0);
		hi.openAccount(13,14.0);
		hi.openAccount(13,14.0);
		System.out.println(hi.checkBalance(13));
		System.out.println(hi.checkBalance(0));
		System.out.println(hi.depositMoney(0, -15));
		System.out.println(hi.checkBalance(0));
		System.out.println(hi.withdrawMoney(0, 13));
		System.out.println(hi.checkBalance(0));
		
	}
}
