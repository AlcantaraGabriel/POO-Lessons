package controle;

import javax.swing.JTextField;

import modelo.Aluno;
import view.Janela;

public class ControleMedia {
	private Janela janela;
	private Aluno aluno;
	
	
	public  ControleMedia(Janela janela){
		this.janela = janela;
	}
	
	public void efetuarMedia(){
		aluno = new Aluno();
		
		JTextField txtNome = (JTextField) janela.recuperarElemento("txtNome");
		JTextField txtTurma = (JTextField) janela.recuperarElemento("txtTurma");
		JTextField txtN1 = (JTextField) janela.recuperarElemento("txtN1");
		JTextField txtN2 = (JTextField) janela.recuperarElemento("txtN2");
		JTextField txtMedia = (JTextField) janela.recuperarElemento("txtMedia");
		
		
		aluno.setNome(txtNome.getText());
		aluno.setTurma(txtTurma.getText());
		
		aluno.setN1(Float.parseFloat(txtN1.getText()));
		aluno.setN2(Float.parseFloat(txtN2.getText()));
		
		txtMedia.setText(""+aluno.calcularMedia());
		
		
	}
}
