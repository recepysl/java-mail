package com.java.mail.app;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mail extends javax.swing.JFrame {
    

    
    public String list = "";
    public String topic = "";
    public String EmailBody = "";
    public int a;
    public int x;
    public String signuture ="";
    
    public Mail() {
        initComponents();
        jTextField8.setText("ry@recepyesil.com");  // labels
        jTextField8.setEditable(false);
        jTextField8.setEnabled(false);
        jTextField8.setDisabledTextColor(Color.red);
        jTextField9.setText("**************");
        jTextField9.setEditable(false);
        jTextField9.setEnabled(false);
        jTextField9.setDisabledTextColor(Color.red);
       
       
        JFrame frame = new JFrame();
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        
    }
    // sending mail with coming informations
    public void generateAndSendEmail() throws AddressException, MessagingException {

    	
Properties prop = new Properties();
		
String emailBody = EmailBody + "<br><br> Regards, <br><b>Recep Yesil</b><br>Contact:<br><b>ry@recepyesil.com<br>"
		+ "recepysl@gmail.com<br>Web-site:<br>www.recepyesil.com</b>";
		// Signature 

		prop.put("mail.transport.protocol", "smtp");
		// to send a mail use protocol -> smtp
		
		prop.put("mail.smtp.host","smtp.recepyesil.com");
		// server adress of mail 
		
		prop.put("mail.smtp.auth","true");
		//server password Authentication 
		
		prop.put("mail.smtp.port", "147");
		// mail port number
		
		try {

			UserInformations user = new UserInformations();
			// define user informations
			
			Session mailSession  = Session.getDefaultInstance(prop, user);
			// create object
			
			try {
				Transport trans;
				trans = mailSession.getTransport();
				

				MimeMessage mail = new MimeMessage(mailSession);
				// mail variable (all mail informations will be here)
				
				try {
				//	mail.setContent(EmailBody,"text/plain");
					// mail subtitle
					
					mail.setFrom(new InternetAddress("ry@recepyesil.com"));
					// From who 
					
					mail.setSubject(topic);
					// set topic of the mail
					
					mail.setContent(emailBody, "text/html");
					//set signuture 

					
					mail.addRecipient(Message.RecipientType.TO,new InternetAddress(list));
					// to  the list 
					
					trans.connect();
					// connect to the server
					
					try {
						trans.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
						// send the mail
					} catch (Exception e) {
						e.printStackTrace();
						System.err.println("tranport error");
						JOptionPane.showMessageDialog(rootPane, "Progress is Faid Check Your Information");
					}
					
					
					trans.close();
					//close the connection
					
				} catch (MessagingException e) {
					JOptionPane.showMessageDialog(rootPane, "Progress is Faid Check Your Information");
					e.printStackTrace();
				}
				
				
			} catch (NoSuchProviderException e1) {
				System.err.println("trans mail session error");
				JOptionPane.showMessageDialog(rootPane, "Progress is Faid Check Your Information");
			//	e1.printStackTrace();
			}
			 
			
			
		} catch (Exception e2) {
			System.err.println("Session error");
			e2.setStackTrace(null);
			JOptionPane.showMessageDialog(rootPane, "Progress is Faid Check Your Information");
		}
		System.out.println("Succedd !!!!");	
		  
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold default state="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(77, 23, 23));
        jLabel1.setText("Enter Mail List:");

        jButton1.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(176, 67, 67));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gmail3.png"))); // NOI18N
        jButton1.setText("Send ALL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(77, 23, 23));
        jLabel2.setText("Enter Topic:");

        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(77, 23, 23));
        jLabel3.setText("From:");

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(77, 23, 23));
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(77, 23, 23));
        jLabel5.setText("1-");

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(77, 23, 23));
        jLabel6.setText("2-");

        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(77, 23, 23));
        jLabel7.setText("3-");

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(77, 23, 23));
        jLabel8.setText("4-");

        jLabel9.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(77, 23, 23));
        jLabel9.setText("5-");

        jLabel10.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(77, 23, 23));
        jLabel10.setText("6-");

        jLabel11.setText("  ");

        jLabel12.setText("  ");

        jLabel13.setText("  ");

        jButton2.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(176, 67, 67));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete30.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(77, 23, 23));
        jLabel17.setText("Text: ");

        jButton3.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(176, 67, 67));
        jButton3.setText("Clear All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(94, 26, 26));
        jLabel18.setText("© 2014 Recep Yesil  All Rights Reserved.");

        jButton4.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(61, 14, 14));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info4 (1).png"))); // NOI18N
        jButton4.setText("About");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 63, 63), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel13))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel12))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel11))))
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16)))
                                .addGap(2, 2, 2)))))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jTextField7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(49, 49, 49)))))
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (!jTextField1.getText().isEmpty()) {
            list = jTextField1.getText().trim();
        } else if (!jTextField2.getText().isEmpty()) {
            list += ",";
            list += jTextField2.getText().trim();
        } else if (!jTextField3.getText().isEmpty()) {
            list += ",";
            list += jTextField3.getText().trim();
        } else if (!jTextField4.getText().isEmpty()) {
            list += ",";
            list += jTextField4.getText().trim();
        } else if (!jTextField5.getText().isEmpty()) {
            list += ",";
            list += jTextField5.getText().trim();
        } else if (!jTextField6.getText().isEmpty()) {
            list += ",";
            list += jTextField6.getText().trim();
        } else {
            list = "zangevange@gmail.com";
            //    JOptionPane.showMessageDialog(rootPane, " Mail Address are EMPTY...");
            a = 41;
        }
        topic = jTextField7.getText();
        EmailBody = jTextArea1.getText();
        
        if (a != 41) {
            try {
                generateAndSendEmail();
                System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
                JOptionPane.showMessageDialog(rootPane, "Mail Succesfully SEND...");
                
            } catch (MessagingException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
                //      JOptionPane.showInternalMessageDialog(rootPane, "Progress is Faild Check Your Information");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Progress is Faid Check Your Information");
        }
        // after mail send 
        jTextArea1.setText(null);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);

    }//GEN-LAST:event_jButton1ActionPerformed
    

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        /*    if (jTextField1.getText().contains("@gmail.com")) {
         //  JOptionPane.showMessageDialog(rootPane, "check the mail address");
         jLabel11.setText("correct");
         }*/
    }//GEN-LAST:event_formKeyTyped
