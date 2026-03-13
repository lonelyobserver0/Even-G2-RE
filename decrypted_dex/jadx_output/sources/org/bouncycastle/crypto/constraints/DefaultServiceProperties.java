package org.bouncycastle.crypto.constraints;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DefaultServiceProperties implements CryptoServiceProperties {
    private final String algorithm;
    private final int bitsOfSecurity;
    private final Object params;
    private final CryptoServicePurpose purpose;

    public DefaultServiceProperties(String str, int i3) {
        this(str, i3, null, CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.CryptoServiceProperties
    public int bitsOfSecurity() {
        return this.bitsOfSecurity;
    }

    @Override // org.bouncycastle.crypto.CryptoServiceProperties
    public Object getParams() {
        return this.params;
    }

    @Override // org.bouncycastle.crypto.CryptoServiceProperties
    public CryptoServicePurpose getPurpose() {
        return this.purpose;
    }

    @Override // org.bouncycastle.crypto.CryptoServiceProperties
    public String getServiceName() {
        return this.algorithm;
    }

    public DefaultServiceProperties(String str, int i3, Object obj) {
        this(str, i3, obj, CryptoServicePurpose.ANY);
    }

    public DefaultServiceProperties(String str, int i3, Object obj, CryptoServicePurpose cryptoServicePurpose) {
        this.algorithm = str;
        this.bitsOfSecurity = i3;
        this.params = obj;
        if (obj instanceof CryptoServicePurpose) {
            throw new IllegalArgumentException(StubApp.getString2(28452));
        }
        this.purpose = cryptoServicePurpose;
    }
}
