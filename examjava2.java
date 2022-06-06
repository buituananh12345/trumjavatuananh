import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.Scanner;
public class examjava2 {
    public static void main(String[] args) throws SQLException {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/movie",
                        "root", ""
                );
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO allmovie VALUES(?,?, ?, ?, ?)");
                PreparedStatement ignored = connection.prepareStatement("select * from allmovie");
                PreparedStatement preparedStatementdelete = connection.prepareStatement("delete from allmovie where name = ?");
                PreparedStatement preparedStatementupdate = connection.prepareStatement("update allmovie set id = ? where name = ?");
                Statement statement = connection.createStatement()
        ){
            try {
                connection.setAutoCommit(false);
                int input;
                String accid;
                String name;
                String time;
                String author;
                int movduration;
                ResultSet rset;
                String sqlSelect;
                int fixmovie;
                Scanner ip = new Scanner(System.in);
                System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
                System.out.println("Những Phim hiện có tại rạp của  ");
                System.out.println("1. Pokemon \n2. \n3.Harry porter\n4.Doraemon\n5.Doctor Strage");
                System.out.println("Bạn muốn dùng yêu cầu gì vậy ?");
                System.out.println("1 đầy đủ thông tin phim đang chiếu ở rạp\n2.Sửa Thông tin phim\n3.Xóa phim\n4.Thêm Phim");
                System.out.println("Nhập yêu cầu muốn thực hiện :");
                input = ip.nextInt();
                if(input==1){
                    System.out.println("Bạn chọn hiển thị phim đang có trong rạp");
                    sqlSelect = "select * from allmovie";
                    rset = statement.executeQuery(sqlSelect);
                    while (rset.next()){
                        String id = rset.getString("id");
                        String name1 = rset.getString("name");
                        String time1 = rset.getString("time");
                        String author1 = rset.getString("author");
                        int movduration1 = rset.getInt("movduration");
                        System.out.println("Mã Phim : "+id + ", Tên Phim : " + name1 + ", Thời Gian công chiếu : " + time1 + ", Tác giả :" +author1 + ", Thời Lượng Phim: " +movduration1);
                    }
                }
                if(input==2){
                    System.out.println("Bạn muốn sửa phim số mấy : ");
                    fixmovie = ip.nextInt();
                    if(fixmovie==1){
                        System.out.println("Bạn Chọn phim số 1");
                        ip.nextLine();
                        System.out.println("nhập id muốn thay đổi :");
                        accid=ip.nextLine();
                        preparedStatementupdate.setString(1, accid);
                        System.out.println("Nhập tên muốn thay đổi :");
                        name= ip.nextLine();
                        preparedStatementupdate.setString(2,name);
                        System.out.println("Nhập thời gian muốn thay đổi :");
                        time= ip.nextLine();
                        preparedStatementupdate.setString(3,time);
                        System.out.println("Nhập tác giả muốn thay đổi :");
                        author= ip.nextLine();
                        preparedStatementupdate.setString(4,author);
                        System.out.println("Nhập thời lượng phim muốn thay đổi :");
                        movduration= ip.nextInt();
                        preparedStatementupdate.setInt(5,movduration);
                        preparedStatementupdate.executeUpdate();

                    }
                    if(fixmovie==2){
                        System.out.println("Bạn Chọn phim số 2");
                        ip.nextLine();
                        System.out.println("nhập id muốn thay đổi :");
                        accid=ip.nextLine();
                        preparedStatementupdate.setString(1, accid);
                        System.out.println("Nhập tên muốn thay đổi :");
                        name= ip.nextLine();
                        preparedStatementupdate.setString(2,name);
                        System.out.println("Nhập thời gian muốn thay đổi :");
                        time= ip.nextLine();
                        preparedStatementupdate.setString(3,time);
                        System.out.println("Nhập tác giả muốn thay đổi :");
                        author= ip.nextLine();
                        preparedStatementupdate.setString(4,author);
                        System.out.println("Nhập thời lượng phim muốn thay đổi :");
                        movduration= ip.nextInt();
                        preparedStatementupdate.setInt(5,movduration);
                        preparedStatementupdate.executeUpdate();

                    }
                    if(fixmovie==3){
                        System.out.println("Bạn Chọn phim số 3");
                        ip.nextLine();
                        System.out.println("nhập id muốn thay đổi :");
                        accid=ip.nextLine();
                        preparedStatementupdate.setString(1, accid);
                        System.out.println("Nhập tên muốn thay đổi :");
                        name= ip.nextLine();
                        preparedStatementupdate.setString(2,name);
                        System.out.println("Nhập thời gian muốn thay đổi :");
                        time= ip.nextLine();
                        preparedStatementupdate.setString(3,time);
                        System.out.println("Nhập tác giả muốn thay đổi :");
                        author= ip.nextLine();
                        preparedStatementupdate.setString(4,author);
                        System.out.println("Nhập thời lượng phim muốn thay đổi :");
                        movduration= ip.nextInt();
                        preparedStatementupdate.setInt(5,movduration);
                        preparedStatementupdate.executeUpdate();

                    }
                    if(fixmovie==4){
                        System.out.println("Bạn Chọn phim số 4");
                        ip.nextLine();
                        System.out.println("nhập id muốn thay đổi :");
                        accid=ip.nextLine();
                        preparedStatementupdate.setString(1, accid);
                        System.out.println("Nhập tên muốn thay đổi :");
                        name= ip.nextLine();
                        preparedStatementupdate.setString(2,name);
                        System.out.println("Nhập thời gian muốn thay đổi :");
                        time= ip.nextLine();
                        preparedStatementupdate.setString(3,time);
                        System.out.println("Nhập tác giả muốn thay đổi :");
                        author= ip.nextLine();
                        preparedStatementupdate.setString(4,author);
                        System.out.println("Nhập thời lượng phim muốn thay đổi :");
                        movduration= ip.nextInt();
                        preparedStatementupdate.setInt(5,movduration);
                        preparedStatementupdate.executeUpdate();

                    }
                    if(fixmovie==5){
                        System.out.println("Bạn Chọn phim số 5");
                        ip.nextLine();
                        System.out.println("nhập id muốn thay đổi :");
                        accid=ip.nextLine();
                        preparedStatementupdate.setString(1, accid);
                        System.out.println("Nhập tên muốn thay đổi :");
                        name= ip.nextLine();
                        preparedStatementupdate.setString(2,name);
                        System.out.println("Nhập thời gian muốn thay đổi :");
                        time= ip.nextLine();
                        preparedStatementupdate.setString(3,time);
                        System.out.println("Nhập tác giả muốn thay đổi :");
                        author= ip.nextLine();
                        preparedStatementupdate.setString(4,author);
                        System.out.println("Nhập thời lượng phim muốn thay đổi :");
                        movduration= ip.nextInt();
                        preparedStatementupdate.setInt(5,movduration);
                        preparedStatementupdate.executeUpdate();

                    }
                }
                if (input==3){
                    System.out.println("Bạn chọn xóa phim");
                    ip.nextLine();
                    System.out.println("\nNhập tên phim muốn xóa: ");
                    name = ip.nextLine();
                    preparedStatementdelete.setString(1, name);
                    preparedStatementdelete.executeUpdate();
                }
                if(input==4){
                    System.out.println("BẠn chọn thêm Phim");
                    ip.nextLine();
                    System.out.println("Nhập id phim: ");
                    accid = ip.nextLine();
                    System.out.println("Nhập tên phim: ");
                    name = ip.nextLine();
                    System.out.println("Nhập thời gina khởi chiếu:  ");
                    time = ip.nextLine();
                    System.out.println("Nhập tên tác giả: ");
                    author = ip.nextLine();
                    System.out.println("Nhập thời lượng phim ");
                    movduration = ip.nextInt();
                    preparedStatement1.setString(1, accid);
                    preparedStatement1.setString(2, name);
                    preparedStatement1.setString(3, time);
                    preparedStatement1.setString(4, author);
                    preparedStatement1.setInt   (5, movduration);
                    preparedStatement1.executeUpdate();
                }
                connection.commit();
            }catch (SQLException ex){
                System.out.println("--Roll Back Please--");
                connection.rollback();
                ex.printStackTrace();
            }
        }
    }
}
