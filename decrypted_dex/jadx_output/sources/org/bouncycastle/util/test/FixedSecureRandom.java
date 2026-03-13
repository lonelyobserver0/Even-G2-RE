package org.bouncycastle.util.test;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.Provider;
import java.security.SecureRandom;
import kotlin.UByte;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FixedSecureRandom extends SecureRandom {
    private static final boolean isAndroidStyle;
    private static final boolean isClasspathStyle;
    private static final boolean isRegularStyle;
    private byte[] _data;
    private int _index;
    private static java.math.BigInteger REGULAR = new java.math.BigInteger(StubApp.getString2(35012), 16);
    private static java.math.BigInteger ANDROID = new java.math.BigInteger(StubApp.getString2(35013), 16);
    private static java.math.BigInteger CLASSPATH = new java.math.BigInteger(StubApp.getString2(35014), 16);

    public static class BigInteger extends Source {
        public BigInteger(int i3, String str) {
            super(FixedSecureRandom.expandToBitLength(i3, Hex.decode(str)));
        }

        public BigInteger(int i3, byte[] bArr) {
            super(FixedSecureRandom.expandToBitLength(i3, bArr));
        }

        public BigInteger(String str) {
            this(Hex.decode(str));
        }

        public BigInteger(byte[] bArr) {
            super(bArr);
        }
    }

    public static class Data extends Source {
        public Data(byte[] bArr) {
            super(bArr);
        }
    }

    public static class DummyProvider extends Provider {
        public DummyProvider() {
            super(StubApp.getString2(35011), 1.0d, StubApp.getString2(35010));
        }
    }

    public static class RandomChecker extends SecureRandom {
        byte[] data;
        int index;

        public RandomChecker() {
            super(null, new DummyProvider());
            this.data = Hex.decode(StubApp.getString2(35012));
            this.index = 0;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void nextBytes(byte[] bArr) {
            System.arraycopy(this.data, this.index, bArr, 0, bArr.length);
            this.index += bArr.length;
        }
    }

    public static class Source {
        byte[] data;

        public Source(byte[] bArr) {
            this.data = bArr;
        }
    }

    static {
        java.math.BigInteger bigInteger = new java.math.BigInteger(128, new RandomChecker());
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(120, new RandomChecker());
        isAndroidStyle = bigInteger.equals(ANDROID);
        isRegularStyle = bigInteger.equals(REGULAR);
        isClasspathStyle = bigInteger2.equals(CLASSPATH);
    }

    public FixedSecureRandom(byte[] bArr) {
        this(new Source[]{new Data(bArr)});
    }

    private static Data[] buildDataArray(byte[][] bArr) {
        Data[] dataArr = new Data[bArr.length];
        for (int i3 = 0; i3 != bArr.length; i3++) {
            dataArr[i3] = new Data(bArr[i3]);
        }
        return dataArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] expandToBitLength(int i3, byte[] bArr) {
        int i10;
        int i11;
        int i12 = (i3 + 7) / 8;
        if (i12 <= bArr.length) {
            if (isAndroidStyle && i3 < bArr.length * 8 && (i10 = i3 % 8) != 0) {
                Pack.intToBigEndian(Pack.bigEndianToInt(bArr, 0) << (8 - i10), bArr, 0);
            }
            return bArr;
        }
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, 0, bArr2, i12 - bArr.length, bArr.length);
        if (isAndroidStyle && (i11 = i3 % 8) != 0) {
            Pack.intToBigEndian(Pack.bigEndianToInt(bArr2, 0) << (8 - i11), bArr2, 0);
        }
        return bArr2;
    }

    private int nextValue() {
        byte[] bArr = this._data;
        int i3 = this._index;
        this._index = i3 + 1;
        return bArr[i3] & UByte.MAX_VALUE;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i3) {
        byte[] bArr = new byte[i3];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        return (nextValue() << 24) | (nextValue() << 16) | (nextValue() << 8) | nextValue();
    }

    @Override // java.util.Random
    public long nextLong() {
        return (nextValue() << 56) | (nextValue() << 48) | (nextValue() << 40) | (nextValue() << 32) | (nextValue() << 24) | (nextValue() << 16) | (nextValue() << 8) | nextValue();
    }

    public FixedSecureRandom(Source[] sourceArr) {
        super(null, new DummyProvider());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z2 = isRegularStyle;
        String string2 = StubApp.getString2(35015);
        int i3 = 0;
        if (!z2) {
            if (!isAndroidStyle) {
                throw new IllegalStateException(StubApp.getString2(35016));
            }
            for (int i10 = 0; i10 != sourceArr.length; i10++) {
                try {
                    Source source = sourceArr[i10];
                    if (source instanceof BigInteger) {
                        byte[] bArr = source.data;
                        int length = bArr.length - (bArr.length % 4);
                        int i11 = 0;
                        while (i11 < length) {
                            i11 += 4;
                            byteArrayOutputStream.write(bArr, bArr.length - i11, 4);
                        }
                        if (bArr.length - length != 0) {
                            for (int i12 = 0; i12 != 4 - (bArr.length - length); i12++) {
                                byteArrayOutputStream.write(0);
                            }
                        }
                        for (int i13 = 0; i13 != bArr.length - length; i13++) {
                            byteArrayOutputStream.write(bArr[length + i13]);
                        }
                    } else {
                        byteArrayOutputStream.write(source.data);
                    }
                } catch (IOException unused) {
                    throw new IllegalArgumentException(string2);
                }
            }
        } else if (isClasspathStyle) {
            while (i3 != sourceArr.length) {
                try {
                    Source source2 = sourceArr[i3];
                    if (source2 instanceof BigInteger) {
                        byte[] bArr2 = source2.data;
                        int length2 = bArr2.length - (bArr2.length % 4);
                        for (int length3 = (bArr2.length - length2) - 1; length3 >= 0; length3--) {
                            byteArrayOutputStream.write(bArr2[length3]);
                        }
                        for (int length4 = bArr2.length - length2; length4 < bArr2.length; length4 += 4) {
                            byteArrayOutputStream.write(bArr2, length4, 4);
                        }
                    } else {
                        byteArrayOutputStream.write(source2.data);
                    }
                    i3++;
                } catch (IOException unused2) {
                    throw new IllegalArgumentException(string2);
                }
            }
        } else {
            while (i3 != sourceArr.length) {
                try {
                    byteArrayOutputStream.write(sourceArr[i3].data);
                    i3++;
                } catch (IOException unused3) {
                    throw new IllegalArgumentException(string2);
                }
            }
        }
        this._data = byteArrayOutputStream.toByteArray();
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(buildDataArray(bArr));
    }
}
