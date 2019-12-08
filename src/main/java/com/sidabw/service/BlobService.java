package com.sidabw.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/***
 *  Created by shao.guangze on 2019/12/8
 */
public interface BlobService {
    int saveFileContent(InputStream is) throws IOException;

    int qryFileContent() throws IOException;
}
