package Bridge;

class SvgRenderer implements Renderer {
    public void renderCircle(float radius) {
        System.out.println("Desenhando um círculo em SVG com raio: " + radius);
    }

    public void renderSquare(float side) {
        System.out.println("Desenhando um quadrado em SVG com lado: " + side);
    }
}