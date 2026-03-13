package org.bouncycastle.est;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cmc.CMCException;
import org.bouncycastle.cmc.SimplePKIResponse;
import org.bouncycastle.mime.BasicMimeParser;
import org.bouncycastle.mime.ConstantMimeContext;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeContext;
import org.bouncycastle.mime.MimeParserContext;
import org.bouncycastle.mime.MimeParserListener;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.encoders.Base64;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ESTService {
    protected static final String CACERTS = StubApp.getString2(29473);
    protected static final String CSRATTRS = StubApp.getString2(29474);
    protected static final String FULLCMC = StubApp.getString2(29475);
    protected static final String SERVERGEN = StubApp.getString2(29476);
    protected static final String SIMPLE_ENROLL = StubApp.getString2(29477);
    protected static final String SIMPLE_REENROLL = StubApp.getString2(29478);
    protected static final Set<String> illegalParts;
    private static final Pattern pathInValid;
    private final ESTClientProvider clientProvider;
    private final String server;

    static {
        HashSet hashSet = new HashSet();
        illegalParts = hashSet;
        hashSet.add(StubApp.getString2(29466));
        hashSet.add(StubApp.getString2(29467));
        hashSet.add(StubApp.getString2(29468));
        hashSet.add(StubApp.getString2(29469));
        hashSet.add(StubApp.getString2(29470));
        hashSet.add(StubApp.getString2(29471));
        pathInValid = Pattern.compile(StubApp.getString2(29472));
    }

    public ESTService(String str, String str2, ESTClientProvider eSTClientProvider) {
        String k3;
        String verifyServer = verifyServer(str);
        String string2 = StubApp.getString2(29479);
        if (str2 != null) {
            k3 = AbstractC1482f.i(string2, verifyServer, StubApp.getString2(29480), verifyLabel(str2));
        } else {
            k3 = a.k(string2, verifyServer, StubApp.getString2(29481));
        }
        this.server = k3;
        this.clientProvider = eSTClientProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String annotateRequest(byte[] bArr) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        int i3 = 0;
        do {
            int i10 = i3 + 48;
            if (i10 < bArr.length) {
                printWriter.print(Base64.toBase64String(bArr, i3, 48));
                i3 = i10;
            } else {
                printWriter.print(Base64.toBase64String(bArr, i3, bArr.length - i3));
                i3 = bArr.length;
            }
            printWriter.print('\n');
        } while (i3 < bArr.length);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static X509CertificateHolder[] storeToArray(Store<X509CertificateHolder> store) {
        return storeToArray(store, null);
    }

    private String verifyLabel(String str) {
        String string2;
        while (true) {
            string2 = StubApp.getString2(601);
            if (!str.endsWith(string2) || str.length() <= 0) {
                break;
            }
            str = str.substring(0, str.length() - 1);
        }
        while (str.startsWith(string2) && str.length() > 0) {
            str = str.substring(1);
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException(StubApp.getString2(29486));
        }
        if (!pathInValid.matcher(str).matches()) {
            throw new IllegalArgumentException(a.k(StubApp.getString2(29484), str, StubApp.getString2(29485)));
        }
        if (illegalParts.contains(str)) {
            throw new IllegalArgumentException(a.k(StubApp.getString2(29482), str, StubApp.getString2(29483)));
        }
        return str;
    }

    private String verifyServer(String str) {
        String string2 = StubApp.getString2(601);
        while (str.endsWith(string2) && str.length() > 0) {
            try {
                str = str.substring(0, str.length() - 1);
            } catch (Exception e10) {
                if (e10 instanceof IllegalArgumentException) {
                    throw ((IllegalArgumentException) e10);
                }
                throw new IllegalArgumentException(u.r(e10, new StringBuilder(StubApp.getString2(29489))), e10);
            }
        }
        if (str.contains(StubApp.getString2("13138"))) {
            throw new IllegalArgumentException(StubApp.getString2("29488"));
        }
        URL url = new URL(StubApp.getString2("29479") + str);
        if (url.getPath().length() != 0 && !url.getPath().equals(string2)) {
            throw new IllegalArgumentException(StubApp.getString2("29487"));
        }
        return str;
    }

    public EnrollmentResponse enroll(boolean z2, PKCS10CertificationRequest pKCS10CertificationRequest, ESTAuth eSTAuth, boolean z10) throws IOException {
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException(StubApp.getString2(29490));
        }
        ESTResponse eSTResponse = null;
        try {
            byte[] bytes = annotateRequest(pKCS10CertificationRequest.getEncoded()).getBytes();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.server);
            sb2.append(z10 ? "/serverkeygen" : z2 ? "/simplereenroll" : StubApp.getString2("29477"));
            URL url = new URL(sb2.toString());
            ESTClient makeClient = this.clientProvider.makeClient();
            ESTRequestBuilder withClient = new ESTRequestBuilder(StubApp.getString2("13314"), url).withData(bytes).withClient(makeClient);
            withClient.addHeader(StubApp.getString2("466"), StubApp.getString2("29459"));
            withClient.addHeader(StubApp.getString2("2415"), "" + bytes.length);
            withClient.addHeader(StubApp.getString2("29460"), StubApp.getString2("10758"));
            if (eSTAuth != null) {
                eSTAuth.applyAuth(withClient);
            }
            eSTResponse = makeClient.doRequest(withClient.build());
            EnrollmentResponse handleEnrollResponse = handleEnrollResponse(eSTResponse);
            if (eSTResponse != null) {
                eSTResponse.close();
            }
            return handleEnrollResponse;
        } catch (Throwable th) {
            try {
                if (th instanceof ESTException) {
                    throw th;
                }
                throw new ESTException(th.getMessage(), th);
            } catch (Throwable th2) {
                if (eSTResponse != null) {
                    eSTResponse.close();
                }
                throw th2;
            }
        }
    }

    public EnrollmentResponse enrollPop(boolean z2, final PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder, final ContentSigner contentSigner, ESTAuth eSTAuth, boolean z10) throws IOException {
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException(StubApp.getString2(29490));
        }
        ESTResponse eSTResponse = null;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.server);
            sb2.append(z2 ? "/simplereenroll" : StubApp.getString2("29477"));
            URL url = new URL(sb2.toString());
            ESTClient makeClient = this.clientProvider.makeClient();
            ESTRequestBuilder withConnectionListener = new ESTRequestBuilder(StubApp.getString2("13314"), url).withClient(makeClient).withConnectionListener(new ESTSourceConnectionListener() { // from class: org.bouncycastle.est.ESTService.1
                @Override // org.bouncycastle.est.ESTSourceConnectionListener
                public ESTRequest onConnection(Source source, ESTRequest eSTRequest) throws IOException {
                    if (source instanceof TLSUniqueProvider) {
                        TLSUniqueProvider tLSUniqueProvider = (TLSUniqueProvider) source;
                        if (tLSUniqueProvider.isTLSUniqueAvailable()) {
                            PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder2 = new PKCS10CertificationRequestBuilder(pKCS10CertificationRequestBuilder);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            pKCS10CertificationRequestBuilder2.setAttribute(PKCSObjectIdentifiers.pkcs_9_at_challengePassword, new DERPrintableString(Base64.toBase64String(tLSUniqueProvider.getTLSUnique())));
                            byteArrayOutputStream.write(ESTService.this.annotateRequest(pKCS10CertificationRequestBuilder2.build(contentSigner).getEncoded()).getBytes());
                            byteArrayOutputStream.flush();
                            ESTRequestBuilder withData = new ESTRequestBuilder(eSTRequest).withData(byteArrayOutputStream.toByteArray());
                            withData.setHeader(StubApp.getString2(466), StubApp.getString2(29459));
                            withData.setHeader(StubApp.getString2(29460), StubApp.getString2(10758));
                            withData.setHeader(StubApp.getString2(2415), Long.toString(byteArrayOutputStream.size()));
                            return withData.build();
                        }
                    }
                    throw new IOException(StubApp.getString2(29461));
                }
            });
            if (eSTAuth != null) {
                eSTAuth.applyAuth(withConnectionListener);
            }
            eSTResponse = makeClient.doRequest(withConnectionListener.build());
            EnrollmentResponse handleEnrollResponse = handleEnrollResponse(eSTResponse);
            if (eSTResponse != null) {
                eSTResponse.close();
            }
            return handleEnrollResponse;
        } catch (Throwable th) {
            try {
                if (th instanceof ESTException) {
                    throw th;
                }
                throw new ESTException(th.getMessage(), th);
            } catch (Throwable th2) {
                if (eSTResponse != null) {
                    eSTResponse.close();
                }
                throw th2;
            }
        }
    }

    public CACertsResponse getCACerts() throws ESTException {
        URL url;
        ESTRequest build;
        ESTResponse doRequest;
        Store<X509CertificateHolder> store;
        Store<X509CRLHolder> store2;
        Store<X509CertificateHolder> store3;
        Store<X509CRLHolder> store4;
        String string2 = StubApp.getString2(29491);
        String string22 = StubApp.getString2(8287);
        String string23 = StubApp.getString2(29492);
        ESTResponse eSTResponse = null;
        try {
            url = new URL(this.server + StubApp.getString2("29473"));
            ESTClient makeClient = this.clientProvider.makeClient();
            build = new ESTRequestBuilder(StubApp.getString2("595"), url).withClient(makeClient).build();
            doRequest = makeClient.doRequest(build);
        } catch (Throwable th) {
            th = th;
        }
        try {
            int statusCode = doRequest.getStatusCode();
            String string24 = StubApp.getString2(29493);
            if (statusCode == 200) {
                String firstValue = doRequest.getHeaders().getFirstValue(StubApp.getString2("466"));
                if (firstValue == null || !firstValue.startsWith(StubApp.getString2("29464"))) {
                    throw new ESTException(string2 + url.toString() + StubApp.getString2("29495") + (firstValue != null ? string22.concat(firstValue) : StubApp.getString2("29494")), null, doRequest.getStatusCode(), doRequest.getInputStream());
                }
                try {
                    if (doRequest.getContentLength() == null || doRequest.getContentLength().longValue() <= 0) {
                        store3 = null;
                        store4 = null;
                    } else {
                        SimplePKIResponse simplePKIResponse = new SimplePKIResponse(ContentInfo.getInstance((ASN1Sequence) new ASN1InputStream(doRequest.getInputStream()).readObject()));
                        store3 = simplePKIResponse.getCertificates();
                        store4 = simplePKIResponse.getCRLs();
                    }
                    store = store3;
                    store2 = store4;
                } catch (Throwable th2) {
                    throw new ESTException(string23 + url.toString() + StubApp.getString2("397") + th2.getMessage(), th2, doRequest.getStatusCode(), doRequest.getInputStream());
                }
            } else {
                if (doRequest.getStatusCode() != 204) {
                    throw new ESTException(string24 + url.toString(), null, doRequest.getStatusCode(), doRequest.getInputStream());
                }
                store = null;
                store2 = null;
            }
            CACertsResponse cACertsResponse = new CACertsResponse(store, store2, build, doRequest.getSource(), this.clientProvider.isTrusted());
            try {
                doRequest.close();
                e = null;
            } catch (Exception e10) {
                e = e10;
            }
            if (e == null) {
                return cACertsResponse;
            }
            if (e instanceof ESTException) {
                throw ((ESTException) e);
            }
            throw new ESTException(string24 + url.toString(), e, doRequest.getStatusCode(), null);
        } catch (Throwable th3) {
            th = th3;
            eSTResponse = doRequest;
            try {
                if (th instanceof ESTException) {
                    throw th;
                }
                throw new ESTException(th.getMessage(), th);
            } catch (Throwable th4) {
                if (eSTResponse != null) {
                    try {
                        eSTResponse.close();
                    } catch (Exception unused) {
                    }
                }
                throw th4;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:6|7|(2:9|(2:13|14))(3:31|32|(5:36|17|18|19|(2:21|(2:23|24)(2:25|26))(2:27|28)))|16|17|18|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.est.CSRRequestResponse getCSRAttributes() throws org.bouncycastle.est.ESTException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.est.ESTService.getCSRAttributes():org.bouncycastle.est.CSRRequestResponse");
    }

    public EnrollmentResponse handleEnrollResponse(ESTResponse eSTResponse) throws IOException {
        Object obj;
        long time;
        ESTRequest originalRequest = eSTResponse.getOriginalRequest();
        if (eSTResponse.getStatusCode() == 202) {
            String header = eSTResponse.getHeader(StubApp.getString2(25025));
            if (header == null) {
                throw new ESTException(StubApp.getString2(29499) + originalRequest.getURL().toString());
            }
            try {
                try {
                    time = (Long.parseLong(header) * 1000) + System.currentTimeMillis();
                } catch (NumberFormatException unused) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2("29497"), Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone(StubApp.getString2("22649")));
                    time = simpleDateFormat.parse(header).getTime();
                }
                return new EnrollmentResponse(null, time, originalRequest, eSTResponse.getSource());
            } catch (Exception e10) {
                throw new ESTException(StubApp.getString2(29498) + originalRequest.getURL().toString() + StubApp.getString2(397) + e10.getMessage(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
            }
        }
        if (eSTResponse.getStatusCode() == 200) {
            String string2 = StubApp.getString2(8450);
            if (eSTResponse.getHeaderOrEmpty(string2).contains(StubApp.getString2(29500))) {
                final Object[] objArr = new Object[2];
                new BasicMimeParser(new Headers(eSTResponse.getHeaderOrEmpty(string2), StubApp.getString2(10758)), eSTResponse.getInputStream()).parse(new MimeParserListener() { // from class: org.bouncycastle.est.ESTService.2
                    @Override // org.bouncycastle.mime.MimeParserListener
                    public MimeContext createContext(MimeParserContext mimeParserContext, Headers headers) {
                        return ConstantMimeContext.Instance;
                    }

                    @Override // org.bouncycastle.mime.MimeParserListener
                    public void object(MimeParserContext mimeParserContext, Headers headers, InputStream inputStream) throws IOException {
                        if (headers.getContentType().contains(StubApp.getString2(29462))) {
                            ASN1InputStream aSN1InputStream = new ASN1InputStream(inputStream);
                            objArr[0] = PrivateKeyInfo.getInstance(aSN1InputStream.readObject());
                            if (aSN1InputStream.readObject() != null) {
                                throw new ESTException(StubApp.getString2(29463));
                            }
                            return;
                        }
                        if (headers.getContentType().contains(StubApp.getString2(29464))) {
                            ASN1InputStream aSN1InputStream2 = new ASN1InputStream(inputStream);
                            try {
                                objArr[1] = new SimplePKIResponse(ContentInfo.getInstance(aSN1InputStream2.readObject()));
                                if (aSN1InputStream2.readObject() != null) {
                                    throw new ESTException(StubApp.getString2(29465));
                                }
                            } catch (CMCException e11) {
                                throw new IOException(e11.getMessage());
                            }
                        }
                    }
                });
                if (objArr[0] == null || (obj = objArr[1]) == null) {
                    throw new ESTException(StubApp.getString2(29501));
                }
                return new EnrollmentResponse(((SimplePKIResponse) obj).getCertificates(), -1L, null, eSTResponse.getSource(), PrivateKeyInfo.getInstance(objArr[0]));
            }
        }
        if (eSTResponse.getStatusCode() == 200) {
            try {
                return new EnrollmentResponse(new SimplePKIResponse(ContentInfo.getInstance(new ASN1InputStream(eSTResponse.getInputStream()).readObject())).getCertificates(), -1L, null, eSTResponse.getSource());
            } catch (CMCException e11) {
                throw new ESTException(e11.getMessage(), e11.getCause());
            }
        }
        throw new ESTException(StubApp.getString2(29502) + originalRequest.getURL().toString(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
    }

    public EnrollmentResponse simpleEnroll(EnrollmentResponse enrollmentResponse) throws Exception {
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException(StubApp.getString2(29490));
        }
        ESTResponse eSTResponse = null;
        try {
            ESTClient makeClient = this.clientProvider.makeClient();
            eSTResponse = makeClient.doRequest(new ESTRequestBuilder(enrollmentResponse.getRequestToRetry()).withClient(makeClient).build());
            EnrollmentResponse handleEnrollResponse = handleEnrollResponse(eSTResponse);
            if (eSTResponse != null) {
                eSTResponse.close();
            }
            return handleEnrollResponse;
        } catch (Throwable th) {
            try {
                if (th instanceof ESTException) {
                    throw th;
                }
                throw new ESTException(th.getMessage(), th);
            } catch (Throwable th2) {
                if (eSTResponse != null) {
                    eSTResponse.close();
                }
                throw th2;
            }
        }
    }

    public EnrollmentResponse simpleEnrollPoP(boolean z2, PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder, ContentSigner contentSigner, ESTAuth eSTAuth) throws IOException {
        return enrollPop(z2, pKCS10CertificationRequestBuilder, contentSigner, eSTAuth, false);
    }

    public EnrollmentResponse simpleEnrollPopWithServersideCreation(PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder, ContentSigner contentSigner, ESTAuth eSTAuth) throws IOException {
        return enrollPop(false, pKCS10CertificationRequestBuilder, contentSigner, eSTAuth, true);
    }

    public EnrollmentResponse simpleEnrollWithServersideCreation(PKCS10CertificationRequest pKCS10CertificationRequest, ESTAuth eSTAuth) throws IOException {
        return enroll(false, pKCS10CertificationRequest, eSTAuth, true);
    }

    public static X509CertificateHolder[] storeToArray(Store<X509CertificateHolder> store, Selector<X509CertificateHolder> selector) {
        Collection<X509CertificateHolder> matches = store.getMatches(selector);
        return (X509CertificateHolder[]) matches.toArray(new X509CertificateHolder[matches.size()]);
    }

    public EnrollmentResponse simpleEnroll(boolean z2, PKCS10CertificationRequest pKCS10CertificationRequest, ESTAuth eSTAuth) throws IOException {
        return enroll(z2, pKCS10CertificationRequest, eSTAuth, false);
    }
}
