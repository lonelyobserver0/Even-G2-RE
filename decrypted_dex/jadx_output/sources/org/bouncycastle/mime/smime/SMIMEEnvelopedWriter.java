package org.bouncycastle.mime.smime;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.cms.CMSEnvelopedDataStreamGenerator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.OriginatorInformation;
import org.bouncycastle.cms.RecipientInfoGenerator;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeIOException;
import org.bouncycastle.mime.MimeWriter;
import org.bouncycastle.mime.encoding.Base64OutputStream;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SMIMEEnvelopedWriter extends MimeWriter {
    private final String contentTransferEncoding;
    private final CMSEnvelopedDataStreamGenerator envGen;
    private final OutputStream mimeOut;
    private final OutputEncryptor outEnc;

    /* renamed from: org.bouncycastle.mime.smime.SMIMEEnvelopedWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private static final String[] stdHeaders = {StubApp.getString2(466), StubApp.getString2(33031), StubApp.getString2(29460), StubApp.getString2(33030)};
        private static final String[] stdValues = {StubApp.getString2(33033), StubApp.getString2(33034), StubApp.getString2(10758), StubApp.getString2(33032)};
        private final CMSEnvelopedDataStreamGenerator envGen = new CMSEnvelopedDataStreamGenerator();
        private final Map<String, String> headers = new LinkedHashMap();
        String contentTransferEncoding = StubApp.getString2(10758);

        public Builder() {
            int i3 = 0;
            while (true) {
                String[] strArr = stdHeaders;
                if (i3 == strArr.length) {
                    return;
                }
                this.headers.put(strArr[i3], stdValues[i3]);
                i3++;
            }
        }

        public Builder addRecipientInfoGenerator(RecipientInfoGenerator recipientInfoGenerator) {
            this.envGen.addRecipientInfoGenerator(recipientInfoGenerator);
            return this;
        }

        public SMIMEEnvelopedWriter build(OutputStream outputStream, OutputEncryptor outputEncryptor) {
            return new SMIMEEnvelopedWriter(this, outputEncryptor, SMimeUtils.autoBuffer(outputStream), null);
        }

        public Builder setBufferSize(int i3) {
            this.envGen.setBufferSize(i3);
            return this;
        }

        public Builder setOriginatorInfo(OriginatorInformation originatorInformation) {
            this.envGen.setOriginatorInfo(originatorInformation);
            return this;
        }

        public Builder setUnprotectedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
            this.envGen.setUnprotectedAttributeGenerator(cMSAttributeTableGenerator);
            return this;
        }

        public Builder withHeader(String str, String str2) {
            this.headers.put(str, str2);
            return this;
        }
    }

    public static class ContentOutputStream extends OutputStream {
        private final OutputStream backing;
        private final OutputStream main;

        public ContentOutputStream(OutputStream outputStream, OutputStream outputStream2) {
            this.main = outputStream;
            this.backing = outputStream2;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.main.close();
            OutputStream outputStream = this.backing;
            if (outputStream != null) {
                outputStream.close();
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

    private SMIMEEnvelopedWriter(Builder builder, OutputEncryptor outputEncryptor, OutputStream outputStream) {
        super(new Headers(MimeWriter.mapToLines(builder.headers), builder.contentTransferEncoding));
        this.envGen = builder.envGen;
        this.contentTransferEncoding = builder.contentTransferEncoding;
        this.outEnc = outputEncryptor;
        this.mimeOut = outputStream;
    }

    @Override // org.bouncycastle.mime.MimeWriter
    public OutputStream getContentStream() throws IOException {
        this.headers.dumpHeaders(this.mimeOut);
        this.mimeOut.write(Strings.toByteArray(StubApp.getString2(4962)));
        try {
            OutputStream outputStream = this.mimeOut;
            if (StubApp.getString2("10758").equals(this.contentTransferEncoding)) {
                outputStream = new Base64OutputStream(outputStream);
            }
            return new ContentOutputStream(this.envGen.open(SMimeUtils.createUnclosable(outputStream), this.outEnc), outputStream);
        } catch (CMSException e10) {
            throw new MimeIOException(e10.getMessage(), e10);
        }
    }

    public /* synthetic */ SMIMEEnvelopedWriter(Builder builder, OutputEncryptor outputEncryptor, OutputStream outputStream, AnonymousClass1 anonymousClass1) {
        this(builder, outputEncryptor, outputStream);
    }
}
