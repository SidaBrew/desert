package com.system.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;

/***
 *  Created by shao.guangze on 2020/2/4
 */
public class Demo {

    public static void main(String[] args) {


        String aa = "hello";
        System.out.println( aa.indexOf('h',2));

        ArrayList<Manager> a = new ArrayList<Manager>();
        String jsonDate ="{\n" +
                "    \"_id\" : \"ed1574668485117_561\",\n" +
                "    \"file_path\" : \"/dataplus/ceed1d2370be16f2dfcbea06c8035f2f\",\n" +
                "    \"gmt8_created\" : \"2019-11-25 15:54:45:119\",\n" +
                "    \"service_id\" : \"extract_GGCZ_1570867344275\",\n" +
                "    \"model_id\" : \"gaoguancizhi\",\n" +
                "    \"doc_id\" : \"md1573700885395_744\",\n" +
                "    \"content\" : {\n" +
                "        \"gaoguancizhi\" : {\n" +
                "            \"comment\" : \"高管辞职\",\n" +
                "            \"final_result\" : \"extract\",\n" +
                "            \"index\" : 8,\n" +
                "            \"intermediate\" : {\n" +
                "                \"normal\" : {\n" +
                "                    \"display_type\" : \"TABLE2\",\n" +
                "                    \"display_title\" : \"归一化结果\",\n" +
                "                    \"index\" : 1,\n" +
                "                    \"detail\" : {\n" +
                "                        \"gmt8_created\" : \"2019-11-25 15:54:42:885\",\n" +
                "                        \"group_id\" : \"ds1573700876039_080\",\n" +
                "                        \"header\" : {\n" +
                "                            \"schema\" : {\n" +
                "                                \"resignation_reason\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 6.1,\n" +
                "                                    \"comment\" : \"离职原因\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"resignation_reason\"\n" +
                "                                },\n" +
                "                                \"agent\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 14.1,\n" +
                "                                    \"comment\" : \"代理人\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"agent\"\n" +
                "                                },\n" +
                "                                \"successor\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 12.1,\n" +
                "                                    \"comment\" : \"继任者\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"successor\"\n" +
                "                                },\n" +
                "                                \"h_name\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 0.1,\n" +
                "                                    \"comment\" : \"高管姓名\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"h_name\"\n" +
                "                                },\n" +
                "                                \"gender\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 2.1,\n" +
                "                                    \"comment\" : \"性别\",\n" +
                "                                    \"type\" : \"enum\",\n" +
                "                                    \"field_name\" : \"gender\"\n" +
                "                                },\n" +
                "                                \"resignation_position\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 8.1,\n" +
                "                                    \"comment\" : \"离职岗位\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"resignation_position\"\n" +
                "                                },\n" +
                "                                \"successor_resume\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 16.1,\n" +
                "                                    \"comment\" : \"继任者/代理人简历\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"successor_resume\"\n" +
                "                                },\n" +
                "                                \"resignation_time\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 4.1,\n" +
                "                                    \"comment\" : \"离职时间\",\n" +
                "                                    \"type\" : \"date\",\n" +
                "                                    \"field_name\" : \"resignation_time\"\n" +
                "                                },\n" +
                "                                \"remain_position\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 10.1,\n" +
                "                                    \"comment\" : \"留任岗位\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"remain_position\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"index\" : 8,\n" +
                "                            \"comment\" : \"高管辞职\",\n" +
                "                            \"model_id\" : \"gaoguancizhi\"\n" +
                "                        },\n" +
                "                        \"_id\" : \"md1573700885395_744__gaoguancizhi\",\n" +
                "                        \"model_id\" : \"gaoguancizhi\",\n" +
                "                        \"concat\" : [],\n" +
                "                        \"doc_id\" : \"md1573700885395_744\",\n" +
                "                        \"content\" : [ \n" +
                "                            {\n" +
                "                                \"h_name\" : [ \n" +
                "                                    {\n" +
                "                                        \"err_msg\" : \"\",\n" +
                "                                        \"error\" : \"0\",\n" +
                "                                        \"value\" : \"张锦楠\",\n" +
                "                                        \"label\" : 2\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"gender\" : [ \n" +
                "                                    {\n" +
                "                                        \"err_msg\" : \"\",\n" +
                "                                        \"error\" : \"0\",\n" +
                "                                        \"value\" : \"先生\",\n" +
                "                                        \"label\" : 2\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"resignation_position\" : [ \n" +
                "                                    {\n" +
                "                                        \"err_msg\" : \"\",\n" +
                "                                        \"error\" : \"0\",\n" +
                "                                        \"value\" : \"副总经理\",\n" +
                "                                        \"label\" : 2\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"successor\" : [ \n" +
                "                                    {\n" +
                "                                        \"err_msg\" : \"\",\n" +
                "                                        \"error\" : \"0\",\n" +
                "                                        \"value\" : \"陈杰\",\n" +
                "                                        \"label\" : 2\n" +
                "                                    }, \n" +
                "                                    {\n" +
                "                                        \"err_msg\" : \"\",\n" +
                "                                        \"error\" : \"0\",\n" +
                "                                        \"value\" : \"郭文辉\",\n" +
                "                                        \"label\" : 2\n" +
                "                                    }, \n" +
                "                                    {\n" +
                "                                        \"err_msg\" : \"\",\n" +
                "                                        \"error\" : \"0\",\n" +
                "                                        \"value\" : \"赵建民\",\n" +
                "                                        \"label\" : 2\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"successor_resume\" : [ \n" +
                "                                    {\n" +
                "                                        \"err_msg\" : \"\",\n" +
                "                                        \"error\" : \"0\",\n" +
                "                                        \"value\" : \"（5）陈杰，男，1986年出生，中国国籍，无境外长期居留权，毕业于中国青年政治学院法律系，法学学士学位，拥有深圳证券交易所董事会秘书任职资格。曾任公司证券事务代表，上海泰胜电力工程机械有限公司董事会办公室秘书。现任公司副总经理、董事会秘书。\",\n" +
                "                                        \"label\" : 2\n" +
                "                                    }, \n" +
                "                                    {\n" +
                "                                        \"err_msg\" : \"\",\n" +
                "                                        \"error\" : \"0\",\n" +
                "                                        \"value\" : \"（4）郭文辉，男，1968年出生，中国国籍，无境外长期居留权，毕业于大连铁道学院焊接工艺及设备专业，工学学士学位，拥有高级工程师职称、注册国际焊接工程师资格证书、国际焊接检验师资格证书。近年来在中国科技核心期刊发表专业论文 6 篇，拥有 5项实用新型专利。所负责的 SEW 3.6MW 90mm风力发电机组塔架项目荣获 2016\",\n" +
                "                                        \"label\" : 2\n" +
                "                                    }, \n" +
                "                                    {\n" +
                "                                        \"err_msg\" : \"\",\n" +
                "                                        \"error\" : \"0\",\n" +
                "                                        \"value\" : \"（3）赵建民，男，1962年出生，中国国籍，无境外长期居留权，1986年毕业于北京有色金属研究总院研究生部，工学硕士学位。曾任公司市场营销总监、负责国际业务及市场开发，维斯塔斯风力技术（中国及亚太区）副总裁，维斯塔斯风力技术（中国）有限公司销售总监、副总裁，歌美飒风电（天津）有限公司中国区销售经理，GE 能源集团（中国）有限公司销售总监，科劳赛技术有限公司项目经理，三河麦卡力电池公司工厂厂长，东方电化学有限公司总工程师，北京有色金属研究总院工程师等职位。现任公司副总经理。\",\n" +
                "                                        \"label\" : 2\n" +
                "                                    }\n" +
                "                                ]\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"is_delete\" : 0,\n" +
                "                        \"gmt8_modified\" : \"2019-11-25 15:54:42:885\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"extract\" : {\n" +
                "                    \"display_type\" : \"TABLE1\",\n" +
                "                    \"display_title\" : \"模型抽取\",\n" +
                "                    \"index\" : 0,\n" +
                "                    \"detail\" : {\n" +
                "                        \"gmt8_created\" : \"2019-11-25 15:54:42:885\",\n" +
                "                        \"group_id\" : \"ds1573700876039_080\",\n" +
                "                        \"header\" : {\n" +
                "                            \"schema\" : {\n" +
                "                                \"resignation_reason\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 3,\n" +
                "                                    \"comment\" : \"离职原因\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"resignation_reason\"\n" +
                "                                },\n" +
                "                                \"agent\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 7,\n" +
                "                                    \"comment\" : \"代理人\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"agent\"\n" +
                "                                },\n" +
                "                                \"successor\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 6,\n" +
                "                                    \"comment\" : \"继任者\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"successor\"\n" +
                "                                },\n" +
                "                                \"h_name\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 0,\n" +
                "                                    \"comment\" : \"高管姓名\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"h_name\",\n" +
                "                                    \"associated_schema_ids\" : [ \n" +
                "                                        \"data_schema_1\", \n" +
                "                                        \"M_45872_MUYANG_TEST\"\n" +
                "                                    ],\n" +
                "                                    \"is_associated\" : 1\n" +
                "                                },\n" +
                "                                \"gender\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 1,\n" +
                "                                    \"comment\" : \"性别\",\n" +
                "                                    \"type\" : \"enum\",\n" +
                "                                    \"field_name\" : \"gender\",\n" +
                "                                    \"associated_schema_ids\" : [ \n" +
                "                                        \"M_45872_MUYANG_TEST\"\n" +
                "                                    ],\n" +
                "                                    \"is_associated\" : 1\n" +
                "                                },\n" +
                "                                \"resignation_position\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 4,\n" +
                "                                    \"comment\" : \"离职岗位\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"resignation_position\",\n" +
                "                                    \"associated_schema_ids\" : [ \n" +
                "                                        \"data_schema_7\"\n" +
                "                                    ],\n" +
                "                                    \"is_associated\" : 1\n" +
                "                                },\n" +
                "                                \"successor_resume\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 8,\n" +
                "                                    \"comment\" : \"继任者/代理人简历\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"successor_resume\"\n" +
                "                                },\n" +
                "                                \"resignation_time\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 2,\n" +
                "                                    \"comment\" : \"离职时间\",\n" +
                "                                    \"type\" : \"date\",\n" +
                "                                    \"field_name\" : \"resignation_time\",\n" +
                "                                    \"associated_schema_ids\" : [ \n" +
                "                                        \"M_45872_MUYANG_TEST\"\n" +
                "                                    ],\n" +
                "                                    \"is_associated\" : 1\n" +
                "                                },\n" +
                "                                \"remain_position\" : {\n" +
                "                                    \"is_null\" : 1,\n" +
                "                                    \"index\" : 5,\n" +
                "                                    \"comment\" : \"留任岗位\",\n" +
                "                                    \"type\" : \"text\",\n" +
                "                                    \"field_name\" : \"remain_position\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"index\" : 8,\n" +
                "                            \"comment\" : \"高管辞职\",\n" +
                "                            \"model_id\" : \"gaoguancizhi\"\n" +
                "                        },\n" +
                "                        \"_id\" : \"md1573700885395_744__gaoguancizhi\",\n" +
                "                        \"model_id\" : \"gaoguancizhi\",\n" +
                "                        \"concat\" : [],\n" +
                "                        \"doc_id\" : \"md1573700885395_744\",\n" +
                "                        \"content\" : [ \n" +
                "{\"h_name\" : [ \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 5,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 523.36,\n" +
                "                                            \"b\" : 457.3,\n" +
                "                                            \"t\" : 382.27997,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 26,\n" +
                "                                        \"value\" : \"张锦楠2\",\n" +
                "                                        \"node_id\" : \"_05\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"gender\" : [ \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 5,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 523.36,\n" +
                "                                            \"b\" : 457.3,\n" +
                "                                            \"t\" : 382.27997,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 26,\n" +
                "                                        \"value\" : \"先生2\",\n" +
                "                                        \"node_id\" : \"_05\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }\n" +
                "                                ]\n" +
                "},\n" +
                "                            {\n" +
                "                                \"h_name\" : [ \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 5,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 523.36,\n" +
                "                                            \"b\" : 457.3,\n" +
                "                                            \"t\" : 382.27997,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 26,\n" +
                "                                        \"value\" : \"张锦楠\",\n" +
                "                                        \"node_id\" : \"_05\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"gender\" : [ \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 5,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 523.36,\n" +
                "                                            \"b\" : 457.3,\n" +
                "                                            \"t\" : 382.27997,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 26,\n" +
                "                                        \"value\" : \"先生\",\n" +
                "                                        \"node_id\" : \"_05\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"resignation_position\" : [ \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 5,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 523.36,\n" +
                "                                            \"b\" : 457.3,\n" +
                "                                            \"t\" : 382.27997,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 22,\n" +
                "                                        \"value\" : \"副总经理\",\n" +
                "                                        \"node_id\" : \"_05\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"successor\" : [ \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 4,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 523.38,\n" +
                "                                            \"b\" : 371.3,\n" +
                "                                            \"t\" : 254.29999,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 125,\n" +
                "                                        \"value\" : \"陈杰\",\n" +
                "                                        \"node_id\" : \"_04\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }, \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 4,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 523.38,\n" +
                "                                            \"b\" : 371.3,\n" +
                "                                            \"t\" : 254.29999,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 112,\n" +
                "                                        \"value\" : \"郭文辉\",\n" +
                "                                        \"node_id\" : \"_04\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }, \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 4,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 523.38,\n" +
                "                                            \"b\" : 371.3,\n" +
                "                                            \"t\" : 254.29999,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 106,\n" +
                "                                        \"value\" : \"赵建民\",\n" +
                "                                        \"node_id\" : \"_04\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"successor_resume\" : [ \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 21,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 529.404,\n" +
                "                                            \"b\" : 285.8,\n" +
                "                                            \"t\" : 210.79999,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 0,\n" +
                "                                        \"value\" : \"（5）陈杰，男，1986年出生，中国国籍，无境外长期居留权，毕业于中国青年政治学院法律系，法学学士学位，拥有深圳证券交易所董事会秘书任职资格。曾任公司证券事务代表，上海泰胜电力工程机械有限公司董事会办公室秘书。现任公司副总经理、董事会秘书。\",\n" +
                "                                        \"node_id\" : \"_10_4\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }, \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 17,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 529.32,\n" +
                "                                            \"b\" : 748.86,\n" +
                "                                            \"t\" : 673.7799,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 0,\n" +
                "                                        \"value\" : \"（4）郭文辉，男，1968年出生，中国国籍，无境外长期居留权，毕业于大连铁道学院焊接工艺及设备专业，工学学士学位，拥有高级工程师职称、注册国际焊接工程师资格证书、国际焊接检验师资格证书。近年来在中国科技核心期刊发表专业论文 6 篇，拥有 5项实用新型专利。所负责的 SEW 3.6MW 90mm风力发电机组塔架项目荣获 2016\",\n" +
                "                                        \"node_id\" : \"_10_3\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }, \n" +
                "                                    {\n" +
                "                                        \"paragraph_offset\" : 15,\n" +
                "                                        \"loc\" : {\n" +
                "                                            \"r\" : 529.104,\n" +
                "                                            \"b\" : 593.86,\n" +
                "                                            \"t\" : 455.79996,\n" +
                "                                            \"l\" : 72\n" +
                "                                        },\n" +
                "                                        \"file_id\" : \"992ab20a645349778ed301345cda2e3d\",\n" +
                "                                        \"text_offset\" : 0,\n" +
                "                                        \"value\" : \"（3）赵建民，男，1962年出生，中国国籍，无境外长期居留权，1986年毕业于北京有色金属研究总院研究生部，工学硕士学位。曾任公司市场营销总监、负责国际业务及市场开发，维斯塔斯风力技术（中国及亚太区）副总裁，维斯塔斯风力技术（中国）有限公司销售总监、副总裁，歌美飒风电（天津）有限公司中国区销售经理，GE 能源集团（中国）有限公司销售总监，科劳赛技术有限公司项目经理，三河麦卡力电池公司工厂厂长，东方电化学有限公司总工程师，北京有色金属研究总院工程师等职位。现任公司副总经理。\",\n" +
                "                                        \"node_id\" : \"_10_2\",\n" +
                "                                        \"label\" : 0\n" +
                "                                    }\n" +
                "                                ]\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"is_delete\" : 0,\n" +
                "                        \"gmt8_modified\" : \"2019-11-25 15:54:42:885\"\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    },\n" +
                "    \"gmt8_modified\" : \"2019-11-25 15:54:45:119\",\n" +
                "    \"is_delete\" : 0\n" +
                "}";
        String date = "{\"association\":{\n" +
                "\"h_name_2\":\"h_name\",\n" +
                "\"gender_2\":\"gender\"\n" +
                "}}";


        JSONObject jsonObject = JSONObject.parseObject(jsonDate);
        JSONObject dateObject = JSONObject.parseObject(date);

        JSONObject content = jsonObject.getJSONObject("content");
        if(content!=null){
            JSONObject gaoguancizhi = content.getJSONObject("gaoguancizhi");
            if(gaoguancizhi!=null) {
                //System.out.println(gaoguancizhi.getString("final_result"));
                JSONObject intermediate = gaoguancizhi.getJSONObject("intermediate");
                if("extract".equals(gaoguancizhi.getString("final_result"))){
                    JSONObject extract = intermediate.getJSONObject("extract");
                    JSONObject detail = extract.getJSONObject("detail");
                    JSONArray detailContent = detail.getJSONArray("content");

                    for(int i=0;i<detailContent.size();i++) {

                        System.out.println(detailContent.getJSONObject(0));
                        if(detailContent.getJSONObject(0).equals( dateObject.getString("h_name_2"))){




                        }
                    }

//                    if(detailContent.getString("gender").equals( dateObject.getString("gender"))){
//
//                    }

                }else{

                    JSONObject normal = intermediate.getJSONObject("normal");
                }
            }
        }


    }

}
