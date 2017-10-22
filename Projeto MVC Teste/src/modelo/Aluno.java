package modelo;

public class Aluno {

		private String nome;
		private String turma;
		private float n1;
		private float n2;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTurma() {
			return turma;
		}
		public void setTurma(String turma) {
			this.turma = turma;
		}
		public float getN1() {
			return n1;
		}
		public void setN1(float n1) {
			this.n1 = n1;
		}
		public float getN2() {
			return n2;
		}
		public void setN2(float n2) {
			this.n2 = n2;
		}
		
		public float calcularMedia(){
			return (this.n1+this.n2)/2;
		}
		
}
