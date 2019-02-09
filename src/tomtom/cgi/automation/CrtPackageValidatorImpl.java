package tomtom.cgi.automation;

import java.sql.SQLException;

public class CrtPackageValidatorImpl {
	
	String uri = "";
	String version = "";
	
	public void checkPhillyRecords (String skus) throws SQLException {
		CrtPackageDAO crtPackageDAO = new CrtPackageDAO();
		int productID = crtPackageDAO.getProductId(skus);
		String uriAndVersion = crtPackageDAO.getUriAndVersion(productID);
		String[] words=uriAndVersion.split(",");
		uri = words[0];
		version = words[1];
		int contentItemId = crtPackageDAO.getContentItemId(uri, version);
		if (crtPackageDAO.isArtifactData(contentItemId)) {
			System.out.println("Passed for this SKU");
		} else {
			System.out.println("***********Failed for this " +skus);
		}
	}

}
