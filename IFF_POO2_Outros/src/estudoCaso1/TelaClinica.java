package estudoCaso1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TelaClinica extends JFrame
{	
	//atributos
	private JLabel lNome, lEmail, lCnpj, lRazaoSocial, lRua, lNumero, lComplemento, lBairro, lCidade, lCep, lEstado, lDdi, lDdd, lTel, lTipo, lOperadora;
	private JTextField tNome, tEmail, tCnpj, tRazaoSocial, tRua, tNumero, tComplemento, tBairro, tCidade, tCep, tEstado, tDdi, tDdd, tTel, tTipo, tOperadora;
	private JButton bSalvar, bLimpar, bListar, bFechar;
	private JPanel pClinica, pEndereco, pTelefone;

	//vari�veis locais para armazenar o que for digitado
	String nome,email,cnpj,razaosocial,rua,numero,complemento,bairro,cidade,cep,estado,ddi,ddd,tel,tipo,operadora;
	
	//atributos de refer�ncia - a principio n�o � necess�rio
	Clinica cli;	
	Endereco end;
	Telefone fone;
		
	//m�todo construtor
	public TelaClinica()
	{
		//configura��es da janela
		this.setSize(700,640);
		this.setTitle("Cadastro de Cl�nica");
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null); //centraliza a janela na abertura
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		//criando os panels para estruturar as �reas na tela 
		pClinica = new JPanel();
		pClinica.setSize(680, 150);
		pClinica.setLocation(10, 10);
		pClinica.setBorder
		(	BorderFactory.createTitledBorder("Dados da Cl�nica:")	);
		
		pEndereco = new JPanel();
		pEndereco.setSize(680, 240);
		pEndereco.setLocation(10, 170);
		pEndereco.setBorder
		(	BorderFactory.createTitledBorder("Endere�o Completo:")	);
		
		pTelefone = new JPanel();
		pTelefone.setSize(680, 120);
		pTelefone.setLocation(10, 420);	
		pTelefone.setBorder
		(	BorderFactory.createTitledBorder("Telefone de Contato:")	);
		
		//adicionando os labels	e text fields
		
		//pessoal
		lNome = new JLabel("Nome: ");
		lNome.setSize(120,30);
		lNome.setLocation(30,20);
		
		tNome = new JTextField();
		tNome.setSize(460,20);
		tNome.setLocation (170,25);
		
		lEmail = new JLabel("E-mail: ");
		lEmail.setSize(120,30);
		lEmail.setLocation(30,50);
		
		tEmail = new JTextField();
		tEmail.setSize(460,20);
		tEmail.setLocation(170,55);
		
		lCnpj = new JLabel("CNPJ: ");
		lCnpj.setSize(120,30);
		lCnpj.setLocation(30,80);
		
		tCnpj = new JTextField();
		tCnpj.setSize(240,20);
		tCnpj.setLocation(170,85);
		
		lRazaoSocial = new JLabel("Raz�o Social: ");
		lRazaoSocial.setSize(120,30);
		lRazaoSocial.setLocation(30,110);
		
		tRazaoSocial = new JTextField();
		tRazaoSocial.setSize(240,20);
		tRazaoSocial.setLocation(170,115);
		

		//endere�o
		lRua = new JLabel("Rua: ");
		lRua.setSize(120,30);
		lRua.setLocation(30,20);
		
		tRua = new JTextField();
		tRua.setSize(460,20);
		tRua.setLocation(170,25);
		
		lNumero = new JLabel("N�mero: ");
		lNumero.setSize(120,30);
		lNumero.setLocation(30,50);
		
		tNumero = new JTextField();
		tNumero.setSize(240,20);
		tNumero.setLocation(170,55);
		
		lComplemento = new JLabel("Complemento: ");
		lComplemento.setSize(120,30);
		lComplemento.setLocation(30,80);
		
		tComplemento = new JTextField();
		tComplemento.setSize(240,20);
		tComplemento.setLocation(170,85);
		
		lBairro = new JLabel("Bairro: ");
		lBairro.setSize(120,30);
		lBairro.setLocation(30,110);
		
		tBairro = new JTextField();
		tBairro.setSize(240,20);
		tBairro.setLocation(170,115);
		
		lCidade = new JLabel("Cidade: ");
		lCidade.setSize(120,30);
		lCidade.setLocation(30,140);
		
		tCidade = new JTextField();
		tCidade.setSize(240,20);
		tCidade.setLocation(170,145);
		
		lCep = new JLabel("CEP: ");
		lCep.setSize(120,30);
		lCep.setLocation(30,170);
		
		tCep = new JTextField();
		tCep.setSize(240,20);
		tCep.setLocation(170,175);
		
		lEstado = new JLabel("Estado: ");
		lEstado.setSize(120,30);
		lEstado.setLocation(30,200);
		
		tEstado = new JTextField();
		tEstado.setSize(240,20);
		tEstado.setLocation(170,205);
		
		//telefone
		lDdi = new JLabel("DDI: ");
		lDdi.setSize(80,30);
		lDdi.setLocation(30,20);
		
		tDdi = new JTextField();
		tDdi.setSize(80,20);
		tDdi.setLocation(170,25);
		
		lDdd = new JLabel("DDD: ");
		lDdd.setSize(80,30);
		lDdd.setLocation(30,50);
		
		tDdd = new JTextField();
		tDdd.setSize(80,20);
		tDdd.setLocation(170,55);
		
		lTel = new JLabel("N�mero: ");
		lTel.setSize(120,30);
		lTel.setLocation(30,80);
		
		tTel = new JTextField();
		tTel.setSize(160,20);
		tTel.setLocation(170,85);
		
		lTipo = new JLabel("Tipo: ");
		lTipo.setSize(80,30);
		lTipo.setLocation(400,20);
		
		tTipo = new JTextField();
		tTipo.setSize(140,20);
		tTipo.setLocation(490,25);
		
		lOperadora = new JLabel("Operadora: ");
		lOperadora.setSize(100,30);
		lOperadora.setLocation(400,50);
				
		tOperadora = new JTextField();
		tOperadora.setSize(140,20);
		tOperadora.setLocation(490,55);
		
		//criando classe interna para funcionar como ouvinte dos eventos de mouse
		class BatSinal extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == bSalvar) {
					nome = tNome.getText();
					email = tEmail.getText();
					cnpj = tCnpj.getText();
					razaosocial = tRazaoSocial.getText();
//					cli = new Clinica(nome,email,cnpj,razaosocial);
					rua = tRua.getText();
					numero = tNumero.getText();
					complemento = tComplemento.getText();
					bairro = tBairro.getText();
					cidade = tCidade.getText();
					cep = tCep.getText();
					estado = tEstado.getText();
					end = new Endereco(rua,numero,complemento,bairro,cidade,cep,estado);
					ddi = tDdi.getText();
					ddd = tDdd.getText();
					tel = tTel.getText();
					tipo = tTipo.getText();
					operadora = tOperadora.getText();
					fone = new Telefone(ddi,ddd,tel,tipo,operadora);
					
					cli = new Clinica(nome,email,cnpj,razaosocial,end,fone);
					
					
					JOptionPane.showMessageDialog(null, "Paciente inclu�do com sucesso!");
				}
				if (e.getSource() == bLimpar) {
					tNome.setText("");
					tEmail.setText("");
					tCnpj.setText("");
					tRazaoSocial.setText("");
					tRua.setText("");
					tNumero.setText("");
					tComplemento.setText("");
					tBairro.setText("");
					tCidade.setText("");
					tCep.setText("");
					tEstado.setText("");
					tDdi.setText("");
					tDdd.setText("");
					tTel.setText("");
					tTipo.setText("");
					tOperadora.setText("");
				}	
				if (e.getSource() == bListar) {
					cli.imprimirDados();
					JOptionPane.showMessageDialog(null,"ENDERE�O COMPLETO:\n\n"+end.getRua()+", "+end.getNumero()+" - "+end.getComplemento()+" - "+end.getBairro()+" - "+end.getCidade()+"/"+end.getUf()+" - CEP: "+end.getCep());
					JOptionPane.showMessageDialog(null,"TELEFONE COMPLETO:\n\n"+fone.getDdi()+" ("+fone.getDdd()+") "+fone.getNumero()+" - "+fone.getTipo()+" - "+fone.getOperadora());
				}
				if (e.getSource() == bFechar) {
					System.exit(0);  
				}
			}	
		}
		
		//adicionando ouvinte para os bot�es
		BatSinal batman;
		batman = new BatSinal();
				
		//adicionando os buttons
		bSalvar = new JButton("Salvar");
		bSalvar.setSize(80,30);
		bSalvar.setLocation(150,560);
		bSalvar.setForeground(Color.white);
		bSalvar.setBackground(Color.blue);
		bSalvar.addMouseListener(batman);
		
		bLimpar = new JButton("Limpar");
		bLimpar.setSize(80,30);
		bLimpar.setLocation(250,560);
		bLimpar.setForeground(Color.white);
		bLimpar.setBackground(Color.gray);
		bLimpar.addMouseListener(batman);
		
		bListar = new JButton("Listar Ficha");
		bListar.setSize(100,30);
		bListar.setLocation(350,560);
		bListar.setForeground(Color.white);
		bListar.setBackground(Color.green);
		bListar.addMouseListener(batman);
				
		bFechar = new JButton("Fechar");
		bFechar.setSize(80,30);
		bFechar.setLocation(470,560);
		bFechar.setForeground(Color.white);
		bFechar.setBackground(Color.red);
		bFechar.addMouseListener(batman);
		
		//colocando tudin na tela
		this.add(pClinica);
		pClinica.add(lNome);
		pClinica.add(lEmail);
		pClinica.add(lCnpj);
		pClinica.add(lRazaoSocial);
		pClinica.add(tNome);
		pClinica.add(tEmail);
		pClinica.add(tCnpj);
		pClinica.add(tRazaoSocial);
		this.add(pEndereco);
		pEndereco.add(lRua);
		pEndereco.add(lNumero);
		pEndereco.add(lComplemento);
		pEndereco.add(lBairro);
		pEndereco.add(lCidade);
		pEndereco.add(lCep);
		pEndereco.add(lEstado);
		pEndereco.add(tRua);
		pEndereco.add(tNumero);
		pEndereco.add(tComplemento);
		pEndereco.add(tBairro);
		pEndereco.add(tCidade);		
		pEndereco.add(tCep);
		pEndereco.add(tEstado);
		this.add(pTelefone);
		pTelefone.add(lDdi);
		pTelefone.add(lDdd);
		pTelefone.add(lTel);
		pTelefone.add(lTipo);
		pTelefone.add(lOperadora);
		pTelefone.add(tDdi);
		pTelefone.add(tDdd);
		pTelefone.add(tTel);
		pTelefone.add(tTipo);
		pTelefone.add(tOperadora);
		this.add(bSalvar);
		this.add(bLimpar);
		this.add(bListar);	
		this.add(bFechar);
		this.repaint();					
	}	
}