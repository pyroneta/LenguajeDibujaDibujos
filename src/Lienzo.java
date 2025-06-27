import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Lienzo extends JPanel {
    private Color fondo = Color.WHITE;
    private final List<Figura> figuras = new ArrayList<>();

    Lienzo() {
        this.setPreferredSize(new Dimension(1920, 1080));
    }

    public void setFondo(Color color) {
        this.fondo = color;
        repaint();
    }

    public void agregarFigura(Figura f) {
        figuras.add(f);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(fondo);
        g.fillRect(0, 0, getWidth(), getHeight());

        Graphics2D g2d = (Graphics2D) g;

        for (Figura f : figuras) {
            f.dibujar(g2d);
        }
    }
}

abstract class Figura {
    Color trazo;
    Color relleno;
    int stroke;

    Figura(Color trazo, Color relleno, int stroke) {
        this.trazo = trazo;
        this.relleno = relleno;
        this.stroke = stroke;
    }

    abstract void dibujar(Graphics2D g);
}

class Circulo extends Figura {
    int x, y, r;

    Circulo(int x, int y, int r, Color trazo, Color relleno, int stroke) {
        super(trazo, relleno, stroke);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    void dibujar(Graphics2D g) {
        int drawX = x - r;
        int drawY = y - r;
        int size = 2 * r;

        if (relleno != null) {
            g.setColor(relleno);
            g.fillOval(drawX, drawY, size, size);
        }

        g.setStroke(new BasicStroke(stroke));
        g.setColor(trazo);
        g.drawOval(drawX, drawY, size, size);
    }
}

class Rectangulo extends Figura {
    int x1, x2, y1, y2;

    Rectangulo(int x1, int x2, int y1, int y2, Color trazo, Color relleno, int stroke) {
        super(trazo, relleno, stroke);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    void dibujar(Graphics2D g) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int w = Math.abs(x2 - x1);
        int h = Math.abs(y2 - y1);

        if (relleno != null) {
            g.setColor(relleno);
            g.fillRect(x, y, w, h);
        }

        g.setStroke(new BasicStroke(stroke));
        g.setColor(trazo);
        g.drawRect(x, y, w, h);
    }
}

class Linea extends Figura {
    int x1, y1, x2, y2;

    Linea(int x1, int y1, int x2, int y2, Color trazo, int stroke) {
        super(trazo, null, stroke);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    void dibujar(Graphics2D g) {
        g.setStroke(new BasicStroke(stroke));
        g.setColor(trazo);
        g.drawLine(x1, y1, x2, y2);
    }
}

class Texto extends Figura {
    int x, y;
    String contenido;
    int fontSize;

    Texto(int x, int y, String contenido, Color trazo, int fontSize) {
        super(trazo, null, 1);
        this.x = x;
        this.y = y;
        this.contenido = contenido;
        this.fontSize = fontSize;
    }

    @Override
    void dibujar(Graphics2D g) {
        g.setColor(trazo);
        g.setFont(new Font("Arial", Font.PLAIN, fontSize));
        g.drawString(contenido, x, y);
    }
}

