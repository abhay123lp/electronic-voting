/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VotingProcessMain.java
 *
 * Created on Jan 9, 2010, 8:09:23 PM
 */

package voter;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import utils.MyLogger;

/**
 *
 * @author Marius Ion
 */
public class VotingProcessMain extends javax.swing.JFrame {
    Logger vLogger = Logger.getLogger("VotingLogger");

    /** Creates new form VotingProcessMain */
    public VotingProcessMain() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAuthentication = new javax.swing.JPanel();
        jLabelKSPath = new javax.swing.JLabel();
        jLabelKSPass = new javax.swing.JLabel();
        jTextFieldKSPath = new javax.swing.JTextField();
        jPasswordFieldKSPass = new javax.swing.JPasswordField();
        jLabelNume = new javax.swing.JLabel();
        jLabelPrenume = new javax.swing.JLabel();
        jLabelCNP = new javax.swing.JLabel();
        jTextFieldNume = new javax.swing.JTextField();
        jTextFieldPrenume = new javax.swing.JTextField();
        jTextFieldCNP = new javax.swing.JTextField();
        jScrollPaneList = new javax.swing.JScrollPane();
        jListCandidates = new javax.swing.JList();
        jButtonVote = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelAuthentication.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Authentication", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabelKSPath.setText("KeyStore Path");

        jLabelKSPass.setText("KeyStore Password");

        jTextFieldKSPath.setText("security/voters/Marius/Marius.ks");

        jPasswordFieldKSPass.setText("Marius_password");

        jLabelNume.setText("Nume");

        jLabelPrenume.setText("Prenume");

        jLabelCNP.setText("CNP");

        jTextFieldNume.setText("Ion");

        jTextFieldPrenume.setText("Marius");

        jTextFieldCNP.setText("1851130160046");

        javax.swing.GroupLayout jPanelAuthenticationLayout = new javax.swing.GroupLayout(jPanelAuthentication);
        jPanelAuthentication.setLayout(jPanelAuthenticationLayout);
        jPanelAuthenticationLayout.setHorizontalGroup(
            jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthenticationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelKSPass)
                    .addComponent(jLabelKSPath)
                    .addComponent(jLabelNume)
                    .addComponent(jLabelPrenume)
                    .addComponent(jLabelCNP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCNP)
                    .addComponent(jTextFieldPrenume)
                    .addComponent(jTextFieldNume)
                    .addComponent(jPasswordFieldKSPass)
                    .addComponent(jTextFieldKSPath, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAuthenticationLayout.setVerticalGroup(
            jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthenticationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKSPath)
                    .addComponent(jTextFieldKSPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKSPass)
                    .addComponent(jPasswordFieldKSPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNume)
                    .addComponent(jTextFieldNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrenume)
                    .addComponent(jTextFieldPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCNP)
                    .addComponent(jTextFieldCNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jListCandidates.setModel(new javax.swing.AbstractListModel() {
            String[] strings = getCandidates();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneList.setViewportView(jListCandidates);

        jButtonVote.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButtonVote.setText("Voteaza !");
        jButtonVote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneList, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelAuthentication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAuthentication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonVote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneList))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoteActionPerformed
        try {
            String ksPath = jTextFieldKSPath.getText();
            char [] ksPass = jPasswordFieldKSPass.getPassword();
            VotingProcess vp = new VotingProcess(ksPath, ksPass);
            String firstName = jTextFieldPrenume.getText();
            String lastName = jTextFieldNume.getText();
            String cnp = jTextFieldCNP.getText();
            Voter v = new Voter(firstName, lastName, cnp);
            vp.sendRequestToVote(v);
            if (!vp.voterIsEligible()){
                String message = "Voter with CNP "+v.getCNP()+" is NOT eligible to vote. Possible fraud detected.";
                vLogger.fatal(message);
                throw new Exception(message);
            }
            else{
                String message = "Voter with CNP "+v.getCNP()+" is eligible to vote.";
                vLogger.info(message);
                vp.sendBlindedMessage("sdfsdf".getBytes());
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Eroare", "Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonVoteActionPerformed

    private String [] getCandidates() {
        return new String[] {
          "Candidatul 1, Partidul 1",
          "Candidatul 1, Partidul 2",
          "Candidatul 1, Partidul 3",
          "Candidatul 1, Partidul 4",
          "Candidatul 1, Partidul 5",
        };
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        Voter v = new Voter("Ionut", "Posea","1851220081660");
        MyLogger.initLogging("VotingLogger", "voting.log");

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VotingProcessMain().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVote;
    private javax.swing.JLabel jLabelCNP;
    private javax.swing.JLabel jLabelKSPass;
    private javax.swing.JLabel jLabelKSPath;
    private javax.swing.JLabel jLabelNume;
    private javax.swing.JLabel jLabelPrenume;
    private javax.swing.JList jListCandidates;
    private javax.swing.JPanel jPanelAuthentication;
    private javax.swing.JPasswordField jPasswordFieldKSPass;
    private javax.swing.JScrollPane jScrollPaneList;
    private javax.swing.JTextField jTextFieldCNP;
    private javax.swing.JTextField jTextFieldKSPath;
    private javax.swing.JTextField jTextFieldNume;
    private javax.swing.JTextField jTextFieldPrenume;
    // End of variables declaration//GEN-END:variables

}
