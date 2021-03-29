/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import context.DBContext;
import encryptData.Encrypt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;

/**
 *
 * @author Minh Thanh
 */
public class AccountDAO extends DBContext {

    private PreparedStatement st;
    private ResultSet rs;

    public List<Account> getAllAccount() {

        List<Account> list = new ArrayList<>();
        String sql = "SELECT * FROM Accounts";

        try {

            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Account(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)));
            }
            return list;
        } catch (SQLException e) {

        }
        return null;
    }

    public Account login(String username, String password) {
        
        String encrypPass = new Encrypt().hashPass(password);
        String sql = "SELECT * FROM Accounts WHERE username = ? AND password = ?";
        try {

            st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, encrypPass);
            rs = st.executeQuery();
            if (rs.next()) {
                return new Account(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (SQLException e) {

        }
        return null;
    }

    public boolean signup(String username, String password, String fullName) {

        String encrypPass = new Encrypt().hashPass(password);
        
        String sql = "INSERT INTO Accounts VALUES(?,?,?,?)";

        try {
            st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, encrypPass);
            st.setString(3, fullName);
            st.setInt(4, 2); // default when sigup of role is 2 (user)
            if (!isExistUsername(username)) {
                st.executeUpdate();
                return true;
            }

        } catch (SQLException e) {

        }
        return false;
    }

    public boolean isExistUsername(String username) {
        AccountDAO dao = new AccountDAO();
        List<Account> list = dao.getAllAccount();

        for (Account account : list) {
            if (username.equalsIgnoreCase(account.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public void deleteAccountByUserName(String username) {
        String sql = "DELETE FROM Orders WHERE usernameCustomer = ? "
                + "DELETE FROM Accounts WHERE username = ? AND role <> 1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, username);
            st.executeUpdate();
        } catch (SQLException e) {

        }
    }

    public void editAccount(Account a) {

        String sql = "UPDATE Accounts SET fullName = ?, role = ? WHERE username = ?";
        try {
            st = connection.prepareStatement(sql);

            st.setString(1, a.getFullName());
            st.setInt(2, a.getRole());
            st.setString(3, a.getUsername());

            st.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    /*    public void editProduct(Product p) {
        String sql = "UPDATE Products\n"
                + "SET name = ?, cid=?, image = ?, price = ?, description=?, dateCreated = ?\n"
                + "WHERE id = ?";
        try {
            st = connection.prepareStatement(sql);

            st.setString(1, p.getName());
            st.setString(2, p.getCid());
            st.setString(3, p.getImage());
            st.setDouble(4, p.getPrice());
            st.setString(5, p.getDescription());
            st.setDate(6, (Date) p.getDateCreated());
            st.setString(7, p.getId());
            
            st.executeUpdate();

        } catch (SQLException e) {

        }

    }*/
    public static void main(String[] args) {
        String encrypPass = new Encrypt().hashPass("130600");
        System.out.println(encrypPass);
    }
}
