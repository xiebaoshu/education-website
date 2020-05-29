package com.atguigu.eduservice.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CourseQuery {
    @ApiModelProperty("课程名称")
    private String title;
    @ApiModelProperty("是否发布")
    private String status;
}
