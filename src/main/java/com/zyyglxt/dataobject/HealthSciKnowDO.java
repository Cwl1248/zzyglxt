package com.zyyglxt.dataobject;

import java.util.Date;

public class HealthSciKnowDO extends HealthSciKnowDOKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_NAME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String scienceKnowledgeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_SOURCE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String scienceKnowledgeSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_AUTHOR
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String scienceKnowledgeAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_health_care_sci_know.VISIT_NUM
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Integer visitNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_STATUS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String scienceKnowledgeStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_health_care_sci_know.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_health_care_sci_know.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Date itemcreateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_health_care_sci_know.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String updater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_health_care_sci_know.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Date itemupdateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_health_care_sci_know.CONTENT
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_NAME
     *
     * @return the value of tb_health_care_sci_know.SCIENCE_KNOWLEDGE_NAME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getScienceKnowledgeName() {
        return scienceKnowledgeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_NAME
     *
     * @param scienceKnowledgeName the value for tb_health_care_sci_know.SCIENCE_KNOWLEDGE_NAME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setScienceKnowledgeName(String scienceKnowledgeName) {
        this.scienceKnowledgeName = scienceKnowledgeName == null ? null : scienceKnowledgeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_SOURCE
     *
     * @return the value of tb_health_care_sci_know.SCIENCE_KNOWLEDGE_SOURCE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getScienceKnowledgeSource() {
        return scienceKnowledgeSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_SOURCE
     *
     * @param scienceKnowledgeSource the value for tb_health_care_sci_know.SCIENCE_KNOWLEDGE_SOURCE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setScienceKnowledgeSource(String scienceKnowledgeSource) {
        this.scienceKnowledgeSource = scienceKnowledgeSource == null ? null : scienceKnowledgeSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_AUTHOR
     *
     * @return the value of tb_health_care_sci_know.SCIENCE_KNOWLEDGE_AUTHOR
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getScienceKnowledgeAuthor() {
        return scienceKnowledgeAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_AUTHOR
     *
     * @param scienceKnowledgeAuthor the value for tb_health_care_sci_know.SCIENCE_KNOWLEDGE_AUTHOR
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setScienceKnowledgeAuthor(String scienceKnowledgeAuthor) {
        this.scienceKnowledgeAuthor = scienceKnowledgeAuthor == null ? null : scienceKnowledgeAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_health_care_sci_know.VISIT_NUM
     *
     * @return the value of tb_health_care_sci_know.VISIT_NUM
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Integer getVisitNum() {
        return visitNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_health_care_sci_know.VISIT_NUM
     *
     * @param visitNum the value for tb_health_care_sci_know.VISIT_NUM
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_STATUS
     *
     * @return the value of tb_health_care_sci_know.SCIENCE_KNOWLEDGE_STATUS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getScienceKnowledgeStatus() {
        return scienceKnowledgeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_health_care_sci_know.SCIENCE_KNOWLEDGE_STATUS
     *
     * @param scienceKnowledgeStatus the value for tb_health_care_sci_know.SCIENCE_KNOWLEDGE_STATUS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setScienceKnowledgeStatus(String scienceKnowledgeStatus) {
        this.scienceKnowledgeStatus = scienceKnowledgeStatus == null ? null : scienceKnowledgeStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_health_care_sci_know.CREATER
     *
     * @return the value of tb_health_care_sci_know.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_health_care_sci_know.CREATER
     *
     * @param creater the value for tb_health_care_sci_know.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_health_care_sci_know.itemCreateAt
     *
     * @return the value of tb_health_care_sci_know.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Date getItemcreateat() {
        return itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_health_care_sci_know.itemCreateAt
     *
     * @param itemcreateat the value for tb_health_care_sci_know.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemcreateat(Date itemcreateat) {
        this.itemcreateat = itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_health_care_sci_know.UPDATER
     *
     * @return the value of tb_health_care_sci_know.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_health_care_sci_know.UPDATER
     *
     * @param updater the value for tb_health_care_sci_know.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_health_care_sci_know.itemUpdateAt
     *
     * @return the value of tb_health_care_sci_know.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Date getItemupdateat() {
        return itemupdateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_health_care_sci_know.itemUpdateAt
     *
     * @param itemupdateat the value for tb_health_care_sci_know.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemupdateat(Date itemupdateat) {
        this.itemupdateat = itemupdateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_health_care_sci_know.CONTENT
     *
     * @return the value of tb_health_care_sci_know.CONTENT
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_health_care_sci_know.CONTENT
     *
     * @param content the value for tb_health_care_sci_know.CONTENT
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}