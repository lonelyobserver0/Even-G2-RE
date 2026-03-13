package org.bouncycastle.asn1.x509;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509Extension {
    boolean critical;
    ASN1OctetString value;
    public static final ASN1ObjectIdentifier subjectDirectoryAttributes = new ASN1ObjectIdentifier(StubApp.getString2(27748));
    public static final ASN1ObjectIdentifier subjectKeyIdentifier = new ASN1ObjectIdentifier(StubApp.getString2(27749));
    public static final ASN1ObjectIdentifier keyUsage = new ASN1ObjectIdentifier(StubApp.getString2(27750));
    public static final ASN1ObjectIdentifier privateKeyUsagePeriod = new ASN1ObjectIdentifier(StubApp.getString2(27751));
    public static final ASN1ObjectIdentifier subjectAlternativeName = new ASN1ObjectIdentifier(StubApp.getString2(27752));
    public static final ASN1ObjectIdentifier issuerAlternativeName = new ASN1ObjectIdentifier(StubApp.getString2(27753));
    public static final ASN1ObjectIdentifier basicConstraints = new ASN1ObjectIdentifier(StubApp.getString2(27754));
    public static final ASN1ObjectIdentifier cRLNumber = new ASN1ObjectIdentifier(StubApp.getString2(27755));
    public static final ASN1ObjectIdentifier reasonCode = new ASN1ObjectIdentifier(StubApp.getString2(27756));
    public static final ASN1ObjectIdentifier instructionCode = new ASN1ObjectIdentifier(StubApp.getString2(27757));
    public static final ASN1ObjectIdentifier invalidityDate = new ASN1ObjectIdentifier(StubApp.getString2(27758));
    public static final ASN1ObjectIdentifier deltaCRLIndicator = new ASN1ObjectIdentifier(StubApp.getString2(27759));
    public static final ASN1ObjectIdentifier issuingDistributionPoint = new ASN1ObjectIdentifier(StubApp.getString2(27760));
    public static final ASN1ObjectIdentifier certificateIssuer = new ASN1ObjectIdentifier(StubApp.getString2(27761));
    public static final ASN1ObjectIdentifier nameConstraints = new ASN1ObjectIdentifier(StubApp.getString2(27762));
    public static final ASN1ObjectIdentifier cRLDistributionPoints = new ASN1ObjectIdentifier(StubApp.getString2(27763));
    public static final ASN1ObjectIdentifier certificatePolicies = new ASN1ObjectIdentifier(StubApp.getString2(27764));
    public static final ASN1ObjectIdentifier policyMappings = new ASN1ObjectIdentifier(StubApp.getString2(27765));
    public static final ASN1ObjectIdentifier authorityKeyIdentifier = new ASN1ObjectIdentifier(StubApp.getString2(27766));
    public static final ASN1ObjectIdentifier policyConstraints = new ASN1ObjectIdentifier(StubApp.getString2(27767));
    public static final ASN1ObjectIdentifier extendedKeyUsage = new ASN1ObjectIdentifier(StubApp.getString2(27768));
    public static final ASN1ObjectIdentifier freshestCRL = new ASN1ObjectIdentifier(StubApp.getString2(27769));
    public static final ASN1ObjectIdentifier inhibitAnyPolicy = new ASN1ObjectIdentifier(StubApp.getString2(27770));
    public static final ASN1ObjectIdentifier authorityInfoAccess = new ASN1ObjectIdentifier(StubApp.getString2(27771));
    public static final ASN1ObjectIdentifier subjectInfoAccess = new ASN1ObjectIdentifier(StubApp.getString2(27772));
    public static final ASN1ObjectIdentifier logoType = new ASN1ObjectIdentifier(StubApp.getString2(27773));
    public static final ASN1ObjectIdentifier biometricInfo = new ASN1ObjectIdentifier(StubApp.getString2(27774));
    public static final ASN1ObjectIdentifier qCStatements = new ASN1ObjectIdentifier(StubApp.getString2(27775));
    public static final ASN1ObjectIdentifier auditIdentity = new ASN1ObjectIdentifier(StubApp.getString2(27776));
    public static final ASN1ObjectIdentifier noRevAvail = new ASN1ObjectIdentifier(StubApp.getString2(27777));
    public static final ASN1ObjectIdentifier targetInformation = new ASN1ObjectIdentifier(StubApp.getString2(27778));

    public X509Extension(ASN1Boolean aSN1Boolean, ASN1OctetString aSN1OctetString) {
        this.critical = aSN1Boolean.isTrue();
        this.value = aSN1OctetString;
    }

    public static ASN1Primitive convertValueToObject(X509Extension x509Extension) throws IllegalArgumentException {
        try {
            return ASN1Primitive.fromByteArray(x509Extension.getValue().getOctets());
        } catch (IOException e10) {
            throw new IllegalArgumentException(b.h(StubApp.getString2(27780), e10));
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof X509Extension)) {
            return false;
        }
        X509Extension x509Extension = (X509Extension) obj;
        return x509Extension.getValue().equals((ASN1Primitive) getValue()) && x509Extension.isCritical() == isCritical();
    }

    public ASN1Encodable getParsedValue() {
        return convertValueToObject(this);
    }

    public ASN1OctetString getValue() {
        return this.value;
    }

    public int hashCode() {
        return isCritical() ? getValue().hashCode() : ~getValue().hashCode();
    }

    public boolean isCritical() {
        return this.critical;
    }

    public X509Extension(boolean z2, ASN1OctetString aSN1OctetString) {
        this.critical = z2;
        this.value = aSN1OctetString;
    }
}
