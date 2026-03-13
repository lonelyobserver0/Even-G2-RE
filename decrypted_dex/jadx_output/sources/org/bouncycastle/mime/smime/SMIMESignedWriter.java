package org.bouncycastle.mime.smime;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.Typography;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignedDataStreamGenerator;
import org.bouncycastle.cms.SignerInfoGenerator;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeWriter;
import org.bouncycastle.mime.encoding.Base64OutputStream;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SMIMESignedWriter extends MimeWriter {
    public static final Map RFC3851_MICALGS;
    public static final Map RFC5751_MICALGS;
    public static final Map STANDARD_MICALGS;
    private final String boundary;
    private final String contentTransferEncoding;
    private final OutputStream mimeOut;
    private final CMSSignedDataStreamGenerator sigGen;

    /* renamed from: org.bouncycastle.mime.smime.SMIMESignedWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private static final String[] detHeaders;
        private static final String[] detValues;
        private static final String[] encHeaders;
        private static final String[] encValues;
        String contentTransferEncoding;
        private final boolean encapsulated;
        private final Map<String, String> extraHeaders;
        private final Map micAlgs;
        private final CMSSignedDataStreamGenerator sigGen;

        static {
            String string2 = StubApp.getString2(466);
            detHeaders = new String[]{string2};
            detValues = new String[]{StubApp.getString2(33035)};
            encHeaders = new String[]{string2, StubApp.getString2(33031), StubApp.getString2(29460), StubApp.getString2(33030)};
            encValues = new String[]{StubApp.getString2(33033), StubApp.getString2(33034), StubApp.getString2(10758), StubApp.getString2(33036)};
        }

        public Builder() {
            this(false);
        }

        private void addBoundary(StringBuffer stringBuffer, String str) {
            stringBuffer.append(StubApp.getString2(33037));
            stringBuffer.append(str);
            stringBuffer.append(StubApp.getString2(2123));
        }

        private void addHashHeader(StringBuffer stringBuffer, List list) {
            Iterator it = list.iterator();
            TreeSet treeSet = new TreeSet();
            while (it.hasNext()) {
                String str = (String) this.micAlgs.get(((AlgorithmIdentifier) it.next()).getAlgorithm());
                if (str == null) {
                    str = StubApp.getString2(351);
                }
                treeSet.add(str);
            }
            Iterator it2 = treeSet.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (i3 == 0) {
                    stringBuffer.append(treeSet.size() != 1 ? StubApp.getString2(33038) : StubApp.getString2(33039));
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(str2);
                i3++;
            }
            if (i3 == 0 || treeSet.size() == 1) {
                return;
            }
            stringBuffer.append(Typography.quote);
        }

        private String generateBoundary() {
            return StubApp.getString2(33040) + new BigInteger(180, new SecureRandom()).setBit(179).toString(16) + StubApp.getString2(2359);
        }

        public Builder addCertificate(X509CertificateHolder x509CertificateHolder) throws CMSException {
            this.sigGen.addCertificate(x509CertificateHolder);
            return this;
        }

        public Builder addCertificates(Store store) throws CMSException {
            this.sigGen.addCertificates(store);
            return this;
        }

        public Builder addSignerInfoGenerator(SignerInfoGenerator signerInfoGenerator) {
            this.sigGen.addSignerInfoGenerator(signerInfoGenerator);
            return this;
        }

        public SMIMESignedWriter build(OutputStream outputStream) {
            String generateBoundary;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i3 = 0;
            if (!this.encapsulated) {
                generateBoundary = generateBoundary();
                StringBuffer stringBuffer = new StringBuffer(detValues[0]);
                addHashHeader(stringBuffer, this.sigGen.getDigestAlgorithms());
                addBoundary(stringBuffer, generateBoundary);
                linkedHashMap.put(detHeaders[0], stringBuffer.toString());
                int i10 = 1;
                while (true) {
                    String[] strArr = detHeaders;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    linkedHashMap.put(strArr[i10], detValues[i10]);
                    i10++;
                }
            } else {
                while (true) {
                    String[] strArr2 = encHeaders;
                    if (i3 == strArr2.length) {
                        break;
                    }
                    linkedHashMap.put(strArr2[i3], encValues[i3]);
                    i3++;
                }
                generateBoundary = null;
            }
            String str = generateBoundary;
            for (Map.Entry<String, String> entry : this.extraHeaders.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return new SMIMESignedWriter(this, linkedHashMap, str, SMimeUtils.autoBuffer(outputStream), null);
        }

        public Builder withHeader(String str, String str2) {
            this.extraHeaders.put(str, str2);
            return this;
        }

        public Builder(boolean z2) {
            this.sigGen = new CMSSignedDataStreamGenerator();
            this.extraHeaders = new LinkedHashMap();
            this.micAlgs = SMIMESignedWriter.STANDARD_MICALGS;
            this.contentTransferEncoding = StubApp.getString2(10758);
            this.encapsulated = z2;
        }
    }

    public class ContentOutputStream extends OutputStream {
        private final OutputStream backing;
        private final OutputStream main;
        private final OutputStream sigBase;
        private final ByteArrayOutputStream sigStream;

        public ContentOutputStream(OutputStream outputStream, OutputStream outputStream2, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream3) {
            this.main = outputStream;
            this.backing = outputStream2;
            this.sigStream = byteArrayOutputStream;
            this.sigBase = outputStream3;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (SMIMESignedWriter.this.boundary != null) {
                this.main.close();
                OutputStream outputStream = this.backing;
                String string2 = StubApp.getString2(33041);
                outputStream.write(Strings.toByteArray(string2));
                this.backing.write(Strings.toByteArray(SMIMESignedWriter.this.boundary));
                OutputStream outputStream2 = this.backing;
                String string22 = StubApp.getString2(4962);
                outputStream2.write(Strings.toByteArray(string22));
                this.backing.write(Strings.toByteArray(StubApp.getString2(33042)));
                this.backing.write(Strings.toByteArray(StubApp.getString2(33043)));
                this.backing.write(Strings.toByteArray(StubApp.getString2(33044)));
                this.backing.write(Strings.toByteArray(string22));
                OutputStream outputStream3 = this.sigBase;
                if (outputStream3 != null) {
                    outputStream3.close();
                }
                this.backing.write(this.sigStream.toByteArray());
                this.backing.write(Strings.toByteArray(string2));
                this.backing.write(Strings.toByteArray(SMIMESignedWriter.this.boundary));
                this.backing.write(Strings.toByteArray(StubApp.getString2(33045)));
            }
            OutputStream outputStream4 = this.backing;
            if (outputStream4 != null) {
                outputStream4.close();
            }
        }

        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            this.main.write(i3);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.main.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i10) throws IOException {
            this.main.write(bArr, i3, i10);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSAlgorithm.MD5;
        String string2 = StubApp.getString2(33046);
        hashMap.put(aSN1ObjectIdentifier, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CMSAlgorithm.SHA1;
        hashMap.put(aSN1ObjectIdentifier2, StubApp.getString2(33047));
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CMSAlgorithm.SHA224;
        hashMap.put(aSN1ObjectIdentifier3, StubApp.getString2(33048));
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CMSAlgorithm.SHA256;
        hashMap.put(aSN1ObjectIdentifier4, StubApp.getString2(33049));
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = CMSAlgorithm.SHA384;
        hashMap.put(aSN1ObjectIdentifier5, StubApp.getString2(33050));
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = CMSAlgorithm.SHA512;
        hashMap.put(aSN1ObjectIdentifier6, StubApp.getString2(33051));
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = CMSAlgorithm.GOST3411;
        String string22 = StubApp.getString2(33052);
        hashMap.put(aSN1ObjectIdentifier7, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = CMSAlgorithm.GOST3411_2012_256;
        String string23 = StubApp.getString2(33053);
        hashMap.put(aSN1ObjectIdentifier8, string23);
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = CMSAlgorithm.GOST3411_2012_512;
        String string24 = StubApp.getString2(33054);
        hashMap.put(aSN1ObjectIdentifier9, string24);
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        RFC5751_MICALGS = unmodifiableMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aSN1ObjectIdentifier, string2);
        hashMap2.put(aSN1ObjectIdentifier2, StubApp.getString2(33055));
        hashMap2.put(aSN1ObjectIdentifier3, StubApp.getString2(33056));
        hashMap2.put(aSN1ObjectIdentifier4, StubApp.getString2(33057));
        hashMap2.put(aSN1ObjectIdentifier5, StubApp.getString2(33058));
        hashMap2.put(aSN1ObjectIdentifier6, StubApp.getString2(33059));
        hashMap2.put(aSN1ObjectIdentifier7, string22);
        hashMap2.put(aSN1ObjectIdentifier8, string23);
        hashMap2.put(aSN1ObjectIdentifier9, string24);
        RFC3851_MICALGS = Collections.unmodifiableMap(hashMap2);
        STANDARD_MICALGS = unmodifiableMap;
    }

    private SMIMESignedWriter(Builder builder, Map<String, String> map, String str, OutputStream outputStream) {
        super(new Headers(MimeWriter.mapToLines(map), builder.contentTransferEncoding));
        this.sigGen = builder.sigGen;
        this.contentTransferEncoding = builder.contentTransferEncoding;
        this.boundary = str;
        this.mimeOut = outputStream;
    }

    @Override // org.bouncycastle.mime.MimeWriter
    public OutputStream getContentStream() throws IOException {
        this.headers.dumpHeaders(this.mimeOut);
        OutputStream outputStream = this.mimeOut;
        String string2 = StubApp.getString2(4962);
        outputStream.write(Strings.toByteArray(string2));
        if (this.boundary == null) {
            return null;
        }
        this.mimeOut.write(Strings.toByteArray(StubApp.getString2(33060)));
        this.mimeOut.write(Strings.toByteArray(StubApp.getString2(33041)));
        this.mimeOut.write(Strings.toByteArray(this.boundary));
        this.mimeOut.write(Strings.toByteArray(string2));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream);
        return new ContentOutputStream(this.sigGen.open((OutputStream) base64OutputStream, false, SMimeUtils.createUnclosable(this.mimeOut)), this.mimeOut, byteArrayOutputStream, base64OutputStream);
    }

    public /* synthetic */ SMIMESignedWriter(Builder builder, Map map, String str, OutputStream outputStream, AnonymousClass1 anonymousClass1) {
        this(builder, map, str, outputStream);
    }
}
