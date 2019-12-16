package com.sidabw.controller;

import com.sidabw.service.BlobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2019/2/21.
 */
@RestController
public class UserController {

    @Autowired
    private BlobService BlobServiceImpl;

    /**
     * 上传二进制流存储到数据库
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping("/saveFileContent")
    public int saveFileContent(@RequestParam("file") MultipartFile file) throws IOException {
        InputStream is = file.getInputStream();
        return BlobServiceImpl.saveFileContent(is);
    }

    /**
     * 从数据库中读取二进制流
     * @return
     * @throws IOException
     */
    @PostMapping("/qryFileContent")
    public int qryFileContent() throws IOException {
        return BlobServiceImpl.qryFileContent();
    }
}

