package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class DERMacData {
    private final byte[] macData;

    /* renamed from: org.bouncycastle.crypto.util.DERMacData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$util$DERMacData$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$org$bouncycastle$crypto$util$DERMacData$Type = iArr;
            try {
                iArr[Type.UNILATERALU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$util$DERMacData$Type[Type.BILATERALU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$util$DERMacData$Type[Type.UNILATERALV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$util$DERMacData$Type[Type.BILATERALV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Builder {
        private ASN1OctetString ephemDataU;
        private ASN1OctetString ephemDataV;
        private ASN1OctetString idU;
        private ASN1OctetString idV;
        private byte[] text;
        private final Type type;

        public Builder(Type type, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.type = type;
            this.idU = DerUtil.getOctetString(bArr);
            this.idV = DerUtil.getOctetString(bArr2);
            this.ephemDataU = DerUtil.getOctetString(bArr3);
            this.ephemDataV = DerUtil.getOctetString(bArr4);
        }

        private byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            return Arrays.concatenate(Arrays.concatenate(bArr, bArr2, bArr3), Arrays.concatenate(bArr4, bArr5, bArr6));
        }

        public DERMacData build() {
            int i3 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$util$DERMacData$Type[this.type.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            if (i3 == 1 || i3 == 2) {
                return new DERMacData(concatenate(this.type.getHeader(), DerUtil.toByteArray(this.idU), DerUtil.toByteArray(this.idV), DerUtil.toByteArray(this.ephemDataU), DerUtil.toByteArray(this.ephemDataV), this.text), anonymousClass1);
            }
            if (i3 == 3 || i3 == 4) {
                return new DERMacData(concatenate(this.type.getHeader(), DerUtil.toByteArray(this.idV), DerUtil.toByteArray(this.idU), DerUtil.toByteArray(this.ephemDataV), DerUtil.toByteArray(this.ephemDataU), this.text), anonymousClass1);
            }
            throw new IllegalStateException(StubApp.getString2(29341));
        }

        public Builder withText(byte[] bArr) {
            this.text = DerUtil.toByteArray(new DERTaggedObject(false, 0, (ASN1Encodable) DerUtil.getOctetString(bArr)));
            return this;
        }
    }

    public enum Type {
        UNILATERALU(StubApp.getString2(28423)),
        UNILATERALV(StubApp.getString2(29343)),
        BILATERALU(StubApp.getString2(29345)),
        BILATERALV(StubApp.getString2(29347));

        private final String enc;

        Type(String str) {
            this.enc = str;
        }

        public byte[] getHeader() {
            return Strings.toByteArray(this.enc);
        }
    }

    private DERMacData(byte[] bArr) {
        this.macData = bArr;
    }

    public byte[] getMacData() {
        return Arrays.clone(this.macData);
    }

    public /* synthetic */ DERMacData(byte[] bArr, AnonymousClass1 anonymousClass1) {
        this(bArr);
    }
}
