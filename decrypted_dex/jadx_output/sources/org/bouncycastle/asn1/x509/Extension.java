package org.bouncycastle.asn1.x509;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Extension extends ASN1Object {
    private boolean critical;
    private ASN1ObjectIdentifier extnId;
    private ASN1OctetString value;
    public static final ASN1ObjectIdentifier subjectDirectoryAttributes = a.u(StubApp.getString2(27748));
    public static final ASN1ObjectIdentifier subjectKeyIdentifier = a.u(StubApp.getString2(27749));
    public static final ASN1ObjectIdentifier keyUsage = a.u(StubApp.getString2(27750));
    public static final ASN1ObjectIdentifier privateKeyUsagePeriod = a.u(StubApp.getString2(27751));
    public static final ASN1ObjectIdentifier subjectAlternativeName = a.u(StubApp.getString2(27752));
    public static final ASN1ObjectIdentifier issuerAlternativeName = a.u(StubApp.getString2(27753));
    public static final ASN1ObjectIdentifier basicConstraints = a.u(StubApp.getString2(27754));
    public static final ASN1ObjectIdentifier cRLNumber = a.u(StubApp.getString2(27755));
    public static final ASN1ObjectIdentifier reasonCode = a.u(StubApp.getString2(27756));
    public static final ASN1ObjectIdentifier instructionCode = a.u(StubApp.getString2(27757));
    public static final ASN1ObjectIdentifier invalidityDate = a.u(StubApp.getString2(27758));
    public static final ASN1ObjectIdentifier deltaCRLIndicator = a.u(StubApp.getString2(27759));
    public static final ASN1ObjectIdentifier issuingDistributionPoint = a.u(StubApp.getString2(27760));
    public static final ASN1ObjectIdentifier certificateIssuer = a.u(StubApp.getString2(27761));
    public static final ASN1ObjectIdentifier nameConstraints = a.u(StubApp.getString2(27762));
    public static final ASN1ObjectIdentifier cRLDistributionPoints = a.u(StubApp.getString2(27763));
    public static final ASN1ObjectIdentifier certificatePolicies = a.u(StubApp.getString2(27764));
    public static final ASN1ObjectIdentifier policyMappings = a.u(StubApp.getString2(27765));
    public static final ASN1ObjectIdentifier authorityKeyIdentifier = a.u(StubApp.getString2(27766));
    public static final ASN1ObjectIdentifier policyConstraints = a.u(StubApp.getString2(27767));
    public static final ASN1ObjectIdentifier extendedKeyUsage = a.u(StubApp.getString2(27768));
    public static final ASN1ObjectIdentifier freshestCRL = a.u(StubApp.getString2(27769));
    public static final ASN1ObjectIdentifier inhibitAnyPolicy = a.u(StubApp.getString2(27770));
    public static final ASN1ObjectIdentifier authorityInfoAccess = a.u(StubApp.getString2(27771));
    public static final ASN1ObjectIdentifier subjectInfoAccess = a.u(StubApp.getString2(27772));
    public static final ASN1ObjectIdentifier logoType = a.u(StubApp.getString2(27773));
    public static final ASN1ObjectIdentifier biometricInfo = a.u(StubApp.getString2(27774));
    public static final ASN1ObjectIdentifier qCStatements = a.u(StubApp.getString2(27775));
    public static final ASN1ObjectIdentifier auditIdentity = a.u(StubApp.getString2(27776));
    public static final ASN1ObjectIdentifier noRevAvail = a.u(StubApp.getString2(27777));
    public static final ASN1ObjectIdentifier targetInformation = a.u(StubApp.getString2(27778));
    public static final ASN1ObjectIdentifier expiredCertsOnCRL = a.u(StubApp.getString2(27779));

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Boolean aSN1Boolean, ASN1OctetString aSN1OctetString) {
        this(aSN1ObjectIdentifier, aSN1Boolean.isTrue(), aSN1OctetString);
    }

    private static ASN1Primitive convertValueToObject(Extension extension) throws IllegalArgumentException {
        try {
            return ASN1Primitive.fromByteArray(extension.getExtnValue().getOctets());
        } catch (IOException e10) {
            throw new IllegalArgumentException(b.h(StubApp.getString2(27780), e10));
        }
    }

    public static Extension create(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1Encodable aSN1Encodable) throws IOException {
        return new Extension(aSN1ObjectIdentifier, z2, aSN1Encodable.toASN1Primitive().getEncoded());
    }

    public static Extension getInstance(Object obj) {
        if (obj instanceof Extension) {
            return (Extension) obj;
        }
        if (obj != null) {
            return new Extension(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        if (!(obj instanceof Extension)) {
            return false;
        }
        Extension extension = (Extension) obj;
        return extension.getExtnId().equals((ASN1Primitive) getExtnId()) && extension.getExtnValue().equals((ASN1Primitive) getExtnValue()) && extension.isCritical() == isCritical();
    }

    public ASN1ObjectIdentifier getExtnId() {
        return this.extnId;
    }

    public ASN1OctetString getExtnValue() {
        return this.value;
    }

    public ASN1Encodable getParsedValue() {
        return convertValueToObject(this);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return isCritical() ? getExtnValue().hashCode() ^ getExtnId().hashCode() : ~(getExtnValue().hashCode() ^ getExtnId().hashCode());
    }

    public boolean isCritical() {
        return this.critical;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.extnId);
        if (this.critical) {
            aSN1EncodableVector.add(ASN1Boolean.getInstance(true));
        }
        aSN1EncodableVector.add(this.value);
        return new DERSequence(aSN1EncodableVector);
    }

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1OctetString aSN1OctetString) {
        this.extnId = aSN1ObjectIdentifier;
        this.critical = z2;
        this.value = aSN1OctetString;
    }

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, byte[] bArr) {
        this(aSN1ObjectIdentifier, z2, new DEROctetString(Arrays.clone(bArr)));
    }

    private Extension(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        if (aSN1Sequence.size() == 2) {
            this.extnId = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.critical = false;
            objectAt = aSN1Sequence.getObjectAt(1);
        } else {
            if (aSN1Sequence.size() != 3) {
                throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
            }
            this.extnId = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.critical = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(1)).isTrue();
            objectAt = aSN1Sequence.getObjectAt(2);
        }
        this.value = ASN1OctetString.getInstance(objectAt);
    }
}
