package com.scanrider.finalprojectp1;

import com.formdev.flatlaf.FlatLightLaf;
import com.scanrider.finalprojectp1.view.VentanaPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Isaac M
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }

        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
//        System.out.println(getClass().getResource("/18220884_v1016-b-09.jpg"));
        
//        URL imageUrl = getClass().getResource("/com/scanrider/finalprojectp1/view/image/18220884_v1016-b-09.jpg");
//        if (imageUrl == null) {
//            System.out.println("⚠️ Imagen no encontrada en el classpath.");
//        } else {
//            System.out.println("✅ Imagen encontrada: " + imageUrl);
//        }
    }
}
