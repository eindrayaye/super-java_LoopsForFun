public class SwitchExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchExamp cast = new SwitchExamp();
		//cast.num1();
		cast.num2();
	}
		
		public void num2()
		{
			char cVal='a';
			switch(cVal){
			case 'a':
			case 'e':
			case 'i':
			case 'o':				
			case 'u':
				System.out.println("Vowles");
			break;
			default:
				System.out.println("Consonant");
			break;
			}
		}
		
		

	}
