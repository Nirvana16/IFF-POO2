package apresentacao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Emprestimo;
import modelo.Livro;

@SuppressWarnings("serial")
public class TelaLivro extends JFrame {	

	//Atributos ================================================================================
		private JLabel lDados, ltitulo, lautor, lcodigo, leditora,lano, lstatus;
		private JTextField ttitulo, tautor, tcodigo, teditora, tano, tstatus;
		private JButton bSalvar, bLimpar, bListar, bFechar;

	//Variaveis para Armazenamento do que for inserido ====================================================
		String titulo,autor,codigo,editora,status;
		int ano;

	//Atributos de referencia ====================================================================	
		Livro liv;
		

		// Metodo construtor
		public TelaLivro(){	
			configTela();
			configDados();
			configBotoes();
			this.repaint();					
		}	

		class mouseAdapter extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == bSalvar) {
					codigo = tcodigo.getText();
					titulo = ttitulo.getText();
					autor = tautor.getText();
					editora = teditora.getText();
					ano = Integer.parseInt(tano.getText());
					status = tstatus.getText();		
					liv = new Livro(codigo, titulo, autor, editora, ano, status);
					
										
					JOptionPane.showMessageDialog(null, "Livro incluido com sucesso!");
				}
				if (e.getSource() == bLimpar) {
					ttitulo.setText("");
					tautor.setText("");
					tcodigo.setText("");
					teditora.setText("");
					tano.setText("");
					tstatus.setText("");
				}	
				if (e.getSource() == bListar) {
					JOptionPane.showMessageDialog(null, "LISTADO teste");
				}
				if (e.getSource() == bFechar) {
					System.exit(0);  
				}
			}	
		}

		private void configTela(){
			this.setSize(700,350);
			this.setTitle("Cadastro de Livros");
			this.setResizable(false);
			this.setLayout(null);
			this.setVisible(true);
			this.setLocationRelativeTo(null); //centraliza a janela na abertura
			this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		}

		private void configDados(){
			lDados = new JLabel("- Informacoes -");
			lDados.setSize(120,30);
			lDados.setLocation(30,0);
			
			ltitulo = new JLabel("Titulo: ");
			ltitulo.setSize(120,30);
			ltitulo.setLocation(30,25);

			ttitulo = new JTextField();
			ttitulo.setSize(460,20);
			ttitulo.setLocation (170,30);

			lautor = new JLabel("Autor ");
			lautor.setSize(120,30);
			lautor.setLocation(30,50);

			tautor = new JTextField();
			tautor.setSize(460,20);
			tautor.setLocation(170,55);

			lcodigo = new JLabel("Codigo: ");
			lcodigo.setSize(120,30);
			lcodigo.setLocation(30,75);

			tcodigo = new JTextField();
			tcodigo.setSize(460,20);
			tcodigo.setLocation(170,80);

			leditora = new JLabel("Editora");
			leditora.setSize(120,30);
			leditora.setLocation(30,100);

			teditora = new JTextField();
			teditora.setSize(460,20);
			teditora.setLocation(170,105);

			lano = new JLabel("Ano: ");
			lano.setSize(120,30);
			lano.setLocation(30,140);

			tano = new JTextField();
			tano.setSize(460,20);
			tano.setLocation(170,140);
			
			lstatus = new JLabel("Status: ");
			lstatus.setSize(120,30);
			lstatus.setLocation(30,175);

			tstatus = new JTextField();
			tstatus.setSize(460,20);
			tstatus.setLocation(170,180);

			this.add(lDados);
			this.add(ltitulo);
			this.add(lautor);
			this.add(lcodigo);
			this.add(leditora);
			this.add(lano);
			this.add(lstatus);
			this.add(ttitulo);
			this.add(tautor);
			this.add(tcodigo);
			this.add(teditora);
			this.add(tano);
			this.add(tstatus);
		}
		private void configBotoes() {
			mouseAdapter adapter;
			adapter = new mouseAdapter();

			bSalvar = new JButton("Salvar");
			bSalvar.setSize(80,30);
			bSalvar.setLocation(100,270);
			bSalvar.addMouseListener(adapter);

			bLimpar = new JButton("Limpar");
			bLimpar.setSize(80,30);
			bLimpar.setLocation(200,270);
			bLimpar.addMouseListener(adapter);

			bListar = new JButton("Ver Ficha");
			bListar.setSize(100,30);
			bListar.setLocation(300,270);
			bListar.addMouseListener(adapter);

			bFechar = new JButton("Sair do Programa");
			bFechar.setSize(150,30);
			bFechar.setLocation(420,270);
			bFechar.addMouseListener(adapter);

			this.add(bSalvar);
			this.add(bLimpar);
			this.add(bListar);	
			this.add(bFechar);
		}
	}
