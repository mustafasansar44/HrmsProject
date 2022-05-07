package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.core.utilities.verification.result.SuccessDataResult;
import kodlamaio.hrms.core.utilities.verification.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.dataAccess.abstracts.RoleDao;
import kodlamaio.hrms.entities.abstracts.Candidate;
import kodlamaio.hrms.entities.abstracts.Role;
import kodlamaio.hrms.entities.dtos.CandidateCvDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    private ModelMapper modelMapper;
    private RoleDao roleDao;


    public CandidateManager(CandidateDao candidateDao, ModelMapper modelMapper, RoleDao roleDao){
        this.candidateDao = candidateDao;
        this.modelMapper = modelMapper;
        this.roleDao = roleDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<>(this.candidateDao.findAll(), "Veri listelendi.");
    }

    @Override
    public DataResult<Candidate> getByFirstName(String firstName) {
        return new SuccessDataResult<>(this.candidateDao.getByFirstName(firstName));
    }

    @Override
    public Result add(Candidate candidate) {
        this.candidateDao.save(candidate); // Burada default role = 1 olarak kaydedecez.
        return new SuccessResult("Veri kaydedildi.");
    }

    @Override
    public List<CandidateCvDto> findAll() {
        List<Candidate> candidates = this.candidateDao.findAll();
        List<CandidateCvDto> candidateCvDtos = candidates.stream().map(candidate -> this.modelMapper.map(candidate, CandidateCvDto.class)).collect(Collectors.toList());
        return candidateCvDtos;
    }

    @Override
    public Result updateCandidate(Candidate candidate) {
        Candidate newCandidate = this.candidateDao.findAllById(candidate.getId());
        newCandidate.setFirstName(candidate.getFirstName());
        newCandidate.setLastName(candidate.getLastName());
        newCandidate.setEmail(candidate.getEmail());
        newCandidate.setPassword(candidate.getPassword());
        this.candidateDao.save(newCandidate);
        return new Result(true, "Veri güncellendi.");
    }

    @Override
    public Candidate findAllById(int id) {
        return this.candidateDao.findAllById(id);
    }


}


