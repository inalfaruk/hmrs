package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	
	
	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

}
