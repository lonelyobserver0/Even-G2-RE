package org.bouncycastle.pkix.jcajce;

import com.stub.StubApp;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509RevocationChecker extends PKIXCertPathChecker {
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;
    private final boolean canSoftFail;
    private final List<CertStore> crlCertStores;
    private final List<Store<CRL>> crls;
    private Date currentDate;
    private final long failHardMaxTime;
    private final long failLogMaxTime;
    private final Map<X500Principal, Long> failures;
    private final JcaJceHelper helper;
    private final boolean isCheckEEOnly;
    private X509Certificate signingCert;
    private final Set<TrustAnchor> trustAnchors;
    private final Date validationDate;
    private final int validityModel;
    private X500Principal workingIssuerName;
    private PublicKey workingPublicKey;
    private static Logger LOG = Logger.getLogger(X509RevocationChecker.class.getName());
    protected static final String[] crlReasons = {StubApp.getString2(27723), StubApp.getString2(27724), StubApp.getString2(27725), StubApp.getString2(27726), StubApp.getString2(27727), StubApp.getString2(27728), StubApp.getString2(27729), StubApp.getString2(351), StubApp.getString2(27730), StubApp.getString2(27721), StubApp.getString2(27722)};

    public static class Builder {
        private boolean canSoftFail;
        private List<CertStore> crlCertStores;
        private List<Store<CRL>> crls;
        private long failHardMaxTime;
        private long failLogMaxTime;
        private boolean isCheckEEOnly;
        private Provider provider;
        private String providerName;
        private Set<TrustAnchor> trustAnchors;
        private Date validityDate;
        private int validityModel;

        public Builder(KeyStore keyStore) throws KeyStoreException {
            this.crlCertStores = new ArrayList();
            this.crls = new ArrayList();
            this.validityModel = 0;
            this.validityDate = new Date();
            this.trustAnchors = new HashSet();
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (keyStore.isCertificateEntry(nextElement)) {
                    this.trustAnchors.add(new TrustAnchor((X509Certificate) keyStore.getCertificate(nextElement), null));
                }
            }
        }

        public Builder addCrls(CertStore certStore) {
            this.crlCertStores.add(certStore);
            return this;
        }

        public X509RevocationChecker build() {
            return new X509RevocationChecker(this);
        }

        public Builder setCheckEndEntityOnly(boolean z2) {
            this.isCheckEEOnly = z2;
            return this;
        }

        public Builder setDate(Date date) {
            this.validityDate = new Date(date.getTime());
            return this;
        }

        public Builder setSoftFail(boolean z2, long j) {
            this.canSoftFail = z2;
            this.failLogMaxTime = j;
            this.failHardMaxTime = -1L;
            return this;
        }

        public Builder setSoftFailHardLimit(boolean z2, long j) {
            this.canSoftFail = z2;
            this.failLogMaxTime = (3 * j) / 4;
            this.failHardMaxTime = j;
            return this;
        }

        public Builder setValidityModel(int i3) {
            this.validityModel = i3;
            return this;
        }

        public Builder usingProvider(String str) {
            this.providerName = str;
            return this;
        }

        public Builder(TrustAnchor trustAnchor) {
            this.crlCertStores = new ArrayList();
            this.crls = new ArrayList();
            this.validityModel = 0;
            this.validityDate = new Date();
            this.trustAnchors = Collections.singleton(trustAnchor);
        }

        public Builder addCrls(Store<CRL> store) {
            this.crls.add(store);
            return this;
        }

        public Builder usingProvider(Provider provider) {
            this.provider = provider;
            return this;
        }

        public Builder(Set<TrustAnchor> set) {
            this.crlCertStores = new ArrayList();
            this.crls = new ArrayList();
            this.validityModel = 0;
            this.validityDate = new Date();
            this.trustAnchors = new HashSet(set);
        }
    }

    public static class LocalCRLStore implements PKIXCRLStore<CRL>, Iterable<CRL> {
        private Collection<CRL> _local;

        public LocalCRLStore(Store<CRL> store) {
            this._local = new ArrayList(store.getMatches(null));
        }

        @Override // org.bouncycastle.jcajce.PKIXCRLStore, org.bouncycastle.util.Store
        public Collection<CRL> getMatches(Selector<CRL> selector) {
            if (selector == null) {
                return new ArrayList(this._local);
            }
            ArrayList arrayList = new ArrayList();
            for (CRL crl : this._local) {
                if (selector.match(crl)) {
                    arrayList.add(crl);
                }
            }
            return arrayList;
        }

        @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
        public Iterator<CRL> iterator() {
            return getMatches(null).iterator();
        }
    }

    private X509RevocationChecker(Builder builder) {
        this.failures = new HashMap();
        this.crls = new ArrayList(builder.crls);
        this.crlCertStores = new ArrayList(builder.crlCertStores);
        this.isCheckEEOnly = builder.isCheckEEOnly;
        this.validityModel = builder.validityModel;
        this.trustAnchors = builder.trustAnchors;
        this.canSoftFail = builder.canSoftFail;
        this.failLogMaxTime = builder.failLogMaxTime;
        this.failHardMaxTime = builder.failHardMaxTime;
        this.validationDate = builder.validityDate;
        if (builder.provider != null) {
            this.helper = new ProviderJcaJceHelper(builder.provider);
        } else if (builder.providerName != null) {
            this.helper = new NamedJcaJceHelper(builder.providerName);
        } else {
            this.helper = new DefaultJcaJceHelper();
        }
    }

    private void addIssuers(final List<X500Principal> list, CertStore certStore) throws CertStoreException {
        certStore.getCRLs(new X509CRLSelector() { // from class: org.bouncycastle.pkix.jcajce.X509RevocationChecker.1
            @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
            public boolean match(CRL crl) {
                if (!(crl instanceof X509CRL)) {
                    return false;
                }
                list.add(((X509CRL) crl).getIssuerX500Principal());
                return false;
            }
        });
    }

    private Set<CRL> downloadCRLs(X500Principal x500Principal, Date date, ASN1Primitive aSN1Primitive, JcaJceHelper jcaJceHelper) {
        URI uri;
        PKIXCRLStore crl;
        DistributionPoint[] distributionPoints = CRLDistPoint.getInstance(aSN1Primitive).getDistributionPoints();
        try {
            CertificateFactory createCertificateFactory = jcaJceHelper.createCertificateFactory(StubApp.getString2("19963"));
            X509CRLSelector x509CRLSelector = new X509CRLSelector();
            x509CRLSelector.addIssuer(x500Principal);
            PKIXCRLStoreSelector<? extends CRL> build = new PKIXCRLStoreSelector.Builder(x509CRLSelector).build();
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 != distributionPoints.length; i3++) {
                DistributionPointName distributionPoint = distributionPoints[i3].getDistributionPoint();
                if (distributionPoint != null && distributionPoint.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint.getName()).getNames();
                    for (int i10 = 0; i10 != names.length; i10++) {
                        GeneralName generalName = names[i10];
                        if (generalName.getTagNo() == 6) {
                            try {
                                uri = new URI(((ASN1String) generalName.getName()).getString());
                                try {
                                    crl = CrlCache.getCrl(createCertificateFactory, this.validationDate, uri);
                                } catch (Exception e10) {
                                    e = e10;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                uri = null;
                            }
                            if (crl != null) {
                                try {
                                    hashSet.addAll(PKIXCRLUtil.findCRLs(build, date, Collections.EMPTY_LIST, Collections.singletonList(crl)));
                                } catch (Exception e12) {
                                    e = e12;
                                    Logger logger = LOG;
                                    Level level = Level.FINE;
                                    boolean isLoggable = logger.isLoggable(level);
                                    String string2 = StubApp.getString2(33924);
                                    String string22 = StubApp.getString2(33925);
                                    if (isLoggable) {
                                        LOG.log(level, string22 + uri + string2 + e.getMessage(), (Throwable) e);
                                    } else {
                                        LOG.log(Level.INFO, string22 + uri + string2 + e.getMessage());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return hashSet;
        } catch (Exception e13) {
            Logger logger2 = LOG;
            Level level2 = Level.FINE;
            boolean isLoggable2 = logger2.isLoggable(level2);
            String string23 = StubApp.getString2(33926);
            if (isLoggable2) {
                LOG.log(level2, string23 + e13.getMessage(), (Throwable) e13);
            } else {
                LOG.log(Level.INFO, string23 + e13.getMessage());
            }
            return null;
        }
    }

    public static List<PKIXCRLStore> getAdditionalStoresFromCRLDistributionPoint(CRLDistPoint cRLDistPoint, Map<GeneralName, PKIXCRLStore> map) throws AnnotatedException {
        if (cRLDistPoint == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
            ArrayList arrayList = new ArrayList();
            for (DistributionPoint distributionPoint : distributionPoints) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2 != null && distributionPoint2.getType() == 0) {
                    for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                        PKIXCRLStore pKIXCRLStore = map.get(generalName);
                        if (pKIXCRLStore != null) {
                            arrayList.add(pKIXCRLStore);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e10) {
            throw new AnnotatedException(StubApp.getString2(33927), e10);
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection<String> collection) throws CertPathValidatorException {
        GeneralSecurityException generalSecurityException;
        X509RevocationChecker x509RevocationChecker;
        Logger logger;
        Level level;
        StringBuilder sb2;
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (this.isCheckEEOnly && x509Certificate.getBasicConstraints() != -1) {
            this.workingIssuerName = x509Certificate.getSubjectX500Principal();
            this.workingPublicKey = x509Certificate.getPublicKey();
            this.signingCert = x509Certificate;
            return;
        }
        if (this.workingIssuerName == null) {
            this.workingIssuerName = x509Certificate.getIssuerX500Principal();
            TrustAnchor trustAnchor = null;
            for (TrustAnchor trustAnchor2 : this.trustAnchors) {
                if (this.workingIssuerName.equals(trustAnchor2.getCA()) || this.workingIssuerName.equals(trustAnchor2.getTrustedCert().getSubjectX500Principal())) {
                    trustAnchor = trustAnchor2;
                }
            }
            if (trustAnchor == null) {
                throw new CertPathValidatorException(StubApp.getString2(33928) + this.workingIssuerName);
            }
            X509Certificate trustedCert = trustAnchor.getTrustedCert();
            this.signingCert = trustedCert;
            this.workingPublicKey = trustedCert.getPublicKey();
        }
        ArrayList arrayList = new ArrayList();
        try {
            PKIXParameters pKIXParameters = new PKIXParameters(this.trustAnchors);
            pKIXParameters.setRevocationEnabled(false);
            pKIXParameters.setDate(this.validationDate);
            for (int i3 = 0; i3 != this.crlCertStores.size(); i3++) {
                try {
                    if (LOG.isLoggable(Level.INFO)) {
                        addIssuers(arrayList, this.crlCertStores.get(i3));
                    }
                    pKIXParameters.addCertStore(this.crlCertStores.get(i3));
                } catch (GeneralSecurityException e10) {
                    generalSecurityException = e10;
                    throw new RuntimeException(a.h(generalSecurityException, new StringBuilder(StubApp.getString2(33934))));
                }
            }
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXParameters);
            builder.setValidityModel(this.validityModel);
            for (int i10 = 0; i10 != this.crls.size(); i10++) {
                if (LOG.isLoggable(Level.INFO)) {
                    addIssuers(arrayList, this.crls.get(i10));
                }
                builder.addCRLStore(new LocalCRLStore(this.crls.get(i10)));
            }
            boolean isEmpty = arrayList.isEmpty();
            String string2 = StubApp.getString2(2123);
            if (isEmpty) {
                LOG.log(Level.INFO, StubApp.getString2(33929));
            } else if (LOG.isLoggable(Level.FINE)) {
                for (int i11 = 0; i11 != arrayList.size(); i11++) {
                    LOG.log(Level.FINE, StubApp.getString2(33930) + arrayList.get(i11) + string2);
                }
            } else {
                LOG.log(Level.INFO, StubApp.getString2(33931) + arrayList.size() + StubApp.getString2(33932));
            }
            PKIXExtendedParameters build = builder.build();
            Date validityDate = RevocationUtilities.getValidityDate(build, this.validationDate);
            try {
                x509RevocationChecker = this;
                try {
                    x509RevocationChecker.checkCRLs(build, this.currentDate, validityDate, x509Certificate, this.signingCert, this.workingPublicKey, new ArrayList(), this.helper);
                } catch (AnnotatedException e11) {
                    e = e11;
                    AnnotatedException annotatedException = e;
                    throw new CertPathValidatorException(annotatedException.getMessage(), annotatedException.getCause());
                } catch (CRLNotFoundException e12) {
                    e = e12;
                    CRLNotFoundException cRLNotFoundException = e;
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.cRLDistributionPoints;
                    if (x509Certificate.getExtensionValue(aSN1ObjectIdentifier.getId()) == null) {
                        throw cRLNotFoundException;
                    }
                    try {
                        Set<CRL> downloadCRLs = downloadCRLs(x509Certificate.getIssuerX500Principal(), validityDate, RevocationUtilities.getExtensionValue(x509Certificate, aSN1ObjectIdentifier), x509RevocationChecker.helper);
                        if (!downloadCRLs.isEmpty()) {
                            try {
                                builder.addCRLStore(new LocalCRLStore(new CollectionStore(downloadCRLs)));
                                PKIXExtendedParameters build2 = builder.build();
                                x509RevocationChecker.checkCRLs(build2, x509RevocationChecker.currentDate, RevocationUtilities.getValidityDate(build2, x509RevocationChecker.validationDate), x509Certificate, x509RevocationChecker.signingCert, x509RevocationChecker.workingPublicKey, new ArrayList(), x509RevocationChecker.helper);
                            } catch (AnnotatedException e13) {
                                throw new CertPathValidatorException(e13.getMessage(), e13.getCause());
                            }
                        } else {
                            if (!x509RevocationChecker.canSoftFail) {
                                throw cRLNotFoundException;
                            }
                            X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                            Long l9 = x509RevocationChecker.failures.get(issuerX500Principal);
                            if (l9 != null) {
                                long currentTimeMillis = System.currentTimeMillis() - l9.longValue();
                                long j = x509RevocationChecker.failHardMaxTime;
                                if (j != -1 && j < currentTimeMillis) {
                                    throw cRLNotFoundException;
                                }
                                long j3 = x509RevocationChecker.failLogMaxTime;
                                String string22 = StubApp.getString2(33933);
                                if (currentTimeMillis < j3) {
                                    logger = LOG;
                                    level = Level.WARNING;
                                    sb2 = new StringBuilder(string22);
                                } else {
                                    logger = LOG;
                                    level = Level.SEVERE;
                                    sb2 = new StringBuilder(string22);
                                }
                                sb2.append(issuerX500Principal);
                                sb2.append(string2);
                                logger.log(level, sb2.toString());
                            } else {
                                x509RevocationChecker.failures.put(issuerX500Principal, Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                        x509RevocationChecker.signingCert = x509Certificate;
                        x509RevocationChecker.workingPublicKey = x509Certificate.getPublicKey();
                        x509RevocationChecker.workingIssuerName = x509Certificate.getSubjectX500Principal();
                    } catch (AnnotatedException e14) {
                        throw new CertPathValidatorException(e14.getMessage(), e14.getCause());
                    }
                }
            } catch (AnnotatedException e15) {
                e = e15;
            } catch (CRLNotFoundException e16) {
                e = e16;
                x509RevocationChecker = this;
            }
            x509RevocationChecker.signingCert = x509Certificate;
            x509RevocationChecker.workingPublicKey = x509Certificate.getPublicKey();
            x509RevocationChecker.workingIssuerName = x509Certificate.getSubjectX500Principal();
        } catch (GeneralSecurityException e17) {
            generalSecurityException = e17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkCRLs(org.bouncycastle.jcajce.PKIXExtendedParameters r20, java.util.Date r21, java.util.Date r22, java.security.cert.X509Certificate r23, java.security.cert.X509Certificate r24, java.security.PublicKey r25, java.util.List r26, org.bouncycastle.jcajce.util.JcaJceHelper r27) throws org.bouncycastle.pkix.jcajce.AnnotatedException, java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pkix.jcajce.X509RevocationChecker.checkCRLs(org.bouncycastle.jcajce.PKIXExtendedParameters, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, org.bouncycastle.jcajce.util.JcaJceHelper):void");
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Object clone() {
        return this;
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set<String> getSupportedExtensions() {
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z2) throws CertPathValidatorException {
        if (z2) {
            throw new IllegalArgumentException(StubApp.getString2(33944));
        }
        this.currentDate = new Date();
        this.workingIssuerName = null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }

    private void addIssuers(final List<X500Principal> list, Store<CRL> store) {
        store.getMatches(new Selector<CRL>() { // from class: org.bouncycastle.pkix.jcajce.X509RevocationChecker.2
            @Override // org.bouncycastle.util.Selector
            public Object clone() {
                return this;
            }

            @Override // org.bouncycastle.util.Selector
            public boolean match(CRL crl) {
                if (!(crl instanceof X509CRL)) {
                    return false;
                }
                list.add(((X509CRL) crl).getIssuerX500Principal());
                return false;
            }
        });
    }
}
