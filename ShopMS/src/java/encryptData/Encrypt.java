/*
* MessageDigest : là một class ,MessageDigest này cung cấp các ứng dụng các chức năng của một thông điệp tiêu hóa thuật toán, 
    chẳng hạn như SHA-1 hoặc SHA-256 hay MD5.Khi chúng ta mã hóa thì nó sẽ mã hóa một chiều,không thể mã hóa ngược lại,
    đây là lý do bảo mật cho người sử dụng.
* getInstance : đây là method để truyền vào chuỗi muốn mã hóa,ví dụ md5.
* update : update là một method của lớp MessageDigest giúp cập nhật lại chuỗi cần mã hóa.
* BigInteger :  BigInteger là một class cung cấp tương tự cho tất cả các nhà khai thác nguyên nguyên thủy của Java,
    và tất cả các phương pháp có liên quan từ java.lang.Math. BigInteger lớp phân bổ bộ nhớ nhiều như nó cần cho tất cả 
    các bit của dữ liệu và đặc biệt là nó không giới hạn 
* toString(16) : giúp đồng bộ chuỗi mã hóa md5 trong sql
 */
package encryptData;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Minh Thanh
 */
public class Encrypt {

    public String hashPass(String input) {
        try {
            // Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5");
            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes());
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest);
            // Convert message digest into hex value 
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) {
        }
        return "";
    }
}
