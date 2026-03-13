package org.chromium.net;

import com.stub.StubApp;
import java.util.Comparator;
import org.chromium.net.CronetEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CronetProvider cronetProvider = (CronetProvider) obj;
        CronetProvider cronetProvider2 = (CronetProvider) obj2;
        String name = cronetProvider.getName();
        String string2 = StubApp.getString2(13773);
        if (string2.equals(name)) {
            return 1;
        }
        if (string2.equals(cronetProvider2.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
    }
}
