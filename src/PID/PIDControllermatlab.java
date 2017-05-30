package PID;

public class PIDControllermatlab {
	
	/*public double xn,bn,en,rn,cn,un,fn,PIDaction,m_Ts,m_Ti,m_Td,m_Kd,m_PB,m_L,m_H;
	
	public double xnold= 50;
	public double bnold= 50;
	
/*	double rn=50, cn=70;
	m_L = 0; m_H = 100;
	PIDaction=1;m_Ts = 0.1;
	m_Ti=1;m_T=0;m_Kd=10;m_PB=100;

	
	public static void main(String[] args) {
		
		  xn = (xnold +(m_Ts*(cn - xnold)/((m_Ts*m_Kd +m_Td)/m_Kd)));
		  bn = (bnold +(m_Ts*(fn - bnold)/(m_Ts+ m_Ti)));
		  en = rn  - cn;
		  un = (((100/m_PB) * (en -m_Kd*(cn - xn))) * PIDaction + bn);// + UF + KF;
		  
		  if(un <= m_L)
			     un = m_L;   
		  else if (un >= m_H)
			     un = m_H;
		  //else un = un;
		  end  
			  xnold = xn;
			  bnold = bn;
			  fn = un;
*/
	}
	
/*
 function PID1_controller(obj, event, string_arg)
global obj  adcdata Time_count; 
global m_Ts m_Ti1 m_Td1 m_Kd1 m_PB1 m_UL1 m_UH1 PIDaction ;
global xnold_PID1  bnold_PID1  fn_PID1 xn_PID1  bn_PID1  en_PID1 cn_PID1 rn_PID1 un_PID1;

%  formula
  xn_PID1 = xnold_PID1 +(m_Ts*(cn_PID1 - xnold_PID1)/((m_Ts*m_Kd1 +m_Td1)/m_Kd1));
  bn_PID1 = bnold_PID1 +(m_Ts*(fn_PID1 - bnold_PID1)/(m_Ts+ m_Ti1));
  en_PID1 = rn_PID1  - cn_PID1;
  un_PID1 = ((100/m_PB1) * (en_PID1 -m_Kd1*(cn_PID1 - xn_PID1))) * PIDaction + bn_PID1; % + UF + KF;

  if(un_PID1 <= m_UL1)
     un_PID1 = m_UL1;   
  elseif(un_PID1 >= m_UH1)
     un_PID1 = m_UH1;
  end  
  xnold_PID1 = xn_PID1;
  bnold_PID1 = bn_PID1;
  fn_PID1 = un_PID1;
  
*/


