package com.example.demo.service;


import com.example.demo.model.TidmAgrBnf;
import com.example.demo.repository.TidmAgrBnfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TidmAgrBnfService {

    @Autowired
    private TidmAgrBnfRepository tidmAgrBnfRepository;

    public List<TidmAgrBnf> getAll() {
        List<TidmAgrBnf> tidmAgrBnf = tidmAgrBnfRepository.findAll();
        return tidmAgrBnf;
    }

    public TidmAgrBnf getById(Long agrId){
        return tidmAgrBnfRepository.getOne(agrId);
    }

    public void put(TidmAgrBnf tidmAgrBnf){
        tidmAgrBnfRepository.save(tidmAgrBnf);
    }

    public void putAll(List<TidmAgrBnf> tidmAgrBnfs){
        tidmAgrBnfs.forEach(record->tidmAgrBnfRepository.save(record));
    }

    public void update(TidmAgrBnf tidmAgrBnf){
        TidmAgrBnf tidmAgrBnfUpdated=tidmAgrBnfRepository.getOne(tidmAgrBnf.getAgrId());
        tidmAgrBnfUpdated.setAgrBnfSqnNu(tidmAgrBnf.getAgrBnfSqnNu());
        tidmAgrBnfUpdated.setBnfAsOfDt(tidmAgrBnf.getBnfAsOfDt());
        tidmAgrBnfUpdated.setBnfBthDt(tidmAgrBnf.getBnfBthDt());
        tidmAgrBnfUpdated.setBnfDsgDt(tidmAgrBnf.getBnfDsgDt());
        tidmAgrBnfUpdated.setBnfFstNm(tidmAgrBnf.getBnfFstNm());
        tidmAgrBnfUpdated.setBnfLstMntDt(tidmAgrBnf.getBnfLstMntDt());
        tidmAgrBnfUpdated.setBnfLstMntUsrId(tidmAgrBnf.getBnfLstMntUsrId());
        tidmAgrBnfUpdated.setBnfLstNm(tidmAgrBnf.getBnfLstNm());
        tidmAgrBnfUpdated.setBnfMidNm(tidmAgrBnf.getBnfMidNm());
        tidmAgrBnfUpdated.setBnfRspTypCd(tidmAgrBnf.getBnfRspTypCd());
        tidmAgrBnfUpdated.setBnfRspTypTx(tidmAgrBnf.getBnfRspTypTx());
        tidmAgrBnfUpdated.setBnfSfxNm(tidmAgrBnf.getBnfSfxNm());
        tidmAgrBnfUpdated.setBnfTaxIdNu(tidmAgrBnf.getBnfTaxIdNu());
        tidmAgrBnfUpdated.setBnfTaxIdTypCd(tidmAgrBnf.getBnfTaxIdTypCd());
        tidmAgrBnfUpdated.setBnfTodIn(tidmAgrBnf.getBnfTodIn());
        tidmAgrBnfUpdated.setBnfTotAstRt(tidmAgrBnf.getBnfTotAstRt());
        tidmAgrBnfUpdated.setBnfTypCd(tidmAgrBnf.getBnfTypCd());
        tidmAgrBnfUpdated.setLtsUpdUsrNu(tidmAgrBnf.getOrgUsrNu());
        tidmAgrBnfUpdated.setLtsUpdUsrTs(tidmAgrBnf.getOrgUsrAcvTs());
        tidmAgrBnfUpdated.setOrgUsrAcvTs(tidmAgrBnf.getOrgUsrAcvTs());
        tidmAgrBnfUpdated.setOrgUsrNu(tidmAgrBnf.getOrgUsrNu());
        tidmAgrBnfRepository.save(tidmAgrBnfUpdated);
    }

    public void delete(Long agrId){
        tidmAgrBnfRepository.deleteById(agrId);
    }
}
