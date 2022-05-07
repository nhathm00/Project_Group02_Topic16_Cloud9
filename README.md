# **Nhóm 2 - đề tài 16 : Tìm hiểu về Cloud9 và viết ứng dụng minh họa**
### **Thành viên :**
#### **Hoàng Minh Nhật (NT)** - 19133042
#### **Dương Thanh Tuấn** - 19133004
#### **Lê Phương Nam** - 19133036

### **Mục tiêu đề tài** : Ứng dụng các kiến thức về môn học vào đề tài , hiểu về Cloud9 và ứng dụng vào thực tiễn .
### **Nội dung đề tài** : Gồm 2 phần : Tìm hiểu về Cloud9 và viết ứng dụng minh họa .
## **Phần 1** : Tìm hiểu về Cloud9
### **1.1 Tổng quan về Cloud9** 
#### **Cloud9 là gì ?**
-	**AWS Cloud9** là một môi trường phát triển tích hợp, hoặc **IDE**.
-	**AWS Cloud9 IDE** cung cấp trải nghiệm chỉnh sửa mã phong phú với sự hỗ trợ cho một số ngôn ngữ lập trình và trình gỡ lỗi thời gian chạy và thiết bị đầu cuối tích hợp. Nó chứa một bộ công cụ mà bạn sử dụng để mã, hãy xây dựng, chạy, kiểm tra và gỡ lỗi và giúp bạn phát hành phần mềm về đám mây.
-	Bạn truy cập **IDE AWS Cloud9** thông qua trình duyệt web. Bạn có thể định cấu hình **IDE** theo sở thích của bạn. Bạn có thể chuyển đổi các chủ đề màu, các phím tắt liên kết, cho phép lập trình ngôn ngữ và định dạng mã cú pháp cụ thể của ngôn ngữ, v.v.

