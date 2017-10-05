package exercicio.spa;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class TelaClinica extends JFrame {
	//Atributos
	private JLabel lNome,
				   lEmail,
				   lCnpj,
				   lRazaoSocial,
				   lRua,
				   lNumero,
				   lComplemento,
				   lBairro,
				   lCidade,
				   lCep, 
				   lEstado, 
				   lDdi, 
				   lDdd, 
				   lTel, 
				   lTipo, 
				   lOperadora;
	private JTextField tNome,
					   tEmail,
					   tCnpj,
					   tRazaoSocial,
					   tRua,
					   tNumero,
					   tComplemento,
					   tBairro,
					   tCidade,
					   tCep, 
					   tEstado, 
					   tDdi, 
					   tDdd, 
					   tTel, 
					   tTipo, 
					   tOperadora;
	private JButton bSalvar,
					bLimpar,
					bListar,
					bFechar;
	private JPanel pPessoal,
				   pEndereco,
				   pTelefone;
	
	//Variaveis LOcais
	String nome, email, cnpj, razaoSocial, rua, numero, complemento, bairro, cidade, cep, estado, ddi,ddd,tipo,tel,operadora;
	
	
	//Atributo de Referencia
	Clinica cli;
	Endereco end;
	Telefone fone;
	
	
	//Metodo Construtor
	public TelaClinica(){
		//configurações da janela
		this.setSize(700,720);
		this.setTitle("Cadastro de Clinicas");
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null); //centraliza a janela na abertura
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		//criando os panels para estruturar as áreas na tela 
		pPessoal = new JPanel();
		pPessoal.setSize(680, 240);
		pPessoal.setLocation(10, 10);
		pPessoal.setBorder
		(	BorderFactory.createTitledBorder("Dados da CLinica")	);
		
		pEndereco = new JPanel();
		pEndereco.setSize(680, 240);
		pEndereco.setLocation(10, 260);
		pEndereco.setBorder
		(	BorderFactory.createTitledBorder("Endereço")	);
		
		pTelefone = new JPanel();
		pTelefone.setSize(680, 120);
		pTelefone.setLocation(10, 510);	
		pTelefone.setBorder
		(	BorderFactory.createTitledBorder("Telefone")	);
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
		
		lCnpj = new JLabel("cnpj: ");
		lCnpj.setSize(120,30);
		lCnpj.setLocation(30,80);
		
		tCnpj = new JTextField();
		tCnpj.setSize(240,20);
		tCnpj.setLocation(170,85);
		
		lRazaoSocial = new JLabel("Razão Social: ");
		lRazaoSocial.setSize(120,30);
		lRazaoSocial.setLocation(30,110);
		
		tRazaoSocial = new JTextField();
		tRazaoSocial.setSize(240,20);
		tRazaoSocial.setLocation(170,115);
		
		//endereço
		lRua = new JLabel("Rua: ");
		lRua.setSize(120,30);
		lRua.setLocation(30,20);
		
		tRua = new JTextField();
		tRua.setSize(460,20);
		tRua.setLocation(170,25);
		
		lNumero = new JLabel("Número: ");
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
		
		lTel = new JLabel("Número: ");
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
		
		//Ouvinte (Classe Interna)
		
		class BatSinal extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == bSalvar) {
					nome = tNome.getText();
					email = tEmail.getText();
					cnpj = tCnpj.getText();
					razaoSocial = tRazaoSocial.getText();
					
					cli = new Clinica(nome, cnpj, razaoSocial);
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
					
					JOptionPane.showMessageDialog(null, "CLinica incluído com sucesso!");
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
					JOptionPane.showMessageDialog(null,"ENDEREÇO COMPLETO:\n\n"+end.getRua()+", "+end.getNumero()+" - "+end.getComplemento()+" - "+end.getBairro()+" - "+end.getCidade()+"/"+end.getEstado()+" - CEP: "+end.getCep());
					JOptionPane.showMessageDialog(null,"TELEFONE COMPLETO:\n\n"+fone.getDdi()+" ("+fone.getDdd()+") "+fone.getNumero()+" - "+fone.getTipo()+" - "+fone.getOperadora());
				}
				if (e.getSource() == bFechar) {
					System.exit(0);  
				}
			}
		}
	//adicionando ouvinte para os botões
			BatSinal batman;
			batman = new BatSinal();
					
			//adicionando os buttons
			bSalvar = new JButton("Salvar");
			bSalvar.setSize(80,30);
			bSalvar.setLocation(210,650);
			bSalvar.setForeground(Color.white);
			bSalvar.setBackground(Color.blue);
			bSalvar.addMouseListener(batman);
			
			bLimpar = new JButton("Limpar");
			bLimpar.setSize(80,30);
			bLimpar.setLocation(310,650);
			bLimpar.setForeground(Color.white);
			bLimpar.setBackground(Color.gray);
			bLimpar.addMouseListener(batman);
			
			bListar = new JButton("Ver Ficha");
			bListar.setSize(100,30);
			bListar.setLocation(410,650);
			bListar.setForeground(Color.white);
			bListar.setBackground(Color.green);
			bListar.addMouseListener(batman);
					
			bFechar = new JButton("Sair do Programa");
			bFechar.setSize(150,30);
			bFechar.setLocation(530,650);
			bFechar.setForeground(Color.white);
			bFechar.setBackground(Color.red);
			bFechar.addMouseListener(batman);
			
			//colocando tudin na tela
			this.add(pPessoal);
			pPessoal.add(lNome);
			pPessoal.add(lEmail);
			pPessoal.add(lCnpj);
			pPessoal.add(lRazaoSocial);
			pPessoal.add(tNome);
			pPessoal.add(tEmail);
			pPessoal.add(tCnpj);
			pPessoal.add(tRazaoSocial);
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

