# proxy
Proxy pattern được sử dụng khi chúng ta cần tạo một wrapper để che đi sự phức tạp của đối tượng chính khỏi client.

# Các loại proxy

Proxy từ xa(Remote proxy):

Chúng có nhiệm vụ đại diện cho đối tượng được định vị từ xa. Nói chuyện với đối tượng thực có thể liên quan đến việc sắp xếp và giải nén dữ liệu và nói chuyện với đối tượng từ xa. Tất cả logic đó được gói gọn trong các proxy này và ứng dụng khách không cần lo lắng về chúng.


Proxy ảo(Virtual proxy):

Các proxy này sẽ cung cấp một số kết quả mặc định và tức thì nếu đối tượng thực được cho là mất một thời gian để tạo ra kết quả. Các proxy này bắt đầu hoạt động trên các đối tượng thực và cung cấp kết quả mặc định cho ứng dụng. Sau khi đối tượng thực được thực hiện xong, các proxy này sẽ đẩy dữ liệu thực tế đến máy khách nơi nó đã cung cấp dữ liệu giả trước đó.

Proxy bảo vệ(Protection proxy):

Nếu một ứng dụng không có quyền truy cập vào một số tài nguyên thì các proxy đó sẽ nói chuyện với các đối tượng trong ứng dụng có quyền truy cập vào tài nguyên đó và sau đó lấy lại kết quả.

Proxy thông minh(Smart Proxy):

Một proxy thông minh cung cấp thêm lớp bảo mật bằng cách lồng ghép các hành động cụ thể khi đối tượng được truy cập. Một ví dụ có thể là kiểm tra xem đối tượng thực có bị khóa trước khi nó được truy cập hay không để đảm bảo rằng không đối tượng nào khác có thể thay đổi nó.
# Những lợi ích:
Một trong những ưu điểm của Proxy pattern là tính bảo mật.
Mẫu này tránh trùng lặp các đối tượng có thể có kích thước lớn và tốn nhiều bộ nhớ. Điều này sẽ làm tăng hiệu suất của ứng dụng.
Proxy từ xa cũng đảm bảo tính bảo mật bằng cách cài đặt proxy code cục bộ (sơ khai) trong máy khách và sau đó truy cập vào máy chủ với sự trợ giúp của mã từ xa.
# Hạn chế / Hậu quả:
Mẫu này giới thiệu một lớp trừu tượng khác mà đôi khi có thể là một vấn đề nếu code RealSubject được một số máy khách truy cập trực tiếp và một số trong số họ có thể truy cập các lớp Proxy. Điều này có thể gây ra hành vi khác nhau.

# Điểm thú vị:
Có một số khác biệt giữa các Pattern liên quan. Giống như Adapter pattern cung cấp một giao diện khác cho chủ đề của nó, trong khi các Pattern Proxy cung cấp cùng một giao diện từ đối tượng ban đầu nhưng trình trang trí(decorator) cung cấp một giao diện nâng cao. Mẫu trang trí thêm hành vi bổ sung trong thời gian chạy.
Proxy được sử dụng trong Java API: java.rmi. *;
