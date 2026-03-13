package org.bouncycastle.x509;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509CollectionStoreParameters implements X509StoreParameters {
    private Collection collection;

    public X509CollectionStoreParameters(Collection collection) {
        if (collection == null) {
            throw new NullPointerException(StubApp.getString2(35134));
        }
        this.collection = collection;
    }

    public Object clone() {
        return new X509CollectionStoreParameters(this.collection);
    }

    public Collection getCollection() {
        return new ArrayList(this.collection);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(35135));
        stringBuffer.append(StubApp.getString2(35136) + this.collection + StubApp.getString2(3692));
        stringBuffer.append(StubApp.getString2(511));
        return stringBuffer.toString();
    }
}
