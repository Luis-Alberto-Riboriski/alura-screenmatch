package estudo.java.spring.Screenmatch.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
