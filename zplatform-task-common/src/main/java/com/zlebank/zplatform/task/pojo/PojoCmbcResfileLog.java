package com.zlebank.zplatform.task.pojo;

// Generated 2016-10-25 16:22:02 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.zlebank.zplatform.task.bean.SingleReexchangeBean;

/**
 * TCmbcResfileLog generated by hbm2java
 */
@Entity
@Table(name = "T_CMBC_RESFILE_LOG")
public class PojoCmbcResfileLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1144182124522153649L;
	private long tid;
	private String banktrandataseqno;
	private String banktranresno;
	private String accno;
	private String accname;
	private Long tranamt;
	private String restype;
	private String rescode;
	private String resinfo;
	private String paydate;
	private String paydatetime;
	private String banktranbatchno;
	private String reexchangedate;
	private String billdate;
	private String busicode;

	public PojoCmbcResfileLog() {
	}

	public PojoCmbcResfileLog(long tid) {
		this.tid = tid;
	}

	public PojoCmbcResfileLog(long tid, String banktrandataseqno,
			String banktranresno, String accno, String accname, Long tranamt,
			String restype, String rescode, String resinfo, String paydate,
			String paydatetime, String banktranbatchno, String reexchangedate,
			String billdate, String busicode) {
		this.tid = tid;
		this.banktrandataseqno = banktrandataseqno;
		this.banktranresno = banktranresno;
		this.accno = accno;
		this.accname = accname;
		this.tranamt = tranamt;
		this.restype = restype;
		this.rescode = rescode;
		this.resinfo = resinfo;
		this.paydate = paydate;
		this.paydatetime = paydatetime;
		this.banktranbatchno = banktranbatchno;
		this.reexchangedate = reexchangedate;
		this.billdate = billdate;
		this.busicode = busicode;
	}
	public PojoCmbcResfileLog(SingleReexchangeBean bean) {
		
		this.banktrandataseqno = bean.getTranId();
		this.banktranresno = bean.getBankTranId();
		this.accno = bean.getAccNo();
		this.accname = bean.getAccName();
		this.tranamt = Long.valueOf(bean.getTransAmt());
		this.restype = bean.getRespType();
		this.rescode = bean.getRespCode();
		this.resinfo = bean.getRespMsg();
		this.paydate = "";
		this.paydatetime = "";
		this.banktranbatchno = "";
		this.reexchangedate = bean.getReexchangeDate();
		this.billdate = bean.getBankBillDate();
		this.busicode = bean.getBusiCode();
	}
	@GenericGenerator(name = "id_gen", strategy = "enhanced-table", parameters = {
            @Parameter(name = "table_name", value = "T_C_PRIMAY_KEY"),
            @Parameter(name = "value_column_name", value = "NEXT_ID"),
            @Parameter(name = "segment_column_name", value = "KEY_NAME"),
            @Parameter(name = "segment_value", value = "T_CMBC_RESFILE_LOG"),
            @Parameter(name = "increment_size", value = "1"),
            @Parameter(name = "optimizer", value = "pooled-lo") })
    @Id
    @GeneratedValue(generator = "id_gen")
    @Column(name = "TID")
	public long getTid() {
		return this.tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	@Column(name = "BANKTRANDATASEQNO", length = 32)
	public String getBanktrandataseqno() {
		return this.banktrandataseqno;
	}

	public void setBanktrandataseqno(String banktrandataseqno) {
		this.banktrandataseqno = banktrandataseqno;
	}

	@Column(name = "BANKTRANRESNO", length = 32)
	public String getBanktranresno() {
		return this.banktranresno;
	}

	public void setBanktranresno(String banktranresno) {
		this.banktranresno = banktranresno;
	}

	@Column(name = "ACCNO", length = 32)
	public String getAccno() {
		return this.accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	@Column(name = "ACCNAME", length = 128)
	public String getAccname() {
		return this.accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	@Column(name = "TRANAMT", precision = 12, scale = 0)
	public Long getTranamt() {
		return this.tranamt;
	}

	public void setTranamt(Long tranamt) {
		this.tranamt = tranamt;
	}

	@Column(name = "RESTYPE", length = 2)
	public String getRestype() {
		return this.restype;
	}

	public void setRestype(String restype) {
		this.restype = restype;
	}

	@Column(name = "RESCODE", length = 8)
	public String getRescode() {
		return this.rescode;
	}

	public void setRescode(String rescode) {
		this.rescode = rescode;
	}

	@Column(name = "RESINFO", length = 64)
	public String getResinfo() {
		return this.resinfo;
	}

	public void setResinfo(String resinfo) {
		this.resinfo = resinfo;
	}

	@Column(name = "PAYDATE", length = 8)
	public String getPaydate() {
		return this.paydate;
	}

	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}

	@Column(name = "PAYDATETIME", length = 14)
	public String getPaydatetime() {
		return this.paydatetime;
	}

	public void setPaydatetime(String paydatetime) {
		this.paydatetime = paydatetime;
	}

	@Column(name = "BANKTRANBATCHNO", length = 32)
	public String getBanktranbatchno() {
		return this.banktranbatchno;
	}

	public void setBanktranbatchno(String banktranbatchno) {
		this.banktranbatchno = banktranbatchno;
	}

	@Column(name = "REEXCHANGEDATE", length = 8)
	public String getReexchangedate() {
		return this.reexchangedate;
	}

	public void setReexchangedate(String reexchangedate) {
		this.reexchangedate = reexchangedate;
	}

	@Column(name = "BILLDATE", length = 8)
	public String getBilldate() {
		return this.billdate;
	}

	public void setBilldate(String billdate) {
		this.billdate = billdate;
	}

	@Column(name = "BUSICODE", length = 4)
	public String getBusicode() {
		return this.busicode;
	}

	public void setBusicode(String busicode) {
		this.busicode = busicode;
	}

}
