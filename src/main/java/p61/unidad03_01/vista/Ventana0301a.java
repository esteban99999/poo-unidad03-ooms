/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_01.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author LAB-2
 */
public class Ventana0301a extends JFrame {

    private List<JPanel> jPanelList;

    public Ventana0301a(String title) throws HeadlessException {

        super(title);
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jPanelList = new ArrayList<>();
        this.setLayout(new FlowLayout());

    }

    public void iniciarComponentes() {
        var jPanelrojo = new JPanel();
        jPanelrojo.setBackground(Color.RED);
        var jPanelazul = new JPanel();
        jPanelazul.setBackground(Color.BLUE);
        var jPanelverde = new JPanel();
        jPanelverde.setBackground(Color.GREEN);
        var jPanelGris = new JPanel();
        jPanelGris.setBackground(Color.GRAY);
        var jPanelRosa = new JPanel();
        jPanelRosa.setBackground(Color.PINK);
        
        this.jPanelList.add(jPanelrojo);
        this.jPanelList.add(jPanelazul);
        this.jPanelList.add(jPanelverde);
        this.jPanelList.add(jPanelGris);
        this.jPanelList.add(jPanelRosa);
        for(var jPanel:this.jPanelList)
        this.getContentPane().add(jPanel);
    }
}