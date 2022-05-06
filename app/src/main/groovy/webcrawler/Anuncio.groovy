package webcrawler

class Anuncio {
    String titulo
    Integer valor
    String cep
    String municipio
    String bairro
    String URL

    Anuncio(titulo, valor, cep, municipio, bairro, URL) {
        this.titulo = titulo
        this.valor = valor
        this.cep = cep
        this.municipio = municipio
        this.bairro = bairro
        this.URL = URL
    }
}
