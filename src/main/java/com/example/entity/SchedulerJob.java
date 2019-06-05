package com.example.entity;

import java.io.Serializable;

public class SchedulerJob implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_job.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_job.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scheduler_job.user_job
     *
     * @mbggenerated
     */
    private String userJob;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scheduler_job
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_job.user_id
     *
     * @return the value of scheduler_job.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_job.user_id
     *
     * @param userId the value for scheduler_job.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_job.user_name
     *
     * @return the value of scheduler_job.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_job.user_name
     *
     * @param userName the value for scheduler_job.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scheduler_job.user_job
     *
     * @return the value of scheduler_job.user_job
     *
     * @mbggenerated
     */
    public String getUserJob() {
        return userJob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scheduler_job.user_job
     *
     * @param userJob the value for scheduler_job.user_job
     *
     * @mbggenerated
     */
    public void setUserJob(String userJob) {
        this.userJob = userJob == null ? null : userJob.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduler_job
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userJob=").append(userJob);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}