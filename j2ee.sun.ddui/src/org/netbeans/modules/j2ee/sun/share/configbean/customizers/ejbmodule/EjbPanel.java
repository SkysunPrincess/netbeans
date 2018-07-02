/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Contributor(s):
 *
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 */
package org.netbeans.modules.j2ee.sun.share.configbean.customizers.ejbmodule;

import javax.swing.JCheckBox;
import org.netbeans.modules.j2ee.sun.dd.api.ASDDVersion;
import org.netbeans.modules.j2ee.sun.dd.api.CommonDDBean;
import org.netbeans.modules.j2ee.sun.dd.api.ejb.Ejb;
import org.netbeans.modules.j2ee.sun.ddloaders.SunDescriptorDataObject;
import org.netbeans.modules.j2ee.sun.ddloaders.Utils;
import org.netbeans.modules.j2ee.sun.ddloaders.multiview.BaseSectionNodeInnerPanel;
import org.netbeans.modules.j2ee.sun.ddloaders.multiview.DDTextFieldEditorModel;
import org.netbeans.modules.j2ee.sun.ddloaders.multiview.ejb.EjbNode;
import org.netbeans.modules.xml.multiview.ItemCheckBoxHelper;
import org.netbeans.modules.xml.multiview.ItemEditorHelper;
import org.netbeans.modules.xml.multiview.XmlMultiViewDataSynchronizer;
import org.netbeans.modules.xml.multiview.ui.SectionNodeView;


/**
 *
 * @author Peter Williams
 */
public class EjbPanel extends BaseSectionNodeInnerPanel {

    // data model & version
    private EjbNode ejbNode;

    public EjbPanel(SectionNodeView sectionNodeView, final EjbNode ejbNode, final ASDDVersion version) {
        super(sectionNodeView, version);
        this.ejbNode = ejbNode;

        initComponents();
        initUserComponents(sectionNodeView);
    }

    private void initUserComponents(SectionNodeView sectionNodeView) {
        SunDescriptorDataObject dataObject = (SunDescriptorDataObject) sectionNodeView.getDataObject();
        XmlMultiViewDataSynchronizer synchronizer = dataObject.getModelSynchronizer();
        addRefreshable(new ItemEditorHelper(nameTextField, new EjbTextFieldEditorModel(synchronizer, Ejb.EJB_NAME)));
        addRefreshable(new ItemEditorHelper(jndiNameTextField, new EjbTextFieldEditorModel(synchronizer, Ejb.JNDI_NAME)));
        addRefreshable(new PassByRefCheckboxHelper(synchronizer, passByRefCheckBox));
        
        nameTextField.setEditable(!ejbNode.getBinding().isBound());
    }

     /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        generalPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jndiNameLabel = new javax.swing.JLabel();
        jndiNameTextField = new javax.swing.JTextField();
        passByRefLabel = new javax.swing.JLabel();
        passByRefCheckBox = new javax.swing.JCheckBox();

        setAlignmentX(LEFT_ALIGNMENT);
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        generalPanel.setOpaque(false);
        generalPanel.setLayout(new java.awt.GridBagLayout());

