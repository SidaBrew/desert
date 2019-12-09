package com.sidabw.service.Impl;

import com.sidabw.dao.BlobTest;
import com.sidabw.dao.BlobTestMapper;
import com.sidabw.service.BlobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/***
 *  Created by shao.guangze on 2019/12/8
 */
@Service("BlobServiceImpl")
public class BlobServiceImpl implements BlobService {

    @Autowired
    private BlobTestMapper blobTestMapper;

    @Override
    public int saveFileContent(InputStream is) throws IOException {

        byte[] bytes = new byte[1024];
        FileInputStream fi= null;
        int len =0;
        List<Byte> byteList = new ArrayList<>();
        while((len=is.read(bytes))!=-1){

           for (int i =0;i<byteList.size();i++){
               byteList.add(bytes[i]);
           }
        }

        Object[] objects = byteList.toArray();
        byte[] bytes1 = new byte[objects.length];
        for (int i = 0; i < objects.length; i++) {
            bytes1[i] = ((Byte) objects[i]).byteValue();
        }
        BlobTest blobTest = new BlobTest();
        blobTest.setId(3);
        blobTest.setFileContent(bytes1);

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
