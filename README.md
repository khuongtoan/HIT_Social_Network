# Lifebook-Wato

**Lifebook** là một ứng dụng mạng xã hội cho phép bạn đăng bài viết, 
trạng thái, chia sẻ hình ảnh và tương tác với người khác. Mục tiêu hoàn thành
bài tập lớn của lớp java private của câu lạc bộ HIT (HAUI)

### các tinh năng chính:
- Đăng nhập 
- Đăng kí tài khoản mới
- lấy lại mật khẩu bằng câu hỏi khôi phục
- xem bài viết
- tạo, xóa bài đăng
- Thích, bỏ thích bài đăng  
- thêm, sửa, xóa bình luận
- trò chơi bóng bàn
- cài đặt tài khoản :
  - thay đổi mật khẩu
  - thay đổi tên người dùng
  - thay đổi email
  - thay đổi câu hỏi khôi phục mật khẩu
  - thay đổi vai trò người dùng (admin)
  - thay đổi trạng thái tài khoản (admin)

## Hướng dẫn cài đặt và sử dụng
### yêu cầu
- Mysql.
- Java 17+
- Maven.
- IDE: IntelliJ hoặc Netbeans.

### làm sao để chạy project ?

- sao chép dự án từ github về máy cá nhân .
- cài đặt các thư viện cần thiết.
- đổi tên và mật khẩu của mysql trong file persistence.xml
- đổi phiên bản java phù hợp trong file pom.xml 

## cách sử dụng

1. kết nối với cơ sở dữ liệu.
2. chạy dự án.
3. tạo tài admin
4. 
5. Retrieve your account information if needed.

<p>
    <img src="app_image/img_17.png" width="250">
    <img src="app_image/img_18.png" width="250">
    <img src="app_image/img_19.png" width="250">
</p>

### Home Page

- You can choose a book from the home page.
    - View books in a list or grid layout.
    - Browse books by style.

You can search for books using the search label.  
You can view more books by clicking on the "Thêm >" label.
<p>
    <img src="app_image/img_29.png" width="250">
    <img src="app_image/img_3.png" width="250">
</p>

### Recent Page

You can see a list of recently read books.  
<img src="app_image/img_4.png" width="250">

### Favorite Page

This page displays the books you've marked as favorites.  
<img src="app_image/img_5.png" width="250">

### Account Page

You can see the information of your account in this page. Moreover, you can choose options in setting.

- Change your name.
- Change your password.
- Change the theme of the application.
- Retrieve your password if forgotten.
- Remove your account.

<p>
    <img src="app_image/img_20.png" width="250">
    <img src="app_image/img_21.png" width="250">  
    <img src="app_image/img_22.png" width="250">
</p>
<p>
    <img src="app_image/img_23.png" width="250">
    <img src="app_image/img_24.png" width="250">
    <img src="app_image/img_25.png" width="250">  
</p>

### More Book Screen

This screen lets you view books categorized by their status (e.g., ongoing, completed, new, etc.).  
<img src="app_image/img_12.png" width="250">

### One Book Screen

In this screen, you can read the book by clicking "Bắt đầu đọc". You can also see a list of chapters and choose one to
read. If you've already read a chapter, it will be marked. You can also add this book to your favorites list.
<p>
    <img src="app_image/img_26.png" width="250">
    <img src="app_image/img_14.png" width="250">
</p>

### Chapter Screen

Read books on this screen. You can navigate between chapters using the next or previous chapter labels.  
<img src="app_image/img_27.png" width="250">

### Search Screen

Search for books by typing the book name in the text field.  
<img src="app_image/img_28.png" width="250">

## Các công nghệ đã dùng

### Java Swing
- **Kéo thả và code tạo giao diện chính**: Java Swing được sử dụng để xây dựng giao diện người dùng của ứng dụng.
- **Các thư viện cài đặt thêm của Java Swing**:
  - **FlatLaf**: Giúp tạo giao diện hiện đại hơn cho Java Swing, cải thiện trải nghiệm người dùng với giao diện phẳng, tối giản.
  - **JFontChooser**: Hỗ trợ người dùng chọn font chữ trong ứng dụng, mang lại tính linh hoạt trong việc thay đổi kiểu chữ.

### MySQL
- **Kết nối với cơ sở dữ liệu MySQL**: Sử dụng MySQL làm hệ quản trị cơ sở dữ liệu để lưu trữ và quản lý dữ liệu của người dùng và các bài viết.

### Hibernate
- Quản lý kết nối, ánh xạ các class từ java với các bảng trong database  

### JBCrypt
- **Mã hóa thông tin người dùng**: Sử dụng JBCrypt để mã hóa mật khẩu và các thông tin nhạy cảm của người dùng khi lưu vào cơ sở dữ liệu, bảo mật thông tin tốt hơn.

## Folder Structure

📁HIT_Social_Network
social_network
  src
    main
  pom.xml
README.md




┣📁.idea  
┣📁src/main/java  
┃ ┣📁api (API-related classes and services)  
┃ ┣📁commons (Common utilities or constants used across the project)   
┃ ┣📁controllers (Controller classes managing business logic)  
┃ ┣📁dao (Data Access Object classes for database interaction)  
┃ ┣📁data (Data handling and processing classes)  
┃ ┣📁libs  (External libraries and dependencies)  
┃ ┣📁models (Model classes representing data entities)  
┃ ┣📁services (Service classes containing business logic)  
┃ ┣📁utils (Utility classes for various helper functions)  
┃ ┣📁view (UI components and screens)  
┃ ┣📁assets (Images, fonts, and other static resources)  
┃ ┗📜GitFlow.txt   
┣📜pom.xml (Maven build configuration)  
┗📜README.md  