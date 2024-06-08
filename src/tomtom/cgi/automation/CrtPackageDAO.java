package tomtom.cgi.automation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionProvider;

public class CrtPackageDAO {

	public int getProductId(String articleNumber) throws SQLException {
		String qry ="SELECT ID FROM PRODUCT WHERE Article_number = '"+ articleNumber+"'";
		PreparedStatement pst;
		int id = 0;
		Connection con=ConnectionProvider.getCon();
        pst = con.prepareStatement(qry);
        ResultSet rs =pst.executeQuery();
        while(rs.next()){
            id  = rs.getInt("ID");
         }
		return id;
	}
	
	public String getUriAndVersion(int productId) throws SQLException {
		String qry ="SELECT URI,VERSION FROM CONTENT_ITEM_REFERENCE WHERE product_id = "+productId;
		PreparedStatement pst;
		String uri = "";
		String version = "";
		Connection con=ConnectionProvider.getCon();
        pst = con.prepareStatement(qry);
        ResultSet rs =pst.executeQuery();
        while(rs.next()){
        	uri  = rs.getString("URI");
        	version = rs.getString("VERSION");
         }
		return (uri +","+ version);
	}
	
	public int getContentItemId(String uri,String version) throws SQLException {
		String qry ="SELECT ID FROM CONTENT_ITEM WHERE uri ='"+ uri +"'" +"AND RELEASE_VERSION =" +version;
		PreparedStatement pst;
		int contentItemId = 0;
		Connection con=ConnectionProvider.getCon();
        pst = con.prepareStatement(qry);
        ResultSet rs =pst.executeQuery();
        while(rs.next()){
        	contentItemId = rs.getInt("ID");
         }
		return contentItemId;
	}
	
	public boolean isArtifactData(int contentItemId) throws SQLException {
		String qry ="SELECT * FROM ARTIFACT WHERE content_item_id = "+contentItemId;
		int i = 0;
		boolean flag = false;
		PreparedStatement pst;
		Connection con=ConnectionProvider.getCon();
        pst = con.prepareStatement(qry);
        ResultSet rs =pst.executeQuery();
        while(rs.next()){
        	i++;
        	if (i == 2 || i == 3) {
        		flag = true;
        	}
         }
		return flag;
	}

}
