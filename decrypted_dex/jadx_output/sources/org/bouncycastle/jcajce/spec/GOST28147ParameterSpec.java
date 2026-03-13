package org.bouncycastle.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST28147ParameterSpec implements AlgorithmParameterSpec {
    private static Map oidMappings;
    private byte[] iv;
    private byte[] sBox;

    static {
        HashMap hashMap = new HashMap();
        oidMappings = hashMap;
        hashMap.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet, StubApp.getString2(28627));
        oidMappings.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_B_ParamSet, StubApp.getString2(28628));
        oidMappings.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_C_ParamSet, StubApp.getString2(28629));
        oidMappings.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_D_ParamSet, StubApp.getString2(28630));
        oidMappings.put(RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z, StubApp.getString2(28631));
    }

    public GOST28147ParameterSpec(String str) {
        this.iv = null;
        this.sBox = null;
        this.sBox = GOST28147Engine.getSBox(str);
    }

    private static String getName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) oidMappings.get(aSN1ObjectIdentifier);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException(a.e(StubApp.getString2(32440), aSN1ObjectIdentifier));
    }

    public byte[] getIV() {
        return Arrays.clone(this.iv);
    }

    public byte[] getSBox() {
        return Arrays.clone(this.sBox);
    }

    public byte[] getSbox() {
        return Arrays.clone(this.sBox);
    }

    public GOST28147ParameterSpec(String str, byte[] bArr) {
        this(str);
        byte[] bArr2 = new byte[bArr.length];
        this.iv = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public GOST28147ParameterSpec(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this(getName(aSN1ObjectIdentifier));
        this.iv = Arrays.clone(bArr);
    }

    public GOST28147ParameterSpec(byte[] bArr) {
        this.iv = null;
        this.sBox = null;
        byte[] bArr2 = new byte[bArr.length];
        this.sBox = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public GOST28147ParameterSpec(byte[] bArr, byte[] bArr2) {
        this(bArr);
        byte[] bArr3 = new byte[bArr2.length];
        this.iv = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
    }
}
