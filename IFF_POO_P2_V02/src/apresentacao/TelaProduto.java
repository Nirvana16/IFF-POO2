package apresentacao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import modelo.Produto;

@SuppressWarnings({ "serial", "unused" })
public class TelaProduto extends JFrame {
	//Atributos ================================================================================
	private JLabel lDados, lCodigo, lDescricao, lTipo, lValidade, lPeso, lPreco, lQuantidade;
    private JTextField tCodigo, tDescricao, tTipo, tValidade, tPeso, tPreco, tQuantidade;
	private JButton bSalvar, bLimpar, bVoltar;	
	String codigo, descricao, tipo, validade;
    float peso, preco, quantidade;
	//Atributos de referencia ====================================================================
	private Produto pro;
	
	// Meotodo construtor ====================================================================
	public TelaProduto(){	
		configTela();
		configDados();
		configBotoes();		
		this.repaint();					
	}
	private class mouseAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent e){
			if (e.getSource() == bSalvar) {
				codigo = tCodigo.getText();
				quantidade = Float.parseFloat(tQuantidade.getText());
				descricao = tDescricao.getText();
				tipo = tTipo.getText();
				validade = tValidade.getText();
				peso = Float.parseFloat(tPeso.getText());
				preco = Float.parseFloat(tPreco.getText());
				pro = new Produto(codigo, descricao, tipo, validade, peso, preco, quantidade);		
				JOptionPane.showMessageDialog(null, "Produto incluido");
			}
			if (e.getSource() == bLimpar) {
				tCodigo.setText("");
				tDescricao.setText("");
				tTipo.setText("");
				tValidade.setText("");
				tPeso.setText("");
				tPreco.setText("");
				tQuantidade.setText("");			
			}
			if (e.getSource() == bVoltar) {
				dispose();  
			}
		}
	} 
	private void configTela(){
		this.setSize(550,360);
		this.setTitle("Cadastro de Produtos");
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null); //centraliza a janela na abertura
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	private void configDados(){
		lDados = new JLabel(">> Cadastro de Produtos ==============================");
		lDados.setSize(580,30);
		lDados.setLocation(10,0);
		//===================================================================================
		lCodigo = new JLabel("Código: ");
		lCodigo.setSize(120,30);
		lCodigo.setLocation(30,50);

		tCodigo = new JTextField("09890401");
		tCodigo.setSize(400,20);
		tCodigo.setLocation (100,50);
		//===================================================================================
		lDescricao = new JLabel("Descricao ");
		lDescricao.setSize(120,30);
		lDescricao.setLocation(30,80);

		tDescricao = new JTextField("Cupcake de Chocolate com Merengue Suiço e Rum");
		tDescricao.setSize(400,20);
		tDescricao.setLocation(100,80);
		//===================================================================================
		lTipo = new JLabel("Tipo: ");
		lTipo.setSize(120,30);
		lTipo.setLocation(30,110);

		tTipo = new JTextField("Doce");
		tTipo.setSize(400,20);
		tTipo.setLocation(100,110);
		//===================================================================================
		lValidade = new JLabel("Validade ");
		lValidade.setSize(120,30);
		lValidade.setLocation(30,140);

		tValidade = new JTextField("7 Dias");
		tValidade.setSize(400,20);
		tValidade.setLocation(100,140);
		//===================================================================================
		lPeso = new JLabel("Peso: ");
		lPeso.setSize(120,30);
		lPeso.setLocation(30,170);

		tPeso = new JTextField("300");
		tPeso.setSize(400,20);
		tPeso.setLocation(100,170);
		//===================================================================================
		lPreco = new JLabel("Preço ");
		lPreco.setSize(120,30);
		lPreco.setLocation(30,200);

		tPreco = new JTextField("5.99");
		tPreco.setSize(400,20);
		tPreco.setLocation(100,200);
		
		//===================================================================================
		lQuantidade = new JLabel("Qtd:");
		lQuantidade.setSize(120,30);
		lQuantidade.setLocation(30,230);

		tQuantidade = new JTextField("4");
		tQuantidade.setSize(400,20);
		tQuantidade.setLocation(100,230);
		
		
		this.add(lDados);
		this.add(lCodigo);
		this.add(tCodigo);
		this.add(lDescricao);
		this.add(tDescricao);
		this.add(lTipo);
		this.add(tTipo);
		this.add(lValidade);
		this.add(tValidade);
		this.add(lPeso);
		this.add(tPeso);
		this.add(lPreco);
		this.add(tPreco);
		this.add(lQuantidade);
		this.add(tQuantidade);
		
	}
	private void configBotoes() {
		mouseAdapter rato;
		rato = new mouseAdapter();

		bSalvar = new JButton("Salvar");
		bSalvar.setSize(80,30);
		bSalvar.setLocation(100,270);
		bSalvar.addMouseListener(rato);

		bLimpar = new JButton("Limpar");
		bLimpar.setSize(100,30);
		bLimpar.setLocation(200,270);
		bLimpar.addMouseListener(rato);

		bVoltar = new JButton("Voltar");
		bVoltar.setSize(80,30);
		bVoltar.setLocation(330,270);
		bVoltar.addMouseListener(rato);
		
		this.add(bSalvar);
		this.add(bLimpar);
		this.add(bVoltar);
	}
}
