package pessoa;

public class Pessoa {
	private String nome;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	
	private String telefone;
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String _telefone) {
		if(_telefone == null ||_telefone.isEmpty())
			System.out.println("Telefone não pode ficar em branco");
		else
		this.telefone = _telefone;
	}
	
	private String email;
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String _email) {
		if(_email == null || _email.isEmpty())
			System.out.println("Email não pode ficar em branco");
		else
			this.email = _email;
	}
	
	public void alterTelefoneEmail(String _telefone, String _email) {
		this.setEmail(_email);
		this.setTelefone(_telefone);
	}
	
	public void printInfo() {
		System.out.print("Nome: ");
		System.out.println(this.nome);		
		
		System.out.print("Telefone: ");
		System.out.println(this.telefone);		
		
		System.out.print("Email: ");
		System.out.println(this.email);		

	}
	
}
