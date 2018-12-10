package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "tidm_agr_bnf")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TidmAgrBnf implements Serializable{

    @Id
    @Column(name = "agr_id")
    //@GeneratedValue
    private Long agrId;

    @Column(name="bnf_as_of_dt")
    private Date bnfAsOfDt;

    @Column(name="agr_bnf_sqn_nu")
    private int agrBnfSqnNu;

    @Column(name="bnf_fst_nm")
    private String bnfFstNm;

    @Column(name = "bnf_mid_nm")
    private String bnfMidNm;

    @Column(name ="bnf_lst_nm")
    private String bnfLstNm;

    @Column(name="bnf_sfx_nm")
    private String bnfSfxNm;

    @Column(name="bnf_tax_id_nu")
    private String bnfTaxIdNu;

    @Column(name = "bnf_tax_id_typ_cd")
    private String bnfTaxIdTypCd;

    @Column(name = "bnf_bth_dt")
    private Date bnfBthDt;

    @Column(name = "bnf_dsg_dt")
    private Date bnfDsgDt;

    @Column(name="bnf_tot_ast_rt")
    private Long bnfTotAstRt;

    @Column(name = "bnf_typ_cd")
    private String bnfTypCd;

    @Column(name = "bnf_rsp_typ_cd")
    private String bnfRspTypCd;

    @Column(name = "bnf_rsp_typ_tx")
    private String bnfRspTypTx;

    @Column(name = "bnf_tod_in")
    private String bnfTodIn;

    @Column(name = "bnf_lst_mnt_usr_id")
    private String bnfLstMntUsrId;

    @Column(name = "bnf_lst_mnt_dt")
    private Date bnfLstMntDt;

    @Column(name = "org_usr_nu")
    private String orgUsrNu;

    @Column(name = "org_usr_acv_ts")
    private Timestamp orgUsrAcvTs;

    @Column(name = "lts_upd_usr_nu")
    private String ltsUpdUsrNu;

    @Column(name = "lts_upd_usr_ts")
    private Timestamp ltsUpdUsrTs;


    @Override
    public String toString() {
        return "TidmAgrBnf{" +
                "agrId=" + agrId +
                ", bnfAsOfDt=" + bnfAsOfDt +
                ", agrBnfSqnNu=" + agrBnfSqnNu +
                ", bnfFstNm='" + bnfFstNm + '\'' +
                ", bnfMidNm='" + bnfMidNm + '\'' +
                ", bnfLstNm='" + bnfLstNm + '\'' +
                ", bnfSfxNm='" + bnfSfxNm + '\'' +
                ", bnfTaxIdNu='" + bnfTaxIdNu + '\'' +
                ", bnfTaxIdTypCd='" + bnfTaxIdTypCd + '\'' +
                ", bnfBthDt=" + bnfBthDt +
                ", bnfDsgDt=" + bnfDsgDt +
                ", bnfTotAstRt=" + bnfTotAstRt +
                ", bnfTypCd='" + bnfTypCd + '\'' +
                ", bnfRspTypCd='" + bnfRspTypCd + '\'' +
                ", bnfRspTypTx='" + bnfRspTypTx + '\'' +
                ", bnfTodIn='" + bnfTodIn + '\'' +
                ", bnfLstMntUsrId='" + bnfLstMntUsrId + '\'' +
                ", bnfLstMntDt=" + bnfLstMntDt +
                ", orgUsrNu='" + orgUsrNu + '\'' +
                ", orgUsrAcvTs=" + orgUsrAcvTs +
                ", ltsUpdUsrNu='" + ltsUpdUsrNu + '\'' +
                ", ltsUpdUsrTs=" + ltsUpdUsrTs +
                '}';
    }
}
