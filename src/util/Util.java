package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Util {
    public static void close(PreparedStatement ps, Connection c, ResultSet rs) {
        try {
            if (c != null)
                c.close();
            if (ps != null)
                ps.close();
            if (rs != null)
                rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void close(PreparedStatement ps, Connection c) {
        try {
            if (c != null)
                c.close();
            if (ps != null)
                ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
