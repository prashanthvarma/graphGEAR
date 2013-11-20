/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PauseButton.java
 *
 * Created on 11-sep-2012, 8:03:52
 */
package tudelft.nas.graphgear.demointerface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Ruud
 * A pause control is just a button that has two states.
 */
public class PauseControl extends javax.swing.JPanel {
    
    private Boolean ref = null;
    public PauseControl(String caption){
        this();
        pauseButton.setText(caption);
    }
    /** Creates new form PauseButton */
    public PauseControl() {
        initComponents();
        this.setVisible(true);
        this.setSize(this.getPreferredSize());
    }
    public PauseControl(Boolean _ref){
        this();
        ref = _ref;
        addListener();
    }
    public void addListener(){
        
            pauseButton.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("In action listener");
                    if(ref != null)
                    {
                        System.out.println("setting boolean value to " + pauseButton.isSelected());
                        ref = pauseButton.isSelected();
                    }
                }
            
            });
        
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pauseButton = new javax.swing.JToggleButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(75, 50));
        setMinimumSize(new java.awt.Dimension(75, 50));

        pauseButton.setText("Resume"); // NOI18N
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pauseButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton pauseButton;
    // End of variables declaration//GEN-END:variables
}