        nameLabel.setLabelFor(nameTextField);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/sun/share/configbean/customizers/ejbmodule/Bundle"); // NOI18N
        nameLabel.setText(bundle.getString("LBL_Name_1")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        generalPanel.add(nameLabel, gridBagConstraints);
        nameLabel.getAccessibleContext().setAccessibleName(bundle.getString("Name_Acsbl_Name")); // NOI18N
        nameLabel.getAccessibleContext().setAccessibleDescription(bundle.getString("Ejb_Name_Acsbl_Desc")); // NOI18N

        nameTextField.setToolTipText(bundle.getString("Ejb_Name_Tool_Tip")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        generalPanel.add(nameTextField, gridBagConstraints);
        nameTextField.getAccessibleContext().setAccessibleName(bundle.getString("Name_Acsbl_Name")); // NOI18N
        nameTextField.getAccessibleContext().setAccessibleDescription(bundle.getString("Ejb_Name_Acsbl_Desc")); // NOI18N

        jndiNameLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/sun/share/configbean/customizers/ejbmodule/Bundle").getString("MNC_Jndi_Name").charAt(0));
        jndiNameLabel.setLabelFor(jndiNameTextField);
        jndiNameLabel.setText(bundle.getString("LBL_Jndi_Name_1")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        generalPanel.add(jndiNameLabel, gridBagConstraints);
        jndiNameLabel.getAccessibleContext().setAccessibleName(bundle.getString("Jndi_Name_Acsbl_Name")); // NOI18N
        jndiNameLabel.getAccessibleContext().setAccessibleDescription(bundle.getString("Ejb_Jndi_Name_Acsbl_Desc")); // NOI18N

        jndiNameTextField.setToolTipText(bundle.getString("Ejb_Jndi_Name_Tool_Tip")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        generalPanel.add(jndiNameTextField, gridBagConstraints);
        jndiNameTextField.getAccessibleContext().setAccessibleName(bundle.getString("Jndi_Name_Acsbl_Name")); // NOI18N
        jndiNameTextField.getAccessibleContext().setAccessibleDescription(bundle.getString("Ejb_Jndi_Name_Acsbl_Desc")); // NOI18N

        passByRefLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/sun/share/configbean/customizers/ejbmodule/Bundle").getString("MNC_Pass_By_Reference").charAt(0));
        passByRefLabel.setText(bundle.getString("LBL_Pass_By_Reference_1")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        generalPanel.add(passByRefLabel, gridBagConstraints);
        passByRefLabel.getAccessibleContext().setAccessibleName(bundle.getString("Pass_By_Reference_Acsbl_Name")); // NOI18N
        passByRefLabel.getAccessibleContext().setAccessibleDescription(bundle.getString("Pass_By_Reference_Acsbl_Desc")); // NOI18N

        passByRefCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        passByRefCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        generalPanel.add(passByRefCheckBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 5, 5);
        add(generalPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel generalPanel;
    private javax.swing.JLabel jndiNameLabel;
    private javax.swing.JTextField jndiNameTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JCheckBox passByRefCheckBox;
    private javax.swing.JLabel passByRefLabel;
    // End of variables declaration//GEN-END:variables

    public String getHelpId() {
        return "AS_CFG_Ejb";	// NOI18N
    }

    // Model class for handling updates to the text fields
    private class EjbTextFieldEditorModel extends DDTextFieldEditorModel {

        public EjbTextFieldEditorModel(XmlMultiViewDataSynchronizer synchronizer, String propertyName) {
            super(synchronizer, propertyName);
        }
        
        protected CommonDDBean getBean() {
            return ejbNode.getBinding().getSunBean();
        }
        
        @Override
        protected void setValue(String value) {
            super.setValue(value);

            // If this was a virtual bean, commit it to the graph.
            if(ejbNode.addVirtualBean()) {
                // TODO Code to update display based on virtual -> non virtual transition can go here.
            }
        }
        
    }
    
    private class PassByRefCheckboxHelper extends ItemCheckBoxHelper {

        public PassByRefCheckboxHelper(XmlMultiViewDataSynchronizer synchronizer, JCheckBox component) {
            super(synchronizer, component);
        }

        public boolean getItemValue() {
            Ejb ejb = (Ejb) ejbNode.getBinding().getSunBean();
            return Utils.booleanValueOf(ejb.getPassByReference());
        }

        public void setItemValue(boolean value) {
            Ejb ejb = (Ejb) ejbNode.getBinding().getSunBean();
            ejb.setPassByReference(value ? Boolean.toString(value) : null);
            
            // If this was a virtual bean, commit it to the graph.
            if(ejbNode.addVirtualBean()) {
                // TODO Code to update display based on virtual -> non virtual transition can go here.
            }
        }
    }
}