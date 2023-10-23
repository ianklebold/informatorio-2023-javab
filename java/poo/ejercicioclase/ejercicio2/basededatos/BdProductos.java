package poo.ejercicioclase.ejercicio2.basededatos;


import poo.ejercicioclase.ejercicio2.domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class BdProductos {
    public static List<Producto> productos = new ArrayList<>();

    public static void initProducts(){

        Producto producto1 = new Producto(1L, "Gafas de Sol Elegantes", 49.99, 100, "Gafas de sol elegantes con montura de titanio y lentes polarizadas. Perfectas para cualquier ocasión bajo el sol.");
        Producto producto2 = new Producto(2L, "Reloj de Lujo 'Oro Brillante'", 299.99, 50, "Un reloj de lujo con una correa de cuero genuino y detalles de oro brillante. Hora de lucir con estilo.");
        Producto producto3 = new Producto(3L, "Zapatillas Deportivas 'Velocidad Extrema'", 74.99, 75, "Zapatillas deportivas de alto rendimiento para los amantes del deporte. Diseñadas para la velocidad extrema.");
        Producto producto4 = new Producto(4L, "Teléfono Inteligente 'Tecnología Avanzada'", 699.99, 60, "Un teléfono inteligente con tecnología de vanguardia y una pantalla de alta resolución. ¡Conquista el mundo digital!");
        Producto producto5 = new Producto(5L, "Bolso de Viaje 'Aventurero'", 119.99, 120, "Un bolso de viaje espacioso y resistente para los aventureros. ¡Preparado para tus próximas exploraciones!");
        Producto producto6 = new Producto(6L, "Cámara DSLR 'Captura Profesional'", 499.99, 90, "Una cámara DSLR de calidad profesional para capturar momentos inolvidables con precisión y detalle.");
        Producto producto7 = new Producto(7L, "Cafetera Espresso 'Sabor Perfecto'", 179.99, 80, "Una cafetera espresso que te brinda el sabor perfecto de un café recién hecho. ¡Disfruta de tu café favorito en casa!");
        Producto producto8 = new Producto(8L, "Auriculares Inalámbricos 'Sonido Envolvente'", 89.99, 55, "Auriculares inalámbricos con sonido envolvente para una experiencia auditiva excepcional.");
        Producto producto9 = new Producto(9L, "Juego de Maletas 'Aventura Global'", 139.99, 70, "Un juego de maletas elegantes y duraderas para tus aventuras globales. ¡Prepárate para viajar!");
        Producto producto10 = new Producto(10L, "Barbacoa Portátil 'Sabor al Aire Libre'", 79.99, 110, "Una barbacoa portátil para saborear deliciosas parrilladas al aire libre.");
        Producto producto11 = new Producto(11L, "Bicicleta de Montaña 'Explorador Xtreme'", 349.99, 45, "Una bicicleta de montaña de alta calidad para los exploradores extremos. ¡Conquista los senderos más desafiantes!");
        Producto producto12 = new Producto(12L, "Altavoz Bluetooth 'Fiesta en Todas Partes'", 79.99, 65, "Un altavoz Bluetooth potente para llevar la fiesta a todas partes. ¡La música nunca se detiene!");
        Producto producto13 = new Producto(13L, "Robot Aspirador 'Limpieza Inteligente'", 199.99, 0, "Un robot aspirador inteligente que mantiene tu hogar limpio y reluciente con un toque de alta tecnología.");
        Producto producto14 = new Producto(14L, "Tableta Gráfica 'Creatividad Sin Límites'", 129.99, 95, "Una tableta gráfica para desatar tu creatividad sin límites. Perfecta para artistas y diseñadores.");
        Producto producto15 = new Producto(15L, "Herramientas de Jardinería 'Jardín Floreciente'", 69.99, 110, "Un juego de herramientas de jardinería para mantener tu jardín floreciente y hermoso.");
        Producto producto16 = new Producto(16L, "Bicicleta Plegable 'Viaje Urbano'", 199.99, 75, "Una bicicleta plegable ideal para tus viajes urbanos. ¡Evita el tráfico y disfruta de la ciudad!");
        Producto producto17 = new Producto(17L, "Portátil Ultraligero 'Productividad Máxima'", 849.99, 60, "Un portátil ultraligero con un rendimiento máximo para aumentar tu productividad en cualquier lugar.");
        Producto producto18 = new Producto(18L, "Mochila de Senderismo 'Aventura Natural'", 49.99, 50, "Una mochila de senderismo resistente y cómoda para explorar la belleza de la naturaleza.");
        Producto producto19 = new Producto(19L, "Telescopio 'Observador del Cielo'", 179.99, 30, "Un telescopio de alta calidad para observar las maravillas del cielo nocturno. ¡Descubre el universo!");
        Producto producto20 = new Producto(20L, "Caja de Herramientas 'Hazlo Tú Mismo'", 39.99, 40, "Una caja de herramientas completa para tus proyectos de bricolaje. ¡Conviértete en un maestro del bricolaje!");

        productos = List.of(producto1, producto2, producto3, producto4, producto5, producto6, producto7,
                producto8, producto9, producto10, producto11, producto12,
                producto13, producto14, producto15, producto16, producto17,
                producto18, producto19, producto20);
    }

    public static Producto getProductById(Long id){
        for (Producto products : productos) {
            if (id.equals(products.getId())){
                return products;
            }
        }
        return null;
    }
}
