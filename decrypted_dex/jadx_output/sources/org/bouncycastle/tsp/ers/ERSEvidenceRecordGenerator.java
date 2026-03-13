package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.tsp.CryptoInfos;
import org.bouncycastle.asn1.tsp.EncryptionInfo;
import org.bouncycastle.asn1.tsp.EvidenceRecord;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.tsp.TSPException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ERSEvidenceRecordGenerator {
    private final DigestCalculatorProvider digCalcProv;

    public ERSEvidenceRecordGenerator(DigestCalculatorProvider digestCalculatorProvider) {
        this.digCalcProv = digestCalculatorProvider;
    }

    public List<ERSEvidenceRecord> generate(List<ERSArchiveTimeStamp> list) throws TSPException, ERSException {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i3 = 0; i3 != list.size(); i3++) {
            arrayList.add(new ERSEvidenceRecord(new EvidenceRecord((CryptoInfos) null, (EncryptionInfo) null, list.get(i3).toASN1Structure()), this.digCalcProv));
        }
        return arrayList;
    }

    public ERSEvidenceRecord generate(ERSArchiveTimeStamp eRSArchiveTimeStamp) throws TSPException, ERSException {
        return new ERSEvidenceRecord(new EvidenceRecord((CryptoInfos) null, (EncryptionInfo) null, eRSArchiveTimeStamp.toASN1Structure()), this.digCalcProv);
    }
}
