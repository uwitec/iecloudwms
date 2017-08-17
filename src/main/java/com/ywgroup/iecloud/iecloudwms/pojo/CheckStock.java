package com.ywgroup.iecloud.iecloudwms.pojo;

import java.util.Date;

public class CheckStock {
    private Integer id;

    private String ordernum;

    private Integer checktype;

    private Integer producttype;

    private String storagenum;

    private String contractorder;

    private Integer status;

    private Double localqty;

    private Double checkqty;

    private Integer isdelete;

    private Integer iscomplete;

    private Date createtime;

    private String createuser;

    private String audituser;

    private Date auditetime;

    private String printuser;

    private Date printtime;

    private String reason;

    private Integer operatetype;

    private String equipmentnum;

    private String equipmentcode;

    private String remark;

    public CheckStock(Integer id, String ordernum, Integer checktype, Integer producttype, String storagenum, String contractorder, Integer status, Double localqty, Double checkqty, Integer isdelete, Integer iscomplete, Date createtime, String createuser, String audituser, Date auditetime, String printuser, Date printtime, String reason, Integer operatetype, String equipmentnum, String equipmentcode, String remark) {
        this.id = id;
        this.ordernum = ordernum;
        this.checktype = checktype;
        this.producttype = producttype;
        this.storagenum = storagenum;
        this.contractorder = contractorder;
        this.status = status;
        this.localqty = localqty;
        this.checkqty = checkqty;
        this.isdelete = isdelete;
        this.iscomplete = iscomplete;
        this.createtime = createtime;
        this.createuser = createuser;
        this.audituser = audituser;
        this.auditetime = auditetime;
        this.printuser = printuser;
        this.printtime = printtime;
        this.reason = reason;
        this.operatetype = operatetype;
        this.equipmentnum = equipmentnum;
        this.equipmentcode = equipmentcode;
        this.remark = remark;
    }

    public CheckStock() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public Integer getChecktype() {
        return checktype;
    }

    public void setChecktype(Integer checktype) {
        this.checktype = checktype;
    }

    public Integer getProducttype() {
        return producttype;
    }

    public void setProducttype(Integer producttype) {
        this.producttype = producttype;
    }

    public String getStoragenum() {
        return storagenum;
    }

    public void setStoragenum(String storagenum) {
        this.storagenum = storagenum == null ? null : storagenum.trim();
    }

    public String getContractorder() {
        return contractorder;
    }

    public void setContractorder(String contractorder) {
        this.contractorder = contractorder == null ? null : contractorder.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getLocalqty() {
        return localqty;
    }

    public void setLocalqty(Double localqty) {
        this.localqty = localqty;
    }

    public Double getCheckqty() {
        return checkqty;
    }

    public void setCheckqty(Double checkqty) {
        this.checkqty = checkqty;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(Integer iscomplete) {
        this.iscomplete = iscomplete;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public String getAudituser() {
        return audituser;
    }

    public void setAudituser(String audituser) {
        this.audituser = audituser == null ? null : audituser.trim();
    }

    public Date getAuditetime() {
        return auditetime;
    }

    public void setAuditetime(Date auditetime) {
        this.auditetime = auditetime;
    }

    public String getPrintuser() {
        return printuser;
    }

    public void setPrintuser(String printuser) {
        this.printuser = printuser == null ? null : printuser.trim();
    }

    public Date getPrinttime() {
        return printtime;
    }

    public void setPrinttime(Date printtime) {
        this.printtime = printtime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getOperatetype() {
        return operatetype;
    }

    public void setOperatetype(Integer operatetype) {
        this.operatetype = operatetype;
    }

    public String getEquipmentnum() {
        return equipmentnum;
    }

    public void setEquipmentnum(String equipmentnum) {
        this.equipmentnum = equipmentnum == null ? null : equipmentnum.trim();
    }

    public String getEquipmentcode() {
        return equipmentcode;
    }

    public void setEquipmentcode(String equipmentcode) {
        this.equipmentcode = equipmentcode == null ? null : equipmentcode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}