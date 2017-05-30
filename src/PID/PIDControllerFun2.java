package PID;


public class PIDControllerFun2 {
	
	static double xn,bn,en,un;
		/*static double xn,xnold,bn,bnold,en,mv,cn,un,fn,PIDaction,m_Ts,m_Ti,m_Td,m_Kd,m_PB,m_L,m_H;

		public static void main(String[] args) throws InterruptedException {
			m_Ts = 0.01; m_Ti=10; m_Td=2.5; // in sec
			PIDaction=1; //or  -1
			
			// all value in %
			xnold= 50; bnold= 50; // assume
			m_L = 0; m_H = 100;
			m_Kd=10;m_PB=100; 
			
			cn=50;
			
			for (int i=0; i < 101;i++){
				mv=i;
			PIDcontrol(m_Ts,mv,cn, m_Ti, m_Td,PIDaction,m_L,m_H, m_Kd,m_PB, xnold,bnold, fn);
			show();
			
			}
			}*/
			

	
	public static void show() {
			 System.out.println("xn = "+xn+"\nbn = "+bn+"\nen = "+en+"\nun = "+un+"\n");//" "+un1+

			
		}
		
	public static void PIDcontrol(double m_Ts,double mv,double cn,double m_Ti,double m_Td,double PIDaction,
				double m_L, double m_H,double m_Kd, double m_PB,double xnold, double bnold,double fn	) throws InterruptedException {
			
		

			
			 xn = (xnold +(m_Ts*(cn - xnold)/((m_Ts*m_Kd +m_Td)/m_Kd)));
			 bn = (bnold +(m_Ts*(fn - bnold)/(m_Ts+ m_Ti)));
			 en = mv  - cn;
			 un = (((100/m_PB) * (en -m_Kd*(cn - xn))) * PIDaction + bn);// + UF + KF;
			 //double un1 = un; 
			 if(un < m_L)
				     un = m_L;   
			  else if (un > m_H)
				     un = m_H;
			  else un = un;
			  
			  xnold = xn;
			  bnold = bn;
			  fn = un;
			 
			 Double D = m_Ts*1000;
			 Thread.sleep(Integer.valueOf(D.intValue()));
	
		}
		
		
}
