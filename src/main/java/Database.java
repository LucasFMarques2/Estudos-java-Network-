import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Database {
    public List<ItemCardapio> ListaDeItensCardapio(){

        List<ItemCardapio> itens = new LinkedList<>();

        ItemCardapio refrescoDoChaves = new ItemCardapio(1L, "Refresco do chaves",
                """
                        Suco de limao, que parece tamarindo mas tem gosto de groselha
                        """
                , Categoria.BEBIDA, new BigDecimal("2.99"));

        ItemCardapio xicaraDeCafe = new ItemCardapio(2L, "Xicara de Cafe",
                """
                Nao gostaria de entrar para tomar uma xicara de cafe? Feito com muito carinho, ideal para oferecer a visitas ilustres (como professores).
                """,
                Categoria.BEBIDA, new BigDecimal("4.50"));

        ItemCardapio sanduicheDePresunto = new ItemCardapio(3L, "Sanduiche de Presunto",
                """
                O classico e suculento sanduiche de presunto. O prato mais cobicado da vila, impossivel comer sem ser observado.
                """,
                Categoria.LANCHE, new BigDecimal("12.00"));

        ItemCardapio churrosDaDonaFlorinda = new ItemCardapio(4L, "Churros da Dona Florinda",
                """
                Churros quentinhos e crocantes. Produzidos na cozinha da Dona Florinda (sob forte supervisao e mao de obra do Seu Madruga).
                """,
                Categoria.SOBREMESA, new BigDecimal("7.50"));

        ItemCardapio panquecas = new ItemCardapio(5L, "Panquecas",
                """
                Deliciosas panquecas douradas. Perfeitas para um cafe da manha reforcado e para deixar os vizinhos com inveja.
                """,
                Categoria.PRATO_PRINCIPAL, new BigDecimal("18.90"));

        ItemCardapio boloDeChocolate = new ItemCardapio(6L, "Bolo de Chocolate",
                """
                Bolo inteiro, macio e recheado. Comprado na padaria da esquina, mas a Dona Florinda jura que foi ela quem fez.
                """,
                Categoria.SOBREMESA, new BigDecimal("45.00"));

        itens.add(refrescoDoChaves);
        itens.add(boloDeChocolate);
        itens.add(xicaraDeCafe);
        itens.add(churrosDaDonaFlorinda);
        itens.add(panquecas);
        itens.add(sanduicheDePresunto);

        return itens;
    }
}
