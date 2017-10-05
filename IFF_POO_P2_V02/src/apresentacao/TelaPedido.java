package apresentacao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


import modelo.Pedido;
import modelo.Produto;

@SuppressWarnings({ "serial", "unused" })
public class TelaPedido extends JFrame {
	//Atributos ================================================================================
	private JLabel lDados, lCodigo, lDataEntrega, lDataPedido, lFormaPG, lValorTotal, lProdCod, lProdPreco, lProdQuantidade;
    
	private JTextField tCodigo, tDataEntrega, tDataPedido, tFormaPG, tValorTotal, tProdCod, tProdPreco, tProdQuantidade;
	private JButton bSalvar, bLimpar, bVoltar, bCalcular;
	
	String codigo, dataEntrega, dataPedido, formaPG,prodCod;
    float valorTotal, prodPreco, prodQuantidade, total;
    int aleatorio = (int) (10000 + Math.random() * 89999l);
    
	//Atributos de referencia ====================================================================
	private Pedido ped;
	private Produto prod;
	
	
	JComboBox<String> combo1 = new JComboBox<String>();
	JComboBox<String> combo2 = new JComboBox<String>();
	// Meotodo construtor ====================================================================
	public TelaPedido(){	
		configTela();
		configDados();
		configBotoes();
		comboBoxProduto();
		comboBoxPagamento();
		this.repaint();
	}
	private class mouseAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent e){
			if (e.getSource() == bSalvar) {
				if (tValorTotal.getText().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Totalize o Pedido antes de Gravar");
				}else{
					codigo = tCodigo.getText();
					dataEntrega = tDataEntrega.getText();
					dataPedido = tDataPedido.getText();
					formaPG = comboBoxPagamento();
					valorTotal = Float.parseFloat(tValorTotal.getText());
					prodCod = comboBoxProduto();
					prodPreco = Float.parseFloat(tProdPreco.getText());
					prodQuantidade = Float.parseFloat(tProdQuantidade.getText());
					ped = new Pedido(codigo, dataEntrega, dataPedido, formaPG, valorTotal, prodCod, prodPreco, prodQuantidade);
						
					JOptionPane.showMessageDialog(null, "Produto incluido");
				}
			}
			if (e.getSource() == bLimpar) {
				tCodigo.setText("");
				tDataEntrega.setText("");
				tDataPedido.setText("");
				tValorTotal.setText("");
				tProdPreco.setText("");
				tProdQuantidade.setText("");
			}
			if (e.getSource() == bVoltar) {
				dispose();  
			}
			if (e.getSource() == bCalcular) {
				if (tProdQuantidade.getText().equalsIgnoreCase("")
					||(tProdPreco.getText().equalsIgnoreCase(""))){
					JOptionPane.showMessageDialog(null, "Quantidade ou Preço Invalido");
				}else{
					prodQuantidade = Float.parseFloat(tProdQuantidade.getText());
					prodPreco = Float.parseFloat(tProdPreco.getText());
					total = prodPreco*prodQuantidade;
					tValorTotal.setText(Float.toString(total));	
				}
			}
		}
	} 
	
	private String comboBoxPagamento(){
		add(combo1);
		combo1.addItem("Dinheiro ");
		combo1.addItem("Cartão de Credito");
		combo1.addItem("Cartão de Débito");
		combo1.addItem("Não pago / Calote");		
		combo1.setSize(300,20);
		combo1.setLocation(170,100);
		
		return (String) combo1.getSelectedItem();
	}
	
	private String comboBoxProduto(){
		add(combo2);
		combo2.addItem("B001 - Cupcake");
		combo2.addItem("P002 - Pão de Queijo");
		combo2.addItem("B021 - Bisnaga");
		combo2.setLocation(170,125);
		combo2.setSize(300,20);
		
		return (String) combo2.getSelectedItem();
	}
	
	private void configTela(){
		this.setSize(550,360);
		this.setTitle("Cadastro de Pedidos");
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null); //centraliza a janela na abertura
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);		
	}
	private void configDados(){
		lDados = new JLabel(">> Cadastro de Pedidos ==============================");
		lDados.setSize(580,30);
		lDados.setLocation(10,0);
		//===================================================================================
		lCodigo = new JLabel("Código do Pedido: ");
		lCodigo.setSize(160,30);
		lCodigo.setLocation(30,25);

		tCodigo = new JTextField(Integer.toString(aleatorio));
		tCodigo.setSize(300,20);
		tCodigo.setEditable(false);
		tCodigo.setLocation (170,25);
		//===================================================================================
		lDataEntrega = new JLabel("Data de Entrega ");
		lDataEntrega.setSize(160,30);
		lDataEntrega.setLocation(30,50);

		tDataEntrega = new JTextField("25/07/2016");
		tDataEntrega.setSize(300,20);
		tDataEntrega.setLocation(170,50);
		//===================================================================================
		lDataPedido = new JLabel("Data do Pedido: ");
		lDataPedido.setSize(160,30);
		lDataPedido.setLocation(30,75);

		tDataPedido = new JTextField("26/06/2016");
		tDataPedido.setSize(300,20);
		tDataPedido.setLocation(170,75);
		//===================================================================================
		lFormaPG = new JLabel("Forma Pagamento:");
		lFormaPG.setSize(160,30);
		lFormaPG.setLocation(30,100);

		//===================================================================================
		lProdCod = new JLabel("Produto: ");
		lProdCod.setSize(160,30);
		lProdCod.setLocation(30,125);

		//===================================================================================
		lProdQuantidade = new JLabel("Quantidade");
		lProdQuantidade.setSize(160,30);
		lProdQuantidade.setLocation(30,150);

		tProdQuantidade = new JTextField("10");
		tProdQuantidade.setSize(300,20);
		tProdQuantidade.setLocation(170,150);
		
		//===================================================================================
		lProdPreco = new JLabel("Preço Unitário:");
		lProdPreco.setSize(160,30);
		lProdPreco.setLocation(30,175);

		
		tProdPreco = new JTextField("7.99");
		tProdPreco.setSize(300,20);
		tProdPreco.setLocation(170,175);
		
		//===================================================================================
		lValorTotal = new JLabel("Valor Total:");
		lValorTotal.setSize(160,30);
		lValorTotal.setLocation(30,200);

		tValorTotal = new JTextField();
		tValorTotal.setEditable(false);
		tValorTotal.setSize(300,20);
		tValorTotal.setLocation(170,200);

		this.add(lDados);
		this.add(lCodigo);
		this.add(tCodigo);
		this.add(lDataEntrega);
		this.add(tDataEntrega);
		this.add(lDataPedido);
		this.add(tDataPedido);
		this.add(lFormaPG);

		this.add(lProdCod);

		this.add(lProdPreco);
		this.add(tProdPreco);
		this.add(lProdQuantidade);
		this.add(tProdQuantidade);
		this.add(lValorTotal);
		this.add(tValorTotal);
		
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
		
		bCalcular = new JButton("Totalizar");
		bCalcular.setSize(100,30);
		bCalcular.setLocation(200,235);
		bCalcular.addMouseListener(rato);
		
		this.add(bSalvar);
		this.add(bLimpar);
		this.add(bVoltar);
		this.add(bCalcular);
	}

}
