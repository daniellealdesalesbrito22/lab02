/**
 * Classe destinada à criação de resumos para uso em RegistroResumos
 *
 * @author Daniel Leal
 */
public class Resumo {
    /**
     * tema do resumo
     */
    private String tema;
    /**
     * conteudo do resumo
     */
    private String conteudo;

    /**
     * Construtor que cria um objeto Resumo com um tema e um conteudo
     *
     * @param tema tema ou título do resumo
     * @param conteudo conteúdo do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * retorna o tema do resumo especificado
     *
     * @return o tema do resumo
     */
    public String getTema(){
        return this.tema;
    }

    /**
     * retorna o conteúdo do resumo especificado
     *
     * @return o conteúdo do resumo
     */
    public String getConteudo(){
        return this.conteudo;
    }

    /**
     * atualiza o conteúdo de um resumo
     *
     * @param conteudoNovo o novo texto que substituirá o conteúdo do resumo
     */
    public void setConteudo(String conteudoNovo){
        this.conteudo = conteudoNovo;
    }

    /**
     * retorna a representação textual do resumo
     *
     * @return o tema e o conteudo do resumo
     */
    @Override
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}