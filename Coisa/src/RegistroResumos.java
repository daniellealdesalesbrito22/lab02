public class RegistroResumos {
    private Resumo[] resumos;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] == null) {
                resumos[i] = new Resumo(tema, conteudo);
                break;
            }
        }
    }

    public Resumo[] pegaResumos() {
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
        String temas = "";
        int soma = 0;
        if (resumos[0] != null){
            soma = 1;
            temas += "- " + resumos[0].getTema();
            for (int i = 1; i < resumos.length; i++) {
                if (resumos[i] != null) {
                    temas += " | " + resumos[i].getTema();
                    soma += 1;
                }
            }
        }
        System.out.println("- " + soma + " resumo(s) cadastrado(s)");
        return temas;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null && resumos[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
    }

    public String[] busca(String chaveDeBusca) {
        for (Resumo resumo : resumos) {

        }
    }
}

