package com.activity.mapper;

import com.activity.po.ActFileInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ActFileInfoMapper {
    @Delete({
        "delete from act_file_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into act_file_info (id, act_id, ",
        "act_file_name, act_file_url, ",
        "act_file_type, act_class, ",
        "uploadtime, act_file_size, ",
        "act_file_explain, act_file_status, ",
        "act_file_creater, act_small_file_url)",
        "values (#{id,jdbcType=BIGINT}, #{actId,jdbcType=BIGINT}, ",
        "#{actFileName,jdbcType=VARCHAR}, #{actFileUrl,jdbcType=VARCHAR}, ",
        "#{actFileType,jdbcType=VARCHAR}, #{actClass,jdbcType=INTEGER}, ",
        "#{uploadtime,jdbcType=TIMESTAMP}, #{actFileSize,jdbcType=INTEGER}, ",
        "#{actFileExplain,jdbcType=VARCHAR}, #{actFileStatus,jdbcType=INTEGER}, ",
        "#{actFileCreater,jdbcType=VARCHAR}, #{actSmallFileUrl,jdbcType=VARCHAR})"
    })
    int insert(ActFileInfo record);

    int insertSelective(ActFileInfo record);

    @Select({
        "select",
        "id, act_id, act_file_name, act_file_url, act_file_type, act_class, uploadtime, ",
        "act_file_size, act_file_explain, act_file_status, act_file_creater, act_small_file_url",
        "from act_file_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.activity.mapper.ActFileInfoMapper.BaseResultMap")
    ActFileInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ActFileInfo record);

    @Update({
        "update act_file_info",
        "set act_id = #{actId,jdbcType=BIGINT},",
          "act_file_name = #{actFileName,jdbcType=VARCHAR},",
          "act_file_url = #{actFileUrl,jdbcType=VARCHAR},",
          "act_file_type = #{actFileType,jdbcType=VARCHAR},",
          "act_class = #{actClass,jdbcType=INTEGER},",
          "uploadtime = #{uploadtime,jdbcType=TIMESTAMP},",
          "act_file_size = #{actFileSize,jdbcType=INTEGER},",
          "act_file_explain = #{actFileExplain,jdbcType=VARCHAR},",
          "act_file_status = #{actFileStatus,jdbcType=INTEGER},",
          "act_file_creater = #{actFileCreater,jdbcType=VARCHAR},",
          "act_small_file_url = #{actSmallFileUrl,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ActFileInfo record);
}