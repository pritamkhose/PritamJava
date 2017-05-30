package PID;

public class PID1 {

	//static float xn = 0.0f;
	static double xn,xnold,bn,bnold,en,rn,cn,un,fn,PIDaction,m_Ts,m_Ti,m_Td,m_Kd,m_PB,m_L,m_H;
	//double op[10][10]; 
	public static void main(String[] args) throws InterruptedException {
		m_Ts = 0.1; m_Ti=10; m_Td=2.5; // in sec
		PIDaction=1; //or  -1
		
		// all value in %
		xnold= 50; bnold= 50; // assume
		m_L = 0; m_H = 100;
	
		m_Kd=10;m_PB=100; 
		
		rn=50; cn=50;
		
		for (int i=0; i < 101;i++)
		{
		 rn = i; // mv
		 xn = (xnold +(m_Ts*(cn - xnold)/((m_Ts*m_Kd +m_Td)/m_Kd)));
		 bn = (bnold +(m_Ts*(fn - bnold)/(m_Ts+ m_Ti)));
		 en = rn  - cn;
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
		 
		 System.out.println("i = "+i+"\nxn = "+xn+"\nbn = "+bn+"\nen = "+en+"\nun = "+un+"\n");//" "+un1+



		  
		 /* op[i][0]=i;
		  op[i][1]=xn;
		  op[i][2]=bn;
		 op[i][3]=en;
		  op[i][4]=un;*/
		  
		 //long il= Long.parseUnsignedLong(i);
		 Thread.sleep(10);//*Long.parseLong(m_Ts) = 0.1sec
		
		}
		
		double[] myList ={1.9,2.9,3.4,3.5};
		// Print all the array elements
		for(int i =0; i < myList.length; i++)
		System.out.print(myList[i]+" ");
	}

}
