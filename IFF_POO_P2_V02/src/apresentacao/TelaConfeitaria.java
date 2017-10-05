package apresentacao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Admin;
import modelo.Cliente;

@SuppressWarnings({ "serial", "unused" })
public class TelaConfeitaria extends JFrame {
//Atributos ================================================================================
	private JLabel lInical; 
	private JButton bCliente, bAdmin, bProduto, bPedido, bFechar;
	private int apoioA = 0, apoioB= 0, apoioC= 0;
	
// Meotodo construtor ====================================================================
	public TelaConfeitaria(){	
		configTela();
		configBotoes();
		this.repaint();					
	}

// Classe ouvinte para eventos no mouse =============================================

	private class mouseAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent e){
			if (e.getSource() == bCliente) {
				System.out.println("ABRINDO CADASTRO DE CLIENTES....");
				if (apoioA == 0){
					JOptionPane.showMessageDialog(null, "É preciso que ao menos 1 Administrador\nEsteja Cadastrado");
				}else{
					System.out.println("Cadastro de CLIENTE Inicializado...");
					TelaCliente objTC = new TelaCliente();
					apoioB = 1;
				}
			}
			if (e.getSource() == bAdmin) {
				System.out.println("ABRINDO CADASTRO DE ADMINISTRADORES....");
				apoioA = 1;
				TelaAdmin objTA = new TelaAdmin();
				System.out.println("Cadastro de ADMINISTRADORES Inicializado...");
			}
			if (e.getSource() == bProduto) {
				System.out.println("ABRINDO CADASTRO DE PRODUTOS....");
				if (apoioA == 0){
					JOptionPane.showMessageDialog(null, "É preciso que ao menos 1 Administrador\nEsteja Cadastrado");
				}else{
					apoioC=1;
					System.out.println("Cadastro de PRODUTOS Inicializado...");
					TelaProduto objTP = new TelaProduto();
				}
			}
			if (e.getSource() == bPedido) {
				System.out.println("ABRINDO CADASTRO DE PEDIDOS....");	
				if (apoioA == 0 || apoioB == 0 || apoioC ==0){
					JOptionPane.showMessageDialog(null, "É preciso que ao menos 1 Administrador\n1 Cliente e 1 Produto Cadastrado\nAntes de Gerar um novo Produto");
				}else{
					System.out.println("Cadastro de PEDIDOS Inicializado...");
					TelaPedido objTPE = new TelaPedido();
				}
			}
			if (e.getSource() == bFechar) {
				System.exit(0);  
			}
		}
	} 
// Metodo para Configurar a tela principal da aplicação =============================================

	private void configTela(){
		this.setSize(550,360);
		this.setTitle("CONFEITARIA <> MODULO DE CADASTRO <> ALPHA 0.2");
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}
	private void configDados(){
		lInical = new JLabel("CONFEITARIA");
		lInical.setSize(500,30);
		lInical.setLocation(180,40);
		this.add(lInical);	
	}
	
// Metodo para configurações dos Botões =============================================
	private void configBotoes() {
		mouseAdapter rato;
		rato = new mouseAdapter();
		
		bAdmin = new JButton("Cadastrar Administrador");
		bAdmin.setSize(225,30);
		bAdmin.setLocation(160,50);
		bAdmin.addMouseListener(rato);
		
		bCliente = new JButton("Cadastrar Clientes");
		bCliente.setSize(180,30);
		bCliente.setLocation(180,100);
		bCliente.addMouseListener(rato);
				
		bProduto = new JButton("Cadastrar Produtos");
		bProduto.setSize(180,30);
		bProduto.setLocation(180,150);
		bProduto.addMouseListener(rato);
		
		bPedido = new JButton("Cadastrar Pedidos");
		bPedido.setSize(180,30);
		bPedido.setLocation(180,200);
		bPedido.addMouseListener(rato);

		bFechar = new JButton("Sair");
		bFechar.setSize(80,30);
		bFechar.setLocation(230,250);
		bFechar.addMouseListener(rato);

		this.add(bCliente);
		this.add(bAdmin);
		this.add(bProduto);
		this.add(bPedido);
		this.add(bFechar);
	}
}
