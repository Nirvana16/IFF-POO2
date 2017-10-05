package apresentacao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import modelo.Admin;

public class TelaAdmin extends JFrame {
	//Atributos ================================================================================
	private JLabel lPessoal, l_id, lLogin, lSenha;
	private JTextField tId, tLogin, tSenha;
	private JButton bSalvar, bLimpar, bVoltar;
	
	String id, login, senha;
	//Atributos de referencia ====================================================================
	private Admin adi;
	
	// Meotodo construtor ====================================================================
	public TelaAdmin(){	
		configTela();
		configDados();
		configBotoes();
		
		this.repaint();					
	}
	private class mouseAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent e){
			if (e.getSource() == bSalvar) {
				id = tId.getText();
				login = tLogin.getText();
				senha = tSenha.getText();
				adi = new Admin(id, login, senha);
				JOptionPane.showMessageDialog(null, "ADMINISTRADOR incluido");
			}
			if (e.getSource() == bLimpar) {
				tId.setText("");
				tLogin.setText("");
				tSenha.setText("");			
			}
			if (e.getSource() == bVoltar) {
				dispose();  
			}
			
		}
	} 
	private void configTela(){
		this.setSize(550,360);
		this.setTitle("Cadastro de Administradores");
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null); //centraliza a janela na abertura
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	private void configDados(){
		lPessoal = new JLabel(">> Cadastro de Administrador ==============================");
		lPessoal.setSize(580,30);
		lPessoal.setLocation(10,0);
		//===================================================================================
		l_id = new JLabel("ID: ");
		l_id.setSize(120,30);
		l_id.setLocation(30,50);

		tId = new JTextField("IcK0023");
		tId.setSize(400,20);
		tId.setLocation (100,50);
		//===================================================================================
		lLogin = new JLabel("Login ");
		lLogin.setSize(120,30);
		lLogin.setLocation(30,80);

		tLogin = new JTextField("Asdrubral");
		tLogin.setSize(400,20);
		tLogin.setLocation(100,80);
		//===================================================================================
		lSenha = new JLabel("Senha: ");
		lSenha.setSize(120,30);
		lSenha.setLocation(30,110);

		tSenha = new JTextField("012345");
		tSenha.setSize(400,20);
		tSenha.setLocation(100,110);
		//===================================================================================
		
		this.add(lPessoal);
		this.add(l_id);
		this.add(tId);
		this.add(lLogin);
		this.add(tLogin);
		this.add(lSenha);
		this.add(tSenha);
	}
	private void configBotoes() {
		mouseAdapter rato;
		rato = new mouseAdapter();

		bSalvar = new JButton("Salvar");
		bSalvar.setSize(80,30);
		bSalvar.setLocation(100,250);
		bSalvar.addMouseListener(rato);

		bLimpar = new JButton("Limpar");
		bLimpar.setSize(100,30);
		bLimpar.setLocation(200,250);
		bLimpar.addMouseListener(rato);

		bVoltar = new JButton("Voltar");
		bVoltar.setSize(80,30);
		bVoltar.setLocation(330,250);
		bVoltar.addMouseListener(rato);
		
		this.add(bSalvar);
		this.add(bLimpar);
		this.add(bVoltar);
		
	}

}
