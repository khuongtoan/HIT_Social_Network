package view;

import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.component.PanePost;
import view.component.RoundedTextField;
import static view.component.RoundedTextField.textF;


public class PersonalView extends javax.swing.JFrame {

public PersonalView() {
    initComponents();
    setLocationRelativeTo(null);
    this.setLocationRelativeTo(null);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo (3).jpg")));
    textF(searchTF,jPanel1);
    jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
    jScrollPane2.getHorizontalScrollBar().setUnitIncrement(16);
}

public void addPostToMainLabel(PanePost post) {
    mainLabel.add(post,0);
    mainLabel.revalidate();
    mainLabel.repaint();
}



@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        game = new javax.swing.JLabel();
        reload = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        createPostLabel = new javax.swing.JLabel();
        settingLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainLabel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lifebook-WATO");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jSeparator2.setOpaque(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel5.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 105, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search (2).png"))); // NOI18N
        jLabel4.setOpaque(true);

        searchTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTF.setText("search");
        searchTF.setOpaque(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home (3).png"))); // NOI18N

        game.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game (2).png"))); // NOI18N

        reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redo (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(game)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(reload)
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 50);

        jPanel2.setBackground(new java.awt.Color(240, 240, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setAlignmentX(0.0F);
        jPanel4.setAlignmentY(0.0F);
        jPanel4.setPreferredSize(new java.awt.Dimension(219, 440));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user (2).png"))); // NOI18N
        nameLabel.setText("name");
        nameLabel.setOpaque(true);

        createPostLabel.setBackground(new java.awt.Color(255, 255, 255));
        createPostLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createPostLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        createPostLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/create (2).png"))); // NOI18N
        createPostLabel.setText("create post");
        createPostLabel.setOpaque(true);

        settingLabel.setBackground(new java.awt.Color(255, 255, 255));
        settingLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        settingLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/setting (4).png"))); // NOI18N
        settingLabel.setText("setting");
        settingLabel.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createPostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(settingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(nameLabel)
                .addGap(63, 63, 63)
                .addComponent(createPostLabel)
                .addGap(71, 71, 71)
                .addComponent(settingLabel)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 9, -1, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setAutoscrolls(true);

        mainLabel.setBackground(new java.awt.Color(255, 255, 255));
        mainLabel.setLayout(new javax.swing.BoxLayout(mainLabel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(mainLabel);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 580, 440));

        jPanel5.add(jPanel2);
        jPanel2.setBounds(0, 50, 800, 487);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


public static void main(String args[]) {
   
    java.awt.EventQueue.invokeLater(new Runnable() {
    @Override
    public void run() {
        new PersonalView().setVisible(true);
    }
    });
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createPostLabel;
    private javax.swing.JLabel game;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mainLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel reload;
    private javax.swing.JTextField searchTF;
    private javax.swing.JLabel settingLabel;
    // End of variables declaration//GEN-END:variables
}
