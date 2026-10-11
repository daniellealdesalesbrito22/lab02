import java.util.Arrays;

/**
 * Classe destinada ao registro de resumos para o estudo do aluno
 *
 * @author Daniel Leal
 */
public class RegistroResumos {
    /**
     * array de resumos
     */
    private Resumo[] resumos;

    /**
     * Cria um novo array de resumos
     *
     * @param numeroDeResumos a quantidade de espaços disponíveis no array
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    /**
     * Adiciona um novo resumo no primeiro espaço vazio do array de resumos selecionado
     *
     * @param tema o tema ou título do resumo a ser adicionado
     * @param conteudo o conteúdo do resumo a ser adicionado
     */
    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] == null) {
                resumos[i] = new Resumo(tema, conteudo);
                break;
            }
        }
    }

    /**
     * retorna o array de resumos
     *
     * @return o array de resumos
     */
    public Resumo[] pegaResumos() {
        return resumos;
    }

    /**
     * Conta a quantidade de resumos guardados em um array
     *
     * @return a quantidade, como numero inteiro, de resumos guardados no array
     */
    public int conta() {
        int somaResumos = 0;
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                somaResumos += 1;
            }
        }
    return somaResumos;
    }

    /**
     * Imprime a quantidade de resumos cadastrados em certo array e retorna os temas deles
     *
     * @return os temas dos resumos no array
     */
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

    /**
     * Verifica se há um resumo de um nome específico no array
     *
     * @param tema o nome a ser verificado
     * @return valor booleano verdadeiro caso haja um resumo de tema equivalente ao parâmetro
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null && resumos[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
    }

    /**
     * Busca resumos com base numa parte do conteúdo
     *
     * @param chaveDeBusca a parte do conteúdo a ser pesquisado
     * @return todos os resumos que têm partes equivalentes ao pesquisado
     */
    public String busca(String chaveDeBusca) {
        String encontrados = "";
        String pesquisa = chaveDeBusca.toLowerCase();
        for (Resumo resumo : resumos) {
            if (resumo != null && resumo.getConteudo().toLowerCase().contains(pesquisa)) {
                if (encontrados.equals("")) {
                    encontrados += resumo.getTema();
                }
                else {
                    encontrados += " " + resumo.getTema();
                }
            }
        }
        String[] resultados = encontrados.split(" ");
        Arrays.sort(resultados);
        return Arrays.toString(resultados);
    }

}