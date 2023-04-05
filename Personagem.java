// Classe que representa o personagem
class Personagem {
    private String nome;
    private ClassePersonagem classe;

    public Personagem(String nome, ClassePersonagem classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public ClassePersonagem getClasse() {
        return classe;
    }

    // Método para obter os atributos da classe do personagem
    public String getAtributos() {
        switch (classe) {
            case GUERREIRO:
                return "Força: 5, Precisão: 2, Agilidade: 1, Inteligência: 2, Resistência: 5";
            case MAGO:
                return "Força: 1, Precisão: 5, Agilidade: 2, Inteligência: 5, Resistência: 2";
            case ASSASSINO:
                return "Força: 3, Precisão: 3, Agilidade: 5, Inteligência: 2, Resistência: 2";
            case ARQUEIRO:
                return "Força: 3, Precisão: 5, Agilidade: 3, Inteligência: 2, Resistência: 2";
            default:
                return "";
        }
    }
}