package apresentacao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import modelo.Cliente;

public class TelaCliente extends JFrame {
	//Atributos ================================================================================
	private JLabel lPessoal, lCpf, lNome, lTelefone, lEndereco, lCep, lEmail;
	private JTextField tCpf, tNome, tTelefone, tEndereco, tCep, tEmail;
	private JButton bSalvar, bLimpar, bVoltar;
	
	String cpf, nome, telefone, endereco, cep, email;
	//Atributos de referencia ====================================================================
	private Cliente cli;
	
	// Meotodo construtor ====================================================================
	public TelaCliente(){	
		configTela();
		configDados();
		configBotoes();
		
		this.repaint();					
	}
	private class mouseAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent e){
			if (e.getSource() == bSalvar) {
				cpf = tCpf.getText();
				nome = tNome.getText();
				telefone = tTelefone.getText();
				endereco = tEndereco.getText();
				cep = tCep.getText();
				email = tEmail.getText();
				cli = new Cliente(cpf, nome, telefone, endereco, cep, email);
				JOptionPane.showMessageDialog(null, "CLIENTE incluido");
			}
			if (e.getSource() == bLimpar) {
				tCpf.setText("");
				tNome.setText("");
				tTelefone.setText("");
				tEndereco.setText("");
				tCep.setText("");
				tEmail.setText("");				
			}
			if (e.getSource() == bVoltar) {
				dispose();  
			}
						
		}
	} 
	private void configTela(){
		this.setSize(550,360);
		this.setTitle("Cadastro de Clientes");
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null); //centraliza a janela na abertura
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	private void configDados(){
		lPessoal = new JLabel(">> Cadastro de Cliente ==============================");
		lPessoal.setSize(580,30);
		lPessoal.setLocation(10,0);
		//===================================================================================
		lCpf = new JLabel("CPF: ");
		lCpf.setSize(120,30);
		lCpf.setLocation(30,50);

		tCpf = new JTextField("74185296387");
		tCpf.setSize(400,20);
		tCpf.setLocation (100,50);
		//===================================================================================
		lNome = new JLabel("Nome ");
		lNome.setSize(120,30);
		lNome.setLocation(30,80);

		tNome = new JTextField("Fulano de Tal");
		tNome.setSize(400,20);
		tNome.setLocation(100,80);
		//===================================================================================
		lTelefone = new JLabel("Telefone: ");
		lTelefone.setSize(120,30);
		lTelefone.setLocation(30,110);

		tTelefone = new JTextField("(22)27377373");
		tTelefone.setSize(400,20);
		tTelefone.setLocation(100,110);
		//===================================================================================
		lEndereco = new JLabel("Endereco ");
		lEndereco.setSize(120,30);
		lEndereco.setLocation(30,140);

		tEndereco = new JTextField("AV Princesa Isabel N#33 - Centro");
		tEndereco.setSize(400,20);
		tEndereco.setLocation(100,140);
		//===================================================================================
		lCep = new JLabel("CEP: ");
		lCep.setSize(120,30);
		lCep.setLocation(30,170);

		tCep = new JTextField("28073-475");
		tCep.setSize(400,20);
		tCep.setLocation(100,170);
		//===================================================================================
		lEmail = new JLabel("Email ");
		lEmail.setSize(120,30);
		lEmail.setLocation(30,200);

		tEmail = new JTextField("fulando@detal.com.br");
		tEmail.setSize(400,20);
		tEmail.setLocation(100,200);
		//===================================================================================
		
		this.add(lPessoal);
		this.add(lCpf);
		this.add(tCpf);
		this.add(lNome);
		this.add(tNome);
		this.add(lTelefone);
		this.add(tTelefone);
		this.add(lEndereco);
		this.add(tEndereco);
		this.add(lCep);
		this.add(tCep);
		this.add(lEmail);
		this.add(tEmail);
		
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
