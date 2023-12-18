package mypack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class medicalController implements ActionListener {
	
	Medical m; //pojo class
	MedicalModel md;
	Medview mv;
	
	public medicalController(Medview mv) {
		this.mv = mv;
		m = new Medical();
		md = new MedicalModel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==mv.b1)
		{
			m.setId(Integer.parseInt(mv.t1.getText()));
			m.setTname(mv.t2.getText());
			m.setCompany(mv.t3.getText());
			m.setPrice(Double.parseDouble(mv.t4.getText()));
			md.add(m);
		}
		
	}
	
	
	
	
	

}
