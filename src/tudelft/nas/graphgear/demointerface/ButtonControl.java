/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ButtonControl.java
 *
 * Created on 4-okt-2012, 18:11:50
 */
package tudelft.nas.graphgear.demointerface;

/**
 *
 * @author Ruud
 */
public class ButtonControl extends javax.swing.JPanel {

    /** Creates new form ButtonControl */
    public ButtonControl() {
        initComponents();
    }

    public ButtonControl(String name, String caption){
        this();
        this.setName(name);
        Button.setText(caption);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(75, 50));
        setMinimumSize(new java.awt.Dimension(75, 50));

        Button.setText("Caption");
        Button.setMaximumSize(new java.awt.Dimension(61, 23));
        Button.setMinimumSize(new java.awt.Dimension(61, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Button;
    // End of variables declaration//GEN-END:variables
}
