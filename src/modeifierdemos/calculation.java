package modeifierdemos;

class addition{
	public void sum(int num1,int num2) {
		int sum= num1+num2;
		System.out.println("sum=:"+sum);
	}
	}
	public class calculation {
		public static void main(String[] args) 
		{
			addition ss = new addition();
			ss.sum(10, 40);
			subraction sb =new subraction();
			sb.sub(57, 35);
			
		}
	}
	
class subraction{
	public void sub(int num1,int num2) {
		int sub= num1-num2;
		System.out.println("sub="+sub);
	}
}

