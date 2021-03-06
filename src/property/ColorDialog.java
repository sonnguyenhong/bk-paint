/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;

public class ColorDialog extends javax.swing.JPanel {
    private Color strokeColor;
    private Color fillColor;
    private Color colorPicker;
    private ButtonGroup group;
    
    public ColorDialog() {
        group = new ButtonGroup();
        strokeColor = Color.BLACK;
        fillColor = Color.WHITE;
        
        
        initComponents();
        group.add(bStrokeColor);
        group.add(bFillColor);
        bStrokeColor.setBackground(strokeColor);
        bFillColor.setBackground(fillColor);
        bStrokeColor.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorPanel = new property.ColorPanel();
        bStrokeColor = new javax.swing.JToggleButton();
        bFillColor = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        colorChooser = new javax.swing.JButton();

        colorPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorPanelMousePressed(evt);
            }
        });

        bFillColor.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stroke");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fill");

        colorChooser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/property/colorchooser.png"))); // NOI18N
        colorChooser.setToolTipText("Choose your desire color");
        colorChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bStrokeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bFillColor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bStrokeColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(bFillColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)))
            .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void colorPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorPanelMousePressed
        // TODO add your handling code here:
        if (bStrokeColor.isSelected()) {
            strokeColor = colorPanel.getColor();
            bStrokeColor.setBackground(strokeColor);
        } else if (bFillColor.isSelected()) {
            fillColor = colorPanel.getColor();
            bFillColor.setBackground(fillColor);
        }
    }//GEN-LAST:event_colorPanelMousePressed

    private void colorChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorChooserActionPerformed
        // TODO add your handling code here:
        Color color = JColorChooser.showDialog(this, "Edit Color", Color.RED);
        if (color != null){
        colorPanel.setImage(color);
            if (bStrokeColor.isSelected()) {
                strokeColor = colorPanel.getColor();
                bStrokeColor.setBackground(strokeColor);
            } else if (bFillColor.isSelected()) {
                fillColor = colorPanel.getColor();
                bFillColor.setBackground(fillColor);
            }
        }
    }//GEN-LAST:event_colorChooserActionPerformed

    public Color getStrokeColor() {
        return strokeColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setColorPicker(Color c) {
        if (bStrokeColor.isSelected()) {
            strokeColor = c;
            bStrokeColor.setBackground(c);
        } else if (bFillColor.isSelected()) {
            fillColor = c;
            bFillColor.setBackground(c);
        }
    }

    public Color getColorPicker() {
        return colorPicker;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bFillColor;
    private javax.swing.JToggleButton bStrokeColor;
    private javax.swing.JButton colorChooser;
    private property.ColorPanel colorPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
