package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface X509ObjectIdentifiers {
    public static final ASN1ObjectIdentifier crlAccessMethod;
    public static final ASN1ObjectIdentifier id_PasswordBasedMac;
    public static final ASN1ObjectIdentifier id_ad;
    public static final ASN1ObjectIdentifier id_ad_caIssuers;
    public static final ASN1ObjectIdentifier id_ad_ocsp;
    public static final ASN1ObjectIdentifier id_ce;
    public static final ASN1ObjectIdentifier id_ecdsa_with_shake128;
    public static final ASN1ObjectIdentifier id_ecdsa_with_shake256;
    public static final ASN1ObjectIdentifier id_pe;
    public static final ASN1ObjectIdentifier id_pkix;
    public static final ASN1ObjectIdentifier id_rsassa_pss_shake128;
    public static final ASN1ObjectIdentifier id_rsassa_pss_shake256;
    public static final ASN1ObjectIdentifier ocspAccessMethod;
    public static final ASN1ObjectIdentifier commonName = a.u("2.5.4.3");
    public static final ASN1ObjectIdentifier countryName = a.u("2.5.4.6");
    public static final ASN1ObjectIdentifier localityName = a.u("2.5.4.7");
    public static final ASN1ObjectIdentifier stateOrProvinceName = a.u("2.5.4.8");
    public static final ASN1ObjectIdentifier organization = a.u("2.5.4.10");
    public static final ASN1ObjectIdentifier organizationalUnitName = a.u("2.5.4.11");
    public static final ASN1ObjectIdentifier id_at_telephoneNumber = a.u("2.5.4.20");
    public static final ASN1ObjectIdentifier id_at_name = a.u("2.5.4.41");
    public static final ASN1ObjectIdentifier id_at_organizationIdentifier = a.u("2.5.4.97");
    public static final ASN1ObjectIdentifier id_SHA1 = a.u("1.3.14.3.2.26");
    public static final ASN1ObjectIdentifier ripemd160 = a.u("1.3.36.3.2.1");
    public static final ASN1ObjectIdentifier ripemd160WithRSAEncryption = a.u("1.3.36.3.3.1.2");
    public static final ASN1ObjectIdentifier id_ea_rsa = a.u("2.5.8.1.1");

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        id_pkix = aSN1ObjectIdentifier;
        id_rsassa_pss_shake128 = aSN1ObjectIdentifier.branch("6.30");
        id_rsassa_pss_shake256 = aSN1ObjectIdentifier.branch("6.31");
        id_ecdsa_with_shake128 = aSN1ObjectIdentifier.branch("6.32");
        id_ecdsa_with_shake256 = aSN1ObjectIdentifier.branch("6.33");
        id_pe = aSN1ObjectIdentifier.branch("1");
        id_ce = new ASN1ObjectIdentifier("2.5.29");
        ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch("48");
        id_ad = branch;
        ASN1ObjectIdentifier intern = branch.branch("2").intern();
        id_ad_caIssuers = intern;
        ASN1ObjectIdentifier intern2 = branch.branch("1").intern();
        id_ad_ocsp = intern2;
        ocspAccessMethod = intern2;
        crlAccessMethod = intern;
        id_PasswordBasedMac = new ASN1ObjectIdentifier("1.2.840.113533.7.66.13");
    }
}
