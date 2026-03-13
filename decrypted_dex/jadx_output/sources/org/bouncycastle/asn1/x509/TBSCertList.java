package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x500.X500Name;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TBSCertList extends ASN1Object {
    Extensions crlExtensions;
    X500Name issuer;
    Time nextUpdate;
    ASN1Sequence revokedCertificates;
    AlgorithmIdentifier signature;
    Time thisUpdate;
    ASN1Integer version;

    /* renamed from: org.bouncycastle.asn1.x509.TBSCertList$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class CRLEntry extends ASN1Object {
        Extensions crlEntryExtensions;
        ASN1Sequence seq;

        private CRLEntry(ASN1Sequence aSN1Sequence) {
            if (aSN1Sequence.size() < 2 || aSN1Sequence.size() > 3) {
                throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
            }
            this.seq = aSN1Sequence;
        }

        public static CRLEntry getInstance(Object obj) {
            if (obj instanceof CRLEntry) {
                return (CRLEntry) obj;
            }
            if (obj != null) {
                return new CRLEntry(ASN1Sequence.getInstance(obj));
            }
            return null;
        }

        public Extensions getExtensions() {
            if (this.crlEntryExtensions == null && this.seq.size() == 3) {
                this.crlEntryExtensions = Extensions.getInstance(this.seq.getObjectAt(2));
            }
            return this.crlEntryExtensions;
        }

        public Time getRevocationDate() {
            return Time.getInstance(this.seq.getObjectAt(1));
        }

        public ASN1Integer getUserCertificate() {
            return ASN1Integer.getInstance(this.seq.getObjectAt(0));
        }

        public boolean hasExtensions() {
            return this.seq.size() == 3;
        }

        @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
        public ASN1Primitive toASN1Primitive() {
            return this.seq;
        }
    }

    public static class EmptyEnumeration implements Enumeration {
        private EmptyEnumeration() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            throw new NoSuchElementException(StubApp.getString2(27845));
        }

        public /* synthetic */ EmptyEnumeration(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class RevokedCertificatesEnumeration implements Enumeration {
        private final Enumeration en;

        public RevokedCertificatesEnumeration(Enumeration enumeration) {
            this.en = enumeration;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.en.hasMoreElements();
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            return CRLEntry.getInstance(this.en.nextElement());
        }
    }

    public TBSCertList(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 7) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        int i3 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            i3 = 1;
        } else {
            this.version = null;
        }
        this.signature = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i3));
        this.issuer = X500Name.getInstance(aSN1Sequence.getObjectAt(i3 + 1));
        int i10 = i3 + 3;
        this.thisUpdate = Time.getInstance(aSN1Sequence.getObjectAt(i3 + 2));
        if (i10 < aSN1Sequence.size() && ((aSN1Sequence.getObjectAt(i10) instanceof ASN1UTCTime) || (aSN1Sequence.getObjectAt(i10) instanceof ASN1GeneralizedTime) || (aSN1Sequence.getObjectAt(i10) instanceof Time))) {
            this.nextUpdate = Time.getInstance(aSN1Sequence.getObjectAt(i10));
            i10 = i3 + 4;
        }
        if (i10 < aSN1Sequence.size() && !(aSN1Sequence.getObjectAt(i10) instanceof ASN1TaggedObject)) {
            this.revokedCertificates = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i10));
            i10++;
        }
        if (i10 >= aSN1Sequence.size() || !(aSN1Sequence.getObjectAt(i10) instanceof ASN1TaggedObject)) {
            return;
        }
        this.crlExtensions = Extensions.getInstance(ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i10), true));
    }

    public static TBSCertList getInstance(Object obj) {
        if (obj instanceof TBSCertList) {
            return (TBSCertList) obj;
        }
        if (obj != null) {
            return new TBSCertList(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Extensions getExtensions() {
        return this.crlExtensions;
    }

    public X500Name getIssuer() {
        return this.issuer;
    }

    public Time getNextUpdate() {
        return this.nextUpdate;
    }

    public Enumeration getRevokedCertificateEnumeration() {
        ASN1Sequence aSN1Sequence = this.revokedCertificates;
        return aSN1Sequence == null ? new EmptyEnumeration(null) : new RevokedCertificatesEnumeration(aSN1Sequence.getObjects());
    }

    public CRLEntry[] getRevokedCertificates() {
        ASN1Sequence aSN1Sequence = this.revokedCertificates;
        if (aSN1Sequence == null) {
            return new CRLEntry[0];
        }
        int size = aSN1Sequence.size();
        CRLEntry[] cRLEntryArr = new CRLEntry[size];
        for (int i3 = 0; i3 < size; i3++) {
            cRLEntryArr[i3] = CRLEntry.getInstance(this.revokedCertificates.getObjectAt(i3));
        }
        return cRLEntryArr;
    }

    public AlgorithmIdentifier getSignature() {
        return this.signature;
    }

    public Time getThisUpdate() {
        return this.thisUpdate;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    public int getVersionNumber() {
        ASN1Integer aSN1Integer = this.version;
        if (aSN1Integer == null) {
            return 1;
        }
        return aSN1Integer.intValueExact() + 1;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        ASN1Integer aSN1Integer = this.version;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        aSN1EncodableVector.add(this.signature);
        aSN1EncodableVector.add(this.issuer);
        aSN1EncodableVector.add(this.thisUpdate);
        Time time = this.nextUpdate;
        if (time != null) {
            aSN1EncodableVector.add(time);
        }
        ASN1Sequence aSN1Sequence = this.revokedCertificates;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        Extensions extensions = this.crlExtensions;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static TBSCertList getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
