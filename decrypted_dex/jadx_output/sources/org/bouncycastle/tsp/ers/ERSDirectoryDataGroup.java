package org.bouncycastle.tsp.ers;

import com.stub.StubApp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ERSDirectoryDataGroup extends ERSDataGroup {
    public ERSDirectoryDataGroup(File file) throws FileNotFoundException {
        super(buildGroup(file));
    }

    private static List<ERSData> buildGroup(File file) throws FileNotFoundException {
        ERSCachingData eRSFileData;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(StubApp.getString2(34954));
        }
        File[] listFiles = file.listFiles();
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (int i3 = 0; i3 != listFiles.length; i3++) {
            if (!listFiles[i3].isDirectory()) {
                eRSFileData = new ERSFileData(listFiles[i3]);
            } else if (listFiles[i3].listFiles().length != 0) {
                eRSFileData = new ERSDirectoryDataGroup(listFiles[i3]);
            }
            arrayList.add(eRSFileData);
        }
        return arrayList;
    }

    public List<ERSFileData> getFiles() {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 != this.dataObjects.size(); i3++) {
            if (this.dataObjects.get(i3) instanceof ERSFileData) {
                arrayList.add((ERSFileData) this.dataObjects.get(i3));
            }
        }
        return arrayList;
    }

    public List<ERSDirectoryDataGroup> getSubdirectories() {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 != this.dataObjects.size(); i3++) {
            if (this.dataObjects.get(i3) instanceof ERSDirectoryDataGroup) {
                arrayList.add((ERSDirectoryDataGroup) this.dataObjects.get(i3));
            }
        }
        return arrayList;
    }
}
