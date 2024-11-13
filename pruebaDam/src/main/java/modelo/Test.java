package modelo;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Articulo> articulos = Articulo.createRandomList(20);
		System.out.println(articulos);

		Long cant = articulos.stream().filter(a -> a.getStock() > 10).count();
		System.out.println(cant);

		List<String> codigos = articulos.stream().
				filter(a -> a.getStock() > 10)
				.map(a -> a.getCodArticulo())
				.toList();
		System.out.println(codigos);
		
		Articulo art = articulos.stream()
		.filter(a -> a.getStock()>10)
		.sorted((a1, a2)->a2.getPrecio().compareTo(a1.getPrecio()))
		.findFirst().get();
		
		if(articulos.stream().anyMatch(a -> a.getStock()>10)) {
			System.out.println("Existe algún articulo con stock mayor a 10");
		}
		
		
		
		System.out.println(art);
	}

}
