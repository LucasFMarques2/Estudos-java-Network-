import java.math.BigDecimal;

public record ItemCardapio(Long id, String name, String description, Categoria categoria, BigDecimal price) {

}
