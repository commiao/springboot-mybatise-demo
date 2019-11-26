package com.activity.po;

import com.common.entity.BaseBean;
import java.util.Date;

public class ActFileInfo extends BaseBean {
    private Long id;

    private Long actId;

    private String actFileName;

    private String actFileUrl;

    private String actFileType;

    private Integer actClass;

    private Date uploadtime;

    private Integer actFileSize;

    private String actFileExplain;

    private Integer actFileStatus;

    private String actFileCreater;

    private String actSmallFileUrl;

    public ActFileInfo(Long id, Long actId, String actFileName, String actFileUrl, String actFileType, Integer actClass, Date uploadtime, Integer actFileSize, String actFileExplain, Integer actFileStatus, String actFileCreater, String actSmallFileUrl) {
        this.id = id;
        this.actId = actId;
        this.actFileName = actFileName;
        this.actFileUrl = actFileUrl;
        this.actFileType = actFileType;
        this.actClass = actClass;
        this.uploadtime = uploadtime;
        this.actFileSize = actFileSize;
        this.actFileExplain = actFileExplain;
        this.actFileStatus = actFileStatus;
        this.actFileCreater = actFileCreater;
        this.actSmallFileUrl = actSmallFileUrl;
    }

    public Long getId() {
        return id;
    }

    public Long getActId() {
        return actId;
    }

    public String getActFileName() {
        return actFileName;
    }

    public String getActFileUrl() {
        return actFileUrl;
    }

    public String getActFileType() {
        return actFileType;
    }

    public Integer getActClass() {
        return actClass;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public Integer getActFileSize() {
        return actFileSize;
    }

    public String getActFileExplain() {
        return actFileExplain;
    }

    public Integer getActFileStatus() {
        return actFileStatus;
    }

    public String getActFileCreater() {
        return actFileCreater;
    }

    public String getActSmallFileUrl() {
        return actSmallFileUrl;
    }
}