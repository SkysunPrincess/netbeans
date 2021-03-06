/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.maven.j2ee.web;

/**
 *
 * @author  mkuchtiak
 */
public class ServletUriPanel extends javax.swing.JPanel {

    /** Creates new form ServletUriPanel */
    public ServletUriPanel(String[] urlPatterns, String selectedItem, boolean fromRunMenu ) {
        initComponents();
        if (fromRunMenu) {
            jLabel2.setText(org.openide.util.NbBundle.getMessage(ServletUriPanel.class, "DESC_setServletURI"));
        }
        if (selectedItem!=null) {
            jComboBox1.addItem(selectedItem);
        }
        for (int i=0;i<urlPatterns.length;i++) {
            if (!urlPatterns[i].equals(selectedItem))
                jComboBox1.addItem(urlPatterns[i]);
        }
        if (selectedItem!=null) {
            ((javax.swing.JTextField)jComboBox1.getEditor().getEditorComponent()).setText(selectedItem);
        }
    }
    
    public String getServletUri() {
        String servletUri = (String)jComboBox1.getSelectedItem();
        
        if (servletUri != null && servletUri.length() > 0 && servletUri.charAt(0) != '/')
            servletUri = "/" + servletUri;
        
        return servletUri;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jComboBox1.setEditable(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 12);
        add(jComboBox1, gridBagConstraints);

        jLabel1.setDisplayedMnemonic(org.openide.util.NbBundle.getMessage(ServletUriPanel.class, "LBL_setServletURI_mnem").charAt(0));
        jLabel1.setLabelFor(jComboBox1);
        jLabel1.setText(org.openide.util.NbBundle.getMessage(ServletUriPanel.class, "LBL_setServletURI")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 12);
        add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        add(jLabel2, gridBagConstraints);

        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(ServletUriPanel.class, "A11Y_desc_setServletURI")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    
}
