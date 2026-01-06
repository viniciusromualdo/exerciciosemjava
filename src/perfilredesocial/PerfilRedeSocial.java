package perfilredesocial;

public class PerfilRedeSocial {
    public static void main(String[] args) {
        Usuario vinicius = new Usuario("Vinícius Barbosa", "vinicius100000@hotmail.com", 27, "Jovem de 27 anos, movido por propósito, aprendizado contínuo e vontade de evoluir todos os dias. Apaixonado por tecnologia, criatividade e desafios que geram impacto real.");
        Usuario rodrigo = new Usuario("Rodrigo Pessoa", "rodrigopessoa@gmail.com", 19,"Jovem de 19 anos, curioso, determinado e em constante evolução. Busca aprender, crescer e construir um futuro com propósito, aproveitando cada oportunidade de desenvolvimento.");
        Usuario kelly = new Usuario("Kelly Gonçalves","kellyg@gmail.com", 21,"Jovem de 21 anos, determinada e cheia de propósito. Em constante aprendizado, busca evoluir, se expressar com autenticidade e construir um futuro alinhado aos seus sonhos.");
        Usuario milena = new Usuario("Milena Barbosa", "milena.pereira2407@gmail.com", 25, "Mulher de 25 anos, confiante e em constante evolução. Movida por propósito, aprendizado e autenticidade, busca crescer, se reinventar e construir um futuro com significado.");

        milena.exibirPerfil();
        vinicius.exibirPerfil();

        milena.atualizarBio("me chamo Milena Barbosa, tenho 25 anos e sou muito bonita");
    }
}
