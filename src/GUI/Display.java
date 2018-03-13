/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import helpers.Loader;
import static helpers.Logs.*;
import helpers.Teacher;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kapow
 */
@SuppressWarnings("serial")
public class Display extends javax.swing.JFrame {

    /**
     * Creates new form Display
     */
    public Display() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        results = new javax.swing.JDialog();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        recordsReadoutPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        recordsReadoutTitleLabel = new javax.swing.JLabel();
        recordsReadoutXLabel = new org.jdesktop.swingx.JXLabel();
        resultsReadoutPanel = new javax.swing.JPanel();
        resultsReadoutTitleLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        resultsReadoutXLabel = new org.jdesktop.swingx.JXLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        LoginPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        userReadoutLabel = new javax.swing.JLabel();
        TestPanel = new javax.swing.JPanel();
        piTextField = new javax.swing.JTextField();
        instructionLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        digitsInputTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        RecordsPanel = new javax.swing.JPanel();
        allUsersToggleButton = new javax.swing.JToggleButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        logsReadoutPanel = new javax.swing.JPanel();
        datesXLabel = new org.jdesktop.swingx.JXLabel();
        timesXLabel = new org.jdesktop.swingx.JXLabel();
        recordsXLabel = new org.jdesktop.swingx.JXLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sortingComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        advancedToggleButton = new javax.swing.JToggleButton();

        results.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        results.setResizable(false);
        results.setSize(new java.awt.Dimension(400, 275));
        results.setType(java.awt.Window.Type.POPUP);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        recordsReadoutTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordsReadoutTitleLabel.setText("Records");

        recordsReadoutXLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordsReadoutXLabel.setText("You are not logged in. No data available.");
        recordsReadoutXLabel.setLineWrap(true);

