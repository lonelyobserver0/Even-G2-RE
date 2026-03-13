package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.CertID;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.OCSPRequest;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.ocsp.Request;
import org.bouncycastle.asn1.ocsp.ResponseBytes;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.bouncycastle.asn1.ocsp.TBSRequest;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class OcspCache {
    private static final int DEFAULT_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<Map<CertID, OCSPResponse>>> cache = Collections.synchronizedMap(new WeakHashMap());

    /* JADX WARN: Multi-variable type inference failed */
    public static OCSPResponse getOcspResponse(CertID certID, PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, URI uri, X509Certificate x509Certificate, List<Extension> list, JcaJceHelper jcaJceHelper) throws CertPathValidatorException {
        PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters2;
        OCSPResponse oCSPResponse;
        int intValue;
        PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters3;
        OCSPResponse oCSPResponse2;
        ASN1GeneralizedTime nextUpdate;
        String string2 = StubApp.getString2(32683);
        WeakReference<Map<CertID, OCSPResponse>> weakReference = cache.get(uri);
        Map<CertID, OCSPResponse> map = weakReference != null ? weakReference.get() : null;
        boolean z2 = false;
        if (map != null && (oCSPResponse2 = map.get(certID)) != null) {
            ASN1Sequence responses = ResponseData.getInstance(BasicOCSPResponse.getInstance(ASN1OctetString.getInstance(oCSPResponse2.getResponseBytes().getResponse()).getOctets()).getTbsResponseData()).getResponses();
            for (int i3 = 0; i3 != responses.size(); i3++) {
                SingleResponse singleResponse = SingleResponse.getInstance(responses.getObjectAt(i3));
                if (certID.equals(singleResponse.getCertID()) && (nextUpdate = singleResponse.getNextUpdate()) != null) {
                    try {
                    } catch (ParseException unused) {
                        map.remove(certID);
                    }
                    if (pKIXCertRevocationCheckerParameters.getValidDate().after(nextUpdate.getDate())) {
                        map.remove(certID);
                        oCSPResponse2 = null;
                    }
                }
            }
            if (oCSPResponse2 != null) {
                return oCSPResponse2;
            }
        }
        try {
            URL url = uri.toURL();
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new Request(certID, null));
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            byte[] bArr = null;
            for (int i10 = 0; i10 != list.size(); i10++) {
                Extension extension = list.get(i10);
                byte[] value = extension.getValue();
                if (OCSPObjectIdentifiers.id_pkix_ocsp_nonce.getId().equals(extension.getId())) {
                    bArr = value;
                }
                aSN1EncodableVector2.add(new org.bouncycastle.asn1.x509.Extension(new ASN1ObjectIdentifier(extension.getId()), extension.isCritical(), value));
            }
            try {
                byte[] encoded = new OCSPRequest(new TBSRequest((GeneralName) null, new DERSequence(aSN1EncodableVector), Extensions.getInstance(new DERSequence(aSN1EncodableVector2))), null).getEncoded();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod(StubApp.getString2("13314"));
                httpURLConnection.setRequestProperty(StubApp.getString2("32684"), StubApp.getString2("32685"));
                httpURLConnection.setRequestProperty(StubApp.getString2("32686"), String.valueOf(encoded.length));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(encoded);
                outputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = 32768;
                }
                oCSPResponse = OCSPResponse.getInstance(Streams.readAllLimited(inputStream, contentLength));
                intValue = oCSPResponse.getResponseStatus().getIntValue();
            } catch (IOException e10) {
                e = e10;
                pKIXCertRevocationCheckerParameters2 = pKIXCertRevocationCheckerParameters;
            }
            try {
                if (intValue != 0) {
                    throw new CertPathValidatorException(StubApp.getString2("32688") + oCSPResponse.getResponseStatus().getValue(), null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
                }
                ResponseBytes responseBytes = ResponseBytes.getInstance(oCSPResponse.getResponseBytes());
                if (responseBytes.getResponseType().equals((ASN1Primitive) OCSPObjectIdentifiers.id_pkix_ocsp_basic)) {
                    BasicOCSPResponse basicOCSPResponse = BasicOCSPResponse.getInstance(responseBytes.getResponse().getOctets());
                    pKIXCertRevocationCheckerParameters3 = pKIXCertRevocationCheckerParameters;
                    z2 = ProvOcspRevocationChecker.validatedOcspResponse(basicOCSPResponse, pKIXCertRevocationCheckerParameters3, bArr, x509Certificate, jcaJceHelper);
                } else {
                    pKIXCertRevocationCheckerParameters3 = pKIXCertRevocationCheckerParameters;
                }
                if (!z2) {
                    throw new CertPathValidatorException(StubApp.getString2("32687"), null, pKIXCertRevocationCheckerParameters3.getCertPath(), pKIXCertRevocationCheckerParameters3.getIndex());
                }
                WeakReference<Map<CertID, OCSPResponse>> weakReference2 = cache.get(uri);
                if (weakReference2 != null) {
                    weakReference2.get().put(certID, oCSPResponse);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put(certID, oCSPResponse);
                    cache.put(uri, new WeakReference<>(hashMap));
                }
                return oCSPResponse;
            } catch (IOException e11) {
                e = e11;
                pKIXCertRevocationCheckerParameters2 = intValue;
                throw new CertPathValidatorException(u.q(e, new StringBuilder(string2)), e, pKIXCertRevocationCheckerParameters2.getCertPath(), pKIXCertRevocationCheckerParameters2.getIndex());
            }
        } catch (MalformedURLException e12) {
            throw new CertPathValidatorException(string2 + e12.getMessage(), e12, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        }
    }
}
