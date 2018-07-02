/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2010 Oracle and/or its affiliates. All rights reserved.
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
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2008 Sun Microsystems, Inc.
 */
package org.netbeans.modules.groovy.grails.settings;

import java.awt.Component;
import java.awt.Cursor;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.netbeans.modules.groovy.grails.RuntimeHelper;
import org.netbeans.modules.groovy.support.spi.GroovyOptionsSubpanel;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.HtmlBrowser;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service = GroovyOptionsSubpanel.class)
public final class GrailsRuntimePanel extends javax.swing.JPanel implements GroovyOptionsSubpanel {

    private final GrailsSettings settings;

    public GrailsRuntimePanel() {
        this.settings = GrailsSettings.getInstance();
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    private void displayGrailsHomeWarning() {
        DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message(
            NbBundle.getMessage(GrailsRuntimePanel.class, "LBL_Not_grails_home"),
            NotifyDescriptor.Message.WARNING_MESSAGE
            ));
        }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grailsHomeLocation = new javax.swing.JTextField();
        chooseDir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        grailsHomeLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grailsHomeLocationActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(chooseDir, org.openide.util.NbBundle.getMessage(GrailsRuntimePanel.class, "SupportPanel.chooseDir.text")); // NOI18N
        chooseDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseDirActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(GrailsRuntimePanel.class, "SupportPanel.jLabel2.text")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel5.setLabelFor(grailsHomeLocation);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(GrailsRuntimePanel.class, "GrailsRuntimePanel.jLabel5.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(grailsHomeLocation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseDir))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grailsHomeLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseDir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2))
        );

        grailsHomeLocation.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(GrailsRuntimePanel.class, "SupportPanel.grailsHomeLocation.accessibleName")); // NOI18N
        grailsHomeLocation.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(GrailsRuntimePanel.class, "SupportPanel.grailsHomeLocation.accessibleDescription")); // NOI18N
        chooseDir.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(GrailsRuntimePanel.class, "SupportPanel.chooseDir.accessibleName")); // NOI18N
        chooseDir.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(GrailsRuntimePanel.class, "SupportPanel.chooseDir.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void chooseDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseDirActionPerformed
        File file = new FileChooserBuilder(GrailsRuntimePanel.class)
                .setDirectoriesOnly(true)
                .setDefaultWorkingDirectory(new File(System.getProperty("user.home")))
                .setApproveText(NbBundle.getMessage(GrailsRuntimePanel.class, "LBL_Select_Directory"))
                .setTitle(NbBundle.getMessage(GrailsRuntimePanel.class, "LBL_Select_Directory"))
                .showOpenDialog();
        if (file != null && RuntimeHelper.isValidRuntime(file)) {
            grailsHomeLocation.setText(file.getAbsolutePath());
        } else if (file != null) {
            displayGrailsHomeWarning();
        }
    }//GEN-LAST:event_chooseDirActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        try {
            HtmlBrowser.URLDisplayer.getDefault().showURL(new URL("http://www.grails.org")); // NOI18N
        } catch (MalformedURLException murle) {
            Exceptions.printStackTrace(murle);
        }
    }//GEN-LAST:event_jLabel2MousePressed

    private void grailsHomeLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grailsHomeLocationActionPerformed
        if (!valid()) {
            displayGrailsHomeWarning();
        }
    }//GEN-LAST:event_grailsHomeLocationActionPerformed

    @Override
    public Component getComponent() {
        return this;
    }

    @Override
    public void load() {
        grailsHomeLocation.setText(settings.getGrailsBase());
    }

    @Override
    public void store() {
        settings.setGrailsBase(grailsHomeLocation.getText());
    }

    @Override
    public boolean valid() {
        String location = grailsHomeLocation.getText();
        if ("".equals(location.trim())) { // NOI18N
            return false;
        }
        if (!RuntimeHelper.isValidRuntime(new File(location))) {
            return false;
        }
        return true;
    }

    @Override
    public boolean changed() {
        String grailsBase = settings.getGrailsBase();
        return !grailsHomeLocation.getText().equals(grailsBase == null ? "" : grailsBase);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseDir;
    private javax.swing.JTextField grailsHomeLocation;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}