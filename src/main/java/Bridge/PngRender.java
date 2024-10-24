package Bridge;

class PngRenderer implements Renderer {
    public void renderCircle(float radius) {
        System.out.println("Desenhando um círculo em PNG com raio: " + radius);
    }

    public void renderSquare(float side) {
        System.out.println("Desenhando um quadrado em PNG com lado: " + side);
    }
}