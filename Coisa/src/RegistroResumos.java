public class RegistroResumos {
    String[] temas;
    String[] resumos;

    public RegistroResumos(int numeroDeResumos) {
        this.temas = new String[numeroDeResumos];
        this.resumos = new String[numeroDeResumos];
    }

    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < temas.length; i++) {
            if (temas[i] == null) {
                temas[i] = tema;
            }
        }
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] == null) {
                resumos[i] = conteudo;
            }
        }
    }

    public String[] pegaResumos() {
        return resumos;
    }

    public int conta() {
        int somaResumos = 0;
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                somaResumos += 1;
            }
        }
    return somaResumos;
    }

    public String imprimeResumos() {
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                System.out.println(temas[i] + ": " + resumos[i]);
            }
        }
        return "";
    }

    public boolean temResumo(String nome) {
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] == nome) {
                return true;
            }
        }
        return false;
    }
}