// to check gmail is valid or not 
    
    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().contains("@gmail.com")) {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Accept-icon.png")));
            jButton1.setEnabled(true);
        } else {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416363353_101.png")));
            jButton1.setEnabled(false);
        }
        if (jTextField1.getText().isEmpty()) {
            jButton1.setEnabled(true);
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416364638_129.png")));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if (jTextField2.getText().contains("@gmail.com")) {
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Accept-icon.png")));
            jButton1.setEnabled(true);
        } else {
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416363353_101.png")));
            jButton1.setEnabled(false);
        }
        if (jTextField2.getText().isEmpty()) {            
             jButton1.setEnabled(true);
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416364638_129.png")));
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if (jTextField3.getText().contains("@gmail.com")) {
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Accept-icon.png")));
            jButton1.setEnabled(true);
        } else {
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416363353_101.png")));
             jButton1.setEnabled(false);
        }
        if (jTextField3.getText().isEmpty()) {
            jButton1.setEnabled(true);
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416364638_129.png")));
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        if (jTextField5.getText().contains("@gmail.com")) {
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Accept-icon.png")));
            jButton1.setEnabled(true);
        } else {
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416363353_101.png")));
             jButton1.setEnabled(false);
        }
        if (jTextField5.getText().isEmpty()) {
            jButton1.setEnabled(true);
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416364638_129.png")));
        }
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if (jTextField4.getText().contains("@gmail.com")) {
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Accept-icon.png")));
            jButton1.setEnabled(true);
        } else {
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416363353_101.png")));
            jButton1.setEnabled(false);
        }
        if (jTextField4.getText().isEmpty()) {
            jButton1.setEnabled(true);
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416364638_129.png")));
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        if (jTextField6.getText().contains("@gmail.com")) {
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Accept-icon.png")));
            jButton1.setEnabled(true);
        } else {
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416363353_101.png")));
            jButton1.setEnabled(false);
        }
        if (jTextField6.getText().isEmpty()) {
            jButton1.setEnabled(true);
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1416364638_129.png")));
        }
    }//GEN-LAST:event_jTextField6FocusLost

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
     /*   if (zaza[0] == 0 || zaza[1] == 0 || zaza[2] == 0 || zaza[3] == 0 || zaza[4] == 0) {
            jButton1.setEnabled(false);
        } else {
            jButton1.setEnabled(true);
        }
        */
    }//GEN-LAST:event_formMouseMoved

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jTextField7FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        jTextArea1.setText(null);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       JOptionPane.showMessageDialog(rootPane, "written by @recepysl  contact email: recepysl@gmail.com"
       		+ "  www.recepyesil.com", "About: ", WIDTH);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     * @throws javax.mail.internet.AddressException
     */
    public static void main(String args[]) throws AddressException, MessagingException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mail().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
