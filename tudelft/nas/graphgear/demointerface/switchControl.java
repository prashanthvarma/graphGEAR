/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * switchControl.java
 *
 * Created on 31-aug-2012, 18:22:58
 */
package tudelft.nas.graphgear.demointerface;

/**
 *
 * @author Ruud
 */
public class switchControl extends javax.swing.JPanel {

    /** Creates new form switchControl */
    public switchControl() {
        initComponents();
    }
    /**
     * Creates a new switch control
     * @param name name of the control
     * @param caption caption of the control
     * @param checked whether checked or not in initial state
     */
    public switchControl(String name, String caption, boolean checked){
        this();
        this.setName(name);
        Caption.setText(caption);
        CheckBox.setSelected(checked);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckBox = new javax.swing.JCheckBox();
        Caption = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(75, 50));
        setMinimumSize(new java.awt.Dimension(75, 50));

        Caption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Caption.setText("Caption");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caption, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Caption, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Caption;
    public javax.swing.JCheckBox CheckBox;
    // End of variables declaration//GEN-END:variables
}
