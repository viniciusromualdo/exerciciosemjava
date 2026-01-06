package perfilredesocial;

public class Usuario {
    String nome;
    String email;
    int idade = 0;
    String biografia;

    public Usuario(String nome, String email, int idade, String bio){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.biografia = bio;
    }

    public void exibirPerfil(){
        System.out.println("Perfil completo:");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
        System.out.println("Bio: " + biografia);
    }

    public void atualizarBio(String atualizacao){
        biografia = atualizacao;
        System.out.println("Sua biografia foi atualizada com sucesso!");
        System.out.println(biografia);
    }
}
