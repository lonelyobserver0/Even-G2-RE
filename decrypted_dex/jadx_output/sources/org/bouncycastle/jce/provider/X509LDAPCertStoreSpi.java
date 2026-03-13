package org.bouncycastle.jce.provider;

import E1.a;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509LDAPCertStoreSpi extends CertStoreSpi {
    private static String LDAP_PROVIDER = StubApp.getString2(32664);
    private static String REFERRALS_IGNORE = StubApp.getString2(32875);
    private static final String SEARCH_SECURITY_LEVEL = StubApp.getString2(1337);
    private static final String URL_CONTEXT_PREFIX = StubApp.getString2(32862);
    private X509LDAPCertStoreParameters params;

    public X509LDAPCertStoreSpi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        if (certStoreParameters instanceof X509LDAPCertStoreParameters) {
            this.params = (X509LDAPCertStoreParameters) certStoreParameters;
            return;
        }
        throw new InvalidAlgorithmParameterException(X509LDAPCertStoreSpi.class.getName() + StubApp.getString2(32857) + X509LDAPCertStoreParameters.class.getName() + StubApp.getString2(32858) + certStoreParameters.toString());
    }

    private Set certSubjectSerialSearch(X509CertSelector x509CertSelector, String[] strArr, String str, String str2) throws CertStoreException {
        String name;
        String str3;
        Set search;
        HashSet hashSet = new HashSet();
        try {
            if (x509CertSelector.getSubjectAsBytes() == null && x509CertSelector.getSubjectAsString() == null && x509CertSelector.getCertificate() == null) {
                search = search(str, "*", strArr);
                hashSet.addAll(search);
                return hashSet;
            }
            if (x509CertSelector.getCertificate() != null) {
                name = x509CertSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
                str3 = x509CertSelector.getCertificate().getSerialNumber().toString();
            } else {
                name = x509CertSelector.getSubjectAsBytes() != null ? new X500Principal(x509CertSelector.getSubjectAsBytes()).getName("RFC1779") : x509CertSelector.getSubjectAsString();
                str3 = null;
            }
            hashSet.addAll(search(str, "*" + parseDN(name, str2) + "*", strArr));
            if (str3 == null || this.params.getSearchForSerialNumberIn() == null) {
                return hashSet;
            }
            search = search(this.params.getSearchForSerialNumberIn(), "*" + str3 + "*", strArr);
            hashSet.addAll(search);
            return hashSet;
        } catch (IOException e10) {
            throw new CertStoreException(b.h(StubApp.getString2(32859), e10));
        }
    }

    private DirContext connectLDAP() throws NamingException {
        Properties properties = new Properties();
        properties.setProperty(StubApp.getString2(28084), LDAP_PROVIDER);
        properties.setProperty(StubApp.getString2(32860), StubApp.getString2(824));
        properties.setProperty(StubApp.getString2(28088), this.params.getLdapURL());
        properties.setProperty(StubApp.getString2(32861), StubApp.getString2(32862));
        properties.setProperty(StubApp.getString2(32863), REFERRALS_IGNORE);
        properties.setProperty(StubApp.getString2(32864), StubApp.getString2(1337));
        return new InitialDirContext(properties);
    }

    private Set getCACertificates(X509CertSelector x509CertSelector) throws CertStoreException {
        String[] strArr = {this.params.getCACertificateAttribute()};
        Set certSubjectSerialSearch = certSubjectSerialSearch(x509CertSelector, strArr, this.params.getLdapCACertificateAttributeName(), this.params.getCACertificateSubjectAttributeName());
        if (certSubjectSerialSearch.isEmpty()) {
            certSubjectSerialSearch.addAll(search(null, StubApp.getString2(602), strArr));
        }
        return certSubjectSerialSearch;
    }

    private Set getCrossCertificates(X509CertSelector x509CertSelector) throws CertStoreException {
        String[] strArr = {this.params.getCrossCertificateAttribute()};
        Set certSubjectSerialSearch = certSubjectSerialSearch(x509CertSelector, strArr, this.params.getLdapCrossCertificateAttributeName(), this.params.getCrossCertificateSubjectAttributeName());
        if (certSubjectSerialSearch.isEmpty()) {
            certSubjectSerialSearch.addAll(search(null, StubApp.getString2(602), strArr));
        }
        return certSubjectSerialSearch;
    }

    private Set getEndCertificates(X509CertSelector x509CertSelector) throws CertStoreException {
        return certSubjectSerialSearch(x509CertSelector, new String[]{this.params.getUserCertificateAttribute()}, this.params.getLdapUserCertificateAttributeName(), this.params.getUserCertificateSubjectAttributeName());
    }

    private String parseDN(String str, String str2) {
        String substring = str.substring(str2.length() + str.toLowerCase().indexOf(str2.toLowerCase()));
        int indexOf = substring.indexOf(44);
        if (indexOf == -1) {
            indexOf = substring.length();
        }
        while (substring.charAt(indexOf - 1) == '\\') {
            indexOf = substring.indexOf(44, indexOf + 1);
            if (indexOf == -1) {
                indexOf = substring.length();
            }
        }
        String substring2 = substring.substring(0, indexOf);
        String substring3 = substring2.substring(substring2.indexOf(61) + 1);
        if (substring3.charAt(0) == ' ') {
            substring3 = substring3.substring(1);
        }
        String string2 = StubApp.getString2(2123);
        if (substring3.startsWith(string2)) {
            substring3 = substring3.substring(1);
        }
        return substring3.endsWith(string2) ? substring3.substring(0, substring3.length() - 1) : substring3;
    }

    private Set search(String str, String str2, String[] strArr) throws CertStoreException {
        String h2 = AbstractC1482f.h(str, StubApp.getString2(2359), str2);
        DirContext dirContext = null;
        if (str == null) {
            h2 = null;
        }
        HashSet hashSet = new HashSet();
        try {
            try {
                dirContext = connectLDAP();
                SearchControls searchControls = new SearchControls();
                searchControls.setSearchScope(2);
                searchControls.setCountLimit(0L);
                for (String str3 : strArr) {
                    String[] strArr2 = {str3};
                    searchControls.setReturningAttributes(strArr2);
                    String str4 = StubApp.getString2("32865") + h2 + StubApp.getString2("32866") + strArr2[0] + StubApp.getString2("32867");
                    if (h2 == null) {
                        str4 = StubApp.getString2("2830") + strArr2[0] + StubApp.getString2("32868");
                    }
                    NamingEnumeration search = dirContext.search(this.params.getBaseDN(), str4, searchControls);
                    while (search.hasMoreElements()) {
                        NamingEnumeration all = ((Attribute) ((SearchResult) search.next()).getAttributes().getAll().next()).getAll();
                        while (all.hasMore()) {
                            hashSet.add(all.next());
                        }
                    }
                }
                if (dirContext != null) {
                    try {
                        dirContext.close();
                    } catch (Exception unused) {
                    }
                }
                return hashSet;
            } catch (Throwable th) {
                if (dirContext != null) {
                    try {
                        dirContext.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e10) {
            throw new CertStoreException(StubApp.getString2("32869") + e10);
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        String certificateRevocationListIssuerAttributeName;
        String name;
        String[] strArr = {this.params.getCertificateRevocationListAttribute()};
        if (!(cRLSelector instanceof X509CRLSelector)) {
            throw new CertStoreException(StubApp.getString2(32872));
        }
        X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
        HashSet hashSet = new HashSet();
        String ldapCertificateRevocationListAttributeName = this.params.getLdapCertificateRevocationListAttributeName();
        HashSet hashSet2 = new HashSet();
        Collection<Object> issuerNames = x509CRLSelector.getIssuerNames();
        String string2 = StubApp.getString2(602);
        if (issuerNames != null) {
            for (Object obj : x509CRLSelector.getIssuerNames()) {
                if (obj instanceof String) {
                    certificateRevocationListIssuerAttributeName = this.params.getCertificateRevocationListIssuerAttributeName();
                    name = (String) obj;
                } else {
                    certificateRevocationListIssuerAttributeName = this.params.getCertificateRevocationListIssuerAttributeName();
                    name = new X500Principal((byte[]) obj).getName(StubApp.getString2(32870));
                }
                hashSet2.addAll(search(ldapCertificateRevocationListAttributeName, a.k(string2, parseDN(name, certificateRevocationListIssuerAttributeName), string2), strArr));
            }
        } else {
            hashSet2.addAll(search(ldapCertificateRevocationListAttributeName, string2, strArr));
        }
        hashSet2.addAll(search(null, string2, strArr));
        Iterator it = hashSet2.iterator();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(StubApp.getString2("19963"), StubApp.getString2("21668"));
            while (it.hasNext()) {
                CRL generateCRL = certificateFactory.generateCRL(new ByteArrayInputStream((byte[]) it.next()));
                if (x509CRLSelector.match(generateCRL)) {
                    hashSet.add(generateCRL);
                }
            }
            return hashSet;
        } catch (Exception e10) {
            throw new CertStoreException(a.i(StubApp.getString2(32871), e10));
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        if (!(certSelector instanceof X509CertSelector)) {
            throw new CertStoreException(StubApp.getString2(32874));
        }
        X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
        HashSet hashSet = new HashSet();
        Set<byte[]> endCertificates = getEndCertificates(x509CertSelector);
        endCertificates.addAll(getCACertificates(x509CertSelector));
        endCertificates.addAll(getCrossCertificates(x509CertSelector));
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(StubApp.getString2("19963"), StubApp.getString2("21668"));
            for (byte[] bArr : endCertificates) {
                if (bArr != null && bArr.length != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bArr);
                    try {
                        CertificatePair certificatePair = CertificatePair.getInstance(new ASN1InputStream(bArr).readObject());
                        arrayList.clear();
                        if (certificatePair.getForward() != null) {
                            arrayList.add(certificatePair.getForward().getEncoded());
                        }
                        if (certificatePair.getReverse() != null) {
                            arrayList.add(certificatePair.getReverse().getEncoded());
                        }
                    } catch (IOException | IllegalArgumentException unused) {
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream((byte[]) it.next()));
                            if (x509CertSelector.match(generateCertificate)) {
                                hashSet.add(generateCertificate);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            return hashSet;
        } catch (Exception e10) {
            throw new CertStoreException(a.i(StubApp.getString2(32873), e10));
        }
    }
}
