package org.bouncycastle.tsp.ers;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.tsp.ArchiveTimeStamp;
import org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.asn1.tsp.TSTInfo;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TimeStampRequest;
import org.bouncycastle.tsp.TimeStampRequestGenerator;
import org.bouncycastle.tsp.TimeStampResponse;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ERSArchiveTimeStampGenerator {
    private final DigestCalculator digCalc;
    private byte[] previousChainHash;
    private List<ERSData> dataObjects = new ArrayList();
    private ERSRootNodeCalculator rootNodeCalculator = new BinaryTreeRootCalculator();

    /* renamed from: org.bouncycastle.tsp.ers.ERSArchiveTimeStampGenerator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class IndexedPartialHashtree extends PartialHashtree {
        final int order;

        private IndexedPartialHashtree(int i3, byte[] bArr) {
            super(bArr);
            this.order = i3;
        }

        public /* synthetic */ IndexedPartialHashtree(int i3, byte[] bArr, AnonymousClass1 anonymousClass1) {
            this(i3, bArr);
        }

        private IndexedPartialHashtree(int i3, byte[][] bArr) {
            super(bArr);
            this.order = i3;
        }

        public /* synthetic */ IndexedPartialHashtree(int i3, byte[][] bArr, AnonymousClass1 anonymousClass1) {
            this(i3, bArr);
        }
    }

    public ERSArchiveTimeStampGenerator(DigestCalculator digestCalculator) {
        this.digCalc = digestCalculator;
    }

    private IndexedPartialHashtree[] getPartialHashtrees() {
        List<IndexedHash> buildIndexedHashList = ERSUtil.buildIndexedHashList(this.digCalc, this.dataObjects, this.previousChainHash);
        IndexedPartialHashtree[] indexedPartialHashtreeArr = new IndexedPartialHashtree[buildIndexedHashList.size()];
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 != this.dataObjects.size(); i3++) {
            if (this.dataObjects.get(i3) instanceof ERSDataGroup) {
                hashSet.add((ERSDataGroup) this.dataObjects.get(i3));
            }
        }
        for (int i10 = 0; i10 != buildIndexedHashList.size(); i10++) {
            byte[] bArr = buildIndexedHashList.get(i10).digest;
            ERSData eRSData = this.dataObjects.get(buildIndexedHashList.get(i10).order);
            AnonymousClass1 anonymousClass1 = null;
            if (eRSData instanceof ERSDataGroup) {
                List<byte[]> hashes = ((ERSDataGroup) eRSData).getHashes(this.digCalc, this.previousChainHash);
                indexedPartialHashtreeArr[i10] = new IndexedPartialHashtree(buildIndexedHashList.get(i10).order, (byte[][]) hashes.toArray(new byte[hashes.size()][]), anonymousClass1);
            } else {
                indexedPartialHashtreeArr[i10] = new IndexedPartialHashtree(buildIndexedHashList.get(i10).order, bArr, anonymousClass1);
            }
        }
        return indexedPartialHashtreeArr;
    }

    public void addAllData(List<ERSData> list) {
        this.dataObjects.addAll(list);
    }

    public void addData(ERSData eRSData) {
        this.dataObjects.add(eRSData);
    }

    public void addPreviousChains(ArchiveTimeStampSequence archiveTimeStampSequence) throws IOException {
        OutputStream outputStream = this.digCalc.getOutputStream();
        outputStream.write(archiveTimeStampSequence.getEncoded(StubApp.getString2(26791)));
        outputStream.close();
        this.previousChainHash = this.digCalc.getDigest();
    }

    public ERSArchiveTimeStamp generateArchiveTimeStamp(TimeStampResponse timeStampResponse) throws TSPException, ERSException {
        IndexedPartialHashtree[] partialHashtrees = getPartialHashtrees();
        if (partialHashtrees.length != 1) {
            throw new ERSException(StubApp.getString2(34953));
        }
        byte[] computeRootHash = this.rootNodeCalculator.computeRootHash(this.digCalc, partialHashtrees);
        if (timeStampResponse.getStatus() != 0) {
            throw new TSPException(StubApp.getString2(34952) + timeStampResponse.getStatusString());
        }
        TSTInfo aSN1Structure = timeStampResponse.getTimeStampToken().getTimeStampInfo().toASN1Structure();
        if (!aSN1Structure.getMessageImprint().getHashAlgorithm().equals(this.digCalc.getAlgorithmIdentifier())) {
            throw new ERSException(StubApp.getString2(34951));
        }
        if (Arrays.areEqual(aSN1Structure.getMessageImprint().getHashedMessage(), computeRootHash)) {
            return partialHashtrees[0].getValueCount() == 1 ? new ERSArchiveTimeStamp(new ArchiveTimeStamp(null, null, timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure()), this.digCalc) : new ERSArchiveTimeStamp(new ArchiveTimeStamp(this.digCalc.getAlgorithmIdentifier(), partialHashtrees, timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure()), this.digCalc);
        }
        throw new ERSException(StubApp.getString2(34950));
    }

    public List<ERSArchiveTimeStamp> generateArchiveTimeStamps(TimeStampResponse timeStampResponse) throws TSPException, ERSException {
        IndexedPartialHashtree[] partialHashtrees = getPartialHashtrees();
        byte[] computeRootHash = this.rootNodeCalculator.computeRootHash(this.digCalc, partialHashtrees);
        if (timeStampResponse.getStatus() != 0) {
            throw new TSPException(StubApp.getString2(34952) + timeStampResponse.getStatusString());
        }
        TSTInfo aSN1Structure = timeStampResponse.getTimeStampToken().getTimeStampInfo().toASN1Structure();
        if (!aSN1Structure.getMessageImprint().getHashAlgorithm().equals(this.digCalc.getAlgorithmIdentifier())) {
            throw new ERSException(StubApp.getString2(34951));
        }
        if (!Arrays.areEqual(aSN1Structure.getMessageImprint().getHashedMessage(), computeRootHash)) {
            throw new ERSException(StubApp.getString2(34950));
        }
        ContentInfo aSN1Structure2 = timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure();
        ArrayList arrayList = new ArrayList();
        if (partialHashtrees.length == 1 && partialHashtrees[0].getValueCount() == 1) {
            arrayList.add(new ERSArchiveTimeStamp(new ArchiveTimeStamp(null, null, aSN1Structure2), this.digCalc));
            return arrayList;
        }
        ERSArchiveTimeStamp[] eRSArchiveTimeStampArr = new ERSArchiveTimeStamp[partialHashtrees.length];
        for (int i3 = 0; i3 != partialHashtrees.length; i3++) {
            eRSArchiveTimeStampArr[partialHashtrees[i3].order] = new ERSArchiveTimeStamp(new ArchiveTimeStamp(this.digCalc.getAlgorithmIdentifier(), this.rootNodeCalculator.computePathToRoot(this.digCalc, partialHashtrees[i3], i3), aSN1Structure2), this.digCalc);
        }
        for (int i10 = 0; i10 != partialHashtrees.length; i10++) {
            arrayList.add(eRSArchiveTimeStampArr[i10]);
        }
        return arrayList;
    }

    public TimeStampRequest generateTimeStampRequest(TimeStampRequestGenerator timeStampRequestGenerator) throws TSPException, IOException {
        return timeStampRequestGenerator.generate(this.digCalc.getAlgorithmIdentifier(), this.rootNodeCalculator.computeRootHash(this.digCalc, getPartialHashtrees()));
    }

    public TimeStampRequest generateTimeStampRequest(TimeStampRequestGenerator timeStampRequestGenerator, BigInteger bigInteger) throws TSPException, IOException {
        return timeStampRequestGenerator.generate(this.digCalc.getAlgorithmIdentifier(), this.rootNodeCalculator.computeRootHash(this.digCalc, getPartialHashtrees()), bigInteger);
    }
}
