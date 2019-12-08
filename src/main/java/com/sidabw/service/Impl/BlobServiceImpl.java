package com.sidabw.service.Impl;

import com.sidabw.dao.BlobTest;
import com.sidabw.dao.BlobTestMapper;
import com.sidabw.service.BlobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;

/***
 *  Created by shao.guangze on 2019/12/8
 */
@Service("BlobServiceImpl")
public class BlobServiceImpl implements BlobService {

    @Autowired
    private BlobTestMapper blobTestMapper;

    @Override
    public int saveFileContent(InputStream is) throws IOException {

        byte[] bytes = new byte[is.available()];
        is.read(bytes);

        BlobTest blobTest = new BlobTest();
        blobTest.setId(3);
        blobTest.setFileContent(new byte[]{});

        return blobTestMapper.insert(blobTest);
    }

    @Override
    public int qryFileContent() throws IOException {
        BlobTest blobTest = blobTestMapper.selectByPrimaryKey(1);
        byte[] fileContent = blobTest.getFileContent();
        OutputStream os = null;
        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\temp\\1.txt"));

        if ((fileContent.length>0)) {
            fileOutputStream.write(fileContent);
        }
        try {
            if ( os !=null){
                os.close();
            }
            if ( fileOutputStream !=null){
                fileOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
