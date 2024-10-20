package NivelIntermediario4;

public class Ninja {
    String nome;
    String aldeia;

        public Ninja(String nome, String aldeia) {
            this.nome = nome;
            this.aldeia = aldeia;
        }

        @Override
        public String toString() {
            return "Ninja: " + nome + ", Aldeia: " + aldeia;
        }
    }


