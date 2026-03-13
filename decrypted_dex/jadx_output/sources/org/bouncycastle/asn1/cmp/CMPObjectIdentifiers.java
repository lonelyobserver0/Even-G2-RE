package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface CMPObjectIdentifiers {
    public static final ASN1ObjectIdentifier ct_encKeyWithID;
    public static final ASN1ObjectIdentifier id_pkip;
    public static final ASN1ObjectIdentifier id_regCtrl;
    public static final ASN1ObjectIdentifier id_regCtrl_algId;
    public static final ASN1ObjectIdentifier id_regCtrl_rsaKeyLen;
    public static final ASN1ObjectIdentifier id_regInfo;
    public static final ASN1ObjectIdentifier regCtrl_altCertTemplate;
    public static final ASN1ObjectIdentifier regCtrl_authenticator;
    public static final ASN1ObjectIdentifier regCtrl_oldCertID;
    public static final ASN1ObjectIdentifier regCtrl_pkiArchiveOptions;
    public static final ASN1ObjectIdentifier regCtrl_pkiPublicationInfo;
    public static final ASN1ObjectIdentifier regCtrl_protocolEncrKey;
    public static final ASN1ObjectIdentifier regCtrl_regToken;
    public static final ASN1ObjectIdentifier regInfo_certReq;
    public static final ASN1ObjectIdentifier regInfo_utf8Pairs;
    public static final ASN1ObjectIdentifier passwordBasedMac = new ASN1ObjectIdentifier("1.2.840.113533.7.66.13");
    public static final ASN1ObjectIdentifier dhBasedMac = new ASN1ObjectIdentifier("1.2.840.113533.7.66.30");
    public static final ASN1ObjectIdentifier it_caProtEncCert = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.1");
    public static final ASN1ObjectIdentifier it_signKeyPairTypes = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.2");
    public static final ASN1ObjectIdentifier it_encKeyPairTypes = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.3");
    public static final ASN1ObjectIdentifier it_preferredSymAlg = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.4");
    public static final ASN1ObjectIdentifier it_caKeyUpdateInfo = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.5");
    public static final ASN1ObjectIdentifier it_currentCRL = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.6");
    public static final ASN1ObjectIdentifier it_unsupportedOIDs = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.7");
    public static final ASN1ObjectIdentifier it_keyPairParamReq = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.10");
    public static final ASN1ObjectIdentifier it_keyPairParamRep = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.11");
    public static final ASN1ObjectIdentifier it_revPassphrase = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.12");
    public static final ASN1ObjectIdentifier it_implicitConfirm = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.13");
    public static final ASN1ObjectIdentifier it_confirmWaitTime = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.14");
    public static final ASN1ObjectIdentifier it_origPKIMessage = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.15");
    public static final ASN1ObjectIdentifier it_suppLangTags = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.16");
    public static final ASN1ObjectIdentifier id_it_caCerts = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.17");
    public static final ASN1ObjectIdentifier id_it_rootCaKeyUpdate = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.18");
    public static final ASN1ObjectIdentifier id_it_certReqTemplate = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.19");
    public static final ASN1ObjectIdentifier id_it_rootCaCert = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.20");
    public static final ASN1ObjectIdentifier id_it_certProfile = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.21");
    public static final ASN1ObjectIdentifier id_it_crlStatusList = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.22");
    public static final ASN1ObjectIdentifier id_it_crls = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.4.23");

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5");
        id_pkip = aSN1ObjectIdentifier;
        id_regCtrl = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1");
        id_regInfo = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.2");
        regCtrl_regToken = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.1");
        regCtrl_authenticator = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.2");
        regCtrl_pkiPublicationInfo = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.3");
        regCtrl_pkiArchiveOptions = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.4");
        regCtrl_oldCertID = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.5");
        regCtrl_protocolEncrKey = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.6");
        regCtrl_altCertTemplate = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.1.7");
        regInfo_utf8Pairs = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.2.1");
        regInfo_certReq = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.5.2.2");
        ct_encKeyWithID = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.1.21");
        id_regCtrl_algId = aSN1ObjectIdentifier.branch("1.11");
        id_regCtrl_rsaKeyLen = aSN1ObjectIdentifier.branch("1.12");
    }
}
