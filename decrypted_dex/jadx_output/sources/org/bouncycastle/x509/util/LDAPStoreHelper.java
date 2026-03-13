package org.bouncycastle.x509.util;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.jce.provider.X509AttrCertParser;
import org.bouncycastle.jce.provider.X509CRLParser;
import org.bouncycastle.jce.provider.X509CertPairParser;
import org.bouncycastle.jce.provider.X509CertParser;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CRLStoreSelector;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;
import org.bouncycastle.x509.X509CertificatePair;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LDAPStoreHelper {
    private static String LDAP_PROVIDER = StubApp.getString2(32664);
    private static String REFERRALS_IGNORE = StubApp.getString2(32875);
    private static final String SEARCH_SECURITY_LEVEL = StubApp.getString2(1337);
    private static final String URL_CONTEXT_PREFIX = StubApp.getString2(32862);
    private static int cacheSize = 32;
    private static long lifeTime = 60000;
    private Map cacheMap = new HashMap(cacheSize);
    private X509LDAPCertStoreParameters params;

    public LDAPStoreHelper(X509LDAPCertStoreParameters x509LDAPCertStoreParameters) {
        this.params = x509LDAPCertStoreParameters;
    }

    private synchronized void addToCache(String str, List list) {
        Map map;
        try {
            Date date = new Date(System.currentTimeMillis());
            ArrayList arrayList = new ArrayList();
            arrayList.add(date);
            arrayList.add(list);
            if (this.cacheMap.containsKey(str)) {
                map = this.cacheMap;
            } else {
                if (this.cacheMap.size() >= cacheSize) {
                    long time = date.getTime();
                    Object obj = null;
                    for (Map.Entry entry : this.cacheMap.entrySet()) {
                        long time2 = ((Date) ((List) entry.getValue()).get(0)).getTime();
                        if (time2 < time) {
                            obj = entry.getKey();
                            time = time2;
                        }
                    }
                    this.cacheMap.remove(obj);
                }
                map = this.cacheMap;
            }
            map.put(str, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[LOOP:0: B:26:0x00a2->B:28:0x00a5, LOOP_START, PHI: r4
      0x00a2: PHI (r4v5 int) = (r4v1 int), (r4v6 int) binds: [B:25:0x00a0, B:28:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1 A[LOOP:1: B:35:0x00cb->B:37:0x00d1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List attrCertSubjectSerialSearch(org.bouncycastle.x509.X509AttributeCertStoreSelector r6, java.lang.String[] r7, java.lang.String[] r8, java.lang.String[] r9) throws org.bouncycastle.util.StoreException {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r6.getHolder()
            r3 = 0
            if (r2 == 0) goto L3d
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r6.getHolder()
            java.math.BigInteger r2 = r2.getSerialNumber()
            if (r2 == 0) goto L2a
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r6.getHolder()
            java.math.BigInteger r2 = r2.getSerialNumber()
            java.lang.String r2 = r2.toString()
            r1.add(r2)
        L2a:
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r6.getHolder()
            java.security.Principal[] r2 = r2.getEntityNames()
            if (r2 == 0) goto L3d
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r6.getHolder()
            java.security.Principal[] r2 = r2.getEntityNames()
            goto L3e
        L3d:
            r2 = r3
        L3e:
            org.bouncycastle.x509.X509AttributeCertificate r4 = r6.getAttributeCert()
            if (r4 == 0) goto L6d
            org.bouncycastle.x509.X509AttributeCertificate r4 = r6.getAttributeCert()
            org.bouncycastle.x509.AttributeCertificateHolder r4 = r4.getHolder()
            java.security.Principal[] r4 = r4.getEntityNames()
            if (r4 == 0) goto L5e
            org.bouncycastle.x509.X509AttributeCertificate r2 = r6.getAttributeCert()
            org.bouncycastle.x509.AttributeCertificateHolder r2 = r2.getHolder()
            java.security.Principal[] r2 = r2.getEntityNames()
        L5e:
            org.bouncycastle.x509.X509AttributeCertificate r4 = r6.getAttributeCert()
            java.math.BigInteger r4 = r4.getSerialNumber()
            java.lang.String r4 = r4.toString()
            r1.add(r4)
        L6d:
            r4 = 0
            if (r2 == 0) goto L88
            r2 = r2[r4]
            boolean r3 = r2 instanceof javax.security.auth.x500.X500Principal
            if (r3 == 0) goto L84
            javax.security.auth.x500.X500Principal r2 = (javax.security.auth.x500.X500Principal) r2
            r3 = 32870(0x8066, float:4.606E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            java.lang.String r3 = r2.getName(r3)
            goto L88
        L84:
            java.lang.String r3 = r2.getName()
        L88:
            java.math.BigInteger r2 = r6.getSerialNumber()
            if (r2 == 0) goto L99
            java.math.BigInteger r6 = r6.getSerialNumber()
            java.lang.String r6 = r6.toString()
            r1.add(r6)
        L99:
            r6 = 602(0x25a, float:8.44E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            if (r3 == 0) goto Lb9
        La2:
            int r2 = r9.length
            if (r4 >= r2) goto Lb9
            r2 = r9[r4]
            java.lang.String r2 = r5.parseDN(r3, r2)
            java.lang.String r2 = E1.a.k(r6, r2, r6)
            java.util.List r2 = r5.search(r8, r2, r7)
            r0.addAll(r2)
            int r4 = r4 + 1
            goto La2
        Lb9:
            int r9 = r1.size()
            if (r9 <= 0) goto Le9
            org.bouncycastle.jce.X509LDAPCertStoreParameters r9 = r5.params
            java.lang.String r9 = r9.getSearchForSerialNumberIn()
            if (r9 == 0) goto Le9
            java.util.Iterator r9 = r1.iterator()
        Lcb:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Le9
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            org.bouncycastle.jce.X509LDAPCertStoreParameters r4 = r5.params
            java.lang.String r4 = r4.getSearchForSerialNumberIn()
            java.lang.String[] r4 = r5.splitString(r4)
            java.util.List r2 = r5.search(r4, r2, r7)
            r0.addAll(r2)
            goto Lcb
        Le9:
            int r9 = r1.size()
            if (r9 != 0) goto Lf8
            if (r3 != 0) goto Lf8
            java.util.List r6 = r5.search(r8, r6, r7)
            r0.addAll(r6)
        Lf8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.util.LDAPStoreHelper.attrCertSubjectSerialSearch(org.bouncycastle.x509.X509AttributeCertStoreSelector, java.lang.String[], java.lang.String[], java.lang.String[]):java.util.List");
    }

    private List cRLIssuerSearch(X509CRLStoreSelector x509CRLStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        String string2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (x509CRLStoreSelector.getIssuers() != null) {
            hashSet.addAll(x509CRLStoreSelector.getIssuers());
        }
        if (x509CRLStoreSelector.getCertificateChecking() != null) {
            hashSet.add(getCertificateIssuer(x509CRLStoreSelector.getCertificateChecking()));
        }
        if (x509CRLStoreSelector.getAttrCertificateChecking() != null) {
            for (Principal principal : x509CRLStoreSelector.getAttrCertificateChecking().getIssuer().getPrincipals()) {
                if (principal instanceof X500Principal) {
                    hashSet.add(principal);
                }
            }
        }
        Iterator it = hashSet.iterator();
        String str = null;
        while (true) {
            boolean hasNext = it.hasNext();
            string2 = StubApp.getString2(602);
            if (!hasNext) {
                break;
            }
            str = ((X500Principal) it.next()).getName(StubApp.getString2(32870));
            for (String str2 : strArr3) {
                arrayList.addAll(search(strArr2, a.k(string2, parseDN(str, str2), string2), strArr));
            }
        }
        if (str == null) {
            arrayList.addAll(search(strArr2, string2, strArr));
        }
        return arrayList;
    }

    private List certSubjectSerialSearch(X509CertStoreSelector x509CertStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        ArrayList arrayList = new ArrayList();
        String subjectAsString = getSubjectAsString(x509CertStoreSelector);
        String bigInteger = x509CertStoreSelector.getSerialNumber() != null ? x509CertStoreSelector.getSerialNumber().toString() : null;
        if (x509CertStoreSelector.getCertificate() != null) {
            subjectAsString = x509CertStoreSelector.getCertificate().getSubjectX500Principal().getName(StubApp.getString2(32870));
            bigInteger = x509CertStoreSelector.getCertificate().getSerialNumber().toString();
        }
        String string2 = StubApp.getString2(602);
        if (subjectAsString != null) {
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, a.k(string2, parseDN(subjectAsString, str), string2), strArr));
            }
        }
        if (bigInteger != null && this.params.getSearchForSerialNumberIn() != null) {
            arrayList.addAll(search(splitString(this.params.getSearchForSerialNumberIn()), bigInteger, strArr));
        }
        if (bigInteger == null && subjectAsString == null) {
            arrayList.addAll(search(strArr2, string2, strArr));
        }
        return arrayList;
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

    private Set createAttributeCertificates(List list, X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        X509AttrCertParser x509AttrCertParser = new X509AttrCertParser();
        while (it.hasNext()) {
            try {
                x509AttrCertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509AttributeCertificate x509AttributeCertificate = (X509AttributeCertificate) x509AttrCertParser.engineRead();
                if (x509AttributeCertStoreSelector.match(x509AttributeCertificate)) {
                    hashSet.add(x509AttributeCertificate);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private Set createCRLs(List list, X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        HashSet hashSet = new HashSet();
        X509CRLParser x509CRLParser = new X509CRLParser();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                x509CRLParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509CRL x509crl = (X509CRL) x509CRLParser.engineRead();
                if (x509CRLStoreSelector.match((Object) x509crl)) {
                    hashSet.add(x509crl);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private Set createCerts(List list, X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        X509CertParser x509CertParser = new X509CertParser();
        while (it.hasNext()) {
            try {
                x509CertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509Certificate x509Certificate = (X509Certificate) x509CertParser.engineRead();
                if (x509CertStoreSelector.match((Object) x509Certificate)) {
                    hashSet.add(x509Certificate);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    private Set createCrossCertificatePairs(List list, X509CertPairStoreSelector x509CertPairStoreSelector) throws StoreException {
        X509CertificatePair x509CertificatePair;
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (i3 < list.size()) {
            try {
                try {
                    X509CertPairParser x509CertPairParser = new X509CertPairParser();
                    x509CertPairParser.engineInit(new ByteArrayInputStream((byte[]) list.get(i3)));
                    x509CertificatePair = (X509CertificatePair) x509CertPairParser.engineRead();
                } catch (IOException | CertificateParsingException unused) {
                }
            } catch (StreamParsingException unused2) {
                int i10 = i3 + 1;
                i3 = i10;
                x509CertificatePair = new X509CertificatePair(new CertificatePair(Certificate.getInstance(new ASN1InputStream((byte[]) list.get(i3)).readObject()), Certificate.getInstance(new ASN1InputStream((byte[]) list.get(i10)).readObject())));
            }
            if (x509CertPairStoreSelector.match(x509CertificatePair)) {
                hashSet.add(x509CertificatePair);
            }
            i3++;
        }
        return hashSet;
    }

    private List crossCertificatePairSubjectSearch(X509CertPairStoreSelector x509CertPairStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        ArrayList arrayList = new ArrayList();
        String subjectAsString = x509CertPairStoreSelector.getForwardSelector() != null ? getSubjectAsString(x509CertPairStoreSelector.getForwardSelector()) : null;
        if (x509CertPairStoreSelector.getCertPair() != null && x509CertPairStoreSelector.getCertPair().getForward() != null) {
            subjectAsString = x509CertPairStoreSelector.getCertPair().getForward().getSubjectX500Principal().getName(StubApp.getString2(32870));
        }
        String string2 = StubApp.getString2(602);
        if (subjectAsString != null) {
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, a.k(string2, parseDN(subjectAsString, str), string2), strArr));
            }
        }
        if (subjectAsString == null) {
            arrayList.addAll(search(strArr2, string2, strArr));
        }
        return arrayList;
    }

    private X500Principal getCertificateIssuer(X509Certificate x509Certificate) {
        return x509Certificate.getIssuerX500Principal();
    }

    private List getFromCache(String str) {
        List list = (List) this.cacheMap.get(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (list == null || ((Date) list.get(0)).getTime() < currentTimeMillis - lifeTime) {
            return null;
        }
        return (List) list.get(1);
    }

    private String getSubjectAsString(X509CertStoreSelector x509CertStoreSelector) {
        try {
            byte[] subjectAsBytes = x509CertStoreSelector.getSubjectAsBytes();
            if (subjectAsBytes != null) {
                return new X500Principal(subjectAsBytes).getName(StubApp.getString2("32870"));
            }
            return null;
        } catch (IOException e10) {
            throw new StoreException(u.q(e10, new StringBuilder(StubApp.getString2(35165))), e10);
        }
    }

    private String parseDN(String str, String str2) {
        int indexOf = str.toLowerCase().indexOf(str2.toLowerCase() + StubApp.getString2(2359));
        if (indexOf == -1) {
            return "";
        }
        String substring = str.substring(str2.length() + indexOf);
        int indexOf2 = substring.indexOf(44);
        if (indexOf2 == -1) {
            indexOf2 = substring.length();
        }
        while (substring.charAt(indexOf2 - 1) == '\\') {
            indexOf2 = substring.indexOf(44, indexOf2 + 1);
            if (indexOf2 == -1) {
                indexOf2 = substring.length();
            }
        }
        String substring2 = substring.substring(0, indexOf2);
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

    private List search(String[] strArr, String str, String[] strArr2) throws StoreException {
        String k3;
        String string2 = StubApp.getString2(35166);
        String string22 = StubApp.getString2(2830);
        DirContext dirContext = null;
        String string23 = StubApp.getString2(74);
        if (strArr == null) {
            k3 = null;
        } else {
            if (str.equals(StubApp.getString2(35167))) {
                str = StubApp.getString2(602);
            }
            String str2 = "";
            for (String str3 : strArr) {
                StringBuilder n10 = AbstractC1482f.n(str2, string22);
                n10.append(str3);
                n10.append(StubApp.getString2(2359));
                n10.append(str);
                n10.append(string23);
                str2 = n10.toString();
            }
            k3 = a.k(string2, str2, string23);
        }
        String str4 = "";
        for (String str5 : strArr2) {
            str4 = AbstractC1482f.k(AbstractC1482f.n(str4, string22), str5, StubApp.getString2(32868));
        }
        String k4 = a.k(string2, str4, string23);
        String j = AbstractC1482f.j(StubApp.getString2(35168), k3, "", k4, string23);
        if (k3 != null) {
            k4 = j;
        }
        List fromCache = getFromCache(k4);
        if (fromCache != null) {
            return fromCache;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                dirContext = connectLDAP();
                SearchControls searchControls = new SearchControls();
                searchControls.setSearchScope(2);
                searchControls.setCountLimit(0L);
                searchControls.setReturningAttributes(strArr2);
                NamingEnumeration search = dirContext.search(this.params.getBaseDN(), k4, searchControls);
                while (search.hasMoreElements()) {
                    NamingEnumeration all = ((Attribute) ((SearchResult) search.next()).getAttributes().getAll().next()).getAll();
                    while (all.hasMore()) {
                        arrayList.add(all.next());
                    }
                }
                addToCache(k4, arrayList);
                dirContext.close();
                return arrayList;
            } catch (Exception unused) {
                return arrayList;
            }
        } catch (NamingException unused2) {
            if (dirContext != null) {
                dirContext.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (dirContext != null) {
                try {
                    dirContext.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    private String[] splitString(String str) {
        return str.split(StubApp.getString2(23751));
    }

    public Collection getAACertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getAACertificateAttribute());
        String[] splitString2 = splitString(this.params.getLdapAACertificateAttributeName());
        String[] splitString3 = splitString(this.params.getAACertificateSubjectAttributeName());
        Set createAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, splitString, splitString2, splitString3), x509AttributeCertStoreSelector);
        if (createAttributeCertificates.size() == 0) {
            createAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), splitString, splitString2, splitString3), x509AttributeCertStoreSelector));
        }
        return createAttributeCertificates;
    }

    public Collection getAttributeAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getAttributeAuthorityRevocationListAttribute());
        String[] splitString2 = splitString(this.params.getLdapAttributeAuthorityRevocationListAttributeName());
        String[] splitString3 = splitString(this.params.getAttributeAuthorityRevocationListIssuerAttributeName());
        Set createCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, splitString, splitString2, splitString3), x509CRLStoreSelector);
        if (createCRLs.size() == 0) {
            createCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), splitString, splitString2, splitString3), x509CRLStoreSelector));
        }
        return createCRLs;
    }

    public Collection getAttributeCertificateAttributes(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getAttributeCertificateAttributeAttribute());
        String[] splitString2 = splitString(this.params.getLdapAttributeCertificateAttributeAttributeName());
        String[] splitString3 = splitString(this.params.getAttributeCertificateAttributeSubjectAttributeName());
        Set createAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, splitString, splitString2, splitString3), x509AttributeCertStoreSelector);
        if (createAttributeCertificates.size() == 0) {
            createAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), splitString, splitString2, splitString3), x509AttributeCertStoreSelector));
        }
        return createAttributeCertificates;
    }

    public Collection getAttributeCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getAttributeCertificateRevocationListAttribute());
        String[] splitString2 = splitString(this.params.getLdapAttributeCertificateRevocationListAttributeName());
        String[] splitString3 = splitString(this.params.getAttributeCertificateRevocationListIssuerAttributeName());
        Set createCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, splitString, splitString2, splitString3), x509CRLStoreSelector);
        if (createCRLs.size() == 0) {
            createCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), splitString, splitString2, splitString3), x509CRLStoreSelector));
        }
        return createCRLs;
    }

    public Collection getAttributeDescriptorCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getAttributeDescriptorCertificateAttribute());
        String[] splitString2 = splitString(this.params.getLdapAttributeDescriptorCertificateAttributeName());
        String[] splitString3 = splitString(this.params.getAttributeDescriptorCertificateSubjectAttributeName());
        Set createAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, splitString, splitString2, splitString3), x509AttributeCertStoreSelector);
        if (createAttributeCertificates.size() == 0) {
            createAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), splitString, splitString2, splitString3), x509AttributeCertStoreSelector));
        }
        return createAttributeCertificates;
    }

    public Collection getAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getAuthorityRevocationListAttribute());
        String[] splitString2 = splitString(this.params.getLdapAuthorityRevocationListAttributeName());
        String[] splitString3 = splitString(this.params.getAuthorityRevocationListIssuerAttributeName());
        Set createCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, splitString, splitString2, splitString3), x509CRLStoreSelector);
        if (createCRLs.size() == 0) {
            createCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), splitString, splitString2, splitString3), x509CRLStoreSelector));
        }
        return createCRLs;
    }

    public Collection getCACertificates(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getCACertificateAttribute());
        String[] splitString2 = splitString(this.params.getLdapCACertificateAttributeName());
        String[] splitString3 = splitString(this.params.getCACertificateSubjectAttributeName());
        Set createCerts = createCerts(certSubjectSerialSearch(x509CertStoreSelector, splitString, splitString2, splitString3), x509CertStoreSelector);
        if (createCerts.size() == 0) {
            createCerts.addAll(createCerts(certSubjectSerialSearch(new X509CertStoreSelector(), splitString, splitString2, splitString3), x509CertStoreSelector));
        }
        return createCerts;
    }

    public Collection getCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getCertificateRevocationListAttribute());
        String[] splitString2 = splitString(this.params.getLdapCertificateRevocationListAttributeName());
        String[] splitString3 = splitString(this.params.getCertificateRevocationListIssuerAttributeName());
        Set createCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, splitString, splitString2, splitString3), x509CRLStoreSelector);
        if (createCRLs.size() == 0) {
            createCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), splitString, splitString2, splitString3), x509CRLStoreSelector));
        }
        return createCRLs;
    }

    public Collection getCrossCertificatePairs(X509CertPairStoreSelector x509CertPairStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getCrossCertificateAttribute());
        String[] splitString2 = splitString(this.params.getLdapCrossCertificateAttributeName());
        String[] splitString3 = splitString(this.params.getCrossCertificateSubjectAttributeName());
        Set createCrossCertificatePairs = createCrossCertificatePairs(crossCertificatePairSubjectSearch(x509CertPairStoreSelector, splitString, splitString2, splitString3), x509CertPairStoreSelector);
        if (createCrossCertificatePairs.size() == 0) {
            X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
            X509CertPairStoreSelector x509CertPairStoreSelector2 = new X509CertPairStoreSelector();
            x509CertPairStoreSelector2.setForwardSelector(x509CertStoreSelector);
            x509CertPairStoreSelector2.setReverseSelector(x509CertStoreSelector);
            createCrossCertificatePairs.addAll(createCrossCertificatePairs(crossCertificatePairSubjectSearch(x509CertPairStoreSelector2, splitString, splitString2, splitString3), x509CertPairStoreSelector));
        }
        return createCrossCertificatePairs;
    }

    public Collection getDeltaCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getDeltaRevocationListAttribute());
        String[] splitString2 = splitString(this.params.getLdapDeltaRevocationListAttributeName());
        String[] splitString3 = splitString(this.params.getDeltaRevocationListIssuerAttributeName());
        Set createCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, splitString, splitString2, splitString3), x509CRLStoreSelector);
        if (createCRLs.size() == 0) {
            createCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), splitString, splitString2, splitString3), x509CRLStoreSelector));
        }
        return createCRLs;
    }

    public Collection getUserCertificates(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        String[] splitString = splitString(this.params.getUserCertificateAttribute());
        String[] splitString2 = splitString(this.params.getLdapUserCertificateAttributeName());
        String[] splitString3 = splitString(this.params.getUserCertificateSubjectAttributeName());
        Set createCerts = createCerts(certSubjectSerialSearch(x509CertStoreSelector, splitString, splitString2, splitString3), x509CertStoreSelector);
        if (createCerts.size() == 0) {
            createCerts.addAll(createCerts(certSubjectSerialSearch(new X509CertStoreSelector(), splitString, splitString2, splitString3), x509CertStoreSelector));
        }
        return createCerts;
    }
}
