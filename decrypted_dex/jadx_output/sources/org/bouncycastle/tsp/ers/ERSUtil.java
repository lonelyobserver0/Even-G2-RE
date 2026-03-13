package org.bouncycastle.tsp.ers;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ERSUtil {
    private static final Comparator<byte[]> hashComp = new ByteArrayComparator();

    private ERSUtil() {
    }

    public static List<byte[]> buildHashList(DigestCalculator digestCalculator, List<ERSData> list, byte[] bArr) {
        SortedHashList sortedHashList = new SortedHashList();
        for (int i3 = 0; i3 != list.size(); i3++) {
            sortedHashList.add(list.get(i3).getHash(digestCalculator, bArr));
        }
        return sortedHashList.toList();
    }

    public static List<IndexedHash> buildIndexedHashList(DigestCalculator digestCalculator, List<ERSData> list, byte[] bArr) {
        SortedIndexedHashList sortedIndexedHashList = new SortedIndexedHashList();
        for (int i3 = 0; i3 != list.size(); i3++) {
            sortedIndexedHashList.add(new IndexedHash(i3, list.get(i3).getHash(digestCalculator, bArr)));
        }
        return sortedIndexedHashList.toList();
    }

    public static byte[] calculateBranchHash(DigestCalculator digestCalculator, byte[] bArr, byte[] bArr2) {
        return hashComp.compare(bArr, bArr2) <= 0 ? calculateDigest(digestCalculator, bArr, bArr2) : calculateDigest(digestCalculator, bArr2, bArr);
    }

    public static byte[] calculateDigest(DigestCalculator digestCalculator, InputStream inputStream) {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            Streams.pipeAll(inputStream, outputStream);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e10) {
            throw ExpUtil.createIllegalState(u.q(e10, new StringBuilder(StubApp.getString2(34966))), e10);
        }
    }

    public static byte[] computeNodeHash(DigestCalculator digestCalculator, PartialHashtree partialHashtree) {
        byte[][] values = partialHashtree.getValues();
        return values.length > 1 ? calculateDigest(digestCalculator, buildIndexedHashList(values).iterator()) : values[0];
    }

    public static byte[] concatPreviousHashes(DigestCalculator digestCalculator, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(bArr2);
            outputStream.write(bArr);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException unused) {
            throw new IllegalStateException(StubApp.getString2(34967));
        }
    }

    public static List<byte[]> buildIndexedHashList(byte[][] bArr) {
        SortedHashList sortedHashList = new SortedHashList();
        for (int i3 = 0; i3 != bArr.length; i3++) {
            sortedHashList.add(bArr[i3]);
        }
        return sortedHashList.toList();
    }

    public static byte[] calculateBranchHash(DigestCalculator digestCalculator, byte[][] bArr) {
        return bArr.length == 2 ? calculateBranchHash(digestCalculator, bArr[0], bArr[1]) : calculateDigest(digestCalculator, buildIndexedHashList(bArr).iterator());
    }

    public static byte[] calculateDigest(DigestCalculator digestCalculator, Iterator<byte[]> it) {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            while (it.hasNext()) {
                outputStream.write(it.next());
            }
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e10) {
            throw ExpUtil.createIllegalState(u.q(e10, new StringBuilder(StubApp.getString2(34966))), e10);
        }
    }

    public static byte[] calculateDigest(DigestCalculator digestCalculator, byte[] bArr) {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e10) {
            throw ExpUtil.createIllegalState(u.q(e10, new StringBuilder(StubApp.getString2(34966))), e10);
        }
    }

    public static byte[] calculateDigest(DigestCalculator digestCalculator, byte[] bArr, byte[] bArr2) {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(bArr);
            outputStream.write(bArr2);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e10) {
            throw ExpUtil.createIllegalState(u.q(e10, new StringBuilder(StubApp.getString2(34966))), e10);
        }
    }
}