#### **AWS Cloud9 hoạt động như thế nào?**
-	Như sơ đồ dưới đây , bạn sử dụng **AWS Cloud9 IDE**, chạy trong trình duyệt web trên máy tính cục bộ của mình, để tương tác với môi trường **AWS Cloud9** của bạn. Tài nguyên điện toán (ví dụ: phiên bản **Amazon EC2** hoặc máy chủ của riêng bạn) kết nối với môi trường đó. Cuối cùng, công việc của bạn được lưu trữ trong kho lưu trữ **CODECOMMIT** hoặc loại kho lưu trữ từ xa khác.
-	![How AWS Cloud9 works](https://docs.aws.amazon.com/cloud9/latest/user-guide/images/arch.png)

#### **Môi trường AWS Cloud9 ?**
-	Môi trường AWS Cloud9 là nơi bạn lưu trữ các tệp của dự án và nơi bạn chạy các công cụ để phát triển các ứng dụng của mình.
-	Bạn có thể sử dụng AWS Cloud9 IDE để : 
	+ Lưu trữ các tệp dự án của bạn cục bộ trên thể hiện hoặc máy chủ . 
	+ Nhân bản một kho lưu trữ mã từ xa - chẳng hạn như **repo** trong **AWS CodeCommit** vào môi trường của bạn . 
	+ Làm việc với sự kết hợp của các tệp cục bộ và nhân bản trong môi trường. 
-	Bạn có thể tạo và chuyển đổi giữa nhiều môi trường, với mỗi môi trường được thiết lập cho một dự án phát triển cụ thể. Bằng cách lưu trữ môi trường trong đám mây, các dự án của bạn không còn cần phải được gắn với một thiết lập máy tính hoặc máy chủ duy nhất. Điều này cho phép bạn thực hiện những thứ như dễ dàng chuyển đổi giữa các máy tính .

#### **Bạn có thể làm gì với AWS Cloud9 ?**
-	Với AWS Cloud9, bạn có **code, build, run, test, debug, release** phần mềm trong nhiều tình huống và biến thể thú vị. Chúng bao gồm (không phải tất cả):
	+ Làm việc với mã trong một số ngôn ngữ lập trình và Bộ phát triển đám mây AWS (**CDK**). 
	+ Làm việc với mã trong một **container docker** đang chạy. 
	+ Sử dụng kho mã trực tuyến. 
	+ Hợp tác với những người khác trong thời gian thực. 
	+ Tương tác với các công nghệ cơ sở dữ liệu và trang web khác nhau. 
	+ Nhắm mục tiêu **AWS Lambda**, Cổng **API Amazon** và các ứng dụng không có máy chủ AWS. 
	+ Tận dụng các sản phẩm AWS khác như **Amazon Lightsail**, **AWS CodeStar** và **AWS CodePipeline**.
-	Chi tiết : [What can I do with AWS Cloud9?](https://docs.aws.amazon.com/cloud9/latest/user-guide/what-can-i-do.html)
-	[Thông tin bổ sung về AWS Cloud9](https://docs.aws.amazon.com/cloud9/latest/user-guide/additional-info.html)

### **1.2 Các bước cài đặt Cloud9** 
- 	[Thông tin caì đặt AWS Cloud9](https://docs.aws.amazon.com/cloud9/latest/user-guide/setting-up.html)
### **1.3 Setup môi trường và chạy ứng dụng maven đơn giản**
-	Cài đặt java 8
	- `sudo apt update`
	- `sudo apt install -y openjdk-8-jdk`
	- `sudo update-alternatives --config java` và chọn phiên bản phù hợp , sau đó ENTER
	- `sudo update-alternatives --config javac` và chọn phiên bản phù hợp , sau đó ENTER
-	Cài đặt maven 3
	- Với ubuntu server :
		- `sudo apt install -y maven`
		- `mvn -version`
-	Tạo ứng dụng maven đơn giản và chạy thử
	- `mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`
	- `cd my-app`
	- `mvn package`
	- `java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App`
## **Phần 2 : Viết ứng dụng minh họa**
### <mark>**E-commerce Web Application**</mark>
#### **Phiên bản** : 
-	Spring Boot 2.6.7
-	openJDK 8
-	maven3
-	Cloud9

#### **Xây dựng Web Service dùng** :
+ backend: Spring Boot 2.6.7
+ frontend: Thymeleaf, only html,css,bootstrap
+ spring security
+ spring data jpa
+ mysql database

#### **Quản lý Source Code :**
+ Git

#### **Mô tả** :
+ Web Ecommerce bán sản phẩm laptop , điện thoại , đồng hồ ,...
+ Đối tượng sử dụng : Nhân viên, Khách hàng.
+ Yêu cầu chính : Trưng bày sản phẩm, tạo giỏ hàng, thanh toán hóa đơn .

#### **Các tính năng** :
+ phân quyền admin, user
+ đăng nhập qua google 
+ quản lí sản phẩm, loại sản phẩm(**CRUD**)
+ xem sản phẩm, xem chi tiết
+ quản lí giỏ hàng (thêm, xóa)

#### **Admin section**:
+ Loại sản phẩm (**Categories**)
+ Sản phẩm (**Product**)

#### **User section**:
+ Trang trưng bày sản phẩm (**Products page**)
+ Trang sản phẩm chi tiết (**Products detail**)
+ Quản lý Cart (**Cart management**)

#### **Một số ý tưởng cho website**:
+ phân trang
+ công cụ tìm kiếm
## **Deploy Spring Boot Application to AWS Elastic Beanstalk**
### **Tổng quan về Elastic Beanstalk**

#### **Elastic Beanstalk là gì ?**
-	**Elastic Beanstalk** là một dịch vụ điều phối khá dễ sử dụng bởi AWS để triển khai và mở rộng các ứng dụng web và dịch vụ web. Nó hỗ trợ các ngôn ngữ như Java, .NET, PHP, Node.js, Python, Ruby và Go ,..
-	Hơn nữa, **Elastic Beanstalk** cho phép bạn triển khai các ứng dụng của mình trên các máy chủ như Apache, Nginx, Passenger, Tomcat, IIS và Docker.
-	Quy trình làm việc của Elastic Beanstalk :
-	![How AWS Elastic Beanstalk works](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/images/clearbox-flow-00.png)

### **Làm thế nào để triển khai một ứng dụng với AWS Elastic Beanstalk**
-	Để sử dụng Elastic Beanstalk, bạn tạo một ứng dụng, tải lên phiên bản ứng dụng dưới dạng gói nguồn ứng dụng (ví dụ: tệp java .war) lên Elastic Beanstalk, sau đó cung cấp một số thông tin về ứng dụng. Elastic Beanstalk tự động khởi chạy một môi trường và tạo và định cấu hình các tài nguyên AWS cần thiết để chạy mã của bạn. Sau khi môi trường của bạn được ra mắt, sau đó bạn có thể quản lý môi trường của mình và triển khai các phiên bản ứng dụng mới.

### **Các bước triển khai một ứng dụng Spring Boot với AWS Elastic Beanstalk**
-	**Bước 1** :  	Tạo một dự án Spring Boot bằng cách sử dụng **Spring Initializr**
-	**Bước 2** :  	Import dự án vào IDE yêu thích của bạn
-	**Bước 3** :	Thêm một **RestController** để có thể kiểm tra
-	**Bước 4** :	Kiểm tra ứng dụng cục bộ
-	**Bước 5** :	Chuẩn bị final jar file
-	**Bước 6** :	Login vào AWS Management Console và mở Elastic Beanstalk
-	**Bước 7** :	Tạo một ứng dụng (Application)
-	**Bước 8** :	Thay đổi port cho ứng dụng
-	**Bước 9** :	Kiểm tra Spring Boot Application Deployed trên Elastic Beanstalk
-	**Bước 10** :	Update ứng dụng Spring Boot của bạn 



### **Tài liệu Tham khảo** 
##### **AWS Cloud9** : https://docs.aws.amazon.com/cloud9/latest/user-guide/welcome.html
##### **AWS Elastic Beanstalk** : https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/Welcome.html
