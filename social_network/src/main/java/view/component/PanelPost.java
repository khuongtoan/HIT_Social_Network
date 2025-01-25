package view.component;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PanelPost extends javax.swing.JPanel {

public PanelPost(String postContentText, String imagePath) {
    initComponents();
    setPostContent(postContentText);
    setImage(imagePath);
}

public void setPostContent(String content) {
    contentw.setText(content);
}

public void setImage(String imagePath) {
    // Sử dụng đường dẫn tuyệt đối
    File imageFile = new File(imagePath);

    if (imageFile.exists()) {
        // Tạo ImageIcon từ tệp ảnh
        ImageIcon imageIcon = new ImageIcon(imageFile.getAbsolutePath());

        // Lấy kích thước JLabel để thay đổi kích thước ảnh sao cho vừa với JLabel
        int labelWidth = image.getWidth();
        int labelHeight = image.getHeight();

        // Nếu JLabel chưa có kích thước, phải đợi sau khi hiển thị lần đầu
        if (labelWidth == 0 || labelHeight == 0) {
            image.setPreferredSize(new java.awt.Dimension(570, 400)); // Đặt kích thước mặc định cho JLabel
        }

        // Chỉnh kích thước ảnh để phù hợp với JLabel mà không làm biến dạng
        Image img = imageIcon.getImage();
        Image resizedImg = img.getScaledInstance(570, 400, Image.SCALE_SMOOTH);

        // Tạo ImageIcon mới từ ảnh đã thay đổi kích thước
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        // Gán icon cho JLabel
        image.setIcon(resizedIcon);
    } else {
        System.out.println("File does not exist.");
    }
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        contentw = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(570, 400));
        setMinimumSize(new java.awt.Dimension(570, 400));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(570, 400));
        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(570, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(25, 25));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username.setText("name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(570, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/like (2).png"))); // NOI18N
        jLabel1.setText("1");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/like (2).png"))); // NOI18N
        jButton1.setText("Like");
        jButton1.setDefaultCapable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat (2).png"))); // NOI18N
        jButton2.setText("comment");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addContainerGap(10, Short.MAX_VALUE))))
        );

        add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel6.setLayout(new java.awt.BorderLayout());

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setOpaque(true);
        jPanel6.add(image, java.awt.BorderLayout.CENTER);

        contentw.setBackground(new java.awt.Color(255, 255, 255));
        contentw.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contentw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentw.setToolTipText("");
        contentw.setOpaque(true);
        contentw.setPreferredSize(new java.awt.Dimension(570, 50));
        jPanel6.add(contentw, java.awt.BorderLayout.PAGE_START);

        add(jPanel6, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contentw;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
