package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHKDFParameters implements DerivationParameters {
    private ASN1ObjectIdentifier algorithm;
    private byte[] extraInfo;
    private int keySize;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f18747z;

    public DHKDFParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i3, byte[] bArr) {
        this(aSN1ObjectIdentifier, i3, bArr, null);
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getExtraInfo() {
        return this.extraInfo;
    }

    public int getKeySize() {
        return this.keySize;
    }

    public byte[] getZ() {
        return this.f18747z;
    }

    public DHKDFParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i3, byte[] bArr, byte[] bArr2) {
        this.algorithm = aSN1ObjectIdentifier;
        this.keySize = i3;
        this.f18747z = bArr;
        this.extraInfo = bArr2;
    }
}
