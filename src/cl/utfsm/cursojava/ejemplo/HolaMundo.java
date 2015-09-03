package cl.utfsm.cursojava.ejemplo;

public class HolaMundo {
	public void testIncrementales(){
		int x = 1024;
		int y = 3*x;
		int z,q;
		z= ++x;
		q= y--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(q);
	}
	
	public void testBreak(){
		int x=0,y=0;
		while(x==y){
			while(x==y){
				while(x==y){
					System.out.println("\t\tc");
					break;
				}
				System.out.println("\tb");
				break;
			}
			System.out.println("a");
			break;
		}
	}
	
	public void testBreakLabeled(){
		int x=0,y=0;
		primer:
		while(x==y){
			while(x==y){
				while(x==y){
					System.out.println("\t\tc");
					break primer;
				}
				System.out.println("\tb");
				break;
			}
			System.out.println("a");
			break;
		}
		System.out.println("termino de break con etiqueta");
	}
	
	public void testContinue(){
//		for(int i = 0; i< 10;i++){
//			if(i%2 != 0){
//				continue;
//			}
//			System.out.println(i);
//		}
		// break and continue have the same behavior
		int i= 0;
		while(i<10){
			if(i%2 != 0){
				break;
			}
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		HolaMundo holaMundo= new HolaMundo();
		//holaMundo.testIncrementales();
		//holaMundo.testBreak();
//		holaMundo.testBreakLabeled();
//		holaMundo.testContinue();
		holaMundo.testAmbito();
	}

	private void testAmbito() {
		int i = 1;
		if(i == 1){
			int j = 2;
			if(j == 3){
				j++;
			}
			System.out.println(j);
		}else{
			int j = 3; 
//			j++;
			System.out.println(j);
		}
		while(i< 10){
			int j = 2;
			System.out.println(j);
			i++;
		}
		System.out.println(i);
		
	}
}
