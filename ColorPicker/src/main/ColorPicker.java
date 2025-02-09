package main;

import javax.swing.*;

@SuppressWarnings("serial")
public class ColorPicker extends JFrame {
    
    private final ColorPanel colorPanel;
    
    public ColorPicker() {
        setTitle("Selector de Colores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        
        colorPanel = new ColorPanel();
        add(colorPanel);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorPicker::new);
    }
}