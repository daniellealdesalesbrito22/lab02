public class RegistroResumos {
    String[] titulos;
    String[] resumos;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new String[numeroDeResumos];
        this.titulos = new String[numeroDeResumos];
    }

    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] == null) {
                resumos[i] = tema + ": " + conteudo;
                titulos[i] = tema;
                break;
            }
        }
    }

    public String[] pegaResumos() {
        return resumos;
    }

    public int conta() {
        int somaResumos = 0;
        for (int i = 0; i < titulos.length; i++) {
            if (titulos[i] != null) {
                somaResumos += 1;
            }
        }
    return somaResumos;
    }

    public String imprimeResumos() {
        String temas = "";
        int soma = 0;
        if (titulos[0] != null){
            soma = 1;
            temas += "- " + titulos[0];
            for (int i = 1; i < titulos.length; i++) {
                if (titulos[i] != null) {
                    temas += " | " + titulos[i];
                    soma += 1;
                }
            }
        }
        System.out.println("- " + soma + " resumo(s) cadastrado(s)");
        return temas;
    }

    public boolean temResumo(String nome) {
        for (int i = 0; i < titulos.length; i++) {
            if (titulos[i] == nome) {
                return true;
            }
        }
        return false;
    }
}
