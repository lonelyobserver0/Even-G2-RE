package org.bouncycastle.jcajce.provider.asymmetric.x509;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.cert.CertPath;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXCertPath extends CertPath {
    static final List certPathEncodings;
    private List certificates;
    private final JcaJceHelper helper;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(30868));
        arrayList.add(StubApp.getString2(10235));
        arrayList.add(StubApp.getString2(29174));
        certPathEncodings = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PKIXCertPath(java.io.InputStream r5, java.lang.String r6) throws java.security.cert.CertificateException {
        /*
            r4 = this;
            r0 = 30881(0x78a1, float:4.3273E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 19963(0x4dfb, float:2.7974E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r4.<init>(r1)
            org.bouncycastle.jcajce.util.BCJcaJceHelper r2 = new org.bouncycastle.jcajce.util.BCJcaJceHelper
            r2.<init>()
            r4.helper = r2
            java.lang.String r3 = "30868"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            boolean r3 = r6.equalsIgnoreCase(r3)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            if (r3 == 0) goto L7c
            org.bouncycastle.asn1.ASN1InputStream r6 = new org.bouncycastle.asn1.ASN1InputStream     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r6.<init>(r5)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            org.bouncycastle.asn1.ASN1Primitive r5 = r6.readObject()     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            boolean r6 = r5 instanceof org.bouncycastle.asn1.ASN1Sequence     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            if (r6 == 0) goto L70
            org.bouncycastle.asn1.ASN1Sequence r5 = (org.bouncycastle.asn1.ASN1Sequence) r5     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.util.Enumeration r5 = r5.getObjects()     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r6.<init>()     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r4.certificates = r6     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.security.cert.CertificateFactory r6 = r2.createCertificateFactory(r1)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
        L42:
            boolean r0 = r5.hasMoreElements()     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r5.nextElement()     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            org.bouncycastle.asn1.ASN1Encodable r0 = (org.bouncycastle.asn1.ASN1Encodable) r0     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            org.bouncycastle.asn1.ASN1Primitive r0 = r0.toASN1Primitive()     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.lang.String r1 = "26791"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            byte[] r0 = r0.getEncoded(r1)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.util.List r1 = r4.certificates     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r2.<init>(r0)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.security.cert.Certificate r0 = r6.generateCertificate(r2)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r2 = 0
            r1.add(r2, r0)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            goto L42
        L6c:
            r5 = move-exception
            goto Lc4
        L6e:
            r5 = move-exception
            goto Le1
        L70:
            java.security.cert.CertificateException r5 = new java.security.cert.CertificateException     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.lang.String r6 = "30882"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r5.<init>(r6)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            throw r5     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
        L7c:
            java.lang.String r3 = "29174"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            boolean r3 = r6.equalsIgnoreCase(r3)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            if (r3 != 0) goto L9f
            java.lang.String r3 = "10235"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            boolean r3 = r6.equalsIgnoreCase(r3)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            if (r3 == 0) goto L95
            goto L9f
        L95:
            java.security.cert.CertificateException r5 = new java.security.cert.CertificateException     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.lang.String r6 = r0.concat(r6)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r5.<init>(r6)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            throw r5     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
        L9f:
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r6.<init>(r5)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r5.<init>()     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r4.certificates = r5     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            java.security.cert.CertificateFactory r5 = r2.createCertificateFactory(r1)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
        Laf:
            java.security.cert.Certificate r0 = r5.generateCertificate(r6)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            if (r0 == 0) goto Lbb
            java.util.List r1 = r4.certificates     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            r1.add(r0)     // Catch: java.security.NoSuchProviderException -> L6c java.io.IOException -> L6e
            goto Laf
        Lbb:
            java.util.List r5 = r4.certificates
            java.util.List r5 = r4.sortCerts(r5)
            r4.certificates = r5
            return
        Lc4:
            java.security.cert.CertificateException r6 = new java.security.cert.CertificateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 30883(0x78a3, float:4.3276E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Le1:
            java.security.cert.CertificateException r6 = new java.security.cert.CertificateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 30884(0x78a4, float:4.3278E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.x509.PKIXCertPath.<init>(java.io.InputStream, java.lang.String):void");
    }

    private List sortCerts(List list) {
        if (list.size() >= 2) {
            X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
            for (int i3 = 1; i3 != list.size(); i3++) {
                if (!issuerX500Principal.equals(((X509Certificate) list.get(i3)).getSubjectX500Principal())) {
                    ArrayList arrayList = new ArrayList(list.size());
                    ArrayList arrayList2 = new ArrayList(list);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        X509Certificate x509Certificate = (X509Certificate) list.get(i10);
                        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                        int i11 = 0;
                        while (true) {
                            if (i11 == list.size()) {
                                arrayList.add(x509Certificate);
                                list.remove(i10);
                                break;
                            }
                            if (((X509Certificate) list.get(i11)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                break;
                            }
                            i11++;
                        }
                    }
                    if (arrayList.size() <= 1) {
                        for (int i12 = 0; i12 != arrayList.size(); i12++) {
                            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i12)).getIssuerX500Principal();
                            int i13 = 0;
                            while (true) {
                                if (i13 < list.size()) {
                                    X509Certificate x509Certificate2 = (X509Certificate) list.get(i13);
                                    if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                        arrayList.add(x509Certificate2);
                                        list.remove(i13);
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        }
                        if (list.size() <= 0) {
                            return arrayList;
                        }
                    }
                    return arrayList2;
                }
                issuerX500Principal = ((X509Certificate) list.get(i3)).getIssuerX500Principal();
            }
        }
        return list;
    }

    private ASN1Primitive toASN1Object(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new ASN1InputStream(x509Certificate.getEncoded()).readObject();
        } catch (Exception e10) {
            throw new CertificateEncodingException(a.b(e10, new StringBuilder(StubApp.getString2(30885))));
        }
    }

    private byte[] toDEREncoded(ASN1Encodable aSN1Encodable) throws CertificateEncodingException {
        try {
            return aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new CertificateEncodingException(b.h(StubApp.getString2(30886), e10));
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.certificates));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() throws CertificateEncodingException {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return certPathEncodings.iterator();
    }

    public PKIXCertPath(List list) {
        super(StubApp.getString2(19963));
        this.helper = new BCJcaJceHelper();
        this.certificates = sortCerts(new ArrayList(list));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) throws CertificateEncodingException {
        if (str.equalsIgnoreCase(StubApp.getString2(30868))) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                aSN1EncodableVector.add(toASN1Object((X509Certificate) listIterator.previous()));
            }
            return toDEREncoded(new DERSequence(aSN1EncodableVector));
        }
        int i3 = 0;
        if (str.equalsIgnoreCase(StubApp.getString2(29174))) {
            ContentInfo contentInfo = new ContentInfo(PKCSObjectIdentifiers.data, null);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            while (i3 != this.certificates.size()) {
                aSN1EncodableVector2.add(toASN1Object((X509Certificate) this.certificates.get(i3)));
                i3++;
            }
            return toDEREncoded(new ContentInfo(PKCSObjectIdentifiers.signedData, new SignedData(new ASN1Integer(1L), new DERSet(), contentInfo, new DERSet(aSN1EncodableVector2), null, new DERSet())));
        }
        if (!str.equalsIgnoreCase(StubApp.getString2(10235))) {
            throw new CertificateEncodingException(StubApp.getString2(30881).concat(str));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PemWriter pemWriter = new PemWriter(new OutputStreamWriter(byteArrayOutputStream));
        while (i3 != this.certificates.size()) {
            try {
                pemWriter.writeObject(new PemObject(StubApp.getString2("30865"), ((X509Certificate) this.certificates.get(i3)).getEncoded()));
                i3++;
            } catch (Exception unused) {
                throw new CertificateEncodingException(StubApp.getString2(30887));
            }
        }
        pemWriter.close();
        return byteArrayOutputStream.toByteArray();
    }
}
