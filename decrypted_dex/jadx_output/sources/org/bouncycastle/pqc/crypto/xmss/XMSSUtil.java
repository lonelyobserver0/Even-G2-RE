package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;
import kotlin.UByte;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSUtil {

    public static class CheckingStream extends ObjectInputStream {
        private static final Set components;
        private boolean found;
        private final Class mainClass;

        static {
            HashSet hashSet = new HashSet();
            components = hashSet;
            hashSet.add(StubApp.getString2(34361));
            hashSet.add(StubApp.getString2(34362));
            hashSet.add(StubApp.getString2(34363));
            hashSet.add(StubApp.getString2(34364));
            hashSet.add(StubApp.getString2(34365));
            hashSet.add(StubApp.getString2(34366));
            hashSet.add(StubApp.getString2(34367));
            hashSet.add(StubApp.getString2(34368));
            hashSet.add(StubApp.getString2(34369));
            hashSet.add(StubApp.getString2(34370));
            hashSet.add(StubApp.getString2(34371));
            hashSet.add(StubApp.getString2(34372));
        }

        public CheckingStream(Class cls, InputStream inputStream) throws IOException {
            super(inputStream);
            this.found = false;
            this.mainClass = cls;
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            boolean z2 = this.found;
            String string2 = StubApp.getString2(34373);
            if (z2) {
                if (!components.contains(objectStreamClass.getName())) {
                    throw new InvalidClassException(string2, objectStreamClass.getName());
                }
            } else {
                if (!objectStreamClass.getName().equals(this.mainClass.getName())) {
                    throw new InvalidClassException(string2, objectStreamClass.getName());
                }
                this.found = true;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (hasNullPointer(bArr) || hasNullPointer(bArr2)) {
            throw new NullPointerException(StubApp.getString2(34374));
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (!Arrays.areEqual(bArr[i3], bArr2[i3])) {
                return false;
            }
        }
        return true;
    }

    public static long bytesToXBigEndian(byte[] bArr, int i3, int i10) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34375));
        }
        long j = 0;
        for (int i11 = i3; i11 < i3 + i10; i11++) {
            j = (j << 8) | (bArr[i11] & UByte.MAX_VALUE);
        }
        return j;
    }

    public static int calculateTau(int i3, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (((i3 >> i11) & 1) == 0) {
                return i11;
            }
        }
        return 0;
    }

    public static byte[] cloneArray(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34375));
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void copyBytesAtOffset(byte[] bArr, byte[] bArr2, int i3) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34380));
        }
        if (bArr2 == null) {
            throw new NullPointerException(StubApp.getString2(34379));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(34378));
        }
        if (bArr2.length + i3 > bArr.length) {
            throw new IllegalArgumentException(StubApp.getString2(34377));
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            bArr[i3 + i10] = bArr2[i10];
        }
    }

    public static Object deserialize(byte[] bArr, Class cls) throws IOException, ClassNotFoundException {
        CheckingStream checkingStream = new CheckingStream(cls, new ByteArrayInputStream(bArr));
        Object readObject = checkingStream.readObject();
        if (checkingStream.available() != 0) {
            throw new IOException(StubApp.getString2(34382));
        }
        if (cls.isInstance(readObject)) {
            return readObject;
        }
        throw new IOException(StubApp.getString2(34381));
    }

    public static void dumpByteArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new NullPointerException(StubApp.getString2(34383));
        }
        for (byte[] bArr2 : bArr) {
            System.out.println(Hex.toHexString(bArr2));
        }
    }

    public static byte[] extractBytesAtOffset(byte[] bArr, int i3, int i10) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34379));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(34378));
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(34385));
        }
        if (i3 + i10 > bArr.length) {
            throw new IllegalArgumentException(StubApp.getString2(34384));
        }
        byte[] bArr2 = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr2[i11] = bArr[i3 + i11];
        }
        return bArr2;
    }

    public static int getDigestSize(Digest digest) {
        if (digest == null) {
            throw new NullPointerException(StubApp.getString2(34295));
        }
        String algorithmName = digest.getAlgorithmName();
        if (algorithmName.equals(StubApp.getString2(28183))) {
            return 32;
        }
        if (algorithmName.equals(StubApp.getString2(28184))) {
            return 64;
        }
        return digest.getDigestSize();
    }

    public static int getLeafIndex(long j, int i3) {
        return (int) (j & ((1 << i3) - 1));
    }

    public static long getTreeIndex(long j, int i3) {
        return j >> i3;
    }

    public static boolean hasNullPointer(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIndexValid(int i3, long j) {
        if (j >= 0) {
            return j < (1 << i3);
        }
        throw new IllegalStateException(StubApp.getString2(34386));
    }

    public static boolean isNewAuthenticationPathNeeded(long j, int i3, int i10) {
        return j != 0 && (j + 1) % ((long) Math.pow((double) (1 << i3), (double) i10)) == 0;
    }

    public static boolean isNewBDSInitNeeded(long j, int i3, int i10) {
        return j != 0 && j % ((long) Math.pow((double) (1 << i3), (double) (i10 + 1))) == 0;
    }

    public static int log2(int i3) {
        int i10 = 0;
        while (true) {
            i3 >>= 1;
            if (i3 == 0) {
                return i10;
            }
            i10++;
        }
    }

    public static void longToBigEndian(long j, byte[] bArr, int i3) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34375));
        }
        if (bArr.length - i3 < 8) {
            throw new IllegalArgumentException(StubApp.getString2(34387));
        }
        bArr[i3] = (byte) ((j >> 56) & 255);
        bArr[i3 + 1] = (byte) ((j >> 48) & 255);
        bArr[i3 + 2] = (byte) ((j >> 40) & 255);
        bArr[i3 + 3] = (byte) ((j >> 32) & 255);
        bArr[i3 + 4] = (byte) ((j >> 24) & 255);
        bArr[i3 + 5] = (byte) ((j >> 16) & 255);
        bArr[i3 + 6] = (byte) ((j >> 8) & 255);
        bArr[i3 + 7] = (byte) (j & 255);
    }

    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toBytesBigEndian(long j, int i3) {
        byte[] bArr = new byte[i3];
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            bArr[i10] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    public static byte[][] cloneArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new NullPointerException(StubApp.getString2(34376));
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte[] bArr3 = new byte[bArr[i3].length];
            bArr2[i3] = bArr3;
            byte[] bArr4 = bArr[i3];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return bArr2;
    }
}
