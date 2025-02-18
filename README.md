# Lifebook-Wato

**Lifebook** là một ứng dụng mạng xã hội cho phép bạn đăng bài viết, 
trạng thái, chia sẻ hình ảnh và tương tác với người khác. Mục tiêu hoàn thành
bài tập lớn của lớp java private của câu lạc bộ HIT (HAUI)

### Các tính năng chính:
- Đăng nhập 
- Đăng kí tài khoản mới
- Lấy lại mật khẩu bằng câu hỏi khôi phục
- Xem bài viết
- Tạo, xóa bài đăng
- Thích, bỏ thích bài đăng  
- Thêm, sửa, xóa bình luận
- Tìm kiếm bài đăng
- Trò chơi bóng bàn
- Cài đặt tài khoản :
  - Thay đổi mật khẩu
  - Thay đổi tên người dùng
  - Thay đổi email
  - Thay đổi câu hỏi khôi phục mật khẩu
  - Thay đổi vai trò người dùng (admin)
  - Thay đổi trạng thái tài khoản (admin)

## Hướng dẫn cài đặt và sử dụng
### Yêu cầu
- Mysql.
- Java 17+
- Maven.
- IDE: IntelliJ hoặc Netbeans.

### làm sao để chạy project ?

- sao chép dự án từ github về máy cá nhân
- cài đặt các thư viện cần thiết
- đổi tên và mật khẩu của mysql trong file persistence.xml
- đổi phiên bản java phù hợp trong file pom.xml

## cách sử dụng

1. Khởi động cơ sở dữ liệu
2. Tạo tài khoản admin ( chạy file common/Trash.java )
3. Đăng ký nếu chưa có tài khoản
4. Đăng nhập

### Trang chủ
<p>
    <img src="app_image/home.jpg" width = "500">
</p>

- Bài viết mới nhất sẽ được hiển thị, hệ thống sẽ tải 10 bài đăng một nếu kéo đến cuối thanh scrollbar thì sẽ tải thêm 10 bài viết tiếp theo 
- Nếu là bài đăng của tài khoản đang đăng nhập thì sẽ có chức năng xóa.
- Nhập vài ô search để tìm kiếm dự trên nội dung text sau đó nhấn enter để tìm kiếm
- Có thể nhấn like để thích, hoặc nhấn thêm 1 lần để bỏ thích
- Nhấn vào comment để xem các bình luận
<p>
    <img src="app_image/comment.jpg" width = "400">
</p>

- Nhập nội dung bình luận sau đó enter
- Nếu là bình luận của tài khoản đang đăng nhập sẽ có chức năng xóa hoặc cập nhật

### Tạo bài đăng (Create post)
<p>
    <img src="app_image/create.jpg" width = "400" >  
</p>

- Lựa chọn ảnh bằng nút image
- Nhập thông tin muốn chia sẻ vào ô text trống phía trên
- Lựa chọn màu chữ màu nền kiểu chữ cho văn bản
- Để hoàn thành ấn nút post 
### Cài đặt tài khoản (Setting)
<p>
    <img src="app_image/setting.jpg" width = "400">  
</p>

- Ấn click nút option sẽ hiện ra 1 pop up chứa các chức năng
- Lưu ý: chỉ có thể tạo tài khoản admin bằng cách dùng 1 tài khoản admin đổi role của 1 user (mặc định khi tạo là user)
- Hệ thống sẽ tự nhận diện vai trò của tài khoản đang dùng nếu là admin sẽ có 6 chức năng, user sẽ có 4 chức năng
- Chỉ admin mới có quyền thay đổi vai trò và trạng thái của tài khoản
- Có thể đăng xuất trong Setting

### Trò chơi bóng bàn (Game)
- Người chơi bên trái di chuyển lên : "w"  xuống : "s"
- Người chơi bên phải di chuyển lên xuống bằng mũi tên
- Bóng đi qua gôn bên nào thì đối thủ ghi 1 điểm
  
## Các công nghệ đã dùng

### Java Swing
- **Kéo thả và code tạo giao diện chính**: Java Swing được sử dụng để xây dựng giao diện người dùng của ứng dụng.
- **Các thư viện cài đặt thêm của Java Swing**:
  - **FlatLaf**: Giúp tạo giao diện hiện đại hơn cho Java Swing, cải thiện trải nghiệm người dùng với giao diện phẳng, tối giản.
  - **JFontChooser**: Hỗ trợ người dùng chọn font chữ trong ứng dụng, mang lại tính linh hoạt trong việc thay đổi kiểu chữ.

### MySQL
- Kết nối với cơ sở dữ liệu MySQL: Sử dụng MySQL làm hệ quản trị cơ sở dữ liệu để lưu trữ và quản lý dữ liệu của người dùng và các bài viết.

### Hibernate
- Quản lý kết nối, ánh xạ các class từ java với các bảng trong database  

### JBCrypt
- **Mã hóa thông tin người dùng**: Sử dụng JBCrypt để mã hóa mật khẩu và các thông tin nhạy cảm của người dùng khi lưu vào cơ sở dữ liệu, bảo mật thông tin tốt hơn.

## Sơ đồ quan hệ 

<p>
  <img src="app_image/erd.jpg">
</p>

## Cấu trúc thư mục
⚒️ **HIT_Social_Network**

🗂️ social_network  
  ├ 📁 src/main  
  │    ├ 📁 java  
  │    │    ├ 📁 common (các phương thức chung)  
  │    │    ├ 📁 controller (xử lý các hành động từ người dùng)       
  │    │    ├ 📁 dao (tương tác với cơ sở dữ liệu)   
  │    │    ├ 📁 model (các đối tượng )   
  │    │    ├ 📁 service (liên kết với cơ sở dữ liệu thông qua DAO)     
  │    │    ├ 📁 view (giao diện chính )   
  │    │    │    ├ 📁 component (các thành phần custom của giao diện )   
  │    ├ 📁 resources (thông tin dự án)    
  │    │    ├ 📁 META-INF  
  │    │    │    └ 🛠️ persistence.xml  
  ├ 🛠️ pom.xml  (thông tin thư viện)  
  └ 📜 README.md (giới thiệu và Hướng dẫn sử dụng) 
