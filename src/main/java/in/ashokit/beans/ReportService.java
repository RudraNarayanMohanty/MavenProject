package in.ashokit.beans;

import org.springframework.stereotype.Service;

@Service
public class ReportService {

	/*
	 * @Autowired private ReportDAO dao;
	 * 
	 * @Autowired is used at field level here for DI
	 */
	/*
	 * @Qualifier It is used to identify the bean based on the given name for DI
	 * ex: @Qualifier("mysqlDAO")
	 * 
	 */

	private ReportDao dao;

	/*
	 * here to constructor are present so we used @Autowired in one of the
	 * constructor public ReportService() {
	 * System.out.println("ReportService:: o param Constructor"); }
	 * 
	 * @Autowired public ReportService(ReportDAO dao) {
	 * System.out.println("ReportService:: param Constructor"); this.dao = dao; }
	 */
	/*
	 * Here @Autowired is constructor level for DI
	 * 
	 * @Autowired optional for only one constructor present in the class for
	 * injection
	 */

	// @Autowired
	public ReportService(ReportDao dao) {
		System.out.println("ReportService:: param Constructor");
		this.dao = dao;
	}

	// Here @Autowired is used in setter level
	/*
	 * @Autowired public void setDao(ReportDAO dao) {
	 * System.out.println("setter method called..."); this.dao = dao; }
	 */

	public void generateReport() {
		dao.getData();
		System.out.println("Report generated.........");
	}

}