        javax.swing.GroupLayout recordsReadoutPanelLayout = new javax.swing.GroupLayout(recordsReadoutPanel);
        recordsReadoutPanel.setLayout(recordsReadoutPanelLayout);
        recordsReadoutPanelLayout.setHorizontalGroup(
            recordsReadoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordsReadoutPanelLayout.createSequentialGroup()
                .addGroup(recordsReadoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recordsReadoutPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(recordsReadoutPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(recordsReadoutTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(recordsReadoutPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(recordsReadoutXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        recordsReadoutPanelLayout.setVerticalGroup(
            recordsReadoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordsReadoutPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(recordsReadoutTitleLabel)
                .addGap(30, 30, 30)
                .addComponent(recordsReadoutXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(okButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        resultsReadoutTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultsReadoutTitleLabel.setText("Results");

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        resultsReadoutXLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultsReadoutXLabel.setText("Error");
        resultsReadoutXLabel.setLineWrap(true);

        javax.swing.GroupLayout resultsReadoutPanelLayout = new javax.swing.GroupLayout(resultsReadoutPanel);
        resultsReadoutPanel.setLayout(resultsReadoutPanelLayout);
        resultsReadoutPanelLayout.setHorizontalGroup(
            resultsReadoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsReadoutPanelLayout.createSequentialGroup()
                .addGroup(resultsReadoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultsReadoutPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultsReadoutPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(resultsReadoutTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultsReadoutPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(resultsReadoutXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        resultsReadoutPanelLayout.setVerticalGroup(
            resultsReadoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsReadoutPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(resultsReadoutTitleLabel)
                .addGap(30, 30, 30)
                .addComponent(resultsReadoutXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(nextButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(recordsReadoutPanel, 1);
        jLayeredPane1.setLayer(resultsReadoutPanel, 2);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(recordsReadoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(resultsReadoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(recordsReadoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(resultsReadoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout resultsLayout = new javax.swing.GroupLayout(results.getContentPane());
        results.getContentPane().setLayout(resultsLayout);
        resultsLayout.setHorizontalGroup(
            resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        resultsLayout.setVerticalGroup(
            resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Learn Pi");
        setMinimumSize(new java.awt.Dimension(500, 400));

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(529, 400));

        LoginPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                setFirstNameDefault(evt);
                LoginPanelComponentShown(evt);
            }
        });

        firstNameLabel.setText("First Name:");

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        userReadoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        userReadoutLabel.setText("Not logged in");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(firstNameLabel)
                        .addGap(10, 10, 10)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(loginButton)))
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addComponent(userReadoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userReadoutLabel)
                .addGap(120, 120, 120)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(firstNameLabel))
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(loginButton))
        );

        jTabbedPane1.addTab("Login", new javax.swing.ImageIcon(getClass().getResource("/images/login_icon.png")), LoginPanel, "Save your records."); // NOI18N

        TestPanel.setMinimumSize(new java.awt.Dimension(500, 400));
        TestPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                setPiTextFieldDefault(evt);
            }
        });

        piTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        piTextField.setNextFocusableComponent(digitsInputTextField);
        piTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piTextFieldActionPerformed(evt);
            }
        });

        instructionLabel.setText("Type in known digits of pi.");

        submitButton.setText("Submit");
        submitButton.setToolTipText("Click when ready to submit the above String");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        digitsInputTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        digitsInputTextField.setText("3");
        digitsInputTextField.setToolTipText("Remeber to hit ENTER.");
        digitsInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitsInputTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("How many digits would you like to learn at a time.");

        javax.swing.GroupLayout TestPanelLayout = new javax.swing.GroupLayout(TestPanel);
        TestPanel.setLayout(TestPanelLayout);
        TestPanelLayout.setHorizontalGroup(
            TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(piTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TestPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                        .addGroup(TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TestPanelLayout.createSequentialGroup()
                                .addComponent(instructionLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(TestPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(digitsInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TestPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        TestPanelLayout.setVerticalGroup(
            TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(instructionLabel)
                .addGap(48, 48, 48)
                .addComponent(piTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(submitButton)
                .addGap(50, 50, 50)
                .addGroup(TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitsInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Test", new javax.swing.ImageIcon(getClass().getResource("/images/test_icon.png")), TestPanel, "Test what you know and learn more."); // NOI18N

        RecordsPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                RecordsPanelComponentShown(evt);
            }
        });

        allUsersToggleButton.setText("All Users");
        allUsersToggleButton.setToolTipText("Toggle off to see only your records.");
        allUsersToggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allUsersToggleButtonItemStateChanged(evt);
            }
        });

        jProgressBar1.setFocusable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        logsReadoutPanel.setMinimumSize(new java.awt.Dimension(390, 250));

        datesXLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datesXLabel.setText("User should");
        datesXLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        datesXLabel.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);

        timesXLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timesXLabel.setText("not");
        timesXLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        timesXLabel.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);

        recordsXLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordsXLabel.setText("see this");
        recordsXLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        recordsXLabel.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);

        javax.swing.GroupLayout logsReadoutPanelLayout = new javax.swing.GroupLayout(logsReadoutPanel);
        logsReadoutPanel.setLayout(logsReadoutPanelLayout);
        logsReadoutPanelLayout.setHorizontalGroup(
            logsReadoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logsReadoutPanelLayout.createSequentialGroup()
                .addComponent(datesXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timesXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recordsXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        logsReadoutPanelLayout.setVerticalGroup(
            logsReadoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logsReadoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logsReadoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(datesXLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(timesXLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recordsXLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        jScrollPane1.setViewportView(logsReadoutPanel);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Record");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Time");

        sortingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Newest to Oldest", "Oldest to Newest" }));
        sortingComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                sortingComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sort by:");

        advancedToggleButton.setText("Advanced");
        advancedToggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                advancedToggleButtonItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout RecordsPanelLayout = new javax.swing.GroupLayout(RecordsPanel);
        RecordsPanel.setLayout(RecordsPanelLayout);
        RecordsPanelLayout.setHorizontalGroup(
            RecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecordsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(RecordsPanelLayout.createSequentialGroup()
                        .addGroup(RecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sortingComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(advancedToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(allUsersToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RecordsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        RecordsPanelLayout.setVerticalGroup(
            RecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecordsPanelLayout.createSequentialGroup()
                .addGroup(RecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(allUsersToggleButton)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RecordsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sortingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(advancedToggleButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Records", new javax.swing.ImageIcon(getClass().getResource("/images/logs_icon.png")), RecordsPanel, "Veiw your record along with local records."); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void advancedToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_advancedToggleButtonItemStateChanged
        advanced = advancedToggleButton.isSelected();
        updateLogsReadouts();
    }//GEN-LAST:event_advancedToggleButtonItemStateChanged

    private void sortingComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_sortingComboBoxPopupMenuWillBecomeInvisible
        int selected = sortingComboBox.getSelectedIndex();
        if(selected == 0)
            mode = "NORMAL";
        else if (selected == 1)
        	mode = "REVERSE";
        updateLogsReadouts();
    }//GEN-LAST:event_sortingComboBoxPopupMenuWillBecomeInvisible

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextButtonActionPerformed
        jLayeredPane1.setLayer(resultsReadoutPanel, 0);
        results.getRootPane().setDefaultButton(okButton);
    }// GEN-LAST:event_nextButtonActionPerformed

    private void digitsInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_digitsInputTextFieldActionPerformed
        try {
            Teacher.digitsPerTry = Integer.parseInt(digitsInputTextField.getText());
            System.out.println(Teacher.digitsPerTry);
        } catch (NumberFormatException e) {
            Teacher.digitsPerTry = 3;
        }
    }// GEN-LAST:event_digitsInputTextFieldActionPerformed

    private void piTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_piTextFieldActionPerformed
        submitButtonActionPerformed(evt);
    }// GEN-LAST:event_piTextFieldActionPerformed

    private void setPiTextFieldDefault(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_setPiTextFieldDefault
        piTextField.requestFocus();
    }// GEN-LAST:event_setPiTextFieldDefault

    private void setFirstNameDefault(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_setFirstNameDefault
        firstNameTextField.requestFocus();
    }// GEN-LAST:event_setFirstNameDefault

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstNameTextFieldActionPerformed
        loginButtonActionPerformed(evt);
    }// GEN-LAST:event_firstNameTextFieldActionPerformed

    private void RecordsPanelComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_RecordsPanelComponentShown
        if (loggedIn) {
            allUsersToggleButton.setEnabled(true);
        } else {
            allUsersToggleButton.setEnabled(false);
        }
        datesXLabel.setLineWrap(true);
        timesXLabel.setLineWrap(true);
        recordsXLabel.setLineWrap(true);
        inName = username;
        mode = "NORMAL";
        advanced = false;
        updateLogsReadouts();
    }// GEN-LAST:event_RecordsPanelComponentShown

    private void LoginPanelComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_LoginPanelComponentShown
        if (loggedIn) {
            userReadoutLabel.setText(generateFriendlyUsername());
        } else {
            userReadoutLabel.setText("Not logged in");
        }
    }// GEN-LAST:event_LoginPanelComponentShown

    private void allUsersToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_allUsersToggleButtonItemStateChanged
        if (allUsersToggleButton.isSelected()) {
            inName = "WORLD";
        } else {
        	inName = username;
        }
        updateLogsReadouts();
    }// GEN-LAST:event_allUsersToggleButtonItemStateChanged

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_submitActionPerformed
        Teacher.test(piTextField.getText());
        piTextField.setText(null);
        resultsReadoutXLabel.setText(Teacher.teach());
        results.setSize(400, 300);
        results.setVisible(true);
        results.getRootPane().setDefaultButton(nextButton);
        Teacher.setRecords(recordsReadoutXLabel);
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (!loggedIn) {
            try {
                setUser(firstNameTextField.getText());
                if (!Loader.isUser(username)) {
                    Loader.createRecordFile(username);
                }
                firstNameTextField.setText("");
                userReadoutLabel.setText(generateFriendlyUsername());
                loginButton.setText("Logout");
            } catch (IOException ex) {
                Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            loggedIn = false;
            loginButton.setText("Login");
            userReadoutLabel.setText("Not logged in");
        }
    }

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        jLayeredPane1.setLayer(resultsReadoutPanel, 2);
        results.setVisible(false);
    }

    public static void runDisplay() {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting
        // code (optional) ">
        /*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Display().setVisible(true);
        });
    }
    
    private List<String> getLogsDisplay() {
    	if (!loggedIn) {
    		inName = "WORLD";
    	}
    	return parseLogs(inName, mode, advanced);
    }
    
    private void updateLogsReadouts() {
    	List<String> logs = getLogsDisplay();
        datesXLabel.setText(logs.get(0));
        timesXLabel.setText(logs.get(1));
        recordsXLabel.setText(logs.get(2));
    }

    private String generateFriendlyUsername() {
        String name = username, firstLetter, theRest;
        firstLetter = name.substring(0, 1);
        theRest = name.substring(1).toLowerCase();
        return firstLetter + theRest;
    }
    
    private String inName, mode;
    private boolean advanced;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel RecordsPanel;
    private javax.swing.JPanel TestPanel;
    private javax.swing.JToggleButton advancedToggleButton;
    private javax.swing.JToggleButton allUsersToggleButton;
    private org.jdesktop.swingx.JXLabel datesXLabel;
    private javax.swing.JTextField digitsInputTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel logsReadoutPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField piTextField;
    private javax.swing.JPanel recordsReadoutPanel;
    private javax.swing.JLabel recordsReadoutTitleLabel;
    private org.jdesktop.swingx.JXLabel recordsReadoutXLabel;
    private org.jdesktop.swingx.JXLabel recordsXLabel;
    private javax.swing.JDialog results;
    private javax.swing.JPanel resultsReadoutPanel;
    private javax.swing.JLabel resultsReadoutTitleLabel;
    private org.jdesktop.swingx.JXLabel resultsReadoutXLabel;
    private javax.swing.JComboBox<String> sortingComboBox;
    private javax.swing.JButton submitButton;
    private org.jdesktop.swingx.JXLabel timesXLabel;
    private javax.swing.JLabel userReadoutLabel;
    // End of variables declaration//GEN-END:variables
}
