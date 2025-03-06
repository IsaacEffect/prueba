package com.scanrider.finalprojectp1.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel {
    private final Image backgroundImage;

    public BackgroundPanel(String ruta) {
        setOpaque(false);
        URL imgUrl = getClass().getClassLoader().getResource(ruta);
        
        if (imgUrl == null) {
            System.err.println("No se encontró la imagen: " + ruta);
            backgroundImage = null;
        } else {
            backgroundImage = new ImageIcon(imgUrl).getImage();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
